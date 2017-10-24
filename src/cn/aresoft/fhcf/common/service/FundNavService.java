package cn.aresoft.fhcf.common.service;
import java.util.List;

import cn.aresoft.common.service.BaseService;
import cn.aresoft.fhcf.common.model.product.FundNav;
public interface FundNavService extends BaseService<FundNav>{
	/**
	 * 基金净值走势图
	 * @param procode 产品代码
	 * @param starttime 开始时间
	 * @param endtime 结束时间
	 * @return
	 */
	List<FundNav> fundchart(String procode,String starttime,String endtime);
	/**
	 * 基金净值走势图
	 * @param procode 产品代码
	 * @param date_condition 时间标志
	 * @return
	 */
	List<FundNav> fundchart(String procode, String date_condition);
}
