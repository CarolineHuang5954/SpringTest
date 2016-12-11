package com.carolearning.autowaring.test;

import org.junit.Test;

import com.carolearning.autowaring.service.AutoWaringService;
import com.carolearning.test.UnitTestBase;

public class TestAutoWaring extends UnitTestBase {

	public TestAutoWaring(){
		super("classpath*:spring-autowaring.xml");
	}
	
	//�����ļ��е�default-autoware="Constructor"
	//���õ�����ƥ��ķ�ʽ����װ�䣬���bean�е�id���ʡ��
	@Test
	public void testSay(){
		AutoWaringService service = super.getBean("autowaringService");
		service.say("This is a test");
	}
}
