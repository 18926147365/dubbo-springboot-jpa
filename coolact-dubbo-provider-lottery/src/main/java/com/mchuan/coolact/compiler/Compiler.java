/**
 * 
 */
package com.mchuan.coolact.compiler;

import com.alibaba.dubbo.common.extension.SPI;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午2:31:10
* 动态编译
*/
@SPI("javassist" )
public interface Compiler {
	 Class<?> compile(String code, ClassLoader classLoader);
}
