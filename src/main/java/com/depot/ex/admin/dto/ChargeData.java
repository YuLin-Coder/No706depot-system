package com.depot.ex.admin.dto;
/** * 
@author  作者 E-mail: * 
@date 创建时间：2018年2月19日 下午9:57:16 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class ChargeData {
	
	private Integer hourmoney;
	private Integer monthcard;
	private Integer yearcard;
	private Integer illegal;
	public Integer getHourmoney() {
		return hourmoney;
	}
	public void setHourmoney(Integer hourmoney) {
		this.hourmoney = hourmoney;
	}
	public Integer getMonthcard() {
		return monthcard;
	}
	public void setMonthcard(Integer monthcard) {
		this.monthcard = monthcard;
	}
	public Integer getYearcard() {
		return yearcard;
	}
	public void setYearcard(Integer yearcard) {
		this.yearcard = yearcard;
	}
	public Integer getIllegal() {
		return illegal;
	}
	public void setIllegal(Integer illegal) {
		this.illegal = illegal;
	}
	
}
