package com.github.zmm.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.zmm.jpa.entity.TaTiumBill;

@Repository
public interface TaTiumBillDao extends CrudRepository<TaTiumBill,Long>{

}
