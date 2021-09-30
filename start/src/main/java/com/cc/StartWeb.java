package com.cc;

import com.cc.config.AnnotationConfig;
import com.cc.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class StartWeb {

	public static void main(String[] args) {

		AnnotationConfigWebApplicationContext ac=new AnnotationConfigWebApplicationContext();
		ac.register(AnnotationConfig.class);
		ac.refresh();

	}

}
