package com.carolearning.bean.test;

import org.junit.Test;

import com.carolearning.bean.BeanScope;
import com.carolearning.test.UnitTestBase;

public class TestBeanScope extends UnitTestBase {

	public TestBeanScope(){
		super("classpath*:spring-beanscope.xml");
	}
	
	//spring-beanscope.xml中scope
	//设置为singleton单例 两次获得的bean的hashcode相同
	//如果设置为prototype原型 两次获得的bean的hashcode不同
	//说明scope是prototype时每次获取bean都会创建一个新的实例，这时destroy方法不生效
	@Test
	public void testSay(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();
	}
	
	//scope设为singleton的时候run这两个test方法得到的hashcode也不相同
	//因为这两个方法在run之前都会分别调一遍before()和after()方法
	//相当于这两个test方法中的bean是从两个不同的IOC容器取的，所以hashcode不同
	@Test
	public void testSay1(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
	}
	
}
