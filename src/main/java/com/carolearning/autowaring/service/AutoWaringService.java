package com.carolearning.autowaring.service;

import com.carolearning.autowaring.dao.AutoWaringDAO;

public class AutoWaringService {

	private AutoWaringDAO autoWaringDAO;

	public AutoWaringService(AutoWaringDAO autowaringDAO){
		System.out.println("AutoWaringService construtor method.");
		this.autoWaringDAO = autowaringDAO;
	}
	
//	public void setAutowaringDAO(AutoWaringDAO autowaringDAO) {
//		this.autoWaringDAO = autowaringDAO;
//	}

	public void say(String str){		autoWaringDAO.say(str);
	}
}
