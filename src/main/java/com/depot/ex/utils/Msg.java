package com.depot.ex.utils;

import java.util.HashMap;
import java.util.Map;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年9月3日 上午10:58:30 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class Msg {
	
	//状态码
	private int code;
	//提示信息
	private String msg;
	
	//用户要返回给浏览器的
	private Map<String, Object> extend=new HashMap<String, Object>();
	
	public static Msg success()
	{
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("处理成功");
		return result;
	}
	public static Msg fail()
	{
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("处理失败");
		return result;
	}
	public Msg add(String key, Object value)
	{
		this.getExtend().put(key, value);
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
}
