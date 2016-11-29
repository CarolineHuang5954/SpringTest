package com.carolearning.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTestBase {

	private ClassPathXmlApplicationContext context;
//	private FileSystemXmlApplicationContext context;
	
	private String springXmlPath;
	
	public UnitTestBase(){}
	
	public UnitTestBase(String springXmlPath){
		this.springXmlPath = springXmlPath;
	}
	
	@Before
	public void before(){
//		context = new FileSystemXmlApplicationContext(springXmlPath.split("[,\\s]+"));
		context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
		context.start();
	}
	
	@After
	public void after(){
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId){
		return (T)context.getBean(beanId);
	}
	
	protected <T extends Object> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
}
