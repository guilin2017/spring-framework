package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.beancontext.BeanContext;

public class Beaninization {

	public static void main(String[] args){
		System.out.print("sss");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanScanConfig.class);
		OrderService orderService = (OrderService) context.getBean("orderService");
		orderService.test();
	}
}
