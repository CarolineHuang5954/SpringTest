package com.carolearning.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * 要想读取配置文件需要在bean的类里得到applicationContext,所以必须实现ApplicationContextAware
 * @author C5033115
 *
 */
public class SpringResource implements ApplicationContextAware{

	public ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContext = applicationContext;
	}
	
	public void getResource() throws IOException{
		//使用applicationContext.getResource("classpath:config.txt")这种方式
		//能获取到config文件是因为已经把resources文件夹路径在工程的java build path->source下添加了
		//Resource resource = applicationContext.getResource("classpath:config.txt");
		//file:方式读取配置文件
		//Resource resource = applicationContext.getResource("file:C:\\Users\\C5033115\\git\\SpringTest\\src\\main\\resources\\config.txt");
		//url:方式读取配置文件
		//Resource resource = applicationContext.getResource("url:http://jingyan.baidu.com/album/ce436649fd82543772afd34f.html");
		//如果前缀什么都不写，默认按照applicationContext的创建方式进"classpath*:"这种方式在TestResource的构造方法里创建的。
		Resource resource = applicationContext.getResource("config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
