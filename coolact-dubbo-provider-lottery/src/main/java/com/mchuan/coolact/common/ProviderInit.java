/**
 * 
 */
package com.mchuan.coolact.common;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @author 李浩铭
 * @since 2018年5月22日 上午11:08:19
 */
public class ProviderInit extends HttpServlet {
	public void init() throws ServletException {
		try {
			System.out.println("初始化dubbo服务端");
			Provider.init();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("初始化dubbo服务端失败");
		}
	}
}
