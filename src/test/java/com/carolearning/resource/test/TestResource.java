package com.carolearning.resource.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import com.carolearning.resource.SpringResource;
import com.carolearning.test.UnitTestBase;

public class TestResource extends UnitTestBase{

	Logger logger = Logger.getGlobal();
	public TestResource(){
		super("classpath*:spring-resource.xml");
	}
	
	@Test
	public void testGetResource(){
		SpringResource resource = super.getBean("springResource");
		try {
			resource.getResource();
		} catch (IOException e) {
			logger.log(Level.WARNING, e.getMessage());
			e.printStackTrace();
		}
	}
}
