/**
 * 
 */
package com.mchuan.coolact.compiler.impl;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.mchuan.coolact.compiler.Compiler;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午2:32:12
*/
public class AdaptiveCompiler implements Compiler {

	 private static volatile String DEFAULT_COMPILER ;

	    public static void setDefaultCompiler(String compiler) {
	        DEFAULT_COMPILER = compiler ;
	    }

	    public Class<?> compile(String code, ClassLoader classLoader) {
	        Compiler compiler;
	        ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler. class);
	        String name = DEFAULT_COMPILER ; // copy reference
	        if (name != null && name.length() > 0) {
	            compiler = loader.getExtension( name);
	        } else {
	            compiler = loader.getDefaultExtension();
	        }
	        return compiler .compile(code, classLoader);
	    }

  
   }

