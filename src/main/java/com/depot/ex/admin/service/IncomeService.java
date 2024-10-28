package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.IncomeData;
import com.depot.ex.admin.entity.Income;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年1月2日 下午8:07:40 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface IncomeService {

	void save(Income income);

	List<IncomeData> findAllIncome(int page,int size,String content,String startTime,String endTime,int num);

	Income findById(Integer id);

	int findAllIncomeCount(String content,String startTime,String endTime,int num);

	void updateCardnum(String cardnum, String cardnumNew);

	List<IncomeData> findAllIncome(String content, String startTime, String endTime, Integer num);

}
