package com.depot.ex.admin.dao;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2018��2��19�� ����10:03:21 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface DepotInfoDao extends BaseDao<DepotInfo>{
	public void update(ChargeData chargeData);
	public DepotInfo findById(int id);
}
