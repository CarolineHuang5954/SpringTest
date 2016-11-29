package com.carolearning.injection.service;

import com.carolearning.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;
	
//	��ֵע��
//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}
	
	//����ע��
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO = injectionDAO;
	}

	public boolean save(String str) {

		System.out.println("Service get data: " + str);
		str = str + ":" + str.hashCode();
		injectionDAO.save(str);
		return false;
	}

}
