package com.sinochem.crude.trade.transport.commons.exceptions;

import com.sinochem.crude.trade.common.exception.BizException;


public class TransportException extends BizException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6854801395723117773L;

	public TransportException(String code, String msg) {
		super(msg);
		super.setCode(code);
		super.setType("IT");
		super.setData(msg);
	}

	public TransportException(TYPE type) {
		super(type.getDesc());
		super.setCode(type.getCode());
		super.setType("IT");
		super.setData(type.getDesc());
	}

	/**
	 * 代码定义规则 
	 */
	public enum TYPE {
		//高
		ITSH001("ITSH001", "用户信息为空"), ITSH002("ITSH002", "uuid为空"), 	ITSH003("ITSH003", "运单数据为空"),
		ITSH004("ITSH004", "船货装港信息为空"), ITSH005("ITSH005", "运单id为空"), ITSH006("ITSH006", "运单uuid为空"),
		ITSH007("ITSH007", "航次开始信息为空"), ITSH008("ITSH008", "船货卸港信息为空"), ITSH009("ITSH009", "在途数据为空"),
		ITSH010("ITSH010", "货物装港信息为空"), ITSH011("ITSH011", "货物卸港信息为空"), ITSH012("ITSH012", "船盘uuid为空"),
		ITSH013("ITSH013", "船盘数据为空"), ITSH014("ITSH014", "船盘状态发生改变，请刷新重试"), ITSH015("ITSH015", "操作人类型为空"),
		ITSH016("ITSH016", "货盘uuid为空"), ITSH017("ITSH017", "货盘数据为空"), ITSH018("ITSH018", "货盘状态发生改变，请刷新重试"),
		ITSH019("ITSH019", "运单状态发生改变，请刷新重试"), ITSH020("ITSH020", "货盘id为空"),ITSH021("ITSH021", "甲方信息为空"),
		ITSH022("ITSH022", "乙方信息为空"),ITSH023("ITSH023", "船舶信息为空"),ITSH024("ITSH024", "租约日为空"),
		ITSH025("ITSH025", "船舶库船舶未找到"),ITSH026("ITSH026", "租船协议uuid为空"),ITSH027("ITSH027", "租船协议数据为空"),
		ITSH028("ITSH028", "租船人信息为空"),ITSH029("ITSH029", "船东为空"),ITSH030("ITSH030", "船名为空"),
		ITSH031("ITSH031", "装期为空"),ITSH032("ITSH032", "最小货量为空"),ITSH033("ITSH033", "WS点为空"),
		ITSH034("ITSH034", "合同规定航速为空"),ITSH035("ITSH035", "滞期费率为空"),ITSH036("ITSH036", "经纪人为空"),
		ITSH037("ITSH037", "允许装卸时间为空"),ITSH038("ITSH038", "船合同uuid为空"),ITSH039("ITSH039", "船合同数据为空"),
		ITSH040("ITSH040", "航次开始list为空"),ITSH041("ITSH041", "油种为空"),/*ITSH042("ITSH042", "配载计划装量为空"),
		ITSH043("ITSH043", "配载计划温度为空"),ITSH044("ITSH044", "配载计划装港吃水为空"),ITSH045("ITSH045", "配载计划卸港吃水为空"),
		ITSH046("ITSH046", "配载计划API为空"),*/ITSH047("ITSH047", "装港list为空"),ITSH048("ITSH048", "装港为空"),
		ITSH049("ITSH049", "ETA为空"),/*ITSH050("ITSH050", "预计靠泊时间为空"),ITSH051("ITSH051", "NOR递交时间为空"),
		ITSH052("ITSH052", "引水上船时间为空"),ITSH053("ITSH053", "起锚时间为空"),ITSH054("ITSH054", "靠泊完成时间为空"),
		ITSH055("ITSH055", "实际装货开始时间为空"),ITSH056("ITSH056", "实际装货完成时间为空"),ITSH057("ITSH057", "预计离港时间为空"),
		ITSH058("ITSH058", "实际离港时间为空"),ITSH059("ITSH059", "拆管时间为空"),*/ITSH060("ITSH060", "请先至少选择一个租船协议"),
		ITSH061("ITSH061", "请选维护航次开始信息"),ITSH062("ITSH062", "请选维护船舶装港信息"),ITSH063("ITSH063", "请选至少维护一条在途信息"),
		ITSH064("ITSH064", "日期为空"),/*ITSH065("ITSH065", "时间为空"),ITSH066("ITSH066", "位置为空"),
		ITSH067("ITSH067", "平均速度（24h）为空"),ITSH068("ITSH068", "平均速度（全程）为空"),ITSH069("ITSH069", "RPM为空"),
		ITSH070("ITSH070", "卸港ETA信息为空"),ITSH071("ITSH071", "海况为空"),ITSH072("ITSH072", "明水为空"),
		ITSH073("ITSH073", "气相硫化氢为空"),*/ITSH074("ITSH074", "船舶在途uuid为空"),ITSH075("ITSH075", "卸港为空"),
		/*ITSH076("ITSH076", "预计到港时间为空"),ITSH077("ITSH077", "实际卸货开始时间为空"),ITSH078("ITSH078", "实际卸货完成时间为空"),
		ITSH079("ITSH079", "卸港商检指定为空"),ITSH080("ITSH080", "卸港商检指定联系方式为空"),ITSH081("ITSH081", "卸港监卸为空"),
		ITSH082("ITSH082", "卸港监卸联系方式为空"),ITSH083("ITSH083", "卸港船代为空"),ITSH084("ITSH084", "卸港船代联系方式为空"),*/
		ITSH085("ITSH085", "卸港list为空"),ITSH086("ITSH086", "租船协议状态发生改变，请刷新重试"),ITSH087("ITSH087", "船合同状态发生改变，请刷新重试"),
		ITSH088("ITSH088", "协议数据异常"),ITSH089("ITSH089", "值集类型为空"),/*ITSH090("ITSH090", "提单日为空"),
		ITSH091("ITSH091", "提单净桶为空"),ITSH092("ITSH092", "提单毛桶为空"),ITSH093("ITSH093", "提单净吨为空"),
		ITSH094("ITSH094", "提单毛吨为空"),ITSH095("ITSH095", "API为空"),ITSH096("ITSH096", "水杂含量为空"),
		ITSH097("ITSH097", "装港明水数量为空"),ITSH098("ITSH098", "船量毛桶为空"),ITSH099("ITSH099", "船量毛吨为空"),
		ITSH500("ITSH500", "短量比例（桶）为空"),ITSH501("ITSH501", "短量比例（吨）为空"),ITSH503("ITSH503", "装船数量为空"),
		ITSH504("ITSH504", "卸港船毛桶为空"),ITSH505("ITSH505", "卸港船毛吨为空"),ITSH506("ITSH506", "卸港商检毛桶为空"),
		ITSH507("ITSH507", "卸港商检毛吨为空"),ITSH508("ITSH508", "卸港商检净桶为空"),ITSH509("ITSH509", "卸港商检净吨为空"),
		ITSH510("ITSH510", "卸港国检净桶为空"),ITSH511("ITSH511", "卸港国检净吨为空"),ITSH512("ITSH512", "卸港罐毛桶为空"),
		ITSH513("ITSH513", "卸港罐毛吨为空"),ITSH514("ITSH514", "提单短量（%毛桶）为空"),ITSH515("ITSH515", "提单短量（%毛吨）为空"),
		ITSH516("ITSH516", "国检短量（%净吨）为空"),ITSH517("ITSH517", "国检短量（%净桶）为空"),ITSH518("ITSH518", "ROB桶为空"),*/
		ITSH519("ITSH519", "货物装港信息多条异常"),ITSH520("ITSH520", "货物卸港信息多条异常"),ITSH521("ITSH521", "一条协议只能维护一条装港信息"),
		ITSH522("ITSH522", "一条协议只能维护一条卸港信息"),/*ITSH523("ITSH523", "装港list为空"),*/ITSH524("ITSH524", "船装港uuid为空"),
		ITSH525("ITSH525", "船卸港uuid为空"),ITSH526("ITSH526", "查询编号为空"),ITSH527("ITSH527", "装港油种名称不能重复"),
		ITSH528("ITSH528", "卸港油种名称不能重复"),ITSH529("ITSH529", "航次已结束"),ITSH530("ITSH530", "有订单租船必须维护货物装港信息"),
		ITSH531("ITSH531", "有订单租船必须维护货物卸港信息"),ITSH532("ITSH532", "当前订单已经生成租船需求"),ITSH533("ITSH533", "需求类型为空"),
		ITSH534("ITSH534", "需求类型错误"),ITSH535("ITSH535", "当前用户公司信息为空"),ITSH536("ITSH536", "在途信息一天只能维护一条"),
		ITSH537("ITSH537", "请先维护装货信息"),ITSH538("ITSH538", "同步订单装港信息接口异常"),ITSH539("ITSH539", "同步订单卸港信息接口异常"),
		/*ITSH540("ITSH540", "同步订单装货信息接口异常"),ITSH541("ITSH541", "同步订单卸货信息接口异常"),ITSH542("ITSH542", "公司id为空，您不是企业身份"),*/
		ITSH543("ITSH543", "订单详情查询接口异常"),ITSH544("ITSH544", "卸港指定为空"),ITSH545("ITSH545", "查询企业信息接口异常"),
		ITSH546("ITSH546", "此租船需求指定承运商不是您，请刷新需求列表"),/*ITSH547("ITSH547", "不能指定自己为承运商"),*/ITSH548("ITSH548", "请先维护航次开始信息"),
		/*ITSH549("ITSH549", "不能操作别人的数据"),*/ITSH550("ITSH550", "类型为空"),ITSH551("ITSH551", "日期格式不正确"),
		ITSH552("ITSH552", "系统异常"),ITSH553("ITSH553", "航次开始信息已存在"),ITSH554("ITSH554", "会员资质类型为空"),
		ITSH555("ITSH555", "会员根据epMemberI查询企业信息接口异常"),ITSH556("ITSH556", "根据装港和油种未找到船务装港信息"),
		ITSH557("ITSH557", "根据卸港和油种未找到船务卸港信息"),ITSH558("ITSH558", "根据订单编号未找到租船信息"),ITSH559("ITSH559", "租船状态发送改变，请重新进入该页面"),
		ITSH560("ITSH560", "此需求已生成协议"),ITSH561("ITSH561", "同步订单船舶信息接口异"),
		
	
		
		
		//庄  ITSH100
		/*ITSH100("ITSH100", "租船信息为空"),*/
		ITSH101("ITSH101", "租船信息已作废"),
		/*ITSH102("ITSH102", "租船uuid为空"),
		ITSH103("ITSH103", "运单id为空"),*/
		ITSH104("ITSH104", "租船信息未发布不可作废"),
		ITSH105("ITSH105", "租船信息不可确认"),
		ITSH106("ITSH106", "订单编号为空"),
		/*ITSH107("ITSH107", "货盘uuid为空"),
		ITSH108("ITSH108", "货盘id为空"),*/
		ITSH109("ITSH109", "卸港和卸港区域不能同时为空"),
		ITSH110("ITSH110", "装港和装港区域不能同时为空"),
		/*ITSH111("ITSH111", "船合同uuid为空"),
		ITSH112("ITSH112", "船合同信息为空"),*/
		ITSH113("ITSH113", "租船list为空"),
		
		/*ITSH114("ITSH114", "请登录后查看"),
		ITSH115("ITSH115","用户信息为空"),*/
		
		
		
		
		//王  ITSH200
		ITSH200("ITSH200", "船舶uuid为空"),
		/*ITSH201("ITSH201", "船舶信息为空"),*/
		ITSH202("ITSH202", "船舶代码 IMO为空"),
		ITSH203("ITSH203", "船名为空"),
		ITSH204("ITSH204", "船旗为空"),
		ITSH205("ITSH205", "船型为空"),
		ITSH206("ITSH206", "建造商为空"),
		ITSH207("ITSH207", "船级社为空"),
		ITSH208("ITSH208", "建造年份为空"),
		ITSH209("ITSH209", "船体为空"),
		ITSH210("ITSH210", "船长为空"),
		ITSH211("ITSH211", "船宽为空"),
		ITSH212("ITSH212", "吃水为空"),
		ITSH213("ITSH213", "载重吨为空"),
		ITSH214("ITSH214", "总吨为空"),
		ITSH215("ITSH215", "载重容积为空"),
		ITSH216("ITSH216", "附件为空"),
		ITSH217("ITSH217", "船舶ID为空"),
		ITSH218("ITSH218", "附件uuid为空"),
		
		ITSH220("ITSH220", "潮汐uuid为空"),
		ITSH221("ITSH221", "潮汐信息为空"),
		ITSH222("ITSH222", "港口code为空"),
		ITSH223("ITSH223", "港口名称为空"),
		ITSH224("ITSH224", "潮汐小时为空"),
		ITSH225("ITSH225", "潮汐分钟为空"),
		ITSH226("ITSH226", "潮高为空"),
		ITSH227("ITSH227", "潮汐日期为空"),
		
		
		/*ITSH230("ITSH230", "船盘uuid为空"),
		ITSH231("ITSH231", "船盘信息为空"),
		ITSH232("ITSH232", "船名为空"),
		ITSH233("ITSH233", "船型为空"),
		ITSH234("ITSH234", "建造年份为空"),*/
		ITSH235("ITSH235", "船东为空"),
		/*ITSH236("ITSH236", "载重吨为空"),*/
		ITSH237("ITSH237", "船位为空"),
		/*ITSH238("ITSH238", "ETA为空"),*/
		ITSH239("ITSH239", "经纪人为空"),
		ITSH240("ITSH240", "备注为空"),
		
		
		
		//浩 ITSH300~399
		/*ITSH300("ITSH300", "用户信息为空"),*/ITSH301("ITSH301", "查询单位对象为空"),ITSH302("ITSH302", "查询单位比率对象为空"),
		ITSH303("ITSH303", "查询单位uuid为空"),ITSH304("ITSH304", "查询单位比率uuid为空"),ITSH305("ITSH305", "单位类型为空"),
		ITSH306("ITSH306", "单位名称为空"),ITSH307("ITSH307", "单位是否为参考为空"),ITSH308("ITSH308", "单位比率参考单位为空"),
		ITSH309("ITSH309", "单位比率对比单位为空"),ITSH310("ITSH310", "单位比率底数为空"),ITSH311("ITSH311", "单位比率指数为空"),
		
		ITSH312("ITSH312","基础运价对象为空"),ITSH313("ITSH313","基础运价对象第一装港港口名为空"),ITSH314("ITSH314","基础运价对象第一卸港港口名为空"),
		ITSH315("ITSH315","基础运价对象基础为空"),ITSH316("ITSH316","基础运价对象运价年份为空"),ITSH317("ITSH317","基础运价对象里程为空"),
		ITSH318("ITSH318","基础运价对象UUID为空"),ITSH330("ITSH330","基础运价对象地区为空"),
		
		ITSH319("ITSH319","成交点数对象为空"),ITSH320("ITSH320","成交点数对象的uuid为空"),
		ITSH321("ITSH321","成交点数对象的地区名为空"),ITSH322("ITSH322","成交点数对象的船型为空"),
		ITSH323("ITSH323","成交点数对象的价格为空"),ITSH324("ITSH324","成交点数对象的名称为空"),
		ITSH325("ITSH325","成交点数对象的日期为空"),ITSH326("ITSH326","成交点数对象的预估单桶运费为空"),
		ITSH327("ITSH327","成交点数对象的参考路线为空"),ITSH328("ITSH328","已经存在的数据"),
		ITSH329("ITSH329","插入成交点数数据失败"),
		
		
		
		
		ITSH331("ITSH331","结算单发票号为空"),ITSH332("ITSH332","结算单租船协议编号为空"),
		ITSH333("ITSH333","结算单收款方为空"),ITSH334("ITSH334","结算单付款方为空"),
		ITSH335("ITSH335","结算单发票附件为空"),ITSH336("ITSH336","结算单发票附件路径为空"),
		ITSH337("ITSH337","结算单Freight Quantily为空"),ITSH338("ITSH338","结算单Freight overage Quantily为空"),
		ITSH339("ITSH339","结算单Freight overage Flatrate为空"),ITSH340("ITSH340","结算单Freight overage Rate为空"),
		ITSH341("ITSH341","结算单Freight overage Pct为空"),ITSH342("ITSH342","结算单Address Commission Pct为空"),
		ITSH343("ITSH343","结算单Address Commission Quantily为空"),ITSH344("ITSH344","结算单Freight Total为空"),
		ITSH345("ITSH345","结算单Freight overage Total为空"),ITSH346("ITSH346","结算单Address Commission Total为空"),
		ITSH347("ITSH347","结算单Freight Amount为空"),ITSH348("ITSH348","结算单Freight overage Amount为空"),
		ITSH349("ITSH349","结算单Address Commission Amount为空"),ITSH350("ITSH350","结算单Balance in USD为空"),
		ITSH351("ITSH351","结算单协议uuid为空"),ITSH352("ITSH352","结算单船合同uuid为空"),
		
		
		
		
		
		//ZhengC ITSH400~499
		ITSH400("ITSH400","询盘信息多条异常"),
		ITSH401("ITSH401","船舶保存类型为空"),
		ITSH402("ITSH402","船舶审核标识为空"),
		ITSH403("ITSH403","船舶审核驳回信息为空"),
		ITSH404("ITSH404","询盘uuid为空"),
		ITSH405("ITSH405","询盘信息为空"),
		ITSH406("ITSH406","询盘状态发生改变，请刷新重试"),
		ITSH407("ITSH407","用户角色信息为空"),
		ITSH408("ITSH408","发布操作，时效为空"),
		ITSH409("ITSH409","excel文件数据格式不正确"),
		ITSH410("ITSH410","数据保存失败，船名匹配异常"),
		ITSH411("ITSH411","open为空"),
		ITSH412("ITSH412","ETA Fujairah和ETA Cabinda都为空"),
		ITSH413("ITSH413","时效为空"),
		ITSH414("ITSH414","导出类别异常"),
		ITSH415("ITSH415","用户具有多角色"),
		ITSH416("ITSH416","船舶代码imo已存在"),
		ITSH417("ITSH417","当前租船需求已指定承运商，不能再进行询盘操作"),
		
		
		
		//hetao ITSH600~699
		ITSH601("ITSH601","船意向UUID为空"),
		
		ITSH602("ITSH602","报盘信息为空"),
		ITSH603("ITSH603","报盘状态发生改变，请刷新重试"),
		ITSH604("ITSH604","港口地区关系为空"),
		ITSH605("ITSH605","第一装港为空"),
		ITSH606("ITSH606","企业全称为空"),
		ITSH607("ITSH607","角色flag为空"),
		ITSH608("ITSH608","报盘UUID为空"),
		
		//niuwk ITSH700~799
		ITSH701("ITSH701","关键字不能为空"),
		;
		
		private String code;
		private String desc;
		

		TYPE(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public String getCode() {
			return this.code;
		}

		public String getDesc() {
			return this.desc;
		}
	}

}
