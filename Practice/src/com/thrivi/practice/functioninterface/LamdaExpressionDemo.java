package com.thrivi.practice.functioninterface;

public class LamdaExpressionDemo {

	public static void main(String args[]) {
		
	FunctionalInterfaceShow obj = (i) -> System.out.println("Inside Lambda Expression :" + i);
	obj.show(10);
	}
}
