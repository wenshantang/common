package cn.aresoft.fhcf.common.util;

import java.util.List;

import com.puff.framework.container.DBInfoContainer;

/**
 * 数据库-表-工具类
 *
 */
public class TableUtil {
	
	/**
	 * 获取class对应的表的所有列组合字符
	 * @param clazz class类
	 * @return 返回字符串
	 */
	public static String getColumns(Class<?> clazz){
		StringBuffer querySQL = new StringBuffer();
		List<String> columnNames = DBInfoContainer.getColumns(clazz);
		for (int i = 0, size = columnNames.size(); i < size; i++) {
			if (i != 0) {
				querySQL.append(",");
			}
			querySQL.append(columnNames.get(i));
		}
		return querySQL.toString();
	}
	
	/**
	 * 获取class对应的表的所有列组合字符
	 * @param clazz class类
	 * @param as 表别名
	 * @return 返回字符串
	 */
	public static String getColumns(Class<?> clazz,String as){
		StringBuffer querySQL = new StringBuffer();
		List<String> columnNames = DBInfoContainer.getColumns(clazz);
		for (int i = 0, size = columnNames.size(); i < size; i++) {
			if (i != 0) {
				querySQL.append(",");
			}
			querySQL.append(as+"."+columnNames.get(i));
		}
		return querySQL.toString();
	}
	
}
