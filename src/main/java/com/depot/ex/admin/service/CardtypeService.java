package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��11��27�� ����3:06:03 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface CardtypeService {

	List<CardType> findAllCardType();

	CardType findCardTypeByid(int typeid);

}
