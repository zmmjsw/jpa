package com.github.zmm.jpa.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 
* @ClassName: TaTiumbill 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhumingming 
* @date 2019年11月8日 下午1:44:20 
*
 */
@Entity
public class TaTiumBill {
    @Id@GeneratedValue
    private Long id; 
	private String operator;// 操作员
	private String billFlow;// 帐单流水
	private String vessel;// 船名
	private String voyage;// 航次(班)
	private String customerNumber;// 客户编号
	private String mainOrderNo;// 主单编号
	private String payableObject;// 收付对象
	private String payableSign;// 收付标志
	private BigDecimal usdReceived;// USD应收
	private BigDecimal usdPayable;// USD应付
	private BigDecimal rmbReceived;// RMB应收
	private BigDecimal rmbPayable;// RMB应付
	
	private BigDecimal hkdReceived;// HKD应收
	private BigDecimal hkdPayable;// HKD应付
	private BigDecimal eurReceived;// EUR应收
	private BigDecimal eurPayable;// 	// EUR应付
	private BigDecimal jpyReceived;// 	// JPY应收
	private BigDecimal jpyPayable;// JPY应付
	
	private BigDecimal gbpReceived;// 	// GBP应收
	private BigDecimal gbpPayable;// 	// GBP应付

	  private Date sailingDate ;//开航日期
	  private String detailsOfExpenses;// 费用明细
	
