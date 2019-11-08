package com.github.zmm.jpa.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.zmm.jpa.dao.TaTiumBillDao;
import com.github.zmm.jpa.dao.TaTiumDeatilsOfExpensesDao;
import com.github.zmm.jpa.dao.TaTiumOrderDao;
import com.github.zmm.jpa.entity.TaTiumBill;
import com.github.zmm.jpa.entity.TaTiumDetailsOfExpenses;
import com.github.zmm.jpa.entity.TaTiumOrder;




/**
 * 
* @ClassName: CityServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author zhumingming 
* @date 2017年12月7日 下午6:12:54 
*
 */
@Service
@Transactional

public class CityService  {
	
    @Autowired
    private TaTiumOrderDao taTiumOrderDao;
    
    @Autowired
    private TaTiumBillDao TtaTiumBillDao;
    
    @Autowired
    private TaTiumDeatilsOfExpensesDao taTiumDeatilsOfExpensesDao;
    

	public void addTaTiumOrders(List<TaTiumOrder> excelToList) {
		System.out.println("开始");
		taTiumOrderDao.saveAll(excelToList);
		System.out.println("执行完毕");
		
	}

	public void addTaTiumbills(List<TaTiumBill> excelToList) {
		TtaTiumBillDao.saveAll(excelToList);
		
	}

	public void addTaTiumDetailsOfExpenses(List<TaTiumDetailsOfExpenses> excelToList) {
		taTiumDeatilsOfExpensesDao.saveAll(excelToList);
	}
	
	
}
