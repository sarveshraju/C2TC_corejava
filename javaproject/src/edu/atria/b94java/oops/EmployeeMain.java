package edu.atria.b94java.oops;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation o fscanner class
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee details..");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		String designation=sc.next();
		//classname objname=new classname (syntax to create the object)
		//calling default class
		Employee eone=new Employee();
		*/
		
		
		/*eone.setId(id);
		eone.setName(name);
		eone.setSalary(salary);
		eone.setDesignation(designation);
		System.out.println("printingvthe employee id:"+eone.getId());
		System.out.println("printingths employee name"+eone.getName());
		System.out.println("printingths employee salary:"+eone.getSalary());
		System.out.println("printingths employee designation:"+eone.getDesignation());*/
		//calling parameterized construction
		Employee etwo=new Employee(101,"rahul",560,"developer");
		System.out.println(etwo);
		

	}

}
