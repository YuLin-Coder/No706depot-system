package com.depot.ex.admin.dao;

import java.io.Serializable;

/** * 
@author  ���� E-mail: * 
@date ����ʱ�䣺2017��11��6�� ����5:04:29 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface BaseDao <M extends Serializable>{
	public void save(M m);
}
