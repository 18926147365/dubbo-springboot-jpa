/**
 * 
 */
package com.mchuan.coolact.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.mchuan.coolact.dao.MemberDao;
import com.mchuan.coolact.entity.Member;
import com.mchuan.system.dao.impl.CommonDaoImpl;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午5:39:15
*/
@Repository
public class MemberDaoImpl extends CommonDaoImpl<Member> implements MemberDao{

	public void saveMember() {
		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
		Member member=new Member();
		member.setName("qweqwe");
		session.save(member);
	}


	
}
