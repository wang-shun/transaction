package com.sinochem.crude.trade.info.service.impl;

import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFFooter;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
//import com.runyi.ryplat.api.commons.SimplePageInfo;
import com.sinochem.crude.trade.common.SimplePageInfo;
import com.sinochem.crude.trade.common.exception.BizException;
import com.sinochem.crude.trade.common.result.ResultDatas;
import com.sinochem.crude.trade.common.utils.DateTimeUtils;
import com.sinochem.crude.trade.common.utils.KeyGenUtils;
import com.sinochem.crude.trade.info.domain.Quality;
import com.sinochem.crude.trade.info.domain.Symbol;
import com.sinochem.crude.trade.info.domain.SymbolPrice;
import com.sinochem.crude.trade.info.model.SymbolPriceVO;
import com.sinochem.crude.trade.info.dao.SymbolPriceMapper;
import com.sinochem.crude.trade.info.service.SymbolPriceService;
import com.sinochem.crude.trade.info.service.SymbolService;
import com.sinochem.crude.trade.member.user.CurrentUser;

import jodd.util.StringUtil;

@Service
public class SymbolPriceServiceImpl implements SymbolPriceService {
	@Autowired
	private SymbolPriceMapper symbolPriceMapper;
	
	@Autowired
	private SymbolService symbolService;
	
	public SymbolPriceMapper getMapper(){
		return symbolPriceMapper;
	} 
	
	/**
	 * 新增
	 */
	@Override
	public int insertRecord(SymbolPrice symbolprice){
		symbolprice.setUuid(KeyGenUtils.newUuid());
		//TODO 拿到操作人信息
		symbolprice.setCreateDate(DateTimeUtils.currentDate());
		return symbolPriceMapper.insertRecord(symbolprice);
	}
	
	/**
	 * 根据主键物理删除, 慎用！！！
	 */
	@Override
	public int deleteById(Long id) throws BizException{
		if (id == null) {
			throw new BizException("id 为空，不能修改 ");
		}
		return symbolPriceMapper.deleteById(id);
	}
	
	 /**
     * 根据条件-物理删除对象执行delete语句, 慎用！！！
     */
    @Override
    public int deleteRecords(SymbolPrice  record){
    	return symbolPriceMapper.deleteRecords(record);
    }
	
	/**
	 * 根据主键-修改对象
	 */
	@Override
	public int updateRecordById(SymbolPrice symbolPrice) throws BizException{
		if ( symbolPrice.getId() == null  ) {
			throw new BizException("id 为空，不能修改 ");
		}
		symbolPrice.setUpdateDate(DateTimeUtils.currentDate());
		return symbolPriceMapper.updateRecordById(symbolPrice);
	}
	
	/**
	 * 根据uuid-修改对象
	 */
	@Override
	public int updateRecordByUuid(SymbolPrice symbolPrice) throws BizException{
		if ( symbolPrice.getUuid() == null) {
			throw new BizException("uuid为空，不能修改 ");
		}
		symbolPrice.setUpdateDate(DateTimeUtils.currentDate());
		return symbolPriceMapper.updateRecordByUuid(symbolPrice);
	}
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	@Override
	public int updateRecords(Map<String, Object> map) {
		return symbolPriceMapper.updateRecords(map);
	}
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	@Override
	public int updateRecords(SymbolPrice symbolPrice){
		return symbolPriceMapper.updateRecords(symbolPrice.toMap());
	}
	
	
	/**
	 * 根据主键-查询对象
	 */
	@Override
	public SymbolPrice findByPrimaryKey(Long id){
		return  symbolPriceMapper.findByPrimaryKey(id);	
	}
	
	/**
	 * 根据uuid查询对象
	 */
	@Override
	public SymbolPrice findByUuid(String uuid){
		return  symbolPriceMapper.findByUuid(uuid);	
	}
	
	/**
	 * 根据对象-查询对象列表
	 */
	@Override
	public List<SymbolPrice> queryByEntitys(SymbolPrice symbolPrice){
		return  symbolPriceMapper.queryByEntitys(symbolPrice);
	}
	
