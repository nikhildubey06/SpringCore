package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> numbers;
	private Set<String> address;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String name, List<String> numbers, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.numbers = numbers;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name = " + name + ", numbers = " + numbers + ", address = " + address + ", courses = " + courses
				+ "]";
	}
	
	
	
}
