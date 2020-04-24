package com.amit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	
	private int id;
	private String name ;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static List<Employee> getEmployeeList() {
		
		Employee e1 =new Employee(1,"Sanjay",34);
		Employee e2 =new Employee(2,"mahesh",65);
		Employee e3 =new Employee(3,"shalaka",98);
		Employee e4 = new Employee(4, "Dinesh", 50);
		Employee e5 = new Employee(5, "Amit", 38);
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5);
		
		return empList;
	}
	
	public static Map<Integer,Employee> empMap(){
		
		Employee e1 =new Employee(1,"Sanjay",34);
		Employee e2 =new Employee(2,"mahesh",65);
		Employee e3 =new Employee(3,"shalaka",98);
		Employee e4 = new Employee(4, "Dinesh", 50);
		Employee e5 = new Employee(5, "Amit", 38);
		Map<Integer,Employee> empMap = new HashMap<>();
		empMap.put(4,e4);
		empMap.put(2,e2);
		empMap.put(1,e1);
		empMap.put(3,e3);
		empMap.put(5,e5);
		return empMap;
	}
	
	

}
