package com.carolearning.injection.test;

import org.junit.Test;

import com.carolearning.injection.service.InjectionService;
import com.carolearning.test.UnitTestBase;

public class TestInjection extends UnitTestBase{

	public TestInjection(){
		super("classpath*:spring-injection.xml");
	}
	
	@Test
	public void testSetterInjection(){
		InjectionService service = super.getBean("injectionService");
		service.save("This data is to be saved.");
	}
	
	@Test
	public void testConstructInjection(){
		InjectionService service = super.getBean("injectionService");
		service.save("This data is to be saved.");
	}
}
