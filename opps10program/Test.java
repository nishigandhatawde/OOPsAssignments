package com.opps10program;

import java.util.Date;

public class Test {
	public static void main(String[] args) 
	{
		Date dob = new Date(1991,11, 15);
		Date doj = new Date(2022, 07, 07);
         Employee e = new Employee(176,"nishi","Pune", 12345, dob, doj);
         System.out.println(e);
         
         
	}
}
