package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.FormData;
import com.depot.ex.admin.entity.ParkInfo;
import com.depot.ex.admin.entity.ParkSpace;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��10��7�� ����5:00:47 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface ParkinfoService {
	public void saveParkinfo(FormData data);
	public ParkInfo findParkinfoByParknum(int parknum);
	public void deleteParkinfoByParkNum(int parkNum);
	public ParkInfo findParkinfoByCardnum(String cardnum);
	public void updateCardnum(String cardnum, String cardnumNew);
}
