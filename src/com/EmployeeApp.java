package com;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeService e = new EmployeeServiceImpl();
		System.out.println("------Welcome To Employee-DB------");
		while(true) {
			System.out.println("----Menu----");
			System.out.println("1. Create Employee-DB\n2. Available Index\n3. Add Employee\n4. Display all Employees"
					+ "\n5. Employee By ID\n6. Delete Employee By ID\n7. Exit");
			System.out.println("Enter you Option: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the size of DB: ");
				int size = sc.nextInt();
				e.createEmployeeDB(size);
				break;
			case 2:
				try {
					e.availableIndex();
				}
				catch(Exception exp) {
					System.out.println("First create Array");
				}
				break;
			case 3:
				System.out.println("Enter index: ");
				int ind = sc.nextInt();
				e.addEmployee(ind);
				break;
			case 4:
				e.displayAllEmp();
				break;
			case 5:
				System.out.println("Enter Employee Id: ");
				int eId = sc.nextInt();
				e.getEmpById(eId);
				break;
			case 6:
				System.out.println("Enter Employee Id: ");
				int deId = sc.nextInt();
				e.delEmpById(deId);
				break;
			case 7:
				System.out.println("-----ThankYou Visit Again-----");
				System.exit(0);
			default: System.out.println("Invalid Choice");
			}
		}
	}
}
