package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��11��27�� ����3:04:33 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface CardtypeDao extends BaseDao<CardType>{

	List<CardType> findAllCardType();

	CardType findCardTypeByid(@Param("typeid")int typeid);
	
}
