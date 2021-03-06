package cn.aresoft.fhcf.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.puff.framework.annotation.Bean;
import com.puff.framework.utils.StringUtil;
import com.puff.jdbc.core.PageRecord;
import com.puff.jdbc.core.SqlBuilder;

import cn.aresoft.common.model.CommonParam;
import cn.aresoft.common.service.impl.CenterServiceImpl;
import cn.aresoft.fhcf.common.model.msg.Umsg;
import cn.aresoft.fhcf.common.service.UmsgService;

@Bean(id = "umsgService")
public class UmsgServiceImpl extends CenterServiceImpl<Umsg>implements UmsgService {
	@Override
	public PageRecord<Umsg> paging(Umsg u, CommonParam param) {
		StringBuffer sql = new StringBuffer(SqlBuilder.buildQuerySQL(Umsg.class));
		List<Object> condition = new ArrayList<Object>();
		sql.append(" where 1=1 ");
		if(StringUtil.notBlank(u.getType_id())){
			sql.append(" and  type_id=? ");
			condition.add(u.getType_id());
		}
		if(StringUtil.notBlank(u.getType())){
			sql.append("  and  type = ? ");
			condition.add(u.getType());
		}
		if(StringUtil.empty(param.getSort())){
			sql.append(" order by  create_time desc ");
		}
		return paging(sql.toString(), condition, param);
	}
}

