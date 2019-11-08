package com.github.zmm.jpa.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.zmm.jpa.entity.TaTiumBill;
import com.github.zmm.jpa.entity.TaTiumDetailsOfExpenses;
import com.github.zmm.jpa.entity.TaTiumOrder;
import com.github.zmm.jpa.service.CityService;
import com.github.zmm.jpa.util.ExcelUtil;

/**
 * 
 * @ClassName: CityController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhumingming
 * @date 2017年12月7日 下午5:55:57
 *
 */
@RestController
public class CityController {
	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/api/input", method = RequestMethod.POST)
	public String input(@RequestParam(value = "filename") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
		fieldMap.put("销售员", "sale");
		fieldMap.put("操作员", "operator");
		fieldMap.put("托单编号", "billNo");
		fieldMap.put("主单编号", "mainOrderNo");
		fieldMap.put("船名", "vessel");
		fieldMap.put("航次(班)", "voyage");
		fieldMap.put("开航日期", "sailingDate");
		fieldMap.put("RMB收入", "rmbReceived");
		fieldMap.put("RMB成本", "rmbPayable");
		fieldMap.put("RMB利润", "rmbRrofit");
		fieldMap.put("USD收入", "usdReceived");
		fieldMap.put("USD成本", "usdPayable");
		fieldMap.put("USD利润", "usdRrofit");
		fieldMap.put("USD汇率", "usdRate");
		fieldMap.put("利润率(利润/成本)", "costProfitRatio");
		fieldMap.put("利润率(利润/收入)", "IncomeMargin");
		fieldMap.put("分单数", "sbuNo");
		fieldMap.put("TEU", "teu");
		fieldMap.put("20'GP", "twentyGP");
		fieldMap.put("40'HQ", "fortyHQ");
		fieldMap.put("40'GP", "fortyGP");
		fieldMap.put("拼箱", "lcl");
		fieldMap.put("托单箱量", "towingCapacity");
		fieldMap.put("锁费", "lockCharge");
		fieldMap.put("主单状态", "mainOrderStatus");
		fieldMap.put("锁单", "lockOrder");
		fieldMap.put("锁单日期", "lockOrderDate");
		fieldMap.put("结算", "settlement");
		fieldMap.put("结算日期", "settlementDate");

		fieldMap.put("RMB收入不含税", "rmbNoTaxReceived");
		fieldMap.put("RMB成本不含税", "rmbNoTaxPayable");
		fieldMap.put("USD收入不含税", "usdNoTaxReceived");
		fieldMap.put("USD成本不含税", "usdNoTaxPayable");

		fieldMap.put("RMB收入已销", "rmbReceivedChargeOffs");
		fieldMap.put("RMB成本已销", "rmbPayableChargeOffs");
		fieldMap.put("USD收入已销", "usdReceivedChargeOffs");
		fieldMap.put("USD成本已销", "usdPayableChargeOffs");

		fieldMap.put("RMB收入未销", "rmbReceivedNotChargeOffs");
		fieldMap.put("RMB成本未销", "rmbPayableNotChargeOffs");
		fieldMap.put("USD收入未销", "usdReceivedNotChargeOffs");
		fieldMap.put("USD成本未销", "usdPayableNotChargeOffs");

		fieldMap.put("目的港(提单)", "pod");
		fieldMap.put("始发港", "pol");

		fieldMap.put("HKD收入", "hkdReceived");
		fieldMap.put("HKD成本", "hkdPayable");
		fieldMap.put("HKD利润", "hkdprofit");
		fieldMap.put("HKD汇率", "hkdExchangeRate");
		fieldMap.put("EUR收入", "eurReceived");
		fieldMap.put("EUR成本", "eurPayable");
		fieldMap.put("EUR利润", "eurprofit");
		fieldMap.put("EUR汇率", "eurExchangeRate");
		fieldMap.put("本位币应收", "standardCoinReceived");
		fieldMap.put("本位币应付", "standardCoinPayable");
		fieldMap.put("本位币总利润", "standardCoinprofit");
		fieldMap.put("航线", "route");
		fieldMap.put("托单箱量", "singleTankQuantity");
		String are[] = { "Sheet1" };
		InputStream inputStream = file.getInputStream();
		List<TaTiumOrder> excelToList = ExcelUtil.excelToList(inputStream, "Sheet1", TaTiumOrder.class, fieldMap, are); // cityService.addFright(excelToList);
		// System.out.println(excelToList.toString());
		cityService.addTaTiumOrders(excelToList);
		return "";
	}

