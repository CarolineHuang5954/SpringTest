package com.carolearning.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean{

	public void defaultInit(){
		System.out.println("Default init bean...");
	}
	
	public void defaultDestroy(){
		System.out.println("Default destroy bean...");
	}
	
	//ʵ�����������ӿڣ�����Ҫ�������ļ��ж���init-method��destroy-method
	//�������Զ����ñ����ǵĳ�ʼ��������destroy����
	public void destroy() throws Exception {
		System.out.println("Bean destroy...");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean after...");
	}
	
	public void init(){
		System.out.println("Init bean...");
	}
	
	public void stop(){
		System.out.println("Stop bean...");
	}
}
