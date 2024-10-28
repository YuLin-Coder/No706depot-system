package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.ParkinfoallData;
import com.depot.ex.admin.entity.Parkinfoall;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��11��28�� ����12:01:02 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface ParkinfoallService {

	List<ParkinfoallData> findAllParkinfoall(int page,int size);

	void save(Parkinfoall parkinfoall);

	ParkinfoallData findById(int id);

	int findAllParkinfoallCount(String name);

	List<ParkinfoallData> findAllParkinfoallByLike(int i, int pAGESIZE, String name);

	List<ParkinfoallData> findByCardNum(String cardnum,String name);

	void updateCardnum(String cardnum, String cardnumNew);

	List<ParkinfoallData> findByCardNumByPage(int page, int size, String cardnum, String name);

}
