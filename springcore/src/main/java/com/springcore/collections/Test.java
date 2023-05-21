package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
Emp emp=(Emp)context.getBean("emp");
System.out.println(emp);
	}

}
