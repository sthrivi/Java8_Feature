package com.thrivi.practice.functioninterface;


class FunctionaShowImpl implements FunctionalInterfaceShow{

	@Override
	public void show(int i) {
		System.out.println("Interface Show");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String args[]) {
		
		System.out.println("inside main class");
		
		FunctionalInterfaceShow obj = new FunctionaShowImpl();
		obj.show(6);
		
		FunctionalInterfaceShow obj2 = new FunctionalInterfaceShow() {
			
			@Override
			public void show(int i) {
				System.out.println("Inside annonomus");
				
			}
		};
		obj2.show(7);
		
		
	}
}
