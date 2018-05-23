/**
 * 
 */
package com.mchuan.coolact.utils;

import java.lang.reflect.Field;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxy;

/** 
* @author 李浩铭 
* @since 2018年5月23日 下午1:36:23
*/
public class AopUtils {
	    public static Object getTarget(Object bean){
	        if(org.springframework.aop.support.AopUtils.isCglibProxy(bean)) return getCglibAopObject(bean);
	        if(org.springframework.aop.support.AopUtils.isAopProxy(bean)) return getJDKDynamicAopObject(bean);
	        return bean;
	    }


	    private static Object getJDKDynamicAopObject(Object bean){
	        Field field = null;
	        try {
	            field = bean.getClass().getSuperclass().getDeclaredField("h");
	            field.setAccessible(true);
	            AopProxy aopProxy = null;
	                aopProxy = (AopProxy) field.get(bean);
	                field.setAccessible(false);


	            Field advised = aopProxy.getClass().getDeclaredField("advised");
	            advised.setAccessible(true);
	            Object target = ((AdvisedSupport)advised.get(aopProxy)).getTargetSource().getTarget();
	            advised.setAccessible(false);
	            return target;
	        } catch (Exception e) {
	            return bean;
	        }

	    }
	    private static Object getCglibAopObject(Object bean){
	        Field field = null;
	        try {
	            field = bean.getClass().getDeclaredField("CGLIB$CALLBACK_0");
	            field.setAccessible(true);
	            Object dynamicAdvisedInterceptor = field.get(bean);
	            field.setAccessible(false);
	            Field advised = dynamicAdvisedInterceptor.getClass().getDeclaredField("advised");
	            advised.setAccessible(true);
	            Object target = ((AdvisedSupport)advised.get(dynamicAdvisedInterceptor)).getTargetSource().getTarget();
	            advised.setAccessible(false);
	            return  target;
	        } catch (Exception e) {
	            return bean;

	        }


	    }
}
