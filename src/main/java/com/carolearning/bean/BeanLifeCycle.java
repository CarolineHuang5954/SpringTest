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
	
	//实现了这两个接口，不需要在配置文件中定义init-method和destroy-method
	//容器会自动调用被覆盖的初始化方法和destroy方法
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
