/**
 * 
 */
package com.mchuan.coolact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mchuan.coolact.entity.Activity;

/** 
* @author 李浩铭 
* @since 2018年5月23日 下午5:18:11
*/
public interface ActivityDao  extends JpaRepository<Activity,String>,JpaSpecificationExecutor<Activity> {
	
}
