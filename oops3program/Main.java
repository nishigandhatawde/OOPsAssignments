package com.oops3program;

public class Main {
	public static void main(String[] args) 
	  {
		  System.out.println("branch details:");
		  
		  Branch   b1 = new Branch(66,"SBI","Yavatmal" );
		  System.out.println("details of brnach sbi:");
		  System.out.println(b1);
		  
		  Branch   b2 = new Branch(35,"ICICI","Mumbai" );
		  System.out.println("details of brnach ICICI:");
		  System.out.println(b2);
		  
		  Branch   b3 = new Branch(100,"PNB","Pune" );
		  System.out.println("details of brnach PNB:");
		  System.out.println(b3);
		  
		System.out.println("customer details:");	
		
		Customer c1 = new Customer(1,567,"nishi", "Tawde","02/02/99","12/12/21", b1);
		System.out.println("details of customer c1:");
		System.out.println(c1);
		
		Customer c2 = new Customer(102,30002,"pooja", "Patil","07/07/91","01/12/22", b2);
		System.out.println("details of customer c2:");
		System.out.println(c2);
		
		Customer c3 = new Customer(103,30002,"Ashwini", "Rankhamb","05/03/95","01/02/20", b3);
		System.out.println("details of customer c3:");
		System.out.println(c3);
		
		
		System.out.println("all the details of CustomerAccStatement:");
		
		CustomerAccStatement ca1 = new CustomerAccStatement(501,c1, 1200, 500, "24/08/22");
		System.out.println("details of Customer_Account_Statement ca1");
		System.out.println(ca1);
		
		CustomerAccStatement ca2 = new CustomerAccStatement(502,c2, 2000, 700, "22/07/20");
		System.out.println("details of Customer_Account_Statement ca2");
		System.out.println(ca2);
		
		CustomerAccStatement ca3 = new CustomerAccStatement(503,c3, 3000, 800, "21/07/21");
		System.out.println("details of CustomerAccountStatement ca3");
		System.out.println(ca3);
	  }
	}


