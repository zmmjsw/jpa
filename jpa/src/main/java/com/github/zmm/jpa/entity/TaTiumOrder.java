package com.github.zmm.jpa.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 钛腾主单
 * @author wby
 * @date 2019/11/4
 */
@Entity
public class TaTiumOrder {

    /*
    销售员	操作员	托单编号	主单编号	船名	航次(班)	开航日期	RMB收入	RMB成本
    RMB利润	USD收入	USD成本	USD利润	USD汇率	折合总利润	利润率(利润/成本)	利润率(利润/收入)
    分单数	TEU	20'GP	40'HQ	40'GP	拼箱	托单箱量	锁费	主单状态	锁单	锁单日期
    结算	结算日期	RMB收入不含税	RMB成本不含税	USD收入不含税	USD成本不含税	RMB收入已销
    RMB成本已销	USD收入已销	USD成本已销	RMB收入未销	RMB成本未销	USD收入未销	USD成本未销	目的港(提单)
    始发港	HKD收入	HKD成本	HKD利润	HKD汇率	EUR收入	EUR成本	EUR利润	EUR汇率	本位币应收	本位币应付	本位币总利润	航线
    */
    @Id@GeneratedValue
    private Long id; 
    private String sale;//销售员
    private String operator;//操作员
    private String billNo;//托单编号
    private String mainOrderNo;//主单编号
    private String vessel;//船名
    private String voyage;//航次
    private Date sailingDate ;//开航日期
    private BigDecimal rmbReceived;//RMB应收
    private BigDecimal rmbPayable;//RMB应付
    private BigDecimal rmbRrofit;//RMB利润
    
    
    private BigDecimal usdReceived;//USD应收
    private BigDecimal usdPayable;//USD应付
    private BigDecimal usdRate;//USD汇率
    private BigDecimal usdRrofit;//USD利润
	
    //利润率(利润/成本)	利润率(利润/收入)	分单数
    private BigDecimal  costProfitRatio;//成本利润率
    private BigDecimal  IncomeMargin;//收入利润率
   
    
//    折合总利润	利润率(利润/成本)	利润率(利润/收入)
    private Integer sbuNo;//分单数
    private Integer teu;
    private String containerQty;//箱型箱量
    private String lockCharge;//锁费
    private String mainOrderStatus;//主单状态
    private String lockOrder;//锁单
    private Date lockOrderDate;//锁单日期
    private String settlement;//结算
    private Date settlementDate;//结算日期

    private BigDecimal rmbNoTaxReceived;//RMB不含税应收
    private BigDecimal rmbNoTaxPayable;//RMB不含税应付
    private BigDecimal usdNoTaxReceived;//USD不含税应收
    private BigDecimal usdNoTaxPayable;//USD不含税应付

    private BigDecimal rmbReceivedChargeOffs;//RMB收入已销
    private BigDecimal rmbPayableChargeOffs;//RMB成本已销
    private BigDecimal usdReceivedChargeOffs;//USD收入已销
    private BigDecimal usdPayableChargeOffs;//USD成本已销

    private BigDecimal rmbReceivedNotChargeOffs;//RMB收入未销
    private BigDecimal rmbPayableNotChargeOffs;//RMB成本未销
    private BigDecimal usdReceivedNotChargeOffs;//USD收入未销
    private BigDecimal usdPayableNotChargeOffs;//USD成本未销

    private String pod; //目的港
    private String pol;//起始港
    
    private BigDecimal  hkdReceived;//HKD收入
    private BigDecimal  hkdPayable;//HKD成本
    private BigDecimal  hkdprofit;//HKD利润
    private BigDecimal  hkdExchangeRate;//HKD汇率
    
    private BigDecimal  eurReceived;//EUR收入
    private BigDecimal  eurPayable;//EUR成本
    private BigDecimal  eurprofit;//EUR利润
    private BigDecimal  eurExchangeRate;//HKD汇率
    
    
    private BigDecimal  standardCoinReceived;//本位币应收
    private BigDecimal  standardCoinPayable;//本位币应付
    private BigDecimal  standardCoinprofit;//本位币总利润
    
    private String route;//航线
    
