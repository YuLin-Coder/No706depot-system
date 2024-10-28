package com.depot.ex.admin.entity;

import java.io.Serializable;
import java.util.Date;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月5日 下午12:36:01 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class ParkInfo implements Serializable{
	private int id;
	private int parknum;
	private String cardnum;
	private String carnum;
	private Date parkin;
	private int parktem;
	public int getParktem() {
		return parktem;
	}
	public void setParktem(int parktem) {
		this.parktem = parktem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParknum() {
		return parknum;
	}
	public void setParknum(int parknum) {
		this.parknum = parknum;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public Date getParkin() {
		return parkin;
	}
	public void setParkin(Date parkin) {
		this.parkin = parkin;
	}
	@Override
	public String toString() {
		return "ParkInfo [id=" + id + ", parknum=" + parknum + ", cardnum=" + cardnum + ", carnum=" + carnum
				+ ", parkin=" + parkin +  ", parktem=" + parktem + "]";
	}
	
	
}
