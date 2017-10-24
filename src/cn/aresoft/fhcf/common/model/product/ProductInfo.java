package cn.aresoft.fhcf.common.model.product;

import cn.aresoft.common.model.BaseModel;

import com.puff.framework.annotation.Column;
import com.puff.framework.annotation.PrimaryKey;
import com.puff.framework.annotation.Table;

@Table("tb_product_info")
public class ProductInfo extends BaseModel {
	private static final long serialVersionUID = 614175932606410339L;
		/**
		 * 产品信息表
		 */
		@PrimaryKey.IDWORKER
		@Column
		private String i_id;//'主键',
		@Column
		private String pro_code;//产品代码
		@Column
		private String pro_name;//产品名称
		@Column
		private String i_prostatus;//'开放状态：0：在售 1：即将开放 2：已售罄 '
		@Column
		private String i_prostyle;//产品风格(用于首页产品的介绍)
		@Column
		private String d_startdate;//开始时间
		@Column
		private String d_enddate;//结束时间
		@Column
		private String pro_due;//运作期
		@Column
		private String vc_leastsubscribe;//购买起点
		@Column
		private String vc_pub1;//投资类型（用于产品列表的产品投向，详情页的投资目标）
		@Column
		private String vc_pub2;//资金投向（用于详情页面的产品投向图片显示）
		@Column
		private String vc_pro_code;//相关产品
		@Column
		private String risk;//风险控制
		@Column
		private String vc_fundtrustee;//托管人
		@Column
		private String vc_tactics;//投资策略（用于产品列表的适合）
		@Column
		private String vc_fundadministrator;//投资顾问
		@Column
		private String vc_fundmanager;//基金经理
		@Column
		private String fund_style;//基金类型
		@Column
		private String d_createtime;//建立时间
		@Column
		private String i_createuser;//建立人
		@Column
		private String d_lastmodtime;//最后修改时间
		@Column
		private String i_moduser;//修改人
		@Column
		private String industry;//所属行业
		@Column
		private String flag;//海外产品详情页面展示的标志
		@Column
		private String pro_style;//'产品类型：固定、浮动、海外'
		@Column
		private String public_time;//发布时间
		@Column
		private String pro_direction;//'产品风向，是用于钱码头产品的分类'
		@Column
		private String pro_features;//用于首页数据的(每月开放)的显示
		@Column
		private String pro_term;//产品期限
		@Column
		private String vc_pro_name;//相关产品的名称
		@Column
		private String pro_merits;//产品的优点，用于pc首页的资金灵活配置
		@Column
		private String pro_short_name;//产品简介
		@Column
		private String pro_fit;//适合
		
