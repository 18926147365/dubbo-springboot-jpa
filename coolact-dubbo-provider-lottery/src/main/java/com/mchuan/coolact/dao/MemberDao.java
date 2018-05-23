/**
 * 
 */
package com.mchuan.coolact.dao;

import com.mchuan.coolact.entity.Member;
import com.mchuan.system.dao.CommDao;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午5:38:14
*/
public interface MemberDao extends CommDao<Member>{

	public void saveMember();
}
