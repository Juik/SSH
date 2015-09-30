package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.LoginDao;

public class test {
	public static void main(String args[]){
		ApplicationContext ctx=
			new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginDao ld=(LoginDao) ctx.getBean("logindao");
		boolean b=ld.isLogin("aa", "11");
		System.out.println(b);
		
	}
}
