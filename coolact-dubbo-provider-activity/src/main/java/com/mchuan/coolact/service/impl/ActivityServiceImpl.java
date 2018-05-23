/**
 * 
 */
package com.mchuan.coolact.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.mchuan.coolact.dao.ActivityDao;
import com.mchuan.coolact.entity.Activity;
import com.mchuan.coolact.service.ActivityService;

/**
 * @author 李浩铭
 * @since 2018年5月23日 下午4:54:44
 */
@Service(interfaceClass = ActivityService.class)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDao activityDao;

	@Override
	
	public JSONObject test() {
		Activity activity=new Activity();
		activity.setName("jkashdkjhqweqwe");
		System.out.println("asdasqweqwed");
		System.out.println(activityDao.save(activity));
//		int i=1/0;
		return null;
	}

}
