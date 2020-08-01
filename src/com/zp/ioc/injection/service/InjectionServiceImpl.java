package com.zp.ioc.injection.service;

import com.zp.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	// ����ע��
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	public void save(String arg) {
		//ģ��ҵ�����
		System.out.println("Service���ղ�����" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
}
