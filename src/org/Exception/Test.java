package org.Exception;

public class Test {
public static void main(String[] args) {
	try {
		int a=10/0;
		System.out.println(a);
	}
	catch (Exception e) {
System.out.println("Something went wrong");
	}
	finally {
		System.out.println("Done....");
System.out.println("Mugil Task");		
	}
}
}
