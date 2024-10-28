package com.depot.ex.admin.dao;

import java.io.Serializable;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月6日 下午5:04:29 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface BaseDao <M extends Serializable>{
	public void save(M m);
}
