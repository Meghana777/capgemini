package com.cp.bootcamp.bean;

public class Employee {

	private int code;
	private String name;
	private int salary;
	private String project;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int code, String name, int salary, String project) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.project = project;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", salary=" + salary + ", project=" + project + "]";
	}
	
	
	
	
}