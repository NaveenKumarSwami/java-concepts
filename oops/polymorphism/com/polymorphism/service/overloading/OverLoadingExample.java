package com.polymorphism.service.overloading;

class OverLoadingExample1 {
	public OverLoadingExample1(Object object) {
		System.out.println("Object");
	}

	public OverLoadingExample1(Integer integer) {
		System.out.println("Integer");
	}
}

class OverLoadingExample2 {
	public OverLoadingExample2(Object object) {
		System.out.println("Object");
	}

	public OverLoadingExample2(Integer integer) {
		System.out.println("Integer");
	}

	public OverLoadingExample2(String string) {
		System.out.println("String");
	}
}

public class OverLoadingExample {

	public static void main(String[] args) {
		new OverLoadingExample1(null); // Print Integer because Integer is subclass of Object
		//new OverLoadingExample2(null); // compile time error because it is ambigouses between String and Integer because both are subclass of Object 
	}

}
