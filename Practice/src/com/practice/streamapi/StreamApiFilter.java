package com.practice.streamapi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiFilter {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new EmployeeDB().getAllEmployees();
		
		//Filter List of employees are developer and salary above 80K
		
		List<Employee> developEmplsList = employees.stream()
					.filter(e-> e.getDept().equals("Development") && e.getSalary() >=80000)
					.collect(Collectors.toList());
		
		System.out.println(developEmplsList);
		
		developEmplsList.stream()
				.forEach(e -> System.out.println(e.getName() + ":" + e.getSalary() + ":" 
						+ e.getDept()));
		
		//Filter Set of Employees are developer and salary above 50K
		
		Set<Employee> developerEmplSet = employees.stream()
				.filter(e -> e.getDept().equals("Development") && e.getSalary() >= 50000)
				.collect(Collectors.toSet());
		
		System.out.println(developerEmplSet);
		
		developerEmplSet.stream().forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));
		
		
		//Filter Map of Employees are developer and salary lessthan 80000 with Key as a Id and value as Name
		
		Map<Integer,String> developEmplMap = employees.stream()
			.filter(e -> e.getDept().equals("Development") && e.getSalary() <= 80000)
			.collect(Collectors.toMap(Employee::getId,Employee::getName));
		
		System.out.println(developEmplMap);
		
		for(Integer key : developEmplMap.keySet()) {
			System.out.println(developEmplMap.get(key));
		}
		
	}

}
