package com.thrivi.practice.functioninterface;

public class LambdaExpessionAddDemo {

	public static void main(String args[]) {
	
		FunctionalInterfaceAdd obj = (int i, int j) ->  i+j;
		
		int result = obj.add(5, 6);
		System.out.println("Result : " + result);
	}
}
