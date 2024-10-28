package com.depot.ex.admin.service;

import java.util.Date;
import java.util.List;

import com.depot.ex.admin.entity.IllegalInfo;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��12��27�� ����7:40:53 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface IllegalInfoService {

	public void save(IllegalInfo info);

	public List<IllegalInfo> findAllIllegalInfo(int page,int size,String name);

	public IllegalInfo findById(int id);

	public void deleteById(int id);

	public IllegalInfo findByCarnum(String carnum,Date parkin);

	public IllegalInfo findByCardnum(String cardNum);

	public int findAllIllegalInfoCount(String name);

	public List<IllegalInfo> findByUid(int uid);

	public void updateCardnum(String cardnum, String cardnumNew);

	public IllegalInfo findByCardnumParkin(String cardNum, Date parkin);
	
}
