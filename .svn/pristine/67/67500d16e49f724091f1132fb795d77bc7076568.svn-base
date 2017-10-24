package cn.aresoft.fhcf.common.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.puff.framework.annotation.Bean;
import com.puff.framework.utils.StringUtil;
import com.puff.jdbc.core.PageRecord;
import com.puff.jdbc.core.SqlBuilder;

import cn.aresoft.common.model.CommonParam;
import cn.aresoft.common.service.impl.CenterServiceImpl;
import cn.aresoft.fhcf.common.model.product.ProductReport;
import cn.aresoft.fhcf.common.service.ProductReportService;
@Bean(id = "productReportService")
public class ProductReportServiceImpl extends CenterServiceImpl<ProductReport>implements ProductReportService {
	@Override
	public PageRecord<ProductReport>  paging(ProductReport p, CommonParam param) {
		StringBuffer sql = new StringBuffer(SqlBuilder.buildQuerySQL(ProductReport.class));
		List<Object> condition = new ArrayList<Object>();
		sql.append(" where 1=1 ");
		if(StringUtil.notBlank(p.getPro_code())){
			sql.append(" and  pro_code =? ");
			condition.add(p.getPro_code());
		}
		if(StringUtil.notBlank(p.getPro_name())){
			sql.append(" and  pro_name  like ? ");
			condition.add("%"+p.getPro_name()+"%");
		}
		sql.append("  order by d_createtime  desc");
		return paging(sql.toString(), condition,param);
	}
}

