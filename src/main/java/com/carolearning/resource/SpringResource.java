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
		//使用applicationContext.getResource("classpath:config.txt")这种方式
		//能获取到config文件是因为已经把resources文件夹路径在工程的java build path->source下添加了
		Resource resource = applicationContext.getResource("classpath:config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
