package com.depot.ex.admin.dao;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.dto.FormData;
import com.depot.ex.admin.entity.ParkInfo;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月5日 下午12:44:42 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface ParkinfoDao extends BaseDao<ParkInfo>{
	//添加停车位信息
	public void save(ParkInfo parkInfo);
	public ParkInfo findParkinfoByParknum(@Param("parknum")int parknum);
	public void deleteParkinfoByParkNum(@Param("parknum")int parknum);
	public ParkInfo findParkinfoByCardnum(@Param("cardnum")String cardnum);
	public void updateCardnum(@Param("cardnum")String cardnum, @Param("cardnumNew")String cardnumNew);
}
