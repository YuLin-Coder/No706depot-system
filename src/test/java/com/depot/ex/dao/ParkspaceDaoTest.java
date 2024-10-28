package com.depot.ex.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.depot.ex.admin.service.ParkspaceService;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年10月7日 下午5:06:59 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class ParkspaceDaoTest extends BaseTest{
	@Autowired
	ParkspaceService parkspaceService;
	@Test
	public void addParkspaceTest()
	{
		parkspaceService.addParkspace(62);
	}
}
