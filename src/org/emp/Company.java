package org.emp;
//Project     :CompanyDetails
//Package     :org.company
//Class       :CompanyInfo
//Methods     :companyName()
//
//Description
//You have to overload the method companyName()
//based on different Number of arguments.

public class Company {
	private void companyName(String name,int i) {
		System.out.println(name+ "\n" +i);
	}
	private void companyName(String name, int i,float f) {
	System.out.println(name);
	System.out.println(i);
	System.out.println(f);
	}
	private void companyName(int i) {
		System.out.println(i);
	}
public static void main(String[] args) {
	Company c = new Company();
	c.companyName("HCL", 123);
	c.companyName("HCL", 123, 123423.986f);
	c.companyName(123);
}
}
