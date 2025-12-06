package com.thrivi.practice.functioninterface;

@FunctionalInterface
interface A{
	public void show();
	
}

public class LambaExpressionDemoTemp {

//	public static void main(String[] args) {
//		A obj = new A() {
//			public void show() {
//				System.out.println("Hello World - In Inner Class");
//			}
//		};
//	}
	
	public static void main(String[] args) {
		A obj = () -> System.out.println("Hello World - In Lambda Expression");
		obj.show();
	}
}
