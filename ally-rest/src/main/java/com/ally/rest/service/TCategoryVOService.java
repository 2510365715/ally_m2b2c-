package com.ally.rest.service;

import com.ally.rest.po.TcategoryVO;

/**
 * ��ȡ�����µ���Ʒ����
 * @author Administrator
 *
 */
public interface TCategoryVOService {

	/**
	 * ���ݴ���ķ���id��ȡ��Ʒ����
	 * @param id
	 * @return
	 */
	TcategoryVO getScateProducts(Integer id) throws Exception;

}