	/**
	 * 根据条件-查询全部
	 */
	@Override
	public List<Map<String, Object>> queryRecords(Map<String, Object> map){
		return symbolPriceMapper.queryRecords(map);
	}
	
	/**
	 * 根据条件-分页查询
	 */
	@Override
	public Page<Map<String, Object>> queryRecords(Map<String, Object> map, SimplePageInfo pageInfo){
		PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getCount()); 
		return (Page<Map<String, Object>>) symbolPriceMapper.queryRecords(map);
	}
	
	/**
	 * 根据条件-查询记录条数
	 */
	@Override
	public int countRecords(Map<String, Object> map){
		return symbolPriceMapper.countRecords(map);
	}

	@Override
	public Page<Map<String, Object>> querySymbolPriceIndex(Map<String, Object> beanToMap, SimplePageInfo pageInfo) {
		PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getCount()); 
		return (Page<Map<String, Object>>) symbolPriceMapper.querySymbolPriceIndex(beanToMap);
	}

	@Override
	public boolean saveOrUpdateSymbolPrice(SymbolPrice target, CurrentUser user) {
		Symbol symbol=new Symbol();
		if(!StringUtils.isBlank(target.getUuid())) {
			if(StringUtils.isEmpty(target.getSymbolName())){
				symbol.setSymbol(target.getSymbol());
				List<Symbol> list = symbolService.queryByEntitys(symbol);
				if(!CollectionUtils.isEmpty(list)){
					target.setSymbolName(list.get(0).getSymbolName());
				}
			}
			target.setUpdateUser(user.getName());
			return this.updateRecordByUuid(target) == 1;
		}else {
			symbol.setSymbol(target.getSymbol());
			List<Symbol> list = symbolService.queryByEntitys(symbol);
			if(!CollectionUtils.isEmpty(list)){
				target.setSymbolName(list.get(0).getSymbolName());
			}
			target.setCreateUser(user.getName());
			return this.insertRecord(target) == 1;
		}
	}

	@Override
	public List<Map<String, Object>> getSymbolPrice(SymbolPriceVO vo) {
		return symbolPriceMapper.getSymbolPrice(vo);
	}
	
	//**************************以下方法为开发者补充*********************************/
	@Override
	public void exportList(HttpServletResponse response,SymbolPriceVO vo) {
		Map<String, Object> map=new HashMap<>();
		map.put("tradeDate", vo.getTradeDate());
		List<Map<String, Object>> list = symbolPriceMapper.querySymbolPriceIndex(map);
		// 开始导出excel文件
		// 1.创建 一个工作簿 -- excel --默认的名称
		HSSFWorkbook userExcel = new HSSFWorkbook();
		// 获取字体样式
		HSSFFont font = userExcel.createFont();
		font.setFontName("黑体");
		font.setFontHeightInPoints((short) 17);// 设置字体的大小
		font.setColor(IndexedColors.BLUE_GREY.getIndex());// 字体颜色
		font.setItalic(true); // 设置字体为斜体字

		// 样式
		HSSFCellStyle setBorder = userExcel.createCellStyle();// 获取一个样式
		setBorder.setFont(font);
		setBorder.setAlignment(HorizontalAlignment.CENTER); // 居中

		// 第三列样式
		HSSFCellStyle setBorder1 = userExcel.createCellStyle();// 获取一个样式
		setBorder1.setAlignment(HorizontalAlignment.CENTER); // 居中
		setBorder1.setVerticalAlignment(VerticalAlignment.CENTER);// 垂直居中

		// 创建一个sheet
		HSSFSheet userSheet = userExcel.createSheet("合约数据");

		// 设置列宽，第一个参数代表列id(从0开始),第2个参数代表宽度值 参考 ："2012-08-10"的宽度为2500
		userSheet.setColumnWidth(0, 5000);
		userSheet.setColumnWidth(1, 5000);
		userSheet.setColumnWidth(2, 3766);
		userSheet.setColumnWidth(3, 3766);
		userSheet.setColumnWidth(4, 3766);
		userSheet.setColumnWidth(5, 5000);
		userSheet.setColumnWidth(6, 3766);
		userSheet.setColumnWidth(7, 3766);
		userSheet.setColumnWidth(8, 3766);
		userSheet.setColumnWidth(9, 3766);
		userSheet.setColumnWidth(10, 3766);
		// 设置时间
		HSSFCellStyle DateStyle = userExcel.createCellStyle();
		HSSFDataFormat dataFormat = userExcel.createDataFormat();
		DateStyle.setDataFormat(dataFormat.getFormat("yyyy/mm/dd"));
		DateStyle.setAlignment(HorizontalAlignment.CENTER);
		userSheet.setDefaultColumnStyle(2, DateStyle);
		// 3.通过sheet对象根据下标创建【new】行 row ---创建表头 下标从0 开始
		HSSFRow rowOne = userSheet.createRow(0);
		// 4.通过row对象根据下标创建cell单元格 -- 下标从0开始
		String[] cellArray = new String[] {  "合约名称", "合约编码", "交易日期", "开盘价" , "最高价","最低价", "收盘价", "平均价", "持仓量", "成交量", "结算价"};
		for (int i = 0; i < cellArray.length; i++) {
			rowOne.createCell(i).setCellValue(cellArray[i]);
		}
		// 行数的开始位置
		int start = 1;
		if (list != null && list.size() != 0) {
			// 设置眉脚
			HSSFHeader header = (HSSFHeader) userSheet.getHeader();
			header.setLeft("第一页");
			HSSFFooter footer = (HSSFFooter) userSheet.getFooter();
			footer.setRight("总共 " + list.size() + " 条数据 ");
			// 循环 userList 给sheet 的每一行的每一个单元格赋值
			for (int j = 0; j < list.size(); j++) {
				Map<String, Object> datas = list.get(j);
				if (datas == null) {
					continue;
				}
				// 循环创建行
				HSSFRow row = userSheet.createRow(start);
				// 设置第三列样式
				String date="";
				if(datas.get("tradeDate")==null){
					date=vo.getTradeDate();
				}else{
					date=(String)datas.get("tradeDate").toString();
				}
				if(StringUtil.isBlank(StringUtil.toString(datas.get("symbolName")))){
					continue;
				}
				row.createCell(0).setCellValue(StringUtil.toString(datas.get("symbolName")));
				row.createCell(1).setCellValue(StringUtil.toString(datas.get("symbol")));
				HSSFCell cellData = row.createCell(2);
				cellData.setCellStyle(DateStyle);
				cellData.setCellValue(DateTimeUtils.toDate(date,"yyyy-MM-dd"));
				if(datas.get("openPrice")!=null){
					row.createCell(3).setCellValue((String)datas.get("openPrice").toString());
				}
				if(datas.get("highPrice")!=null){
					row.createCell(4).setCellValue((String)datas.get("highPrice").toString());
				}
				if(datas.get("lowPrice")!=null){
					row.createCell(5).setCellValue((String)datas.get("lowPrice").toString());
				}
				if(datas.get("closePrice")!=null){
					row.createCell(6).setCellValue((String)datas.get("closePrice").toString());
				}
				if(datas.get("avgPrice")!=null){
					row.createCell(7).setCellValue((String)datas.get("avgPrice").toString());
				}
				if(datas.get("openInterest")!=null){
					row.createCell(8).setCellValue((String)datas.get("openInterest").toString());
				}
				if(datas.get("volume")!=null){
					row.createCell(9).setCellValue((String)datas.get("volume").toString());
				}
				if(datas.get("settlementPrice")!=null){
					row.createCell(10).setCellValue((String)datas.get("settlementPrice").toString());
				}
				
				
				 
				// 行数的开始位置 自增 +1
				start++;
			}
		}

		// 创建字节输出流
		ServletOutputStream os = null;
		try {
			response.reset();
			// 不同类型的文件对应不同的MIME类型
			response.setContentType("application/x-msdownload");
			// inline在浏览器中直接显示，不提示用户下载
			// attachment弹出对话框，提示用户进行下载保存本地
			// 默认为inline方式
			String fileName=vo.getTradeDate()+"合约价格";
			response.setHeader("Content-Disposition", "attachment;filename="
					+new String(fileName.getBytes(),"iso-8859-1")+ ".xls");
			// 响应到浏览器的输出流
			os = response.getOutputStream();
			// 写excel工作簿
			userExcel.write(os);
			// 输出到本地磁盘目录
			File f = new File("D:\\合约价格.xls");
			// 创建file文件
			f.createNewFile();
			userExcel.write(f);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					os = null;
				}
			}
			if (userExcel != null) {
				try {
					userExcel.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					userExcel = null;
				}
			}
		}
		
	}

	@Override
	public ResultDatas<Void> crudeOilImport(InputStream inputStream, CurrentUser user) {
		ResultDatas<Void> res = new ResultDatas<Void>();
		
		try{
			 HSSFWorkbook workbook = null;
			 try{
				 workbook = new HSSFWorkbook(inputStream);
			 }catch(Exception e){
				 res.setMessage("导入失败");
			 }
			 
			 inputStream.close();
			 HSSFSheet sheet = workbook.getSheetAt(0);
			 for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
				// XSSFRow 代表一行数据
				 HSSFRow row = sheet.getRow(rowIndex);
				if (row == null ) {
					res.setMessage("导入数据为空");
					continue;
				}
				HSSFCell ext2 = row.getCell(1);// 合约代码
				if(ext2==null){
					res.setFail("前"+(rowIndex-1)+"行执行成功，第"+(rowIndex)+"行合约代码格式错误");
					return res;
				}
				HSSFCell ext3= row.getCell(2);// 交易日期
				Date tradeDate =new Date();
				if(ext3==null){
					res.setFail("前"+(rowIndex-1)+"行执行成功，第"+(rowIndex)+"行交易日期格式错误");
					return res;
				}else{
					tradeDate = ext3.getDateCellValue();// 交易日期
				}
				HSSFCell ext4 = row.getCell(3);// 开盘价
				HSSFCell ext5 = row.getCell(4);// 最高价
				HSSFCell ext6 = row.getCell(5);// 最低价
				HSSFCell ext7 = row.getCell(6);// 收盘价
				HSSFCell ext8 = row.getCell(7);// 平均价
				HSSFCell ext9 = row.getCell(8);// 持仓量
				HSSFCell ext10 = row.getCell(9);// 成交量
				HSSFCell ext11 = row.getCell(10);// 结算价
				
				SymbolPrice symbolprice=new SymbolPrice();
				SymbolPrice query=new SymbolPrice();
				query.setSymbol(ext2+"");
				query.setTradeDate(tradeDate);
				Long id = null;
				List<SymbolPrice> list = this.queryByEntitys(query);
				if(!CollectionUtils.isEmpty(list)){
					id = list.get(0).getId();
				}
				symbolprice.setSymbol(ext2+"");
				symbolprice.setTradeDate(tradeDate);
				symbolprice.setOpenPrice(ext4 == null ?null:new BigDecimal(ext4+""));
				symbolprice.setHighPrice(ext5 == null ?null:new BigDecimal(ext5+""));
				symbolprice.setLowPrice(ext6 == null ?null:new BigDecimal(ext6+""));
				symbolprice.setClosePrice(ext7 == null ?null:new BigDecimal(ext7+""));
				symbolprice.setAvgPrice(ext8 == null ?null:new BigDecimal(ext8+""));
				symbolprice.setOpenInterest(ext9 == null ?null:new BigDecimal(ext9+""));
				symbolprice.setVolume(ext10 == null ?null:new BigDecimal(ext10+""));
				symbolprice.setSettlementPrice(ext11 == null ?null:new BigDecimal(ext11+""));
				symbolprice.setId(null);
				if(id==null){
					symbolprice.setCreateUser(user.getName());
					this.insertRecord(symbolprice);
				}else{
					symbolprice.setId(id);
					symbolprice.setUpdateUser(user.getName());
					this.updateRecordById(symbolprice);
				}
			}
			 // 操作完毕后，记得要将打开的 HSSFWorkbook 关闭
			 ((Closeable) workbook).close(); 
		 }catch(Exception e){
			 res.setMessage(e.getMessage());
		 }
		return res;
	}

	@Override
	public Map<String, Object> getNewSymbolPrice(SymbolPriceVO vo) {
		return symbolPriceMapper.getNewSymbolPrice(vo);
	}
}