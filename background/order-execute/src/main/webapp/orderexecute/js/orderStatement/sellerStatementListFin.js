layui.use(['layer', 'form', 'jquery','laypage', 'table', 'laydate'], function(){
	var layer = layui.layer;
	var laydate = layui.laydate;	
 	//执行一个laydate实例
  	laydate.render({
    	elem: '#checkTimeDesc' //指定元素
    		,lang: 'en'
    	,range: true
  	});

	
	// 查看函数
	$('.showFn').on('click',function(){
		var orderStatementUuid = $(this).attr("orderStatementUuid");
		window.location.href = orderServer+"/sellerCenter/orderStatement/infoFin.htm"
		+ "?orderStatementUuid=" + orderStatementUuid;
	});
	
	// 生成正式结算单
	$('.initSett').on('click',function(){
		var orderStatementUuid = $(this).attr("orderStatementUuid");
		window.location.href = orderServer+"/sellerCenter/orderSettlement/infoFin.htm"
		+ "?orderStatementUuid=" + orderStatementUuid;
	});
});	