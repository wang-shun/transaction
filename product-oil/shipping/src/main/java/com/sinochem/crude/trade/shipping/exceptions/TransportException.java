package com.sinochem.crude.trade.shipping.exceptions;

import com.sinochem.it.b2b.common.exception.BizException;


public class TransportException extends BizException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6854801395723117773L;

	public TransportException(String msg) {
		super(msg);
	}

	public TransportException(TYPE type) {
		super(type.getDesc());
	}

	/**
	 * 代码定义规则 
	 */
	public enum TYPE {
		//高
		ITSH001("ITSH001", "身份信息为空"), ITSH002("ITSH002", "uuid为空"), 	ITSH003("ITSH003", "运单数据为空"),
		ITSH004("ITSH004", "船货装港信息为空"), ITSH005("ITSH005", "运单id为空"), ITSH006("ITSH006", "运单uuid为空"),
		ITSH007("ITSH007", "航次开始信息为空"), ITSH008("ITSH008", "船货卸港信息为空"), ITSH009("ITSH009", "在途数据为空"),
		ITSH010("ITSH010", "货物装港信息为空"), ITSH011("ITSH011", "货物卸港信息为空"), ITSH012("ITSH012", "船盘uuid为空"),
		ITSH013("ITSH013", "船盘数据为空"), ITSH014("ITSH014", "船盘状态发生改变，请刷新重试"), ITSH015("ITSH015", "操作人类型为空"),
		ITSH016("ITSH016", "货盘uuid为空"), ITSH017("ITSH017", "货盘数据为空"), ITSH018("ITSH018", "货盘状态发生改变，请刷新重试"),
		ITSH019("ITSH019", "运单状态发生改变，请刷新重试"), ITSH020("ITSH020", "货盘id为空"),ITSH021("ITSH021", "甲方信息为空"),
		ITSH022("ITSH022", "乙方信息为空"),ITSH023("ITSH023", "船舶信息为空"),ITSH024("ITSH024", "租约日为空"),
		ITSH025("ITSH025", "船舶库船舶未找到"),ITSH026("ITSH026", "代理协议uuid为空"),ITSH027("ITSH027", "代理协议数据为空"),
		ITSH028("ITSH028", "租船人信息为空"),ITSH029("ITSH029", "船东为空"),ITSH030("ITSH030", "船名为空"),
		ITSH031("ITSH031", "装期为空"),ITSH032("ITSH032", "最小货量为空"),ITSH033("ITSH033", "WS点为空"),
		ITSH034("ITSH034", "合同规定航速为空"),ITSH035("ITSH035", "滞期费率为空"),ITSH036("ITSH036", "经纪人为空"),
		ITSH037("ITSH037", "允许装卸时间为空"),ITSH038("ITSH038", "船合同uuid为空"),ITSH039("ITSH039", "船合同数据为空"),
		ITSH040("ITSH040", "航次开始list为空"),ITSH041("ITSH041", "油种为空"),ITSH042("ITSH042", "配载计划装量为空"),
		ITSH043("ITSH043", "配载计划温度为空"),ITSH044("ITSH044", "配载计划装港吃水为空"),ITSH045("ITSH045", "配载计划卸港吃水为空"),
		ITSH046("ITSH046", "配载计划API为空"),ITSH047("ITSH047", "装港list为空"),ITSH048("ITSH048", "装港为空"),
		ITSH049("ITSH049", "ETA为空"),ITSH050("ITSH050", "预计靠泊时间为空"),ITSH051("ITSH051", "NOR递交时间为空"),
		ITSH052("ITSH052", "引水上船时间为空"),ITSH053("ITSH053", "起锚时间为空"),ITSH054("ITSH054", "靠泊完成时间为空"),
		ITSH055("ITSH055", "实际装货开始时间为空"),ITSH056("ITSH056", "实际装货完成时间为空"),ITSH057("ITSH057", "预计离港时间为空"),
		ITSH058("ITSH058", "实际离港时间为空"),ITSH059("ITSH059", "拆管时间为空"),ITSH060("ITSH060", "请先至少选择一个代理协议"),
		ITSH061("ITSH061", "请选维护航次开始信息"),ITSH062("ITSH062", "请选维护船舶装港信息"),ITSH063("ITSH063", "请选至少维护一条在途信息"),
		ITSH064("ITSH064", "日期为空"),ITSH065("ITSH065", "时间为空"),ITSH066("ITSH066", "位置为空"),
		ITSH067("ITSH067", "平均速度（24h）为空"),ITSH068("ITSH068", "平均速度（全程）为空"),ITSH069("ITSH069", "RPM为空"),
		ITSH070("ITSH070", "卸港ETA信息为空"),ITSH071("ITSH071", "海况为空"),ITSH072("ITSH072", "明水为空"),
		ITSH073("ITSH073", "气相硫化氢为空"),ITSH074("ITSH074", "船舶在途uuid为空"),ITSH075("ITSH075", "卸港为空"),
		ITSH076("ITSH076", "预计到港时间为空"),ITSH077("ITSH077", "实际卸货开始时间为空"),ITSH078("ITSH078", "实际卸货完成时间为空"),
		ITSH079("ITSH079", "卸港商检指定为空"),ITSH080("ITSH080", "卸港商检指定联系方式为空"),ITSH081("ITSH081", "卸港监卸为空"),
		ITSH082("ITSH082", "卸港监卸联系方式为空"),ITSH083("ITSH083", "卸港船代为空"),ITSH084("ITSH084", "卸港船代联系方式为空"),
		ITSH085("ITSH085", "卸港list为空"),ITSH086("ITSH086", "代理协议状态发生改变，请刷新重试"),ITSH087("ITSH087", "船合同状态发生改变，请刷新重试"),
		ITSH088("ITSH088", "协议数据异常"),ITSH089("ITSH089", "值集类型为空"),ITSH090("ITSH090", "提单日为空"),
		ITSH091("ITSH091", "提单净桶为空"),ITSH092("ITSH092", "提单毛桶为空"),ITSH093("ITSH093", "提单净吨为空"),
		ITSH094("ITSH094", "提单毛吨为空"),ITSH095("ITSH095", "API为空"),ITSH096("ITSH096", "水杂含量为空"),
		ITSH097("ITSH097", "装港明水数量为空"),ITSH098("ITSH098", "船量毛桶为空"),ITSH099("ITSH099", "船量毛吨为空"),
		ITSH500("ITSH500", "短量比例（桶）为空"),ITSH501("ITSH501", "短量比例（吨）为空"),ITSH503("ITSH503", "装船数量为空"),
		ITSH504("ITSH504", "卸港船毛桶为空"),ITSH505("ITSH505", "卸港船毛吨为空"),ITSH506("ITSH506", "卸港商检毛桶为空"),
		ITSH507("ITSH507", "卸港商检毛吨为空"),ITSH508("ITSH508", "卸港商检净桶为空"),ITSH509("ITSH509", "卸港商检净吨为空"),
		ITSH510("ITSH510", "卸港国检净桶为空"),ITSH511("ITSH511", "卸港国检净吨为空"),ITSH512("ITSH512", "卸港罐毛桶为空"),
		ITSH513("ITSH513", "卸港罐毛吨为空"),ITSH514("ITSH514", "提单短量（%毛桶）为空"),ITSH515("ITSH515", "提单短量（%毛吨）为空"),
		ITSH516("ITSH516", "国检短量（%净吨）为空"),ITSH517("ITSH517", "国检短量（%净桶）为空"),ITSH518("ITSH518", "ROB桶为空"),
		ITSH519("ITSH519", "货物装港信息多条异常"),ITSH520("ITSH520", "货物卸港信息多条异常"),ITSH521("ITSH521", "一条协议只能维护一条装港信息"),
		ITSH522("ITSH522", "一条协议只能维护一条卸港信息"),ITSH523("ITSH523", "装港list为空"),ITSH524("ITSH524", "船装港uuid为空"),
		ITSH525("ITSH525", "船卸港uuid为空"),ITSH526("ITSH526", "查询编号为空"),ITSH527("ITSH527", "装港油种名称不能重复"),
		ITSH528("ITSH528", "卸港名称不能重复"),ITSH529("ITSH529", "航次已结束"),ITSH530("ITSH530", "有订单租船必须维护货物装港信息"),
		ITSH531("ITSH531", "有订单租船必须维护货物卸港信息"),ITSH532("ITSH532", "chartering enquiry generated"),ITSH533("ITSH533", "需求类型为空"),
		ITSH534("ITSH534", "需求类型错误"),ITSH535("ITSH535", "当前用户公司信息为空"),ITSH536("ITSH536", "在途信息一天只能维护一条"),
		ITSH537("ITSH537", "请先维护装货信息"),ITSH538("ITSH538", "同步订单装港信息接口异常"),ITSH539("ITSH539", "同步订单卸港信息接口异常"),
		ITSH540("ITSH540", "同步订单装货信息接口异常"),ITSH541("ITSH541", "同步订单卸货信息接口异常"),ITSH542("ITSH542", "公司id为空，您不是企业身份"),
		ITSH543("ITSH543", "订单详情查询接口异常"),ITSH544("ITSH544", "卸港指定为空"),ITSH545("ITSH545", "查询企业信息接口异常"),
		ITSH546("ITSH546", "此租船需求指定承运商不是您，请刷新需求列表"),ITSH547("ITSH547", "不能指定自己为承运商"),ITSH548("ITSH548", "请先维护航次开始信息"),
		ITSH549("ITSH549", "不能操作别人的数据"),ITSH550("ITSH550", "导出类型为空"),ITSH551("ITSH551", "日期格式不正确"),
		ITSH552("ITSH552", "系统异常"),ITSH553("ITSH553", "航次开始信息已存在"),ITSH554("ITSH554", "Charter Party generated"),
		
		//庄  ITSH100
		ITSH100("ITSH100", "租船信息为空"),
		ITSH101("ITSH101", "租船信息已作废"),
		ITSH102("ITSH102", "租船uuid为空"),
		ITSH103("ITSH103", "运单id为空"),
		ITSH104("ITSH104", "租船信息未发布不可作废"),
		ITSH105("ITSH105", "租船信息不可确认"),
		ITSH106("ITSH106", "订单编号不能为空"),
		ITSH107("ITSH107", "货盘uuid为空"),
		ITSH108("ITSH108", "货盘id为空"),
		ITSH109("ITSH109", "卸港和卸港区域不能同时为空"),
		ITSH110("ITSH110", "装港和装港区域不能同时为空"),
		ITSH111("ITSH111", "船合同uuid为空"),
		ITSH112("ITSH112", "船合同信息为空"),
		ITSH113("ITSH113", "租船list为空"),
		
		ITSH114("ITSH114", "请登录后查看"),
		ITSH115("ITSH115","用户信息为空"),
		
		ITSH116("ITSH116","船舶确认单Uuid为空"),
		
		
		
		//王  ITSH200
		ITSH200("ITSH200", "船舶uuid为空"),
		ITSH201("ITSH201", "船舶信息为空"),
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
		
		
		ITSH230("ITSH230", "船盘uuid为空"),
		ITSH231("ITSH231", "船盘信息为空"),
		ITSH232("ITSH232", "船名为空"),
		ITSH233("ITSH233", "船型为空"),
		ITSH234("ITSH234", "建造年份为空"),
		ITSH235("ITSH235", "船东为空"),
		ITSH236("ITSH236", "载重吨为空"),
		ITSH237("ITSH237", "船位为空"),
		ITSH238("ITSH238", "ETA为空"),
		ITSH239("ITSH239", "经纪人为空"),
		ITSH240("ITSH240", "备注为空");
				
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
