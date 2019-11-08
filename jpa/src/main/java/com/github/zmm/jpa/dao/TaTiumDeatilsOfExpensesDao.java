package com.github.zmm.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.github.zmm.jpa.entity.TaTiumDetailsOfExpenses;

@Repository
public interface TaTiumDeatilsOfExpensesDao extends CrudRepository<TaTiumDetailsOfExpenses,Long>{

}
