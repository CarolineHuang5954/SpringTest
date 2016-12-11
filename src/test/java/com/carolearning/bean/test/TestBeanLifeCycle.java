package com.carolearning.bean.test;

import org.junit.Test;

import com.carolearning.test.UnitTestBase;

public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle(){
		super("classpath*:spring-beanlifecycle.xml");
	}
	
	//������BeanLifeCycle����������init()��destroy()
	//��Ϊ��������֮ǰ�ڸ����������context.start()������destroy()����
	//�����������������������ļ����init-method��destroy-method.
	//��ͬʱ���������ֳ�ʼ�������ٷ�ʽ��ʱ�򣬻��Զ�����ȫ��default-init-method
	//��default-destroy-method. 
	//bean��class�����ǿ���û��defaultInit��defaultDestroy������(��ѡ�ķ���)
	//�������ַ�ʽ���ʵ�ֽӿڵķ��������ȵ��ã������bean�ﶨ����init��destroy-method
	//��ô��bean��class����������������������򱨴�
	@Test
	public void test1(){
		super.getBean("beanLifeCycle");
	}
	
}
