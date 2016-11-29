package com.carolearning.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {

	public boolean save(String str) {
		System.out.println("Save to DB: " + str);
		return true;
	}

}
