layui.use(['layer', 'form', 'jquery','laypage', 'table', 'laydate','own'], function(){
	var layer = layui.layer,
	form = layui.form,  // 载入form表单
	own = layui.own,
	table = layui.table;
	window.$ = layui.jquery;
	var laydate = layui.laydate;
	
	//记录船盘uuid，跳回“查看向我询盘列表页”
	var recordShipPlateUuid="";
	
	//记录货盘uuid，跳回“货主/租船代理，租船需求管理---询盘信息列表页”
	var recordPalletUuid="";
	
	//询盘uuid
	var uuid = own.getHref('uuid');
	if(uuid==false){
		uuid="";
	}
	
	
	//询盘 status
	var status = own.getHref('status');
	if(status==false){
		status="";
	}
	
	if(status=='4'){	//已关闭
		$('.confirmShow').hide();
	}
	
	var fromPage = own.getHref('fromPage');	//船盘/货盘，列表->询盘列表信息->询盘详情页，连续返回
	
	//操作之后，返回跳转的页面
	var from = own.getHref('from');	
	
	//roleType：1船东/经纪人，2货主，3转租船东
	var roleType = own.getHref('roleType');
	
	
  	
	//查询详细
 	var params = {};
 	params.uuid = uuid;
 	$.ajax({
		type: "POST",
		url: shipServer+"/intention/findIntentionDetail.json",
		data: JSON.stringify(params),
		dataType: "json",
		contentType:"application/json",
		async: false,
		success: function(data) {
			if(data.status == 0){

				if(status=='3'){	//确认租船，回显还盘信息
					var coPactBegTimeStamp = data.datas.coPactBeg;	//回显还盘装期开始
					if(coPactBegTimeStamp!=null){
						var coPactBeg = new Date(coPactBegTimeStamp).Format("yyyy-MM-dd");
						$(".inPactBeg").html(coPactBeg);
					}else{
						$(".inPactBeg").html("");
					}
					
					var coPactEndTimeStamp = data.datas.coPactEnd;	//回显还盘装期结束
					if(coPactEndTimeStamp!=null){
						var coPactEnd = new Date(coPactEndTimeStamp).Format("yyyy-MM-dd");
						$(".inPactEnd").html(coPactEnd);
					}else{
						$(".inPactEnd").html("");
					}
					$(".inMinQuantity").html(formatNumber(data.datas.coMinQuantity,3,1));
					$(".inLoadRegion").html(data.datas.coLoadRegion);
					$(".inUnloadRegion").html(data.datas.coUnloadRegion);
					$(".inPactSpeed").html(data.datas.coPactSpeed);
					
					$(".inWs").html(formatNumber(data.datas.coWs,2,1));
					$(".inDemurrage").html(formatNumber(data.datas.coDemurrage,2,1));
					$(".inDockTime").html(formatNumber(data.datas.coDockTime,2,1));
					$(".inPactSpeed").html(data.datas.coPactSpeed);
					$(".inCommission").html(formatNumber(data.datas.coCommission,2,1));
					$(".inRemark").html(data.datas.coRemark);
					
					//询盘确认信息
					$('.confirmMsg').html($.i18n("JAVASCRIPT00223"));
					
				}else if(status=='4'){	//已关闭，回显询盘信息
					var inPactBegTimeStamp = data.datas.inPactBeg;	//回显还盘装期开始
					if(inPactBegTimeStamp!=null){
						var inPactBeg = new Date(inPactBegTimeStamp).Format("yyyy-MM-dd");
						$(".inPactBeg").html(inPactBeg);
					}else{
						$(".inPactBeg").html("");
					}
					
					var inPactEndTimeStamp = data.datas.inPactEnd;	//回显还盘装期结束
					if(inPactEndTimeStamp!=null){
						var inPactEnd = new Date(inPactEndTimeStamp).Format("yyyy-MM-dd");
						$(".inPactEnd").html(inPactEnd);
					}else{
						$(".inPactEnd").html("");
					}
					$(".inMinQuantity").html(formatNumber(data.datas.inMinQuantity,3,1));
					$(".inLoadRegion").html(data.datas.inLoadRegion);
					$(".inUnloadRegion").html(data.datas.inUnloadRegion);
					$(".inPactSpeed").html(data.datas.inPactSpeed);
					
					$(".inWs").html(formatNumber(data.datas.inWs,2,1));
					$(".inDemurrage").html(formatNumber(data.datas.inDemurrage,2,1));
					$(".inDockTime").html(formatNumber(data.datas.inDockTime,2,1));
					$(".inPactSpeed").html(data.datas.inPactSpeed);
					$(".inCommission").html(formatNumber(data.datas.inCommission,3,1));
					$(".inRemark").html(data.datas.inRemark);
					
					//询盘信息
					$('.confirmMsg').html($.i18n("JAVASCRIPT00237"));
				}
				
				//对家信息
				//roleType：1船东/经纪人，2货主，3转租船东
				if(roleType=='1' || roleType=='3'){
					var otherName=data.datas.epMemberName;
					if(otherName!=null && $.trim(otherName)!=""){
						$(".otherName").html("( "+otherName+" )");
					}else{
						$(".otherName").html(null);
					}
				}else if(roleType=='2'){
					var otherName=data.datas.shipPlateMemberName;
					if(otherName!=null && $.trim(otherName)!=""){
						$(".otherName").html("( "+otherName+" )");
					}else{
						$(".otherName").html(null);
					}
				}
				
				
				//根据船盘uuid查询船盘信息
				var shipPlateUuid=data.datas.shipPlateUuid;
				recordShipPlateUuid=shipPlateUuid;	//记录船盘uuid
				var paramsShipPlate = {};
				paramsShipPlate.uuid=shipPlateUuid;
			 	$.ajax({
		    		type: "POST",
		    		url: shipServer+"/shipPlate/findShipPlateDetail.json",
		    		data: JSON.stringify(paramsShipPlate),
					dataType: "json",
					contentType:"application/json",
		    		async: false,
		    		success: function(data) {
						if(data.status == 0){
							//船盘信息回显
							$(".name").html(data.datas.name);
							$(".name").attr('title',data.datas.name);
							
							$(".type").html(data.datas.type);
							$(".type").attr('title',data.datas.type);
							
							$(".position").html(data.datas.position);
							$(".position").attr('title',data.datas.position);
							
							var openTimeStamp = data.datas.open;	//open回显
							if(openTimeStamp!=null){
								var open = new Date(openTimeStamp).Format("yyyy-MM-dd");
								$(".open").html(open);
								$(".open").attr('title',open);
							}else{
								$(".open").html("");
								$(".open").attr('title',"");
							}
							var etaTimeStamp = data.datas.eta;	//ETA Fujairah回显
							if(etaTimeStamp!=null){
								var etaDate = new Date(etaTimeStamp).Format("yyyy-MM-dd");
								$(".eta").html(etaDate);
								$(".eta").attr('title',etaDate);
							}else{
								$(".eta").html("");
								$(".eta").attr('title',"");
							}
							var etaCabindaTimeStamp = data.datas.etaCabinda;	//ETA Cabinda回显
							if(etaCabindaTimeStamp!=null){
								var etaCabindaDate = new Date(etaCabindaTimeStamp).Format("yyyy-MM-dd");
								$(".etaCabinda").html(etaCabindaDate);
								$(".etaCabinda").attr('title',etaCabindaDate);
							}else{
								$(".etaCabinda").html("");
								$(".etaCabinda").attr('title',"");
							}
							
							$(".shipOwner").html(data.datas.shipOwner);
							$(".shipOwner").attr('title',data.datas.shipOwner);
							
							$(".epMemberName").html(data.datas.epMemberName);
							$(".epMemberName").attr('title',data.datas.epMemberName);
							
							$(".shipPlateRemark").html(data.datas.remark);
							$(".shipPlateRemark").attr('title',data.datas.remark);
							

							//根据船舶uuid查询船舶信息
							var sysShipUuid=data.datas.sysShipUuid;
							var paramsSysShip = {};
							paramsSysShip.uuid=sysShipUuid;
						 	$.ajax({
					    		type: "POST",
					    		url: shipServer+"/sysShip/findSysShipDetail.json",
					    		data: JSON.stringify(paramsSysShip),
								dataType: "json",
								contentType:"application/json",
					    		async: false,
					    		success: function(data) {
									if(data.status == 0){
										//船舶信息回显
										$(".shipName").html(data.datas.name);
										$(".shipName").attr('title',data.datas.name);
										
										$(".imo").html(data.datas.imo);
										$(".imo").attr('title',data.datas.imo);
										
										$(".completeDate").html(data.datas.completeDate);
										$(".completeDate").attr('title',data.datas.completeDate);
										
										$(".useType").html(data.datas.useType);
										$(".useType").attr('title',data.datas.useType);
										
										$(".sysShipType").html(data.datas.type);
										$(".sysShipType").attr('title',data.datas.type);
										
										$(".capacity").html(data.datas.capacity);
										$(".capacity").attr('title',data.datas.capacity);
										
										$(".loadQuantity").html(data.datas.loadQuantity);
										$(".loadQuantity").attr('title',data.datas.loadQuantity);
										
										$(".length").html(data.datas.length);
										$(".length").attr('title',data.datas.length);
										
										$(".wide").html(data.datas.wide);
										$(".wide").attr('title',data.datas.wide);
										
										$(".draft").html(data.datas.draft);
										$(".draft").attr('title',data.datas.draft);
										
										$(".hull").html(data.datas.hull);
										$(".hull").attr('title',data.datas.hull);
										
									}else{
										message($.i18n("ITSH023"));
									}
								},
								error: function(data) {
									message($.i18n(data.message));
						        }
						 	});
							
						}else{
							message($.i18n("ITSH013"));
						}
					},
					error: function(data) {
						message($.i18n(data.message));
			        }
			 	});
			 	
			 	//根据货盘uuid查询货盘信息
			 	var palletUuid=data.datas.palletUuid;
			 	recordPalletUuid=palletUuid;
			
			}else{
				message($.i18n("ITSH405"));
			}
		},
		error: function(data) {
			message($.i18n(data.message));
		}
 	});

 	
	//返回
	$('.returnBtn').on('click',function(){
		window.location.href = document.referrer;
	});
	
});


//日期格式化函数
Date.prototype.Format = function (fmt) {
	var o = {
			"M+": this.getMonth() + 1, 						//月份 
			"d+": this.getDate(), 							//日 
			"h+": this.getHours(), 							//小时 
			"m+": this.getMinutes(), 						//分 
			"s+": this.getSeconds(), 						//秒 
			"q+": Math.floor((this.getMonth() + 3) / 3), 	//季度 
			"S": this.getMilliseconds() 					//毫秒 
	};
	if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for (var k in o)
		if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	
	return fmt;
}

//日期格式化
function date(str){
	var str;
	if ( str != null && str != '' && str != 0){
		str = new Date(str).Format("yyyy-MM-dd");
	}
	if (str == 0){
		str ='';
	}
	return str;
}

//切除字符串最后 "/"
var splitStr=function(str){
	var result="";
	var index=str.lastIndexOf("/");
	result=str.substring(0,index);
	return result;
}


//错误信息
function message(mess){
	layer.alert(mess, {title:$.i18n("001"),btn:$.i18n("002")},function(index) {
		layer.close(index);
	});
}
