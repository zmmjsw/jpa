package com.github.zmm.jpa.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TaTiumDetailsOfExpenses {
	@Id
	@GeneratedValue
	private Long id;
	private String operator;// 操作员
	private String orderNumber;// 托单编号
	private String mainMentionNumber;// 主提单号
	private String shipOwnerBookingNo;// 船东订舱号
	private String forwarderBlNo;// 货代提单号
	private String externalAccountNumber;// 外帐单号
	private String invoiceNumber;// 发票编号
	private String billFlow;// 帐单流水
	private String costObject;// 费用对象
	private String headingObject;// 抬头对象
	private String costName;// 费用名称
	private BigDecimal rmbReceivable;// RMB应收
	private BigDecimal rmbCoping;// RMB应付
	private BigDecimal usdReceivable;// USD应收
	private BigDecimal usdCoping;// USD应付
	private BigDecimal tax;// TAX(%)
	private BigDecimal taxFree;// 不含税
	private BigDecimal taxAmount;// 税额
	private String nameOfVessel;// 船名
	private String voyage;// 航次(班)
	private Date sailingDate;// 开航日期
	private String reconciliation;// 对帐
	private String signFor;// 签收
	private String printingMark;// 打印标志
	private String writeOff;// 销帐
	private Date dateOfCancellation; // 销帐日期
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
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getMainMentionNumber() {
		return mainMentionNumber;
	}
	public void setMainMentionNumber(String mainMentionNumber) {
		this.mainMentionNumber = mainMentionNumber;
	}
	public String getShipOwnerBookingNo() {
		return shipOwnerBookingNo;
	}
	public void setShipOwnerBookingNo(String shipOwnerBookingNo) {
		this.shipOwnerBookingNo = shipOwnerBookingNo;
	}
	public String getForwarderBlNo() {
		return forwarderBlNo;
	}
	public void setForwarderBlNo(String forwarderBlNo) {
		this.forwarderBlNo = forwarderBlNo;
	}
	public String getExternalAccountNumber() {
		return externalAccountNumber;
	}
	public void setExternalAccountNumber(String externalAccountNumber) {
		this.externalAccountNumber = externalAccountNumber;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getBillFlow() {
		return billFlow;
	}
	public void setBillFlow(String billFlow) {
		this.billFlow = billFlow;
	}
	public String getCostObject() {
		return costObject;
	}
	public void setCostObject(String costObject) {
		this.costObject = costObject;
	}
	public String getHeadingObject() {
		return headingObject;
	}
	public void setHeadingObject(String headingObject) {
		this.headingObject = headingObject;
	}
	public String getCostName() {
		return costName;
	}
	public void setCostName(String costName) {
		this.costName = costName;
	}
	public BigDecimal getRmbReceivable() {
		return rmbReceivable;
	}
	public void setRmbReceivable(BigDecimal rmbReceivable) {
		this.rmbReceivable = rmbReceivable;
	}
	public BigDecimal getRmbCoping() {
		return rmbCoping;
	}
	public void setRmbCoping(BigDecimal rmbCoping) {
		this.rmbCoping = rmbCoping;
	}
	public BigDecimal getUsdReceivable() {
		return usdReceivable;
	}
	public void setUsdReceivable(BigDecimal usdReceivable) {
		this.usdReceivable = usdReceivable;
	}
	public BigDecimal getUsdCoping() {
		return usdCoping;
	}
	public void setUsdCoping(BigDecimal usdCoping) {
		this.usdCoping = usdCoping;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getTaxFree() {
		return taxFree;
	}
	public void setTaxFree(BigDecimal taxFree) {
		this.taxFree = taxFree;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getNameOfVessel() {
		return nameOfVessel;
	}
	public void setNameOfVessel(String nameOfVessel) {
		this.nameOfVessel = nameOfVessel;
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
	public String getReconciliation() {
		return reconciliation;
	}
	public void setReconciliation(String reconciliation) {
		this.reconciliation = reconciliation;
	}
	public String getSignFor() {
		return signFor;
	}
	public void setSignFor(String signFor) {
		this.signFor = signFor;
	}
	public String getPrintingMark() {
		return printingMark;
	}
	public void setPrintingMark(String printingMark) {
		this.printingMark = printingMark;
	}
	public String getWriteOff() {
		return writeOff;
	}
	public void setWriteOff(String writeOff) {
		this.writeOff = writeOff;
	}
	public Date getDateOfCancellation() {
		return dateOfCancellation;
	}
	public void setDateOfCancellation(Date dateOfCancellation) {
		this.dateOfCancellation = dateOfCancellation;
	}


}
