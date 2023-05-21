package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	
private static ApplicationContext context;


public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorConfig.xml");

	Person person=(Person)context.getBean("person");
	AmbiguityInConstructorInjection person1=(AmbiguityInConstructorInjection)context.getBean("add");
person1.doSum();
	System.out.println(person);
}
}
