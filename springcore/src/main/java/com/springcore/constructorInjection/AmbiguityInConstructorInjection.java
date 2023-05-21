package com.springcore.constructorInjection;

public class AmbiguityInConstructorInjection {

	
	private int x;
	private int y;
	
	public AmbiguityInConstructorInjection(double x, double y) {
		super();
		this.x =(int) x;
		this.y = (int)y;
		System.out.println("COnstructor is double double ");
	}
	
	public AmbiguityInConstructorInjection(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("COnstructor is int int ");
	}
	
	public AmbiguityInConstructorInjection(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y =Integer.parseInt(y) ;
		System.out.println("COnstructor is String String  ");
	}
	
	

	public void doSum() {
		System.out.println("Sum is "+(this.x+this.y));
	}
	
}
