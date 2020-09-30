package com.cp.bootcamp.exe;

import java.util.Scanner;

import com.cp.bootcamp.bean.Employee;
import com.cp.bootcamp.ctr.EmployeeOperations;

public class HRApp {

	Scanner sc = new Scanner(System.in);
	EmployeeOperations operations = new EmployeeOperations();
	
	public static void main(String[] args) {
		HRApp hrapp = new HRApp();
		
		while(true)
		{
			System.out.println(" === MENU ====");
			System.out.println("1. Add Employee");
			System.out.println("2. Get Employee By ID");
			System.out.println("3. Update Employee Salary By Project"); // increase the salary of employee by x% (given by user) working on same project
			System.out.println("4. Display All Employees");
			System.out.println("0. Exit");
			
			System.out.println("Enter Your Choice ");
			int choice = Integer.parseInt(hrapp.sc.nextLine());
			
			switch(choice)
			{
				case 1: hrapp.createNewEmployee();
				break;
				
				case 2: hrapp.searchEmployeeById();
				break;
				
				case 3: hrapp.updateSalary();
				
				
				case 4: hrapp.displayAllEmployees();
				break;
				case 0: System.exit(0);
			}
			
		}//end while
		
		
	}//end main
	
	public void createNewEmployee()
	{
		System.out.println("Enter Name ");
		String empName = sc.nextLine();
		System.out.println("Enter Code ");
		int code = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Project ");
		String project = sc.nextLine();

		Employee e = new Employee(code, empName, salary, project);
		
		operations.addEmployee(e);
	}
	
	public void searchEmployeeById()
	{
		System.out.println("Enter Code ");
		int code = Integer.parseInt(sc.nextLine());
		
		Employee e = operations.getEmployeeById(code);
		displayEmployeeDetails(e);
	}
	
	public void displayEmployeeDetails(Employee e)
	{
		System.out.println(" Employee Name: "+e.getName());
		System.out.println(" Employee Code: "+e.getCode());
		System.out.println(" Employee Project: "+e.getProject());
		System.out.println(" Employee Salary: "+e.getSalary());
		
	}
	public Employee displayAllEmployees() {

		return operations.displayAllEmployees();
	}
	public Employee updateSalary() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the project which you want to update salaries for");
		String project = scan.next();
		System.out.println("give the percentage by which you want to update salary of employee");
		int percentage = scan.nextInt();
		return operations.updateSalary(project,percentage);
		
	}

}