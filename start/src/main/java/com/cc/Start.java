package com.cc;

import com.cc.config.AnnotationConfig;
import com.cc.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

	public static void main(String[] args) {
		//把spring的所有的前提环境准备好（创建内部的BeanDefinition，存到DefaultListableBeanFactory里的两个容器里（一个name+BeanDefinition的Map，一个name列表））
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.register(AnnotationConfig.class);
		//初始化spring的环境
		ac.refresh();
		UserDao userDao= ac.getBean(UserDao.class);
		userDao.printInfo();
	}

}
