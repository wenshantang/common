package cn.aresoft.fhcf.common.model.product;

import java.math.BigDecimal;

import cn.aresoft.common.model.BaseModel;

import com.puff.framework.annotation.Column;
import com.puff.framework.annotation.PrimaryKey;
import com.puff.framework.annotation.Table;

@Table("tb_fund_nav")
public class FundNav extends BaseModel {
	private static final long serialVersionUID = 614175932606410339L;
		/**
		 * 产品净值表
		 */
		@PrimaryKey.IDWORKER
		@Column
		private String id;//主键Id
		@Column
		private String ValueId;//主键Id
		@Column
		private String FundInfoName;//产品名称
		@Column
		private String FundInfoId;//产品ID
		@Column
		private String ValueType;//净值类型(1、本产品;2、沪深300指数)
		@Column
		private Float netvalue;//单位净值
		@Column
		private Float totalvalue;//累计净值
		@Column
		private String TradeDateType;//更新日期类型  0估值日  1开放日 2内部估值日3成立日
		@Column
		private String TradeDate;//(getdate())	更新日期
		@Column
		private String WeeklyGrowth;//周增长率
		@Column
		private String VolatilityRate;//年化波动率(100%)
		@Column
		private String AnnualizedRate;//年化收益率
		@Column
		private String SharpRatio;//年化夏普比率
		@Column
		private String RetreatMoney;//回撤
		@Column
		private String RetreatMoney1;//成立以来最大回撤(100%)
		@Column
		private String RetreatMoney2;//今年以来最大回撤(100%)
		@Column
		private String SimulationsRate;//年化下浮比率(100%)
		@Column
		private String Remarks;//备注
		@Column
		private String CreateId;//创建人ID(员工表)
		@Column
		private String CreateName;//创建人
		@Column
		private String CreateTime;//(getdate())	创建时间
		@Column
		private String UpdateId;//修改人ID(员工表)
		@Column
		private String UpdateName;//修改人
		@Column
		private String UpdateTime;//(getdate())	修改时间
		@Column
		private String Position;//创建时间
		@Column
		private Float hs300historymrm;//沪深300指数
		@Column
		private String ZxbHistoryMRM;//中小板指数
		@Column
		private String CybHistoryMRM;//创业板指数
		@Column
		private String IsTempOpenDay;//临时开放日(1是0否)
		@Column(alias = true)
		private String startDate;//开始时间
		@Column(alias = true)
		private String endDate;//结束时间
		@Column(alias = true)
		private String date_condition;//日期类型
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getValueId() {
			return ValueId;
		}
		public void setValueId(String valueId) {
			ValueId = valueId;
		}
		public String getFundInfoName() {
			return FundInfoName;
		}
		public void setFundInfoName(String fundInfoName) {
			FundInfoName = fundInfoName;
		}
		public String getFundInfoId() {
			return FundInfoId;
		}
		public void setFundInfoId(String fundInfoId) {
			FundInfoId = fundInfoId;
		}
		public String getValueType() {
			return ValueType;
		}
		public void setValueType(String valueType) {
			ValueType = valueType;
		}
		public Float getNetvalue() {
			return netvalue;
		}
		public void setNetvalue(Float netvalue) {
			this.netvalue = netvalue;
		}
		public Float getTotalvalue() {
			return totalvalue;
		}
		public void setTotalvalue(Float totalvalue) {
			this.totalvalue = totalvalue;
		}
		public String getTradeDateType() {
			return TradeDateType;
		}
		public void setTradeDateType(String tradeDateType) {
			TradeDateType = tradeDateType;
		}
		public String getTradeDate() {
			return TradeDate;
		}
		public void setTradeDate(String tradeDate) {
			TradeDate = tradeDate;
		}
		public String getWeeklyGrowth() {
			return WeeklyGrowth;
		}
		public void setWeeklyGrowth(String weeklyGrowth) {
			WeeklyGrowth = weeklyGrowth;
		}
		public String getVolatilityRate() {
			return VolatilityRate;
		}
		public void setVolatilityRate(String volatilityRate) {
			VolatilityRate = volatilityRate;
		}
		public String getAnnualizedRate() {
			return AnnualizedRate;
		}
		public void setAnnualizedRate(String annualizedRate) {
			AnnualizedRate = annualizedRate;
		}
		public String getSharpRatio() {
			return SharpRatio;
		}
		public void setSharpRatio(String sharpRatio) {
			SharpRatio = sharpRatio;
		}
		public String getRetreatMoney() {
			return RetreatMoney;
		}
		public void setRetreatMoney(String retreatMoney) {
			RetreatMoney = retreatMoney;
		}
		public String getRetreatMoney1() {
			return RetreatMoney1;
		}
		public void setRetreatMoney1(String retreatMoney1) {
			RetreatMoney1 = retreatMoney1;
		}
		public String getRetreatMoney2() {
			return RetreatMoney2;
		}
		public void setRetreatMoney2(String retreatMoney2) {
			RetreatMoney2 = retreatMoney2;
		}
		public String getSimulationsRate() {
			return SimulationsRate;
		}
		public void setSimulationsRate(String simulationsRate) {
			SimulationsRate = simulationsRate;
		}
		public String getRemarks() {
			return Remarks;
		}
		public void setRemarks(String remarks) {
			Remarks = remarks;
		}
		public String getCreateId() {
			return CreateId;
		}
		public void setCreateId(String createId) {
			CreateId = createId;
		}
		public String getCreateName() {
			return CreateName;
		}
		public void setCreateName(String createName) {
			CreateName = createName;
		}
		public String getCreateTime() {
			return CreateTime;
		}
		public void setCreateTime(String createTime) {
			CreateTime = createTime;
		}
		public String getUpdateId() {
			return UpdateId;
		}
		public void setUpdateId(String updateId) {
			UpdateId = updateId;
		}
		public String getUpdateName() {
			return UpdateName;
		}
		public void setUpdateName(String updateName) {
			UpdateName = updateName;
		}
		public String getUpdateTime() {
			return UpdateTime;
		}
		public void setUpdateTime(String updateTime) {
			UpdateTime = updateTime;
		}
		public String getPosition() {
			return Position;
		}
		public void setPosition(String position) {
			Position = position;
		}
		public Float getHs300historymrm() {
			return hs300historymrm;
		}
		public void setHs300historymrm(Float hs300historymrm) {
			this.hs300historymrm = hs300historymrm;
		}
		public String getZxbHistoryMRM() {
			return ZxbHistoryMRM;
		}
		public void setZxbHistoryMRM(String zxbHistoryMRM) {
			ZxbHistoryMRM = zxbHistoryMRM;
		}
		public String getCybHistoryMRM() {
			return CybHistoryMRM;
		}
		public void setCybHistoryMRM(String cybHistoryMRM) {
			CybHistoryMRM = cybHistoryMRM;
		}
		public String getIsTempOpenDay() {
			return IsTempOpenDay;
		}
		public void setIsTempOpenDay(String isTempOpenDay) {
			IsTempOpenDay = isTempOpenDay;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getDate_condition() {
			return date_condition;
		}
		public void setDate_condition(String date_condition) {
			this.date_condition = date_condition;
		}

}
