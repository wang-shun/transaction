webpackJsonp([19],{1269:function(t,e,n){n(1354);var a=n(14)(n(1302),n(1391),"data-v-45f92d3a",null);t.exports=a.exports},1302:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=n(30);e.default={data:function(){return{noticedata:{},uuid:"",imgUrlBanner:""}},methods:{dataList:function(){var t=this,e={pageSize:10,pageNum:1};(0,a.noticeList)(e).then(function(e){t.uuid=e.datas[0].uuid;var n={uuid:e.datas[0].uuid};(0,a.noticeData)(n).then(function(e){t.noticedata=e.dataList})})},getBanner:function(){var t=this;(0,a.queryCarousels)({typeCode:"WEB",pageCode:"zx_index_barner",pageNum:1,pageSize:10}).then(function(e){t.imgUrlBanner=e.datas[0].imageUrl})}},mounted:function(){this.getBanner(),this.dataList()}}},1325:function(t,e,n){e=t.exports=n(33)(),e.push([t.i,".inf-cont-left[data-v-45f92d3a]{width:100%!important}.cont-left-title[data-v-45f92d3a]{text-align:center}","",{version:3,sources:["D:/workspace_crude_dev/info/src/views/info/notice.vue"],names:[],mappings:"AACA,gCAAgC,oBAAuB,CACtD,AACD,kCAAkC,iBAAmB,CACpD",file:"notice.vue",sourcesContent:["\n.inf-cont-left[data-v-45f92d3a]{width: 100% !important;\n}\n.cont-left-title[data-v-45f92d3a]{text-align: center;\n}\n\n"],sourceRoot:""}])},1354:function(t,e,n){var a=n(1325);"string"==typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);n(124)("7781912a",a,!0)},1391:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("section",[n("div",{staticClass:"inr-banner"},[n("img",{attrs:{src:this.imgUrlBanner,alt:""}})]),t._v(" "),n("div",{staticClass:"inner"},[t._m(0),t._v(" "),n("div",{staticClass:"inf-content clearfix"},[n("div",{staticClass:"inf-cont-left activeLeft"},[n("div",{staticClass:"cont-left-title"},[t._v(t._s(t.noticedata.title))]),t._v(" "),n("div",{staticClass:"cont-left-text",staticStyle:{overflow:"hidden",width:"95%"},domProps:{innerHTML:t._s(t.noticedata.contentWithHtml)}})])])])])},staticRenderFns:[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"inf-info"},[t._v("当前位置："),n("a",{attrs:{href:""}},[t._v("首页 >")]),n("a",{attrs:{href:"javascript:;"}},[t._v(">")]),n("span",{staticClass:"inf-info-tet"},[t._v("公告")])])}]}}});
//# sourceMappingURL=19.79071d092e2f5c6521c7.js.map