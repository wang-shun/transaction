
/** OSS文件上传扩展 **/
layui.define(function(exports){
	var uploader = {
		render:function(options){
//			elem: options.elem,
			maxsize = options.size //限制文件大小，数字+单位，如：30kb,20m
			callback = options.done//回调函数
		    
			accessid = ''
			accesskey = ''
			host = ''
			policyBase64 = ''
			signature = ''
			callbackbody = ''
			filename = ''
			key = ''
			expire = 0
			g_object_name = '';

			function send_request() {
			    var xmlhttp = null;
			    if (window.XMLHttpRequest)
			    {
			        xmlhttp=new XMLHttpRequest();
			    }
			    else if (window.ActiveXObject)
			    {
			        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
			    }
			  
			    if (xmlhttp!=null)
			    {
			        serverUrl = appServer + '/common/oss/getParams.json';
			        xmlhttp.open( "GET", serverUrl, false );
			        xmlhttp.send( null );
			        return xmlhttp.responseText;
			    }
			    else
			    {
			        alert("Your browser does not support XMLHTTP.");
			    }
			};
			function get_signature() {
			    //可以判断当前expire是否超过了当前时间,如果超过了当前时间,就重新取一下.3s 做为缓冲
			    var now = Date.parse(new Date()) / 1000;//秒
			    if (expire < now + 3) {
			        var body = send_request();
			        var result = eval ("(" + body + ")");
			        if(result.status != 0){
			        	layer.alert("系统请求异常");
			        	return false;
			        }
			        var obj = result.datas;
			        host = obj['host']
			        policyBase64 = obj['policy']
			        accessid = obj['accessid']
			        signature = obj['signature']
			        expire = parseInt(obj['expire'])
			        callbackbody = obj['callback'] 
			        key = obj['dir']
			    }
			};

			function random_string(len) {
				len = len || 32;
				var chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678';   
				var maxPos = chars.length;
				var pwd = '';
				for (i = 0; i < len; i++) {
					pwd += chars.charAt(Math.floor(Math.random() * maxPos));
				}
			    return pwd;
			}

			function get_suffix(filename) {
			    pos = filename.lastIndexOf('.')
			    suffix = ''
			    if (pos != -1) {
			        suffix = filename.substring(pos)
			    }
			    return suffix;
			}

			function set_upload_param(up, filename) {
			    get_signature();
		        suffix = get_suffix(filename);
		        g_object_name = key + random_string(10) + suffix;
		        
			    new_multipart_params = {
			        'key' : g_object_name,
			        'policy': policyBase64,
			        'OSSAccessKeyId': accessid, 
			        'success_action_status' : '200', //让服务端返回200,不然，默认会返回204
			        'callback' : callbackbody,
			        'signature': signature,
			    };

			    up.setOption({
			        'url': host,
			        'multipart_params': new_multipart_params
			    });

			    up.start();
			}

			var browseBtnIdsArr = new Array();
			if(options.elem.indexOf(".")!=-1){//class
				var browseBtnObjArr = document.getElementsByClassName(options.elem.replace(".",""));
				for(var i = 0;i<browseBtnObjArr.length;i++){
					browseBtnIdsArr.push(browseBtnObjArr[i].id);
				}
			}else{//id
				browseBtnIdsArr.push(options.elem);
			}
			
			for(var i = 0; i < browseBtnIdsArr.length; i++){
				var pluploader = new plupload.Uploader({
					runtimes : 'html5,flash,silverlight,html4',
					browse_button : browseBtnIdsArr[i],
				    multi_selection: false,//是否可选择多个文件
					//container: document.getElementById('container'),
					flash_swf_url : '../../../lib/plupload-2.1.2/Moxie.swf',
					silverlight_xap_url : '../../../lib/plupload-2.1.2/Moxie.xap',
				    url : 'http://oss.aliyuncs.com',
				    
				    filters: {
				        //mime_types : [ //只允许上传图片和zip,rar文件
				        //{ title : "Image files", extensions : "jpg,gif,png,bmp" }, 
				        //{ title : "Zip files", extensions : "zip,rar" }
				        //],
				        max_file_size : maxsize, //最大能上传的文件大小
				        prevent_duplicates : false //不允许选取重复文件
				    },

					init: {
						PostInit: function(up) {
						},
						FilesAdded: function(up, files) {
							plupload.each(files, function(file) {
								set_upload_param(up, file.name);
							});
						},

						BeforeUpload: function(up, file) {
				        },

						UploadProgress: function(up, file) {
							var self = up.getOption("browse_button")[0];
							self.innerHTML = file.percent+'%';
						},

						FileUploaded: function(up, file, info) {
							var self = up.getOption("browse_button")[0];
				            if (info.status == 200)
				            {
				            	self.innerHTML = "ok";
				            	callback({status:0,message:null,datas:{originalName:file.name,path:g_object_name}}, self);
				            }
				            else
				            {
				            	callback({status:-1,message:info.response,datas:null}, self);
				            }
						},

						Error: function(up, err) {
							var self = up.getOption("browse_button")[0];
				            if (err.code == -600) {
				            	callback({status:-1,message:"文件大小不能超过"+maxsize,datas:null}, self);
				            }
				            else if (err.code == -601) {
				            	callback({status:-1,message:"文件类型不支持",datas:null}, self);
				            }
				            else if (err.code == -602) {
				            	callback({status:-1,message:"该文件已经上传",datas:null}, self);
				            }
				            else 
				            {
				            	callback({status:-1,message:"与服务器连接失败",datas:null}, self);
				            }
						}
					}
				});
				pluploader.init();
			}
		}
	}
	
	exports('ossUpload', uploader);
});

