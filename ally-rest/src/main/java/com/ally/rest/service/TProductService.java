package com.ally.rest.service;

import java.util.Date;
import java.util.List;

import com.ally.rest.po.AddProResult;
import com.ally.rest.po.TProduct;

/**
 * ��Ʒ���ݷ����ӿ�
 * @author Administrator
 *
 */
public interface TProductService {
	
	/**
	 * �����Ʒ�ķ��� ����product���������
	 * @param product
	 * @return
	 * @throws Exception
	 */
	AddProResult addProduct(TProduct product) throws Exception;

	/**
	 * Ʒ���̸� ��Ʒ����id��ȡ��Ʒ���ݵķ���
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	List<TProduct> getBraProducts(Integer userid) throws Exception;

	
	/**
	 * ����ɾ��Ʒ������Ʒ ����list���Ͻ���ɾ��
	 * @param list
	 * @throws Exception
	 */
	void deleteEmp(List<String> list) throws Exception;
	
	/**
	 * ɾ������Ʒ������Ʒ ���ݴ����String����id ����ɾ��
	 * @param proIds
	 */
	void deleteEmp(String proIds) throws Exception;

	/**
	 * ����������Ʒ���ݵķ���
	 * @param userid
	 * @param product
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws Exception 
	 */
	List<TProduct> getBraConditionPros(Integer userid, TProduct product, Date startTime, Date endTime) throws Exception;

	

	/**
	 * ����id��ȡ��Ʒ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TProduct getProduct(String id) throws Exception;

	
	/**
	 * ����Tproduct ������Ʒ���ݵ��޸�
	 * @param product 
	 * @throws Exception
	 */
	void updateProduct(TProduct product) throws Exception;
	
	
}