    private BigDecimal twentyGP;//20GP
    private BigDecimal fortyHQ;//40HQ
    private BigDecimal fortyGP;//40Gp
    private String lcl;//拼箱
    private String towingCapacity;//航线
    private String singleTankQuantity;//托单箱量
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getMainOrderNo() {
		return mainOrderNo;
	}
	public void setMainOrderNo(String mainOrderNo) {
		this.mainOrderNo = mainOrderNo;
	}
	public String getVessel() {
		return vessel;
	}
	public void setVessel(String vessel) {
		this.vessel = vessel;
	}
	public String getVoyage() {
		return voyage;
	}
	public void setVoyage(String voyage) {
		this.voyage = voyage;
	}
	public Date getSailingDate() {
		return sailingDate;
	}
	public void setSailingDate(Date sailingDate) {
		this.sailingDate = sailingDate;
	}
	public BigDecimal getRmbReceived() {
		return rmbReceived;
	}
	public void setRmbReceived(BigDecimal rmbReceived) {
		this.rmbReceived = rmbReceived;
	}
	public BigDecimal getRmbPayable() {
		return rmbPayable;
	}
	public void setRmbPayable(BigDecimal rmbPayable) {
		this.rmbPayable = rmbPayable;
	}
	public BigDecimal getRmbRrofit() {
		return rmbRrofit;
	}
	public void setRmbRrofit(BigDecimal rmbRrofit) {
		this.rmbRrofit = rmbRrofit;
	}
	public BigDecimal getUsdReceived() {
		return usdReceived;
	}
	public void setUsdReceived(BigDecimal usdReceived) {
		this.usdReceived = usdReceived;
	}
	public BigDecimal getUsdPayable() {
		return usdPayable;
	}
	public void setUsdPayable(BigDecimal usdPayable) {
		this.usdPayable = usdPayable;
	}
	public BigDecimal getUsdRate() {
		return usdRate;
	}
	public void setUsdRate(BigDecimal usdRate) {
		this.usdRate = usdRate;
	}
	public BigDecimal getUsdRrofit() {
		return usdRrofit;
	}
	public void setUsdRrofit(BigDecimal usdRrofit) {
		this.usdRrofit = usdRrofit;
	}
	public BigDecimal getCostProfitRatio() {
		return costProfitRatio;
	}
	public void setCostProfitRatio(BigDecimal costProfitRatio) {
		this.costProfitRatio = costProfitRatio;
	}
	public BigDecimal getIncomeMargin() {
		return IncomeMargin;
	}
	public void setIncomeMargin(BigDecimal incomeMargin) {
		IncomeMargin = incomeMargin;
	}
	public Integer getSbuNo() {
		return sbuNo;
	}
	public void setSbuNo(Integer sbuNo) {
		this.sbuNo = sbuNo;
	}
	public Integer getTeu() {
		return teu;
	}
	public void setTeu(Integer teu) {
		this.teu = teu;
	}
	public String getContainerQty() {
		return containerQty;
	}
	public void setContainerQty(String containerQty) {
		this.containerQty = containerQty;
	}
	public String getLockCharge() {
		return lockCharge;
	}
	public void setLockCharge(String lockCharge) {
		this.lockCharge = lockCharge;
	}
	public String getMainOrderStatus() {
		return mainOrderStatus;
	}
	public void setMainOrderStatus(String mainOrderStatus) {
		this.mainOrderStatus = mainOrderStatus;
	}
	public String getLockOrder() {
		return lockOrder;
	}
	public void setLockOrder(String lockOrder) {
		this.lockOrder = lockOrder;
	}
	public Date getLockOrderDate() {
		return lockOrderDate;
	}
	public void setLockOrderDate(Date lockOrderDate) {
		this.lockOrderDate = lockOrderDate;
	}
	public String getSettlement() {
		return settlement;
	}
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}
	public Date getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}
	public BigDecimal getRmbNoTaxReceived() {
		return rmbNoTaxReceived;
	}
	public void setRmbNoTaxReceived(BigDecimal rmbNoTaxReceived) {
		this.rmbNoTaxReceived = rmbNoTaxReceived;
	}
	public BigDecimal getRmbNoTaxPayable() {
		return rmbNoTaxPayable;
	}
	public void setRmbNoTaxPayable(BigDecimal rmbNoTaxPayable) {
		this.rmbNoTaxPayable = rmbNoTaxPayable;
	}
	public BigDecimal getUsdNoTaxReceived() {
		return usdNoTaxReceived;
	}
	public void setUsdNoTaxReceived(BigDecimal usdNoTaxReceived) {
		this.usdNoTaxReceived = usdNoTaxReceived;
	}
	public BigDecimal getUsdNoTaxPayable() {
		return usdNoTaxPayable;
	}
	public void setUsdNoTaxPayable(BigDecimal usdNoTaxPayable) {
		this.usdNoTaxPayable = usdNoTaxPayable;
	}
	public BigDecimal getRmbReceivedChargeOffs() {
		return rmbReceivedChargeOffs;
	}
	public void setRmbReceivedChargeOffs(BigDecimal rmbReceivedChargeOffs) {
		this.rmbReceivedChargeOffs = rmbReceivedChargeOffs;
	}
	public BigDecimal getRmbPayableChargeOffs() {
		return rmbPayableChargeOffs;
	}
	public void setRmbPayableChargeOffs(BigDecimal rmbPayableChargeOffs) {
		this.rmbPayableChargeOffs = rmbPayableChargeOffs;
	}
	public BigDecimal getUsdReceivedChargeOffs() {
		return usdReceivedChargeOffs;
	}
	public void setUsdReceivedChargeOffs(BigDecimal usdReceivedChargeOffs) {
		this.usdReceivedChargeOffs = usdReceivedChargeOffs;
	}
	public BigDecimal getUsdPayableChargeOffs() {
		return usdPayableChargeOffs;
	}
	public void setUsdPayableChargeOffs(BigDecimal usdPayableChargeOffs) {
		this.usdPayableChargeOffs = usdPayableChargeOffs;
	}
	public BigDecimal getRmbReceivedNotChargeOffs() {
		return rmbReceivedNotChargeOffs;
	}
	public void setRmbReceivedNotChargeOffs(BigDecimal rmbReceivedNotChargeOffs) {
		this.rmbReceivedNotChargeOffs = rmbReceivedNotChargeOffs;
	}
	public BigDecimal getRmbPayableNotChargeOffs() {
		return rmbPayableNotChargeOffs;
	}
	public void setRmbPayableNotChargeOffs(BigDecimal rmbPayableNotChargeOffs) {
		this.rmbPayableNotChargeOffs = rmbPayableNotChargeOffs;
	}
	public BigDecimal getUsdReceivedNotChargeOffs() {
		return usdReceivedNotChargeOffs;
	}
	public void setUsdReceivedNotChargeOffs(BigDecimal usdReceivedNotChargeOffs) {
		this.usdReceivedNotChargeOffs = usdReceivedNotChargeOffs;
	}
	public BigDecimal getUsdPayableNotChargeOffs() {
		return usdPayableNotChargeOffs;
	}
	public void setUsdPayableNotChargeOffs(BigDecimal usdPayableNotChargeOffs) {
		this.usdPayableNotChargeOffs = usdPayableNotChargeOffs;
	}
	public String getPod() {
		return pod;
	}
	public void setPod(String pod) {
		this.pod = pod;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public BigDecimal getHkdReceived() {
		return hkdReceived;
	}
	public void setHkdReceived(BigDecimal hkdReceived) {
		this.hkdReceived = hkdReceived;
	}
	public BigDecimal getHkdPayable() {
		return hkdPayable;
	}
	public void setHkdPayable(BigDecimal hkdPayable) {
		this.hkdPayable = hkdPayable;
	}
	public BigDecimal getHkdprofit() {
		return hkdprofit;
	}
	public void setHkdprofit(BigDecimal hkdprofit) {
		this.hkdprofit = hkdprofit;
	}
	public BigDecimal getHkdExchangeRate() {
		return hkdExchangeRate;
	}
	public void setHkdExchangeRate(BigDecimal hkdExchangeRate) {
		this.hkdExchangeRate = hkdExchangeRate;
	}
	public BigDecimal getEurReceived() {
		return eurReceived;
	}
	public void setEurReceived(BigDecimal eurReceived) {
		this.eurReceived = eurReceived;
	}
	public BigDecimal getEurPayable() {
		return eurPayable;
	}
	public void setEurPayable(BigDecimal eurPayable) {
		this.eurPayable = eurPayable;
	}
	public BigDecimal getEurprofit() {
		return eurprofit;
	}
	public void setEurprofit(BigDecimal eurprofit) {
		this.eurprofit = eurprofit;
	}
	public BigDecimal getEurExchangeRate() {
		return eurExchangeRate;
	}
	public void setEurExchangeRate(BigDecimal eurExchangeRate) {
		this.eurExchangeRate = eurExchangeRate;
	}
	public BigDecimal getStandardCoinReceived() {
		return standardCoinReceived;
	}
	public void setStandardCoinReceived(BigDecimal standardCoinReceived) {
		this.standardCoinReceived = standardCoinReceived;
	}
	public BigDecimal getStandardCoinPayable() {
		return standardCoinPayable;
	}
	public void setStandardCoinPayable(BigDecimal standardCoinPayable) {
		this.standardCoinPayable = standardCoinPayable;
	}
	public BigDecimal getStandardCoinprofit() {
		return standardCoinprofit;
	}
	public void setStandardCoinprofit(BigDecimal standardCoinprofit) {
		this.standardCoinprofit = standardCoinprofit;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public BigDecimal getTwentyGP() {
		return twentyGP;
	}
	public void setTwentyGP(BigDecimal twentyGP) {
		this.twentyGP = twentyGP;
	}
	public BigDecimal getFortyHQ() {
		return fortyHQ;
	}
	public void setFortyHQ(BigDecimal fortyHQ) {
		this.fortyHQ = fortyHQ;
	}
	public BigDecimal getFortyGP() {
		return fortyGP;
	}
	public void setFortyGP(BigDecimal fortyGP) {
		this.fortyGP = fortyGP;
	}
	public String getLcl() {
		return lcl;
	}
	public void setLcl(String lcl) {
		this.lcl = lcl;
	}
	public String getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(String towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	public String getSingleTankQuantity() {
		return singleTankQuantity;
	}
	public void setSingleTankQuantity(String singleTankQuantity) {
		this.singleTankQuantity = singleTankQuantity;
	}
    
    


}
