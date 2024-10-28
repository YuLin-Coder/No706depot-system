package com.depot.ex.admin.dao;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年2月19日 下午10:03:21 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface DepotInfoDao extends BaseDao<DepotInfo>{
	public void update(ChargeData chargeData);
	public DepotInfo findById(int id);
}
