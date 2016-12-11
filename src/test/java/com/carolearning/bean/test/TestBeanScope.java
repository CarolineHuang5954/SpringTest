package com.carolearning.bean.test;

import org.junit.Test;

import com.carolearning.bean.BeanScope;
import com.carolearning.test.UnitTestBase;

public class TestBeanScope extends UnitTestBase {

	public TestBeanScope(){
		super("classpath*:spring-beanscope.xml");
	}
	
	//spring-beanscope.xml��scope
	//����Ϊsingleton���� ���λ�õ�bean��hashcode��ͬ
	//�������Ϊprototypeԭ�� ���λ�õ�bean��hashcode��ͬ
	//˵��scope��prototypeʱÿ�λ�ȡbean���ᴴ��һ���µ�ʵ������ʱdestroy��������Ч
	@Test
	public void testSay(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();
	}
	
	//scope��Ϊsingleton��ʱ��run������test�����õ���hashcodeҲ����ͬ
	//��Ϊ������������run֮ǰ����ֱ��һ��before()��after()����
	//�൱��������test�����е�bean�Ǵ�������ͬ��IOC����ȡ�ģ�����hashcode��ͬ
	@Test
	public void testSay1(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
	}
	
}
