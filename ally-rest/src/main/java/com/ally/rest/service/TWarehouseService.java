package com.ally.rest.service;

import java.util.List;

import com.ally.rest.po.TWarehouse;

/**
 * �ֿ����ݱ�ķ����ӿ�
 * @author Administrator
 *
 */
public interface TWarehouseService {

	
	/**
	 * ���ݴ����userid��ȡ�û��Ĳֿ�����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<TWarehouse> getWarehouseByUserid(Integer id)throws Exception;

	/**
	 * ���ݴ����������ȡ�ֿ�����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TWarehouse getWarehouseById(Integer id) throws Exception;

}
