package com.carolearning.autowaring.test;

import org.junit.Test;

import com.carolearning.autowaring.service.AutoWaringService;
import com.carolearning.test.UnitTestBase;

public class TestAutoWaring extends UnitTestBase {

	public TestAutoWaring(){
		super("classpath*:spring-autowaring.xml");
	}
	
	//配置文件中的default-autoware="Constructor"
	//是用的类型匹配的方式进行装配，因此bean中的id项可省略
	@Test
	public void testSay(){
		AutoWaringService service = super.getBean("autowaringService");
		service.say("This is a test");
	}
}
