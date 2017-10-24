package cn.aresoft.fhcf.common;

import com.puff.ioc.BeanFactory;

public class StartInJar {

	String beanPkg = "cn.aresoft.fhcf.common.service,cn.aresoft.fhcf.common.cache";

	public void run() {
		for (String bean : beanPkg.split(",")) {
			BeanFactory.loadPackage(bean);
		}
	}

}
