package com;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

	Employee[] eDB;
	Scanner sc = new Scanner(System.in);

	@Override
	public void createEmployeeDB(int size) {

		eDB = new Employee[size];
		System.out.println("Employee array size is: "+size);
	}

	@Override
	public void availableIndex() {

		int c=0;
		for(int i=0;i<eDB.length;i++) {
			if(eDB[i] == null) {
				System.out.print(i+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.print("Database if Full");
		}
		System.out.println();
	}

	@Override
	public void addEmployee(int in) {
		if(in>=eDB.length) {
			System.out.println("Inavlid Index No");
		}
		else if(eDB[in] != null) {
			System.out.println("It's Already occupied");
		}
		else {
			System.out.println("Enter Emp id");
			int eid = sc.nextInt();
			System.out.println("Enter the name");
			String ename = sc.next();
			System.out.println("Enter the designation");
			String dsg = sc.next();
			System.out.println("Enter the salary");
			double sal = sc.nextDouble();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			eDB[in] = new Employee(eid,ename,dsg,sal,age);
			System.out.println("Employee Added Successfully");
		}

	}

	@Override
	public void displayAllEmp() {
		System.out.println("-----Employe-Details-----");
		int c=0;
		for(int i=0;i<eDB.length;i++) {
			if(eDB[i] != null) {
				System.out.println(eDB[i]);
				c++;
			}
		}
		if(c==0) {
			System.out.println("Database is Empty!!");
		}

	}

	@Override
	public void getEmpById(int eid) {

		System.out.println("-----Employee-By-Employee-Id-----");
		boolean flag = false;
		for(Employee ele:eDB) {
			if(ele!=null) {
				if(ele.getEid()==eid) {
					System.out.println(ele);
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.println("Employee does not exist");
		}
	}

	@Override
	public void delEmpById(int eid) {

		System.out.println("-----Delete-By-Employee-ID-----");
		boolean flag = false;
		for(int i=0;i<eDB.length;i++) {
			if(eDB[i] != null) {
				if(eDB[i].getEid()==eid) {
					eDB[i] = null;
					flag = true;
					System.out.println("Employee Deleted Successfully");
				}
			}
		}
		if(flag==false) {
			System.out.println("Employee does not exist");
		}
	}

}