	@RequestMapping(value = "/api/zhangdan", method = RequestMethod.POST)
	public String input1(@RequestParam(value = "filename") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 判断文件是否为空
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
		fieldMap.put("操作员", "operator");
		fieldMap.put("帐单流水", "billFlow");
		fieldMap.put("船名", "vessel");
		fieldMap.put("航次(班)", "voyage");
		fieldMap.put("客户编号", "customerNumber");
		fieldMap.put("主单编号", "mainOrderNo");
		fieldMap.put("收付对象", "payableObject");
		fieldMap.put("收付标志", "payableSign");
		fieldMap.put("USD应收", "usdReceived");
		fieldMap.put("USD应付", "usdPayable");
		fieldMap.put("RMB应收", "rmbReceived");
		fieldMap.put("RMB应付", "rmbPayable");
		fieldMap.put("HKD应收", "hkdReceived");
		fieldMap.put("HKD应付", "hkdPayable");
		fieldMap.put("EUR应收", "eurReceived");
		fieldMap.put("EUR应付", "eurPayable");
		fieldMap.put("JPY应收", "jpyReceived");
		fieldMap.put("JPY应付", "jpyPayable");
		fieldMap.put("GBP应收", "gbpReceived");
		fieldMap.put("GBP应付", "gbpPayable");
		fieldMap.put("开航日期", "sailingDate");
		fieldMap.put("费用明细", "detailsOfExpenses");
		fieldMap.put("始发港", "departurePort");
		fieldMap.put("目的港", "destinationPort");
		fieldMap.put("托单箱量", "singleTankQuantity");
		fieldMap.put("TEU", "teu");
		fieldMap.put("追加账单", "additionalBill");
		fieldMap.put("审核", "toExamine");
		fieldMap.put("对帐", "captain");
		fieldMap.put("外帐单号", "externalAccountNumber");
		fieldMap.put("对帐日期", "reconciliationDate");
		fieldMap.put("对帐人", "Reconciliant");
		fieldMap.put("审核日期", "auditDate");
		fieldMap.put("审核人", "auditor");
		fieldMap.put("备注", "remarks");
		fieldMap.put("销售员", "salesperson");
		fieldMap.put("操作人", "operatorp");
		fieldMap.put("托单编号", "orderNo");
		fieldMap.put("帐单类型", "billingType");
		fieldMap.put("发票编号", "invoiceNo");
		fieldMap.put("船东订舱号", "shipOwnerBookingNo");
		fieldMap.put("分船东订舱号", "bookingNoOfSubOwner");
		fieldMap.put("销帐日期", "writeOffDate");
		fieldMap.put("打印日期", "printDate");
		fieldMap.put("打印标志", "printMark");
		fieldMap.put("月结开票日期", "monthlySettlementAndInvoicingDate");
		fieldMap.put("未销金额", "amountNotSold");
		fieldMap.put("已销金额", "amountWrittenOff");
		fieldMap.put("帐单金额", "billAmount");
		fieldMap.put("增值税金额", "vatAmount");
		fieldMap.put("不含税金额", "amountExcludingTax");
		fieldMap.put("抬头对象", "headUpObject");
		fieldMap.put("帐龄", "ageOfAccount");
		fieldMap.put("合同付款日", "contractPaymentDate");
		fieldMap.put("付款方式", "paymentMethod");
		fieldMap.put("签收", "signIn");
		fieldMap.put("货代提单号", "forwarderBlNo");
		fieldMap.put("结算", "settlement");
		fieldMap.put("应收", "receivable");
		fieldMap.put("分单流水", "orderSplittingFlow");
		fieldMap.put("分公司", "branch");
		fieldMap.put("应付", "copeWith");
		fieldMap.put("应收USD转换RMB", "conversionFromUsdReceivableToRmb");
		fieldMap.put("应付USD转换RMB", "usdConversionRmbPayable");
		fieldMap.put("币制", "currencySystem");
		fieldMap.put("销帐", "account");
		fieldMap.put("项目类型", "projectType");
		fieldMap.put("制单日期", "dateOfPreparation");
		fieldMap.put("业务归属部门", "businessDepartment");
		fieldMap.put("箱号", "boxNumber");
		fieldMap.put("航线", "route");
		String are[] = { "Sheet1" };
		InputStream inputStream = file.getInputStream();
		List<TaTiumBill> excelToList = ExcelUtil.excelToList(inputStream, "Sheet1", TaTiumBill.class, fieldMap, are); // cityService.addFright(excelToList);
		cityService.addTaTiumbills(excelToList);
		return "";
	}

	
	@RequestMapping(value = "/api/zhangdan1", method = RequestMethod.POST)
	public String input11(@RequestParam(value = "filename") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 判断文件是否为空
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();
		fieldMap.put("操作员", "operator");
		fieldMap.put("托单编号", "orderNumber");
		fieldMap.put("主提单号", "mainMentionNumber");
		fieldMap.put("船东订舱号", "shipOwnerBookingNo");
		fieldMap.put("货代提单号", "forwarderBlNo");
		fieldMap.put("外帐单号", "externalAccountNumber");
		
		fieldMap.put("发票编号", "invoiceNumber");
		fieldMap.put("帐单流水", "billFlow");
		fieldMap.put("费用对象", "costObject");
		fieldMap.put("抬头对象", "headingObject");
		fieldMap.put("费用名称", "costName");
		fieldMap.put("RMB应收", "rmbReceivable");
		
		fieldMap.put("RMB应付", "rmbCoping");
		fieldMap.put("USD应收", "usdReceivable");
		fieldMap.put("USD应付", "usdCoping");
		fieldMap.put("TAX(%)", "tax");
		fieldMap.put("不含税", "taxFree");
		fieldMap.put("税额", "taxAmount");
		
		fieldMap.put("船名", "nameOfVessel");
		fieldMap.put("航次(班)", "voyage");
		fieldMap.put("开航日期", "sailingDate");
		fieldMap.put("对帐", "reconciliation");
		fieldMap.put("签收", "signFor");
		fieldMap.put("打印标志", "printingMark");
		fieldMap.put("销帐", "writeOff");
		fieldMap.put("销帐日期", "dateOfCancellation");
		String are[] = { "Sheet1" };
		InputStream inputStream = file.getInputStream();
		List<TaTiumDetailsOfExpenses> excelToList = ExcelUtil.excelToList(inputStream, "Sheet1", TaTiumDetailsOfExpenses.class, fieldMap, are); // cityService.addFright(excelToList);
		cityService.addTaTiumDetailsOfExpenses(excelToList);
		return "";
	}


}
