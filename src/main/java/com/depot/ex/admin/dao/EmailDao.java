package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.dto.EmailData;
import com.depot.ex.admin.entity.Email;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年1月2日 下午8:22:53 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface EmailDao extends BaseDao<Email>{

	void addEmial(Email email);

	Email findById(int id);

	void updateManReadById(int id);

	List<EmailData> findByUserId(@Param("page")int page,@Param("size")int size,@Param("uid")int id,@Param("role")int role,@Param("content")String content,@Param("tag")Integer tag);

	int findAllEmailCountByUser(@Param("uid")int uid,@Param("role")int role);

	void updateEmail(Email email);


}
