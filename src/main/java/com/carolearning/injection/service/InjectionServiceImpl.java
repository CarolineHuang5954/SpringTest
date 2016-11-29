package com.carolearning.injection.service;

import com.carolearning.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;
	
//	设值注入
//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}
	
	//构造注入
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
