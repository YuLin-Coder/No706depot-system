package com.depot.ex.admin.entity;

import java.io.Serializable;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年10月7日 下午4:53:09 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class ParkSpace implements Serializable{
	private Integer id;
	private int parkid;
	private int status;
	private int tag;
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getParkid() {
		return parkid;
	}
	public void setParkid(int parkid) {
		this.parkid = parkid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
