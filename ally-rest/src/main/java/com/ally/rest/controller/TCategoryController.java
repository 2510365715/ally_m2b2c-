package com.ally.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.CateResult;
import com.ally.rest.po.Msg;
import com.ally.rest.po.TCategory;
import com.ally.rest.service.TCategoryService;

/**
 * �������ݿ��Ʋ�
 * @author Administrator
 *
 */
@Controller
public class TCategoryController {
	@Autowired
	TCategoryService categoryService;
	

	
	/**
	 * ��ȡһ�������б����ݣ���json��ʽ����
	 * @param callback
	 * @return
	 */
	@RequestMapping("/itemcat/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		CateResult catResult = categoryService.getItemCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	/**
	 * ��ȡ���������б����ݣ���json��ʽ����
	 * @param callback
	 * @return
	 */
	@RequestMapping("/itemfcate/list")
	@ResponseBody
	public Object getItemFCatList(String callback) {
		CateResult catResult = categoryService.getItemFCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	
	/**
	 * ���ݸ�id��ȡ��������
	 * @param callback
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/itemscate/list/{parentId}")
	@ResponseBody
	public Object getItemSCatList(String callback,@PathVariable("parentId")int parentId) {
		CateResult catResult = categoryService.getItemSCatList(parentId);
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	/**
	 * ����id������ȡ����
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping("/getCate/{id}")
	@ResponseBody
	public Msg getCategory(@PathVariable("id")Integer id,HttpServletResponse response) {
		//���ÿ���
		allowCrossDomain(response);
		try {
			TCategory category = categoryService.getCategory(id);
			return Msg.success().add("category", category);
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