		public String getPro_fit() {
			return pro_fit;
		}
		public void setPro_fit(String pro_fit) {
			this.pro_fit = pro_fit;
		}
		public String getPro_short_name() {
			return pro_short_name;
		}
		public void setPro_short_name(String pro_short_name) {
			this.pro_short_name = pro_short_name;
		}
		public String getPro_merits() {
			return pro_merits;
		}
		public void setPro_merits(String pro_merits) {
			this.pro_merits = pro_merits;
		}
		public String getVc_pro_name() {
			return vc_pro_name;
		}
		public void setVc_pro_name(String vc_pro_name) {
			this.vc_pro_name = vc_pro_name;
		}
		public String getPro_term() {
			return pro_term;
		}
		public void setPro_term(String pro_term) {
			this.pro_term = pro_term;
		}
		public String getPro_direction() {
			return pro_direction;
		}
		public void setPro_direction(String pro_direction) {
			this.pro_direction = pro_direction;
		}
		public String getPro_features() {
			return pro_features;
		}
		public void setPro_features(String pro_features) {
			this.pro_features = pro_features;
		}
		public String getPublic_time() {
			return public_time;
		}
		public void setPublic_time(String public_time) {
			this.public_time = public_time;
		}
		public String getPro_style() {
			return pro_style;
		}
		public void setPro_style(String pro_style) {
			this.pro_style = pro_style;
		}
		public String getI_id() {
			return i_id;
		}
		public void setI_id(String i_id) {
			this.i_id = i_id;
		}
		public String getPro_code() {
			return pro_code;
		}
		public void setPro_code(String pro_code) {
			this.pro_code = pro_code;
		}
		public String getPro_name() {
			return pro_name;
		}
		public void setPro_name(String pro_name) {
			this.pro_name = pro_name;
		}
		public String getI_prostatus() {
			return i_prostatus;
		}
		public void setI_prostatus(String i_prostatus) {
			this.i_prostatus = i_prostatus;
		}
		public String getI_prostyle() {
			return i_prostyle;
		}
		public void setI_prostyle(String i_prostyle) {
			this.i_prostyle = i_prostyle;
		}
		public String getD_startdate() {
			return d_startdate;
		}
		public void setD_startdate(String d_startdate) {
			this.d_startdate = d_startdate;
		}
		public String getD_enddate() {
			return d_enddate;
		}
		public void setD_enddate(String d_enddate) {
			this.d_enddate = d_enddate;
		}
		public String getPro_due() {
			return pro_due;
		}
		public void setPro_due(String pro_due) {
			this.pro_due = pro_due;
		}
		public String getVc_leastsubscribe() {
			return vc_leastsubscribe;
		}
		public void setVc_leastsubscribe(String vc_leastsubscribe) {
			this.vc_leastsubscribe = vc_leastsubscribe;
		}
		public String getVc_pub1() {
			return vc_pub1;
		}
		public void setVc_pub1(String vc_pub1) {
			this.vc_pub1 = vc_pub1;
		}
		public String getVc_pub2() {
			return vc_pub2;
		}
		public void setVc_pub2(String vc_pub2) {
			this.vc_pub2 = vc_pub2;
		}
		public String getVc_pro_code() {
			return vc_pro_code;
		}
		public void setVc_pro_code(String vc_pro_code) {
			this.vc_pro_code = vc_pro_code;
		}
		public String getRisk() {
			return risk;
		}
		public void setRisk(String risk) {
			this.risk = risk;
		}
		public String getVc_fundtrustee() {
			return vc_fundtrustee;
		}
		public void setVc_fundtrustee(String vc_fundtrustee) {
			this.vc_fundtrustee = vc_fundtrustee;
		}
		public String getVc_tactics() {
			return vc_tactics;
		}
		public void setVc_tactics(String vc_tactics) {
			this.vc_tactics = vc_tactics;
		}
		public String getVc_fundadministrator() {
			return vc_fundadministrator;
		}
		public void setVc_fundadministrator(String vc_fundadministrator) {
			this.vc_fundadministrator = vc_fundadministrator;
		}
		public String getVc_fundmanager() {
			return vc_fundmanager;
		}
		public void setVc_fundmanager(String vc_fundmanager) {
			this.vc_fundmanager = vc_fundmanager;
		}
		public String getFund_style() {
			return fund_style;
		}
		public void setFund_style(String fund_style) {
			this.fund_style = fund_style;
		}
		public String getD_createtime() {
			return d_createtime;
		}
		public void setD_createtime(String d_createtime) {
			this.d_createtime = d_createtime;
		}
		public String getI_createuser() {
			return i_createuser;
		}
		public void setI_createuser(String i_createuser) {
			this.i_createuser = i_createuser;
		}
		public String getD_lastmodtime() {
			return d_lastmodtime;
		}
		public void setD_lastmodtime(String d_lastmodtime) {
			this.d_lastmodtime = d_lastmodtime;
		}
		public String getI_moduser() {
			return i_moduser;
		}
		public void setI_moduser(String i_moduser) {
			this.i_moduser = i_moduser;
		}
		public String getIndustry() {
			return industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public String getFlag() {
			return flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
	
}