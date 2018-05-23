/**
 * 
 */
package com.mchuan.coolact.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** 
* @author 李浩铭 
* @since 2018年5月21日 下午3:13:31
*/
public class DefaultFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
//			response.setHeader("Access-Control-Allow-Origin","http://192.168.2.103:8080");
////			response.setHeader("Access-Control-Allow-Origin","http://192.168.2.29:8020");
//			response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS");
//			response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
//			response.setHeader("Access-Control-Allow-Credentials", " true");
		chain.doFilter(request, response);
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
