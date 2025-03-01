package com.depot.ex.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depot.ex.admin.dao.DepotInfoDao;
import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;
import com.depot.ex.admin.service.DepotInfoService;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年2月19日 下午10:02:58 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
@Service
public class DepotInfoServiceImpl implements DepotInfoService{

	@Autowired 
	private DepotInfoDao depotInfoDao;
	public void update(ChargeData chargeData) {
		depotInfoDao.update(chargeData);
	}
	public DepotInfo findById(int id) {
		return depotInfoDao.findById(id);
	}

}
