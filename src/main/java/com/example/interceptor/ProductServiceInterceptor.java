/**
 * com.example.interceptor
 * Jun 10, 2020
 * snigdha
 * 2020
 */
package com.example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author snigdha
 *
 */
@Component
public class ProductServiceInterceptor implements HandlerInterceptor{


	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		System.out.println("Pre Handle method is Calling");
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("Post Handle method is Calling");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object 
			handler, Exception exception) throws Exception {
		System.out.println("Request and Response is completed");
	}	
}
