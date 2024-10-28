package com.depot.ex.admin.interceptor;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.depot.ex.admin.entity.User;
import com.depot.ex.utils.Constants;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年10月7日 下午7:02:07 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public class LoginInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setCharacterEncoding("UTF-8"); 
	    response.setCharacterEncoding("UTF-8"); 
	    response.setContentType("text/html;charset=UTF-8"); 

	    User user=(User) request.getSession().getAttribute("user");
	    if(null!=user)
	    {
	    	  response.sendRedirect("/depot-system/index/toindex");
	    	  return false;
	    }
		return super.preHandle(request, response, handler);
	}
}