	private String departurePort;// 始发港
	private String destinationPort;// 目的港
	private String singleTankQuantity;// 托单箱量
	private String teu;// TEU
	private String additionalBill;// 追加账单
	private String toExamine;// 审核
	private String captain;// 对帐
	private String externalAccountNumber;// 外帐单号
	private Date reconciliationDate;// 对帐日期
	private String Reconciliant;// 对帐人
	private Date auditDate;// 审核日期
	private String auditor;// 审核人
	private String remarks;// 备注
	private String salesperson;	// 销售员
	// 操作人
	private String operatorp;
	// 托单编号
	private String orderNo;
	// 帐单类型
	private String billingType;
	// 发票编号
	private String invoiceNo;
	// 船东订舱号
	private String shipOwnerBookingNo;
	// 分船东订舱号
	private String bookingNoOfSubOwner;
	// 销帐日期
	private Date writeOffDate;
	// 打印日期
	private Date printDate;
	// 打印标志
	private String printMark;
	// 月结开票日期
	private Date  monthlySettlementAndInvoicingDate;
	// 未销金额
	private BigDecimal amountNotSold;
	// 已销金额
	private BigDecimal amountWrittenOff;
	// 帐单金额
	private BigDecimal billAmount;
	// 增值税金额
	private BigDecimal vatAmount;
	// 不含税金额
	private BigDecimal amountExcludingTax;
	// 抬头对象
	private String headUpObject;
	// 帐龄
	private String ageOfAccount;
	// 合同付款日
	private Date contractPaymentDate;
	// 付款方式
	private String paymentMethod;
	// 签收
	private String	 signIn;
	// 货代提单号
	private String forwarderBlNo;
	// 结算
	private String settlement;
	// 应收
	private String receivable;
	// 分单流水
	private String orderSplittingFlow; 
	// 分公司
	private String branch;
	// 应付
	private String copeWith;
	// 应收USD转换RMB
	private String conversionFromUsdReceivableToRmb;
	// 应付USD转换RMB
	private String usdConversionRmbPayable;
	// 币制
	private String currencySystem;
	// 销帐
	private String account;
	// 项目类型
	private String projectType;
	// 制单日期
	private String dateOfPreparation;
	// 业务归属部门
	private String businessDepartment;
	// 箱号
	private String boxNumber;
	// 航线
	private String route;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getBillFlow() {
		return billFlow;
	}
	public void setBillFlow(String billFlow) {
		this.billFlow = billFlow;
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
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getMainOrderNo() {
		return mainOrderNo;
	}
	public void setMainOrderNo(String mainOrderNo) {
		this.mainOrderNo = mainOrderNo;
	}
	public String getPayableObject() {
		return payableObject;
	}
	public void setPayableObject(String payableObject) {
		this.payableObject = payableObject;
	}
	public String getPayableSign() {
		return payableSign;
	}
	public void setPayableSign(String payableSign) {
		this.payableSign = payableSign;
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
	public BigDecimal getJpyReceived() {
		return jpyReceived;
	}
	public void setJpyReceived(BigDecimal jpyReceived) {
		this.jpyReceived = jpyReceived;
	}
	public BigDecimal getJpyPayable() {
		return jpyPayable;
	}
	public void setJpyPayable(BigDecimal jpyPayable) {
		this.jpyPayable = jpyPayable;
	}
	public BigDecimal getGbpReceived() {
		return gbpReceived;
	}
	public void setGbpReceived(BigDecimal gbpReceived) {
		this.gbpReceived = gbpReceived;
	}
	public BigDecimal getGbpPayable() {
		return gbpPayable;
	}
	public void setGbpPayable(BigDecimal gbpPayable) {
		this.gbpPayable = gbpPayable;
	}
	public Date getSailingDate() {
		return sailingDate;
	}
	public void setSailingDate(Date sailingDate) {
		this.sailingDate = sailingDate;
	}
	public String getDetailsOfExpenses() {
		return detailsOfExpenses;
	}
	public void setDetailsOfExpenses(String detailsOfExpenses) {
		this.detailsOfExpenses = detailsOfExpenses;
	}
	public String getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	public String getDestinationPort() {
		return destinationPort;
	}
	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}
	public String getSingleTankQuantity() {
		return singleTankQuantity;
	}
	public void setSingleTankQuantity(String singleTankQuantity) {
		this.singleTankQuantity = singleTankQuantity;
	}
	public String getTeu() {
		return teu;
	}
	public void setTeu(String teu) {
		this.teu = teu;
	}
	public String getAdditionalBill() {
		return additionalBill;
	}
	public void setAdditionalBill(String additionalBill) {
		this.additionalBill = additionalBill;
	}
	public String getToExamine() {
		return toExamine;
	}
	public void setToExamine(String toExamine) {
		this.toExamine = toExamine;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getExternalAccountNumber() {
		return externalAccountNumber;
	}
	public void setExternalAccountNumber(String externalAccountNumber) {
		this.externalAccountNumber = externalAccountNumber;
	}
	public Date getReconciliationDate() {
		return reconciliationDate;
	}
	public void setReconciliationDate(Date reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}
	public String getReconciliant() {
		return Reconciliant;
	}
	public void setReconciliant(String reconciliant) {
		Reconciliant = reconciliant;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getOperatorp() {
		return operatorp;
	}
	public void setOperatorp(String operatorp) {
		this.operatorp = operatorp;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getShipOwnerBookingNo() {
		return shipOwnerBookingNo;
	}
	public void setShipOwnerBookingNo(String shipOwnerBookingNo) {
		this.shipOwnerBookingNo = shipOwnerBookingNo;
	}
	public String getBookingNoOfSubOwner() {
		return bookingNoOfSubOwner;
	}
	public void setBookingNoOfSubOwner(String bookingNoOfSubOwner) {
		this.bookingNoOfSubOwner = bookingNoOfSubOwner;
	}
	public Date getWriteOffDate() {
		return writeOffDate;
	}
	public void setWriteOffDate(Date writeOffDate) {
		this.writeOffDate = writeOffDate;
	}
	public Date getPrintDate() {
		return printDate;
	}
	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}
	public String getPrintMark() {
		return printMark;
	}
	public void setPrintMark(String printMark) {
		this.printMark = printMark;
	}
	public Date getMonthlySettlementAndInvoicingDate() {
		return monthlySettlementAndInvoicingDate;
	}
	public void setMonthlySettlementAndInvoicingDate(Date monthlySettlementAndInvoicingDate) {
		this.monthlySettlementAndInvoicingDate = monthlySettlementAndInvoicingDate;
	}
	public BigDecimal getAmountNotSold() {
		return amountNotSold;
	}
	public void setAmountNotSold(BigDecimal amountNotSold) {
		this.amountNotSold = amountNotSold;
	}
	public BigDecimal getAmountWrittenOff() {
		return amountWrittenOff;
	}
	public void setAmountWrittenOff(BigDecimal amountWrittenOff) {
		this.amountWrittenOff = amountWrittenOff;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public BigDecimal getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}
	public BigDecimal getAmountExcludingTax() {
		return amountExcludingTax;
	}
	public void setAmountExcludingTax(BigDecimal amountExcludingTax) {
		this.amountExcludingTax = amountExcludingTax;
	}
	public String getHeadUpObject() {
		return headUpObject;
	}
	public void setHeadUpObject(String headUpObject) {
		this.headUpObject = headUpObject;
	}
	public String getAgeOfAccount() {
		return ageOfAccount;
	}
	public void setAgeOfAccount(String ageOfAccount) {
		this.ageOfAccount = ageOfAccount;
	}
	public Date getContractPaymentDate() {
		return contractPaymentDate;
	}
	public void setContractPaymentDate(Date contractPaymentDate) {
		this.contractPaymentDate = contractPaymentDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getSignIn() {
		return signIn;
	}
	public void setSignIn(String signIn) {
		this.signIn = signIn;
	}
	public String getForwarderBlNo() {
		return forwarderBlNo;
	}
	public void setForwarderBlNo(String forwarderBlNo) {
		this.forwarderBlNo = forwarderBlNo;
	}
	public String getSettlement() {
		return settlement;
	}
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}
	public String getReceivable() {
		return receivable;
	}
	public void setReceivable(String receivable) {
		this.receivable = receivable;
	}
	public String getOrderSplittingFlow() {
		return orderSplittingFlow;
	}
	public void setOrderSplittingFlow(String orderSplittingFlow) {
		this.orderSplittingFlow = orderSplittingFlow;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCopeWith() {
		return copeWith;
	}
	public void setCopeWith(String copeWith) {
		this.copeWith = copeWith;
	}
	public String getConversionFromUsdReceivableToRmb() {
		return conversionFromUsdReceivableToRmb;
	}
	public void setConversionFromUsdReceivableToRmb(String conversionFromUsdReceivableToRmb) {
		this.conversionFromUsdReceivableToRmb = conversionFromUsdReceivableToRmb;
	}
	public String getUsdConversionRmbPayable() {
		return usdConversionRmbPayable;
	}
	public void setUsdConversionRmbPayable(String usdConversionRmbPayable) {
		this.usdConversionRmbPayable = usdConversionRmbPayable;
	}
	public String getCurrencySystem() {
		return currencySystem;
	}
	public void setCurrencySystem(String currencySystem) {
		this.currencySystem = currencySystem;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getDateOfPreparation() {
		return dateOfPreparation;
	}
	public void setDateOfPreparation(String dateOfPreparation) {
		this.dateOfPreparation = dateOfPreparation;
	}
	public String getBusinessDepartment() {
		return businessDepartment;
	}
	public void setBusinessDepartment(String businessDepartment) {
		this.businessDepartment = businessDepartment;
	}
	public String getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(String boxNumber) {
		this.boxNumber = boxNumber;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}

}
