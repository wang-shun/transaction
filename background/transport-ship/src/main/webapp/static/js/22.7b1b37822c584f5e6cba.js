webpackJsonp([22],{1319:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(799);e.default={data:function(){return{datas:[],total:0,pageNum:1,pageSize:10}},methods:{pageFn:function(t){var e=this;this.pageNum=t;var n={shipPactUuid:this.$route.query.name,pageNum:this.pageNum};(0,r.transMore)(n).then(function(t){e.datas=t.datas,e.total=t.total})},initData:function(){var t=this,e={shipPactUuid:this.$route.query.name};(0,r.transMore)(e).then(function(e){console.log(e),t.datas=e.datas,t.total=e.total})}},mounted:function(){this.initData()},created:function(){}}},1375:function(t,e,n){e=t.exports=n(15)(),e.push([t.i,"","",{version:3,sources:[],names:[],mappings:"",file:"transmore.vue",sourceRoot:""}])},1431:function(t,e,n){var r=n(1375);"string"==typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);n(71)("7be87e28",r,!0)},1502:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"inner"},[t._m(0),t._v(" "),n("div",{staticClass:"dwhs-box clearfix"},[t._m(1),t._v(" "),n("div",{staticClass:"full-box"},[n("table",{staticClass:"tra-table"},[t._m(2),t._v(" "),t._l(t.datas,function(e){return n("tr",[n("td",[t._v(t._s(e.dateNow))]),t._v(" "),n("td",[t._v(t._s(e.timeNow))]),t._v(" "),n("td",[t._v(t._s(e.position))]),t._v(" "),n("td",[t._v(t._s(e.speedH))]),t._v(" "),n("td",[t._v(t._s(e.speedAll))]),t._v(" "),n("td",[t._v(t._s(e.rpm))]),t._v(" "),n("td",[t._v(t._s(e.sea))]),t._v(" "),n("td",[t._v(t._s(e.ETA))]),t._v(" "),n("td",[t._v(t._s(e.unload))]),t._v(" "),n("td",[t._v(t._s(e.water))]),t._v(" "),n("td",{attrs:{title:e.remark}},[t._v(t._s(t._f("truncate")(e.remark,8)))])])})],2)]),t._v(" "),n("div",{staticClass:"c-page"},[n("el-pagination",{attrs:{layout:"prev, pager, next",total:t.total},on:{"current-change":t.pageFn}})],1)])])},staticRenderFns:[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"tide-title"},[n("a",{attrs:{href:""}},[t._v("Index")]),t._v(">"),n("a",{staticClass:"cur",attrs:{href:""}},[t._v("Captain Noon Report")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"common-tooln-top tide-search-top"},[n("span",{staticClass:"tide-search-title"},[t._v("Captain Noon Report")]),t._v(" "),n("ul",{staticClass:"common-tooln-line tide-search-line clearfix"},[n("li"),n("li",{staticClass:"tooln-line"})])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("tr",[n("th",[t._v("Date")]),t._v(" "),n("th",[t._v("Time")]),t._v(" "),n("th",[t._v("Position")]),t._v(" "),n("th",[t._v("AVG SPD (24h)")]),t._v(" "),n("th",[t._v("G.AVE SPD")]),t._v(" "),n("th",[t._v("RPM")]),t._v(" "),n("th",[t._v("Wind/Sea")]),t._v(" "),n("th",[t._v("ETA")]),t._v(" "),n("th",[t._v("Destination")]),t._v(" "),n("th",[t._v("Free Water")]),t._v(" "),n("th",[t._v("Remark ")])])}]}},728:function(t,e,n){n(1431);var r=n(360)(n(1319),n(1502),null,null);t.exports=r.exports},765:function(t,e,n){"use strict";function r(t){return"[object Array]"===C.call(t)}function o(t){return"[object ArrayBuffer]"===C.call(t)}function a(t){return"undefined"!=typeof FormData&&t instanceof FormData}function s(t){return"undefined"!=typeof ArrayBuffer&&ArrayBuffer.isView?ArrayBuffer.isView(t):t&&t.buffer&&t.buffer instanceof ArrayBuffer}function i(t){return"string"==typeof t}function u(t){return"number"==typeof t}function c(t){return void 0===t}function f(t){return null!==t&&"object"==typeof t}function d(t){return"[object Date]"===C.call(t)}function l(t){return"[object File]"===C.call(t)}function p(t){return"[object Blob]"===C.call(t)}function h(t){return"[object Function]"===C.call(t)}function m(t){return f(t)&&h(t.pipe)}function v(t){return"undefined"!=typeof URLSearchParams&&t instanceof URLSearchParams}function g(t){return t.replace(/^\s*/,"").replace(/\s*$/,"")}function y(){return("undefined"==typeof navigator||"ReactNative"!==navigator.product)&&("undefined"!=typeof window&&"undefined"!=typeof document)}function _(t,e){if(null!==t&&void 0!==t)if("object"!=typeof t&&(t=[t]),r(t))for(var n=0,o=t.length;n<o;n++)e.call(null,t[n],n,t);else for(var a in t)Object.prototype.hasOwnProperty.call(t,a)&&e.call(null,t[a],a,t)}function w(){function t(t,n){"object"==typeof e[n]&&"object"==typeof t?e[n]=w(e[n],t):e[n]=t}for(var e={},n=0,r=arguments.length;n<r;n++)_(arguments[n],t);return e}function x(t,e,n){return _(e,function(e,r){t[r]=n&&"function"==typeof e?b(e,n):e}),t}var b=n(774),j=n(801),C=Object.prototype.toString;t.exports={isArray:r,isArrayBuffer:o,isBuffer:j,isFormData:a,isArrayBufferView:s,isString:i,isNumber:u,isObject:f,isUndefined:c,isDate:d,isFile:l,isBlob:p,isFunction:h,isStream:m,isURLSearchParams:v,isStandardBrowserEnv:y,forEach:_,merge:w,extend:x,trim:g}},769:function(t,e,n){"use strict";(function(e){function r(t,e){!o.isUndefined(t)&&o.isUndefined(t["Content-Type"])&&(t["Content-Type"]=e)}var o=n(765),a=n(796),s={"Content-Type":"application/x-www-form-urlencoded"},i={adapter:function(){var t;return"undefined"!=typeof XMLHttpRequest?t=n(770):void 0!==e&&(t=n(770)),t}(),transformRequest:[function(t,e){return a(e,"Content-Type"),o.isFormData(t)||o.isArrayBuffer(t)||o.isBuffer(t)||o.isStream(t)||o.isFile(t)||o.isBlob(t)?t:o.isArrayBufferView(t)?t.buffer:o.isURLSearchParams(t)?(r(e,"application/x-www-form-urlencoded;charset=utf-8"),t.toString()):o.isObject(t)?(r(e,"application/json;charset=utf-8"),JSON.stringify(t)):t}],transformResponse:[function(t){if("string"==typeof t)try{t=JSON.parse(t)}catch(t){}return t}],timeout:0,xsrfCookieName:"XSRF-TOKEN",xsrfHeaderName:"X-XSRF-TOKEN",maxContentLength:-1,validateStatus:function(t){return t>=200&&t<300}};i.headers={common:{Accept:"application/json, text/plain, */*"}},o.forEach(["delete","get","head"],function(t){i.headers[t]={}}),o.forEach(["post","put","patch"],function(t){i.headers[t]=o.merge(s)}),t.exports=i}).call(e,n(145))},770:function(t,e,n){"use strict";var r=n(765),o=n(788),a=n(791),s=n(797),i=n(795),u=n(773),c="undefined"!=typeof window&&window.btoa&&window.btoa.bind(window)||n(790);t.exports=function(t){return new Promise(function(e,f){var d=t.data,l=t.headers;r.isFormData(d)&&delete l["Content-Type"];var p=new XMLHttpRequest,h="onreadystatechange",m=!1;if("undefined"==typeof window||!window.XDomainRequest||"withCredentials"in p||i(t.url)||(p=new window.XDomainRequest,h="onload",m=!0,p.onprogress=function(){},p.ontimeout=function(){}),t.auth){var v=t.auth.username||"",g=t.auth.password||"";l.Authorization="Basic "+c(v+":"+g)}if(p.open(t.method.toUpperCase(),a(t.url,t.params,t.paramsSerializer),!0),p.timeout=t.timeout,p[h]=function(){if(p&&(4===p.readyState||m)&&(0!==p.status||p.responseURL&&0===p.responseURL.indexOf("file:"))){var n="getAllResponseHeaders"in p?s(p.getAllResponseHeaders()):null,r=t.responseType&&"text"!==t.responseType?p.response:p.responseText,a={data:r,status:1223===p.status?204:p.status,statusText:1223===p.status?"No Content":p.statusText,headers:n,config:t,request:p};o(e,f,a),p=null}},p.onerror=function(){f(u("Network Error",t,null,p)),p=null},p.ontimeout=function(){f(u("timeout of "+t.timeout+"ms exceeded",t,"ECONNABORTED",p)),p=null},r.isStandardBrowserEnv()){var y=n(793),_=(t.withCredentials||i(t.url))&&t.xsrfCookieName?y.read(t.xsrfCookieName):void 0;_&&(l[t.xsrfHeaderName]=_)}if("setRequestHeader"in p&&r.forEach(l,function(t,e){void 0===d&&"content-type"===e.toLowerCase()?delete l[e]:p.setRequestHeader(e,t)}),t.withCredentials&&(p.withCredentials=!0),t.responseType)try{p.responseType=t.responseType}catch(e){if("json"!==t.responseType)throw e}"function"==typeof t.onDownloadProgress&&p.addEventListener("progress",t.onDownloadProgress),"function"==typeof t.onUploadProgress&&p.upload&&p.upload.addEventListener("progress",t.onUploadProgress),t.cancelToken&&t.cancelToken.promise.then(function(t){p&&(p.abort(),f(t),p=null)}),void 0===d&&(d=null),p.send(d)})}},771:function(t,e,n){"use strict";function r(t){this.message=t}r.prototype.toString=function(){return"Cancel"+(this.message?": "+this.message:"")},r.prototype.__CANCEL__=!0,t.exports=r},772:function(t,e,n){"use strict";t.exports=function(t){return!(!t||!t.__CANCEL__)}},773:function(t,e,n){"use strict";var r=n(787);t.exports=function(t,e,n,o,a){var s=new Error(t);return r(s,e,n,o,a)}},774:function(t,e,n){"use strict";t.exports=function(t,e){return function(){for(var n=new Array(arguments.length),r=0;r<n.length;r++)n[r]=arguments[r];return t.apply(e,n)}}},780:function(t,e,n){t.exports=n(782)},782:function(t,e,n){"use strict";function r(t){var e=new s(t),n=a(s.prototype.request,e);return o.extend(n,s.prototype,e),o.extend(n,e),n}var o=n(765),a=n(774),s=n(784),i=n(769),u=r(i);u.Axios=s,u.create=function(t){return r(o.merge(i,t))},u.Cancel=n(771),u.CancelToken=n(783),u.isCancel=n(772),u.all=function(t){return Promise.all(t)},u.spread=n(798),t.exports=u,t.exports.default=u},783:function(t,e,n){"use strict";function r(t){if("function"!=typeof t)throw new TypeError("executor must be a function.");var e;this.promise=new Promise(function(t){e=t});var n=this;t(function(t){n.reason||(n.reason=new o(t),e(n.reason))})}var o=n(771);r.prototype.throwIfRequested=function(){if(this.reason)throw this.reason},r.source=function(){var t;return{token:new r(function(e){t=e}),cancel:t}},t.exports=r},784:function(t,e,n){"use strict";function r(t){this.defaults=t,this.interceptors={request:new s,response:new s}}var o=n(769),a=n(765),s=n(785),i=n(786);r.prototype.request=function(t){"string"==typeof t&&(t=a.merge({url:arguments[0]},arguments[1])),t=a.merge(o,this.defaults,{method:"get"},t),t.method=t.method.toLowerCase();var e=[i,void 0],n=Promise.resolve(t);for(this.interceptors.request.forEach(function(t){e.unshift(t.fulfilled,t.rejected)}),this.interceptors.response.forEach(function(t){e.push(t.fulfilled,t.rejected)});e.length;)n=n.then(e.shift(),e.shift());return n},a.forEach(["delete","get","head","options"],function(t){r.prototype[t]=function(e,n){return this.request(a.merge(n||{},{method:t,url:e}))}}),a.forEach(["post","put","patch"],function(t){r.prototype[t]=function(e,n,r){return this.request(a.merge(r||{},{method:t,url:e,data:n}))}}),t.exports=r},785:function(t,e,n){"use strict";function r(){this.handlers=[]}var o=n(765);r.prototype.use=function(t,e){return this.handlers.push({fulfilled:t,rejected:e}),this.handlers.length-1},r.prototype.eject=function(t){this.handlers[t]&&(this.handlers[t]=null)},r.prototype.forEach=function(t){o.forEach(this.handlers,function(e){null!==e&&t(e)})},t.exports=r},786:function(t,e,n){"use strict";function r(t){t.cancelToken&&t.cancelToken.throwIfRequested()}var o=n(765),a=n(789),s=n(772),i=n(769),u=n(794),c=n(792);t.exports=function(t){return r(t),t.baseURL&&!u(t.url)&&(t.url=c(t.baseURL,t.url)),t.headers=t.headers||{},t.data=a(t.data,t.headers,t.transformRequest),t.headers=o.merge(t.headers.common||{},t.headers[t.method]||{},t.headers||{}),o.forEach(["delete","get","head","post","put","patch","common"],function(e){delete t.headers[e]}),(t.adapter||i.adapter)(t).then(function(e){return r(t),e.data=a(e.data,e.headers,t.transformResponse),e},function(e){return s(e)||(r(t),e&&e.response&&(e.response.data=a(e.response.data,e.response.headers,t.transformResponse))),Promise.reject(e)})}},787:function(t,e,n){"use strict";t.exports=function(t,e,n,r,o){return t.config=e,n&&(t.code=n),t.request=r,t.response=o,t}},788:function(t,e,n){"use strict";var r=n(773);t.exports=function(t,e,n){var o=n.config.validateStatus;n.status&&o&&!o(n.status)?e(r("Request failed with status code "+n.status,n.config,null,n.request,n)):t(n)}},789:function(t,e,n){"use strict";var r=n(765);t.exports=function(t,e,n){return r.forEach(n,function(n){t=n(t,e)}),t}},790:function(t,e,n){"use strict";function r(){this.message="String contains an invalid character"}function o(t){for(var e,n,o=String(t),s="",i=0,u=a;o.charAt(0|i)||(u="=",i%1);s+=u.charAt(63&e>>8-i%1*8)){if((n=o.charCodeAt(i+=.75))>255)throw new r;e=e<<8|n}return s}var a="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";r.prototype=new Error,r.prototype.code=5,r.prototype.name="InvalidCharacterError",t.exports=o},791:function(t,e,n){"use strict";function r(t){return encodeURIComponent(t).replace(/%40/gi,"@").replace(/%3A/gi,":").replace(/%24/g,"$").replace(/%2C/gi,",").replace(/%20/g,"+").replace(/%5B/gi,"[").replace(/%5D/gi,"]")}var o=n(765);t.exports=function(t,e,n){if(!e)return t;var a;if(n)a=n(e);else if(o.isURLSearchParams(e))a=e.toString();else{var s=[];o.forEach(e,function(t,e){null!==t&&void 0!==t&&(o.isArray(t)&&(e+="[]"),o.isArray(t)||(t=[t]),o.forEach(t,function(t){o.isDate(t)?t=t.toISOString():o.isObject(t)&&(t=JSON.stringify(t)),s.push(r(e)+"="+r(t))}))}),a=s.join("&")}return a&&(t+=(-1===t.indexOf("?")?"?":"&")+a),t}},792:function(t,e,n){"use strict";t.exports=function(t,e){return e?t.replace(/\/+$/,"")+"/"+e.replace(/^\/+/,""):t}},793:function(t,e,n){"use strict";var r=n(765);t.exports=r.isStandardBrowserEnv()?function(){return{write:function(t,e,n,o,a,s){var i=[];i.push(t+"="+encodeURIComponent(e)),r.isNumber(n)&&i.push("expires="+new Date(n).toGMTString()),r.isString(o)&&i.push("path="+o),r.isString(a)&&i.push("domain="+a),!0===s&&i.push("secure"),document.cookie=i.join("; ")},read:function(t){var e=document.cookie.match(new RegExp("(^|;\\s*)("+t+")=([^;]*)"));return e?decodeURIComponent(e[3]):null},remove:function(t){this.write(t,"",Date.now()-864e5)}}}():function(){return{write:function(){},read:function(){return null},remove:function(){}}}()},794:function(t,e,n){"use strict";t.exports=function(t){return/^([a-z][a-z\d\+\-\.]*:)?\/\//i.test(t)}},795:function(t,e,n){"use strict";var r=n(765);t.exports=r.isStandardBrowserEnv()?function(){function t(t){var e=t;return n&&(o.setAttribute("href",e),e=o.href),o.setAttribute("href",e),{href:o.href,protocol:o.protocol?o.protocol.replace(/:$/,""):"",host:o.host,search:o.search?o.search.replace(/^\?/,""):"",hash:o.hash?o.hash.replace(/^#/,""):"",hostname:o.hostname,port:o.port,pathname:"/"===o.pathname.charAt(0)?o.pathname:"/"+o.pathname}}var e,n=/(msie|trident)/i.test(navigator.userAgent),o=document.createElement("a");return e=t(window.location.href),function(n){var o=r.isString(n)?t(n):n;return o.protocol===e.protocol&&o.host===e.host}}():function(){return function(){return!0}}()},796:function(t,e,n){"use strict";var r=n(765);t.exports=function(t,e){r.forEach(t,function(n,r){r!==e&&r.toUpperCase()===e.toUpperCase()&&(t[e]=n,delete t[r])})}},797:function(t,e,n){"use strict";var r=n(765),o=["age","authorization","content-length","content-type","etag","expires","from","host","if-modified-since","if-unmodified-since","last-modified","location","max-forwards","proxy-authorization","referer","retry-after","user-agent"];t.exports=function(t){var e,n,a,s={};return t?(r.forEach(t.split("\n"),function(t){if(a=t.indexOf(":"),e=r.trim(t.substr(0,a)).toLowerCase(),n=r.trim(t.substr(a+1)),e){if(s[e]&&o.indexOf(e)>=0)return;s[e]="set-cookie"===e?(s[e]?s[e]:[]).concat([n]):s[e]?s[e]+", "+n:n}}),s):s}},798:function(t,e,n){"use strict";t.exports=function(t){return function(e){return t.apply(null,e)}}},799:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.cancle=e.dingYue=e.columnList=e.mapgui=e.daysInfo=e.oceanInfo=e.goodData=e.userLoadInfo=e.userLoad=e.dayInfo=e.topInfo=e.goodsInfo=e.goodsList=e.transMore=e.bootsList=e.CostDates=e.CostSearch=e.costLoad=e.shippingCost=e.bootsInfo=e.queryTrack=e.basicData=e.conversionData=e.conversionAllData=e.tideDataApp=e.tideData=e.queryValueSet=e.shipInfoData=e.trader=e.saveForm=e.start=void 0;var r=n(800),o=function(t){return t&&t.__esModule?t:{default:t}}(r),a=configURL.shipUrl,s=configURL.infoUrl,i=configURL.appUrl;e.start=function(t){return o.default.post(a+"/shipPact/queryValueSetEle.json",t).then(function(t){return t.data})},e.saveForm=function(t){return o.default.post(a+"/pallet/save.json",t).then(function(t){return t.data})},e.trader=function(t){return o.default.post(a+"/traderNameList.json",t).then(function(t){return t.data})},e.shipInfoData=function(t){return o.default.post(a+"/sysShip/findSysShipByImoName.json",t).then(function(t){return t.data})},e.queryValueSet=function(t){return o.default.post(a+"/sysShip/queryValueSet.json",t).then(function(t){return t.data})},e.tideData=function(t){return o.default.post(a+"/tide/findTideListByPortDate.json",t).then(function(t){return t.data})},e.tideDataApp=function(t){return o.default.post(i+"/ship/tide/findTideListByPortDate.json",t).then(function(t){return t.data})},e.conversionAllData=function(t){return o.default.post(a+"/om/unit/findAll.json",t).then(function(t){return t.data})},e.conversionData=function(t){return o.default.post(a+"/om/unit/getRateInfo.json",t).then(function(t){return t.data})},e.basicData=function(t){return o.default.post(a+"/om/basicTariff/findBasicTariffByPort.json",t).then(function(t){return t.data})},e.queryTrack=function(t){return o.default.post(a+"/shipPact/queryTrack.json",t).then(function(t){return t.data})},e.bootsInfo=function(t){return o.default.post(a+"/shipPlate/findShipPlateDetailForground.json",t).then(function(t){return t.data})},e.shippingCost=function(t){return o.default.post(a+"/om/dealPoints/getDealPointsDates.json",t).then(function(t){return t.data})},e.costLoad=function(t){return o.default.post(a+"/om/basicTariff/findAllPortList.json",t).then(function(t){return t.data})},e.CostSearch=function(t){return o.default.post(a+"/om/basicTariff/freightTools.json",t).then(function(t){return t.data})},e.CostDates=function(t){return o.default.post(a+"/om/dealPoints/getDealPointsDates.json",t).then(function(t){return t.data})},e.bootsList=function(t){return o.default.post(a+"/shipPlate/queryAllShipPlateList.json",t).then(function(t){return t.data})},e.transMore=function(t){return o.default.post(a+"/transit/queryMoreTransitList.json",t).then(function(t){return t.data})},e.goodsList=function(t){return o.default.post(a+"/pallet/findMorePalletList.json",t).then(function(t){return t.data})},e.goodsInfo=function(t){return o.default.post(a+"/pallet/findPalletDetail.json",t).then(function(t){return t.data})},e.topInfo=function(t){return o.default.post(a+"/shipPlate/findShipPlateList.json",t).then(function(t){return t.data})},e.dayInfo=function(t){return o.default.post(a+"/om/dealPoints/getTodayDealPoints.json",t).then(function(t){return t.data})},e.userLoad=function(t){return o.default.get(a+"/current_user/get.json",t).then(function(t){return t.data})},e.userLoadInfo=function(t){return o.default.get(s+"/current_user/get.json",t).then(function(t){return t.data})},e.goodData=function(t){return o.default.post(a+"/pallet/findPalletList.json",t).then(function(t){return t.data})},e.oceanInfo=function(t){return o.default.post(s+"/front/infoListOS.json",t).then(function(t){return t.data})},e.daysInfo=function(t){return o.default.post(s+"/front/infoListOS.json",t).then(function(t){return t.data})},e.mapgui=function(t){return o.default.post(a+"/api/geojson/waypoint.json",t).then(function(t){return t.data})},e.columnList=function(t){return o.default.post(s+"/column/columnList.json",t).then(function(t){return t.data})},e.dingYue=function(t){return o.default.post(s+"/subscribe/subscribeColumn.json",t).then(function(t){return t.data})},e.cancle=function(t){return o.default.post(s+"/subscribe/removeSubscribe.json",t).then(function(t){return t.data})}},800:function(t,e,n){"use strict";function r(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(361),a=r(o),s=n(780),i=r(s),u=function(){var t=window.location.href,e={},n=/[?&][^?&]+=[^?&]+/g,r=t.match(n);return r&&r.forEach(function(t){var n=t.substring(1).split("="),r=decodeURIComponent(n[0]),o=decodeURIComponent(n[1]);e[r]=o}),e._gt}();i.default.defaults.headers.post["Content-Type"]="application/json;charset=UTF-8",i.default.defaults.headers.get["Content-Type"]="application/json;charset=UTF-8",e.default=i.default.create({baseURL:"",headers:{token:u},transformRequest:[function(t,e){return(0,a.default)(t)}]})},801:function(t,e){function n(t){return!!t.constructor&&"function"==typeof t.constructor.isBuffer&&t.constructor.isBuffer(t)}function r(t){return"function"==typeof t.readFloatLE&&"function"==typeof t.slice&&n(t.slice(0,0))}/*!
 * Determine if an object is a Buffer
 *
 * @author   Feross Aboukhadijeh <https://feross.org>
 * @license  MIT
 */
t.exports=function(t){return null!=t&&(n(t)||r(t)||!!t._isBuffer)}}});
//# sourceMappingURL=22.7b1b37822c584f5e6cba.js.map