package com.depot.ex.admin.service;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2018��2��19�� ����10:02:14 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface DepotInfoService {

	void update(ChargeData chargeData);

	DepotInfo findById(int i);

}
