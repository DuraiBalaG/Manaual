package org.emp;

public class Employees {
private void empDetails(String name) {
System.out.println(name);
}
private void empDetails(int i) {
	System.out.println(i);
}
private void empDetails(int i, float f,char c) {
	System.out.println(i +"\n" +f );
	System.out.println(c);
}
private void empDetails(String city,int pincode) {
	System.out.println(city +"\t" + pincode);
}
private void empDetails(int pincode,String city) {
	System.out.println(pincode +"\t" + city);
}
public static void main(String[] args) {
	Employees e = new Employees();
	e.empDetails("Durai");
	e.empDetails("123");
	e.empDetails(123, 1234.876f, 'M');
	e.empDetails("Chennai", 600050);
	e.empDetails(6008601, "Cuddalore");
}
}
