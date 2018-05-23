/**
 * 
 */
package com.mchuan.coolact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mchuan.coolact.service.ActivityService;
import com.mchuan.coolact.service.LotteryService;

/**
 * @author 李浩铭
 * @since 2018年5月21日 下午3:01:37
 */
@Controller
public class TestActivityController {
	@Reference
	private ActivityService activityService;
//	@Reference
//	private LotteryService lotteryService;

	@RequestMapping("/test")
	public void test() {
		System.out.println(activityService.test());
	}

}
