package com.practice.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIForEach {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		
		System.out.println(employees);
		
		//Enhanced For Loop
		for(Employee e:employees) {
			System.out.println(e.getName() + ":" + e.getSalary());
		}
		
		//Traditional For Loop
		for (int i=0; i<employees.size();i++) {
			System.out.println(employees.get(i).getName() + ":" + employees.get(i).getSalary());
		}
		
		//Stream API - For Each
		
		employees.stream().forEach(e->System.out.println(e.getName() + ":" + e.getSalary()));
		
	}

}
