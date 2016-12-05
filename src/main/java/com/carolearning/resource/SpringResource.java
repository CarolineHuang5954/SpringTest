package com.carolearning.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class SpringResource implements ApplicationContextAware{

	public ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContext = applicationContext;
	}
	
	public void getResource() throws IOException{
		//ʹ��applicationContext.getResource("classpath:config.txt")���ַ�ʽ
		//�ܻ�ȡ��config�ļ�����Ϊ�Ѿ���resources�ļ���·���ڹ��̵�java build path->source�������
		Resource resource = applicationContext.getResource("classpath:config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
