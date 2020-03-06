package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	 public static void main(String... args) throws InterruptedException {
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

	       User1 u=context.getBean(User1.class);
	        System.out.println(u);

	        User1 u1=context.getBean(User1.class);
	        System.out.println(u1);

	    }
}
