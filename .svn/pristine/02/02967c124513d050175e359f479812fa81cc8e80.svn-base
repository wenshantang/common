package cn.aresoft.fhcf.common.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.puff.framework.annotation.Bean;
import com.puff.framework.utils.StringUtil;
import com.puff.jdbc.core.PageRecord;
import com.puff.jdbc.core.SqlBuilder;

import cn.aresoft.common.model.CommonParam;
import cn.aresoft.common.service.impl.CenterServiceImpl;
import cn.aresoft.fhcf.common.model.product.ProductInfo;
import cn.aresoft.fhcf.common.service.ProductInfoService;
@Bean(id = "productInfoService")
public class ProductInfoServiceImpl extends CenterServiceImpl<ProductInfo>implements ProductInfoService {
	@Override
	public PageRecord<ProductInfo>  paging(ProductInfo p, CommonParam param) {
		StringBuffer sql = new StringBuffer(SqlBuilder.buildQuerySQL(ProductInfo.class));
		List<Object> condition = new ArrayList<Object>();
		sql.append(" where 1=1 ");
		if(StringUtil.notBlank(p.getPro_code())){
			sql.append(" and  pro_code=? ");
			condition.add(p.getPro_code());
		}
		if(StringUtil.notBlank(p.getPro_name())){
			sql.append(" and  pro_name=? ");
			condition.add(p.getPro_name());
		}
		if(StringUtil.notBlank(p.getPro_style())){
			sql.append(" and  pro_style =? ");
			condition.add(p.getPro_style());
		}
		if(StringUtil.notBlank(p.getI_prostatus())){
			sql.append(" and  i_prostatus =? ");
			condition.add(p.getI_prostatus());
		}
		
		if(StringUtil.notBlank(p.getPro_direction())){
			sql.append(" and   pro_direction =? ");
			condition.add(p.getPro_direction());
		}
		sql.append("  order by public_time desc");
		return paging(sql.toString(), condition,param);
	}

	@Override
	public ProductInfo queryByCode(String code) {
		String sql ="select * from tb_product_info where pro_code=?";
		return query(sql, code);
	}

	@Override
	public List<ProductInfo> products() {
		String sql ="select * from tb_product_info ";
		return queryList(sql);
	}
}

