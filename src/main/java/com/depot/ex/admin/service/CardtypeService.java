package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月27日 下午3:06:03 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface CardtypeService {

	List<CardType> findAllCardType();

	CardType findCardTypeByid(int typeid);

}
