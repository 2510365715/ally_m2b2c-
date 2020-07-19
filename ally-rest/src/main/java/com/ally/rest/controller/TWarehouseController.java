package com.ally.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TWarehouse;
import com.ally.rest.service.TWarehouseService;

/**
 * �ֿ����ݱ�Ŀ��Ʋ�
 * @author Administrator
 *
 */
@Controller
public class TWarehouseController {

	@Autowired
	TWarehouseService tWarehouseService;
	
	/**
	 * ͨ��userid��ȡ�ֿ�����
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/getWarehouse/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getWarehouseByUserid(@PathVariable("id")Integer id,HttpServletResponse response) {
		//���ûش�����
		allowCrossDomain(response);
		try {
			List<TWarehouse> warehouses = tWarehouseService.getWarehouseByUserid(id);
			return Msg.success().add("warehouses", warehouses);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
		
	}
	
	/**
	 * ���ݲֿ�������ȡ�ֿ�����
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/getWarehouseById/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getWarehouseById(@PathVariable("id")Integer id,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			TWarehouse warehouse = tWarehouseService.getWarehouseById(id);
			return Msg.success().add("warehouse", warehouse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}
	
	
	public void allowCrossDomain(HttpServletResponse response) {
		//���ûش�����,�����������
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}
}
