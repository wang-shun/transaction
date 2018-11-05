layui.use(['layer', 'form','jquery','upload','laydate'], function(){
  var layer = layui.layer
  ,form = layui.form,  // 载入form表单
  table = layui.table, //表格
  laydate = layui.laydate,
  upload = layui.upload; 

  window.$ = layui.jquery;    //zai'lu'

	// tag 标签
	$('#tagList').tagsInput({
		'height':'28px', //设置高度
    'width':'650px',  //设置宽度
    'interactive':true, //是否允许添加标签，false为阻止
    'defaultText':'点击选择文章标签,或手动输入,按回车键添加,输入标签长度不能超过7个字符', //默认文字
	});
 	$("#tags_addTag #tags_tag").css("width", "450");

	// 百度编辑器实例
  var ue = UM.getEditor('container');
  
  //时间
  laydate.render({
    elem: '#time1' //指定元素
  });
  laydate.render({
    elem: '#time2' //指定元素
  });
  laydate.render({
    elem: '#time3', //指定元素
    type: 'datetime'
  });
  laydate.render({
    elem: '#time4', //指定元素
    type: 'datetime'
  });
  //二级联动
  form.on('select(selectChannelM)', function (data) {
	  $('#channel').empty();
	  if(data.value){
		  channel('#channel',infoServer+'/channelSub/selectListChannelSub.json?pid='+data.value);
	  }
	  form.render('select');
	  return false;
  });
  
  form.verify({
	  channelM: function(value, item){ //value：表单的值、item：表单的DOM对象
	    if(null == value || value == -1){
	      return '请选择栏目';
	    }
	  }
  });      
  
  //初始化加载
  
  channel('#channelM',infoServer+'/channelM/selectListChannelM.json?channelMDesc=SSBK');
  $('#channelM').append('<option value="">请选择</option>');
  form.render('select');
  
  //channel('#channel','/info-bg/channelSub/selectListChannelSub.json?pid='+$("#channelM option:selected").val());
  //加载父子栏目
  function channel(id,url){
	  if(url && id){
		  $(id).empty();
		  $.ajax({
			  url:url,
			  type:'get',
			  success:function(data){
				  $.each(data,function(i,val){
					  $(id).append('<option value="'+val.uuid+'">'+val.name+'</option>');
				  });
				
				  form.render('select');
			  },
			  error:function(error){
				  console.log(error);
			  }
		  });
	  }
  }
  
  //文章设置
  $('.checkBoxClass').on('click',function(){
  	if($(this).find('input[type="checkbox"]').get(0).checked){
  		$(this).find('input[type="text"]').removeClass('ry-hui-bg').removeAttr('disabled');
  	}else{
  		$(this).find('input[type="text"]').addClass('ry-hui-bg').attr('disabled',true).val('');
  	}
  })
  
  //保存
  form.on('submit(saveInfo)', function(data){
	  var params = getParams(data,10);
	  if(!checkSendInfo(params)){
			 return false;
	  }
  	  
  	  $.ajax({
  		 url:infoServer+'/info/saveOrUpdateInfo.json',
  		 data:JSON.stringify(params),
  		 type:'post',
  		 contentType:"application/json",
  		 success:function(res){
  			if(res){
  				if(res.status == 0){
  					$('#uuid').val(res.code);
  					window.location.href=infoServer+'/om/oil/oil.htm';
  				}else{
  					layer.alert(res.message);
  				}
  			}
  		 },error:function(res){
  			 
  		 }
	  });
	  
    return false;
  });
  
//发布
  form.on('submit(releaseInfo)', function(data){
	  var params = getParams(data,30);
	  if(!checkSendInfo(params)){
			 return false;
	  }
  	  //提交后台处理
  	  $.ajax({
  		 url:infoServer+'/info/saveOrUpdateInfo.json',
  		 data:JSON.stringify(params),
  		 type:'post',
  		 async:false,
  		 contentType:"application/json",
  		 success:function(res){
  			if(res){
  				if(res.status == 0){
  					$('#uuid').val(res.code);
  					window.location.href = infoServer+"/om/oil/oilPublish.htm";
  				}else{
  					layer.alert(res.message);
  				}
  			}
  		 },error:function(res){
  			 
  		 }
	  });
    return false;
  });
  
  //预览
  form.on('submit(previewInfo)', function(data){
	  var params = getParams(data,10);
	  if(!checkSendInfo(params)){
			 return false;
	  }

  	  //提交后台处理
  	  $.ajax({
  		 url:infoServer+'/info/saveOrUpdateInfo.json',
  		 data:JSON.stringify(params),
  		 type:'post',
  		 contentType:"application/json",
  		 success:function(res){
  			if(res){
  				if(res.status == 0){
  					$('#uuid').val(res.code);
  					window.open(infoServer+'/om/info/previewInfo.htm?uuid='+res.code);
  				}else{
  					layer.alert(res.message);
  				}
  			}
  		 },error:function(res){
  			 
  		 }
	  });
	  
	  return false;
  });
  
  //数据校验
  function validator(data){
	  if(data.field.channelUUId=='-1'){
		  layer.alert('请选择栏目');
		  return false;
	  }
	  return true;
  }
  
  //显示导语 ,显示导语
  $('.checkoutActive').on('click',function(){
  	if($(this).find('input[type="checkbox"]').get(0).checked){
  		$(this).find('input[type="text"]').removeClass('ry-hui-bg').removeAttr('disabled');
  	}else{
  		$(this).find('input[type="text"]').addClass('ry-hui-bg').attr('disabled',true).val('');
  	}
  })
  
  
  
  //监听 radio 封面
  form.on('radio(radio1)', function(data){
	   data.value--;
	   $('.ry-upImg').hide();
	   if(data.value==-1) return;
	   $('.ry-upImg').eq(data.value).show();
	}); 
  
  //复选框二选一，可都不选
  $('.twoSelect').on('click',function(){
	  if($(this).find('.layui-form-checkbox').hasClass('layui-form-checked')){
		 $(this).siblings('div.twoSelect').find('.layui-form-checkbox').removeClass('layui-form-checked');
		 $(this).siblings('div.twoSelect').find('input[type="checkbox"]').get(0).checked=false;
	  }
  })
  
  //返回 
  $('#returnInfo').on('click',function(){
	  window.location.href = infoServer+'/om/oil/oil.htm';
  });
  
  /*img 上传*/
  var temp = '<p>';
  	temp = temp + '<input type="hidden" class="storePath" value="{{filePath}}" />';
	temp = temp + '<input type="hidden" class="fileName" value="{{fileName}}" />';
	temp = temp + '<input type="hidden" class="fileSize" value="{{fileSize}}" />';
	temp = temp + '<input type="hidden" class="storeName" value="{{fileId}}" /></p>'; 
  
  function imgUp(id, clazz,dir) {
			var options = {
				multi_selection: false, //设置是否多选
				listId: id, 
				itemTemplate: temp, //设置模板
				signatureUrl: configUitl.getOssServerPath(infoServer,dir),
				dir: dir,
				filters: {
					max_file_size: '1M',
					mime_types: [ //只允许上传图片文件和rar压缩文件
						{
							extensions: "jpg,png,jpeg,gif"
						}
					],
				},
				swfUrl: '../../lib/upload/Moxie.swf',
				xapUrl: '../../lib/upload/Moxie.xap',
				success: function(imgUrl) {
					$('#'+id+' .storePath').val(imgUrl)
					$(clazz).hide();
					
				},
				before: function() {
				}
			};
			$(clazz).bsPlupload(options);
		}
  		//一张图片
        imgUp('demoOne', '#imgOne','info');
        //三张
        imgUp('demoTwo1', '#imgTwo1','info');
        imgUp('demoTwo2', '#imgTwo2','info');
        imgUp('demoTwo3', '#imgTwo3','info');
        // 广告
        imgUp('demoThree', '#imgThree','info');

}); 