layui.use(['layer', 'form', 'laypage', 'table', 'laydate'], function(){
	var layer = layui.layer,
	form = layui.form,  // 载入form表单
	table = layui.table;
	window.$ = layui.jquery;
	var laydate = layui.laydate;
	
	//查看船合同
	$('.queryBtn').on('click',function(){
		var uuid = $(this).attr('attr-data');
		window.location.href=shipServer+"/shipPact/cargoOwnerShipPactDetailQuery.htm?uuid="+uuid;
	});
	
	//修改船合同
	$('.editBtn').on('click',function(){
		var uuid = $(this).attr('attr-data');
		var shipPlateUuid = $(this).attr('attr-shipPlateUuid');
		window.location.href=shipServer+"/shipPact/cargoOwnerShipPactDetail.htm?uuid="+uuid+"&shipPlateUuid="+shipPlateUuid;
	});
	
	//船务信息录入
	$('.shipEditBtn').on('click',function(){
		var uuid = $(this).attr('attr-data');
		window.open(shipServer+"/shipPact/shipLogistics.htm?shipPactUuid="+uuid);
	});
	//物流跟踪
	$('.track').on('click',function(){
		var uuid = $(this).attr('attr-data');
		//alert('等待页面链接')
		window.open(shipServer+"/page/#/transport?uuid="+uuid);
	});
	
	//航次结束
	$('.shipOverBtn').on('click',function(){
		var uuid = $(this).attr('attr-data');
		var obj = {};
		obj.uuid = uuid;
		 layer.confirm($.i18n("JAVASCRIPT00126"), {title:$.i18n("001"),btn:[$.i18n("002"),$.i18n("003")]}, function(index){
				$.ajax({
					type: "POST",
					url: shipServer+"/shipPact/checkShipPactFinish.json",
					data: JSON.stringify(obj),
					dataType: "json",
					contentType:"application/json",
					success: function(data) {
						console.log(data)
						if(data.status == 0){
							if (data.datas.flag){
								cancelPact(uuid); 
							} else {
								 layer.confirm(data.datas.mess, {title:$.i18n("001"),btn:[$.i18n("002"),$.i18n("003")]}, function(indexs){
									 cancelPact(uuid); 
								 })
							}
						} else {
							message($.i18n(data.message));
						}},
				   error:function(){
					   message($.i18n("JAVASCRIPT003"));
					   }
				});
		 });
	});
	
	//结束船合同
	function cancelPact(uuid){
		var obj ={};
		obj.uuid = uuid;
		$.ajax({
			type: "POST",
			url: shipServer+"/shipPact/finishShipPact.json",
			data: JSON.stringify(obj),
			dataType: "json",
			contentType:"application/json",
			success: function(data) {
				console.log(data)
				if(data.status == 0){
					layer.alert($.i18n("JAVASCRIPT0021"), {title:$.i18n("001"),btn:$.i18n("002")}, function(index) { layer.close(index);  location.reload(); });
				} else {
					message($.i18n(data.message));
				}},
				error:function(){
					message($.i18n("JAVASCRIPT003"));
				}
		});
	}
	
	//错误
	function message(mess){
		 layer.alert(mess, {title:$.i18n("001"),btn:$.i18n("002")}, function(index) { 
			 layer.close(index);
		});
	}
	
	// 日期格式化函数
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
});
