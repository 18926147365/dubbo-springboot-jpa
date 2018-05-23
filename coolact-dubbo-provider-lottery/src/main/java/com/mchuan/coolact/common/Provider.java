/**
 * 
 */
package com.mchuan.coolact.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author 李浩铭 
* @since 2018年5月22日 上午11:09:04
*/
public class Provider {
	public static void init() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/META-INFO/spring/ApplicationContext-dubbo.xml" });
		context.start();
		singleton();
	}

	public static ApplicationContext context = null;

	public static ApplicationContext singleton() {
		if (context == null) {
			context = new ClassPathXmlApplicationContext(new String[] { "providerApplicationContext.xml" });
		}
		return context;
	};
}
