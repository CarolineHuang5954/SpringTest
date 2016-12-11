package com.carolearning.bean.test;

import org.junit.Test;

import com.carolearning.test.UnitTestBase;

public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle(){
		super("classpath*:spring-beanlifecycle.xml");
	}
	
	//调用了BeanLifeCycle的两个方法init()和destroy()
	//因为启动方法之前在父类里调用了context.start()方法和destroy()方法
	//在这两个方法里会调用配置文件里的init-method和destroy-method.
	//当同时定义了三种初始化和销毁方式的时候，会自动屏蔽全局default-init-method
	//和default-destroy-method. 
	//bean的class里面是可以没有defaultInit和defaultDestroy方法的(可选的方法)
	//另外两种方式相比实现接口的方法会优先调用，如果在bean里定义了init和destroy-method
	//那么在bean的class里必须有这两个方法，否则报错
	@Test
	public void test1(){
		super.getBean("beanLifeCycle");
	}
	
}
