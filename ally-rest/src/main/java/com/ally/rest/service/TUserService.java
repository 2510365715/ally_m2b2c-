package com.ally.rest.service;

import com.ally.rest.po.TUser;

/**
 * �û����ݵķ����ӿ�
 * @author Administrator
 *
 */
public interface TUserService {

	/**
	 * ����id��ȡ�û�����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TUser getUser(Integer id) throws Exception;

}
