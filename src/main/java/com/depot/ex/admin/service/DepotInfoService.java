package com.depot.ex.admin.service;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年2月19日 下午10:02:14 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface DepotInfoService {

	void update(ChargeData chargeData);

	DepotInfo findById(int i);

}
