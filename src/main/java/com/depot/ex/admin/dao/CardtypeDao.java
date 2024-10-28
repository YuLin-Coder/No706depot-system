package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月27日 下午3:04:33 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface CardtypeDao extends BaseDao<CardType>{

	List<CardType> findAllCardType();

	CardType findCardTypeByid(@Param("typeid")int typeid);
	
}
