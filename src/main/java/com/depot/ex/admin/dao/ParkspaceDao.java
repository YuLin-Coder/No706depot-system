package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.entity.ParkSpace;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年10月7日 下午4:56:15 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface ParkspaceDao extends BaseDao<ParkSpace>{
	
	public void save(ParkSpace parkSpace);
	
	public int findMaxSpace();
	
	public List<ParkSpace> findAllParkspace(@Param("page")int page,@Param("size")int size);
	
	public void changeStatus(@Param("id")int id,@Param("status")int status);

	public List<ParkSpace> findParkspaceByTag(@Param("tag")int tag,@Param("page")int page,@Param("size")int size);

	public void changeStatusByParkNum(@Param("parkNum")int parkNum, @Param("status")int status);

	public int findAllParkspaceCount(@Param("tag")int tag);
	

	
}
