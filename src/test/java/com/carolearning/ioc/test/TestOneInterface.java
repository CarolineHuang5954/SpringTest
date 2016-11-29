package com.carolearning.ioc.test;

import org.junit.Test;

import com.carolearning.ioc.OneInterface;
import com.carolearning.test.UnitTestBase;

public class TestOneInterface extends UnitTestBase{


	public TestOneInterface(){
//		super("classpath*:spring-ioc.xml");
		super("D:/WorkSpace_Neon/SpringTest/src/main/resources/spring-ioc.xml");
	}
	
	@Test
	public void testHello(){
		OneInterface oneInterface = super.getBean("oneInterface");
		String rs = oneInterface.hello("fuck you!");
		System.out.println(rs);
	}
}
