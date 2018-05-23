/**
 * 
 */
package com.mchuan.coolact.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.spring.AnnotationBean;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.mchuan.coolact.dao.MemberDao;
import com.mchuan.coolact.entity.Member;
import com.mchuan.coolact.service.LotteryService;
import com.mchuan.system.dao.CommDao;
import com.mchuan.system.service.impl.BaseServiceImpl;

/**
 * @author 李浩铭
 * @since 2018年5月21日 下午2:39:34
 */

@Service(interfaceClass=LotteryService.class)
public class LotteryServiceImpl extends BaseServiceImpl<Member> implements LotteryService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public CommDao<Member> getCommDao() {
		return memberDao;
	}

	public JSONObject toLottery() {
		Member member=new Member();
		member.setName("测试qwe");
		memberDao.save(member);
//		int i=1/0;
		return null;
	}

	public JSONObject saveMember() {
		Member member=new Member();
		member.setName("测试");
		memberDao.save(member);
		return null;
	}

}
