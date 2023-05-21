package com.springcore.constructorInjection;

import java.util.List;

public class Person {
private String name;
private int id;
private Certificate certi;
private List<String> cars;
public Person(String name, int id, Certificate certi, List<String> cars) {
	super();
	this.name = name;
	this.id = id;
	this.certi = certi;
	this.cars = cars;
}
public Person(String name, int id, Certificate certi) {
	super();
	this.name = name;
	this.id = id;
	this.certi = certi;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", certi=" + certi + ", cars=" + cars + "]";
}

}
