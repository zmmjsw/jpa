package com.github.zmm.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.zmm.jpa.entity.TaTiumOrder;

@Repository
public interface TaTiumOrderDao extends CrudRepository<TaTiumOrder,Long>{

}
