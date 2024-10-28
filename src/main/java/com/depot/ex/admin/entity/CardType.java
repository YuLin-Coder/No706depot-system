package com.depot.ex.admin.entity;

import java.io.Serializable;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月27日 下午3:03:26 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class CardType implements Serializable{
	
	private int id;
	
	private String type;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

}
