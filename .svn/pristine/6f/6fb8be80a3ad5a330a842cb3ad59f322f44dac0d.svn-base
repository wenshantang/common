package cn.aresoft.fhcf.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import cn.aresoft.common.model.CommonParam;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.puff.framework.utils.StringUtil;
import com.puff.jdbc.core.PageRecord;
import com.puff.jdbc.core.Record;

public class InterfaceUtil {
	
	private static ResourceBundle sysconfig = ResourceBundle.getBundle("sysconfig");
	public static String path=sysconfig.getString("api_path");
	public static String queryMFundUrl = path+"/query/queryfund";
	/**基金列表*/
	public static String queryMFundListUrl = path+"/query/queryFundList";
	/**基金详情*/
	public static String queryCompanyInfoUrl = path+"/company/queryCompanyInfo";
	/**基金公司列表*/
	public static String queryCompanyListUrl = path+"/company/queryCompanyList";
	/**变更基金状态*/
	public static String updateFundStatuUrl = path+"/update/fundIsSue";
	/**变更产品管理人（基金公司）状态*/
	public static String fundCompUpIsUrl = path+"/update/fundCompUpIs";
	/**推荐基金*/
	public static String recommendfund = path+"/query/recommendfund";
	/**首页利率*/
	public static String Interestrate = path+"/query/queryYHCFLLandHBJJNHSYL";
	/**查询基金列表，据基金管理人代码列表*/
	public static String queryFundListByKp =  path+"/query/queryFundListByKp";
	/**（非）货币基金对比*/
	public static String queryFundCompare = path+"/query/queryFundCompare";
	/**货币基金列表*/
	public static String querylistfund = path+"/query/querylistfund";
	/**净值走势\历史明细表（非货币）*/
	public static String queryfundhq = path+"/query/queryfundhq";
	/**分红配售历史表*/
	public static String queryMFDividend = path+"/query/queryMFDividend";
	/**费率*/
	public static String queryFundFree = path+"/query/queryFundFree";
	/**基金经理*/
	public static String queryCompanyManger = path+"/company/queryCompanyManger";
	/**基金公告*/
	public static String queryFundAds = path+"/company/queryFundAds";
	/**
	 * 查询非货币基金
	 * @param fundCode
	 * @return
	 */
	public static JSONObject queryMFund(String fundCode){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("fundcode", fundCode);
		String result = HttpUtil.post(InterfaceUtil.queryMFundUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		return json;
	}
	/**
	 * 首页利率
	 * @param zcgmtype 资产规模类型
	 * @param shlvtype 银行拆放利率类型
	 * @param frrlv 银行回购利率类型
	 * @param fundcode 基金代码
	 * @return
	 */
	public static JSONObject queryLilv(String zcgmtype,String shlvtype,String frrlv,String fundcode){
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("zcgm", zcgmtype);
		map.put("shlv", shlvtype);
		map.put("frrlv", frrlv);
		map.put("fundcode", fundcode);
		String result=HttpUtil.post(InterfaceUtil.Interestrate, map);
		JSONObject json = JSONObject.parseObject(result);
		if( !"0000".equals(json.getString("code"))){
			return null;
		}
		return json.getJSONObject("data");
	}
	/**
	 * 查询基金基本信息列表
	 * @param fundcode 基金代码
	 * @param shortname 基金简称
	 * @param keeper 基金管理人
	 * @param issure 发布状态
	 * @return
	 */
	public static PageRecord<Record> queryFundList(String fundcode,String shortname,String keeper,String issue,CommonParam param){
		HashMap<String, String> map = new HashMap<String, String>();
		if(StringUtil.notEmpty(fundcode)){
			map.put("fundcode", fundcode);
		}
		if(StringUtil.notEmpty(shortname)){
			map.put("shortname", shortname);
		}
		if(StringUtil.notEmpty(keeper)){
			map.put("keeper", keeper);
		}
		if(StringUtil.notEmpty(issue)){
			map.put("issue", issue);
		}
		map.put("page", param.getPage()+"");
		if(param.getRows()>0){
			map.put("pagesize", param.getRows()+"");
		}
		if(StringUtil.notEmpty(param.getSort())){
			map.put("sortparam", param.getSort());
		}
		if(StringUtil.notEmpty(param.getOrder())){
			map.put("sorttype", param.getOrder());
		}
		String result = HttpUtil.post(InterfaceUtil.queryMFundListUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		String code = json.getString("code");
		if(StringUtil.empty(code)||!code.equals("0000")){
			return null;
		}
		PageRecord<Record> pageRecord = conversionObject(json.getJSONObject("data"));
		return pageRecord;
	}
	/**
	 * 查询基金基本信息列表
	 * @param fundcode 基金代码
	 * @param shortname 基金简称
	 * @param keeper 基金管理人
	 * @param issure 发布状态
	 * @param isIn 是否包含  Y/N
	 * @return
	 */
	public static PageRecord<Record> queryFundListByKp(String fundcode,String shortname,List<String> keepers,String issure,String isIn,CommonParam param){
		HashMap<String, String> map = new HashMap<String, String>();
		if(StringUtil.notEmpty(fundcode)){
			map.put("fundcode", fundcode);
		}
		if(StringUtil.notEmpty(shortname)){
			map.put("shortname", shortname);
		}
		if(keepers!=null&&keepers.size()>0){
			String temp = "";
			for (int i = 0; i < keepers.size(); i++) {
				temp+=keepers.get(i)+",";
			}
			temp=temp.substring(0,temp.length()-1);
			map.put("keepers", temp);
		}
		if(StringUtil.notEmpty(issure)){
			map.put("issure", issure);
		}
		if(StringUtil.notEmpty(isIn)){
			map.put("isin", isIn);
		}
		map.put("page", param.getPage()+"");
		if(param.getRows()>0){
			map.put("pagesize", param.getRows()+"");
		}
		if(StringUtil.notEmpty(param.getSort())){
			map.put("sortparam", param.getSort());
		}
		if(StringUtil.notEmpty(param.getOrder())){
			map.put("sorttype", param.getOrder());
		}
		String result = HttpUtil.post(InterfaceUtil.queryFundListByKp, map);
		JSONObject json = JSONObject.parseObject(result);
		String code = json.getString("code");
		if(StringUtil.empty(code)||!code.equals("0000")){
			return null;
		}
		PageRecord<Record> pageRecord = conversionObject(json.getJSONObject("data"));
		return pageRecord;
	}
	/**
	 * 查询热门推荐基金详情
	 * @param fundcodes 基金代码
	 */
	public static PageRecord<Record> recommendfund(String fundcodes){
		HashMap<String,String> map =new HashMap<String,String>();
		map.put("fundcodes", fundcodes);
		String result=HttpUtil.post(InterfaceUtil.recommendfund, map);
		JSONObject json = JSONObject.parseObject(result);
		String code = json.getString("code");
		if(StringUtil.empty(code)||!code.equals("0000")){
			return null;
		}
		PageRecord<Record> pageRecord = conversionObject(json.getJSONObject("data"));
		return pageRecord;
		
	}
	/**
	 *根据类型 查询热门推荐基金详情货币型
	 * @param fundcodes 基金代码
	 */
	public static PageRecord<Record> recommendfundbytype(String fundtype,String issue){
		HashMap<String,String> map =new HashMap<String,String>();
		map.put("fundtype", fundtype);
		map.put("issue",issue );
		String result=HttpUtil.post(InterfaceUtil.recommendfund, map);
		JSONObject json = JSONObject.parseObject(result);
		String code = json.getString("code");
		if(StringUtil.empty(code)||!code.equals("0000")){
			return null;
		}
		PageRecord<Record> pageRecord = conversionObject(json.getJSONObject("data"));
		return pageRecord;
		
	}
	/**
	 * 查询基金基本信息列表
	 * @return
	 */
	public static PageRecord<Record> queryFundList(CommonParam param){
		param.setPage(1);
		param.setRows(0);
		return queryFundList(null, null, null, null,param);
	}
	/**
	 * 基金发布状态变更
	 * @param fundcode 基金代码
	 * @param fundsta 基金状态
	 * @param issue 发布状态
	 * @param is_credit 发布状态
	 * @return
	 */
	public static String[] updateFundStatu(String fundcode,String fundsta,String issue,String is_credit){
		String[] ret = new String[2];
		HashMap<String, String> map = new HashMap<String, String>();
		if(StringUtil.notEmpty(fundcode)){
			map.put("fundcode", fundcode);
		}
		if(StringUtil.notEmpty(issue)){
			map.put("issue", issue);
		}
		if(StringUtil.notEmpty(fundsta)){
			map.put("sta_jy", fundsta);
		}
		if(StringUtil.notEmpty(is_credit)){
			map.put("iscredit", is_credit);
		}
		String result = HttpUtil.post(InterfaceUtil.updateFundStatuUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		ret[0] = json.getString("code");
		ret[1] = json.getString("msg");
		return ret;
	}
	/**
	 * 查询基金公司信息
	 * @param compcode
	 * @param compname
	 * @param isintf
	 * @param issure
	 * @param param
	 * @return
	 */
	public static PageRecord<Record> queryCompanyList(String compcode,String compname,String isintf,String issure,CommonParam param){
		HashMap<String, String> map = new HashMap<String, String>();
		if(StringUtil.notEmpty(compcode)){
			map.put("compcode", compcode);
		}
		if(StringUtil.notEmpty(compname)){
			map.put("compname", compname);
		}
		if(StringUtil.notEmpty(isintf)){
			map.put("isintf", isintf);
		}
		if(StringUtil.notEmpty(issure)){
			map.put("issure", issure);
		}
		map.put("pageno", param.getPage()+"");
		if(param.getRows()>0){
			map.put("pagesize", param.getRows()+"");
		}
		if(StringUtil.notEmpty(param.getSort())){
			map.put("sortparam", param.getSort());
		}
		if(StringUtil.notEmpty(param.getOrder())){
			map.put("sorttype", param.getOrder());
		}
		String result = HttpUtil.post(InterfaceUtil.queryCompanyListUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		String code = json.getString("code");
		if(StringUtil.empty(code)||!code.equals("0000")){
			return null;
		}
		PageRecord<Record> pageRecord = conversionObject(json.getJSONObject("data"));
		return pageRecord;
	}
	/**
	 * 产品管理人状态变更
	 * @param fundcode 基金代码(必须)
	 * @param issue 是否发布 (不变更设null)
	 * @param isintf 是否对接 (不变更设null)
	 * @param iscredit 是否授信 (不变更设null)
	 * @return
	 */
	public static String[] fundCompUpIs(String compcode,String issue,String isintf,String iscredit){
		String[] ret = new String[2];
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("compcode", compcode);
		if(StringUtil.notEmpty(issue)){
			map.put("issue", issue);
		}
		if(StringUtil.notEmpty(isintf)){
			map.put("isintf", isintf);
		}
		if(StringUtil.notEmpty(iscredit)){
			map.put("iscredit", iscredit);
		}
		String result = HttpUtil.post(InterfaceUtil.fundCompUpIsUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		ret[0] = json.getString("code");
		ret[1] = json.getString("msg");
		return ret;
	}
	/**
	 * 转换json字符串为PageRecord<Record>
	 * @param result json字符串
	 * @return
	 */
	public static PageRecord<Record> conversionObject(JSONObject json){
		PageRecord<Record> pageRecord = new PageRecord<Record>();
		JSONArray dataList = json.getJSONArray("dataList");
		pageRecord.setPage(json.getIntValue("page"));
		pageRecord.setPageSize(json.getIntValue("pageSize"));
		pageRecord.setTotalCount(json.getIntValue("totalCount"));
		pageRecord.setTotalPage(json.getIntValue("totalPage"));
		List<Record> dataListReal = new ArrayList<Record>();
		JSONObject tempJson = null;
		Record tempRecord = null;
		for (int i = 0; i < dataList.size(); i++) {
			tempJson = dataList.getJSONObject(i);
			tempRecord = new Record();
			for (Iterator iterator = tempJson.keySet().iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				tempRecord.set(key, tempJson.get(key));
			}
			dataListReal.add(tempRecord);
		}
		pageRecord.setDataList(dataListReal);
		return pageRecord;
	}
	/**
	 * 非货币\货币基金对比
	 * @return
	 */
	public static String queryFundCompare(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryFundCompare, map);
		return info;
	}
	/**
	 * 货币基金列表
	 * @return
	 */
	public static String querylistfund(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.querylistfund, map);
		return info;
	}
	/**
	 * 推荐基金列表
	 * @return
	 */
	public static String recommendfund(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.recommendfund, map);
		return info;
	}
	/**
	 * 净值走势图、历史明细表（非货币）
	 * @return
	 */
	public static String queryfundhq(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryfundhq, map);
		return info;
	}
	/**
	 * 基金经理
	 * @return
	 */
	public static JSONObject queryCompanyManger(String fundcode){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("fundcode", fundcode);
		String info=HttpUtil.post(InterfaceUtil.queryCompanyManger, map);
		JSONObject json = JSONObject.parseObject(info);
		return json;
	}
	/**
	 * 费率
	 * @return
	 */
	public static JSONObject queryFundFree(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryFundFree, map);
		JSONObject json = JSONObject.parseObject(info);
		return json;
	}
	/**
	 * 基金公司介绍
	 * @return
	 */
	public static JSONObject queryCompanyInfoUrl(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryCompanyInfoUrl, map);
		JSONObject json = JSONObject.parseObject(info);
		return json;
	}
	/**
	 * 基金公告
	 * @return
	 */
	public static JSONObject queryFundAds(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryFundAds, map);
		JSONObject json = JSONObject.parseObject(info);
		return json;
	}
	/**
	 * 分红配售历史表
	 * @return
	 */
	public static String queryMFDividend(Map<String,String> map){
		String info=HttpUtil.post(InterfaceUtil.queryMFDividend, map);
		return info;
	}
	public static void main(String[] args) {
//		JSONObject json = InterfaceUtil.queryFundList("1");
//		System.out.println(json.toJSONString());
		System.out.println(InterfaceUtil.recommendfund("000965,000916"));
	}
	
	/**
	 * 首页自动搜索提示
	 * @param fundCode 基金代码
	 * @param type 类型
	 * @return
	 */
	public static JSONObject queryFundList(String fundCode,String type){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("fundcode", fundCode);
		map.put("issure", type);
		String result = HttpUtil.post(InterfaceUtil.queryMFundListUrl, map);
		JSONObject json = JSONObject.parseObject(result);
		return json;
	}
}
