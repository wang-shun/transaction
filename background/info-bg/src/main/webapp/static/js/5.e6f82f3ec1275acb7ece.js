webpackJsonp([5],{1273:function(t,n,i){i(1359);var s=i(14)(i(1306),i(1396),null,null);t.exports=s.exports},1281:function(t,n,i){t.exports=i.p+"static/img/zx_banner2.c47fc86.jpg"},1306:function(t,n,i){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var s=i(30);n.default={data:function(){return{id:"",info:{}}},methods:{init:function(){var t=this,n={id:this.id};(0,s.columnDetails)(n).then(function(n){console.log(n),t.info=n.datas})},goBack:function(){navigator.userAgent.indexOf("MSIE")>0?navigator.userAgent.indexOf("MSIE 6.0")>0?(window.opener=null,window.close()):(window.open("","_top"),window.top.close()):navigator.userAgent.indexOf("Firefox")>0?window.location.href="about:blank ":(window.opener=null,window.open("","_self",""),window.close())}},mounted:function(){this.id=this.$own.getHref("id"),this.init()}}},1330:function(t,n,i){n=t.exports=i(33)(),n.push([t.i,"","",{version:3,sources:[],names:[],mappings:"",file:"preview.vue",sourceRoot:""}])},1359:function(t,n,i){var s=i(1330);"string"==typeof s&&(s=[[t.i,s,""]]),s.locals&&(t.exports=s.locals);i(124)("215393c7",s,!0)},1396:function(t,n,i){t.exports={render:function(){var t=this,n=t.$createElement,s=t._self._c||n;return s("section",[s("div",{staticClass:"zx-banner"},[s("img",{attrs:{src:i(1281),alt:""}}),t._v(" "),s("ul",{staticClass:"zx-zl-dzsj"},[s("li",[s("span",[t._v(t._s(t.info.articleCount||0)+"篇")]),t._v(" "),s("em",[t._v("文章")])]),t._v(" "),s("li",[s("span",[t._v(t._s(t.info.browseCount||0))]),t._v(" "),s("em",[t._v("总阅读")])]),t._v(" "),s("li",[t._v(" ")]),t._v(" "),s("li",[s("span",[t._v(t._s(t.info.fabulousCount||0))]),t._v(" "),s("em",[t._v("被赞")])]),t._v(" "),s("li",[s("span",[t._v(t._s(t.info.subscribeCount||0))]),t._v(" "),s("em",[t._v("订阅量")])])]),t._v(" "),s("div",{staticClass:"zx-myho zx-zlbn"},[s("span",[s("img",{attrs:{src:t.info.columnCover,alt:""}})]),t._v(" "),s("em",[t._v(t._s(t.info.columnTitle)),s("a",{staticClass:"zx-my-tgz",attrs:{href:"javascript:;"}},[t._v("订阅专栏")])])])]),t._v(" "),s("div",{staticClass:"inner"},[s("div",{staticClass:"zx-zlyl-t"},[s("h1",[t._v(t._s(t.info.authorName))]),t._v(" "),s("p",[t._v(t._s(t.info.columnBrief))])]),t._v(" "),s("div",{staticClass:"zx-butt zx-xz-butt"},[s("button",{staticClass:"zx-btn-bc zx-btn-fh",attrs:{type:"button"},on:{click:t.goBack}},[t._v("返回")])])])])},staticRenderFns:[]}}});
//# sourceMappingURL=5.e6f82f3ec1275acb7ece.js.map