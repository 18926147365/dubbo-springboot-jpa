/**
 * 
 */
package com.mchuan.coolact.service;

import com.alibaba.fastjson.JSONObject;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午2:39:57
*/
public interface LotteryService {

	/**去抽奖接口*/
	public JSONObject toLottery();
	/**保存用户*/
	public JSONObject saveMember();
}
