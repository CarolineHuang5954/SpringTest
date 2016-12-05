package com.carolearning.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * Ҫ���ȡ�����ļ���Ҫ��bean������õ�applicationContext,���Ա���ʵ��ApplicationContextAware
 * @author C5033115
 *
 */
public class SpringResource implements ApplicationContextAware{

	public ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContext = applicationContext;
	}
	
	public void getResource() throws IOException{
		//ʹ��applicationContext.getResource("classpath:config.txt")���ַ�ʽ
		//�ܻ�ȡ��config�ļ�����Ϊ�Ѿ���resources�ļ���·���ڹ��̵�java build path->source�������
		//Resource resource = applicationContext.getResource("classpath:config.txt");
		//file:��ʽ��ȡ�����ļ�
		//Resource resource = applicationContext.getResource("file:C:\\Users\\C5033115\\git\\SpringTest\\src\\main\\resources\\config.txt");
		//url:��ʽ��ȡ�����ļ�
		//Resource resource = applicationContext.getResource("url:http://jingyan.baidu.com/album/ce436649fd82543772afd34f.html");
		//���ǰ׺ʲô����д��Ĭ�ϰ���applicationContext�Ĵ�����ʽ��"classpath*:"���ַ�ʽ��TestResource�Ĺ��췽���ﴴ���ġ�
		Resource resource = applicationContext.getResource("config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
