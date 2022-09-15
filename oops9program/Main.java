package com.oops9program;

public class Main {
public static void main(String[] args)  {
	try {
	Product p=new Product(10,"laptop",50000,"xyz");
	Product p1 = (Product)p.clone();
	
	System.out.println(p.pname+""+p.pname);
	System.out.println(p1.Price+""+p1.Price);
	
	String pname="nishi";
	boolean b=pname instanceof String;
	System.out.println("pname is instanceof string"+b);
	
	boolean b1=p instanceof Product;    
    System.out.println("pname is instance of string"+b1);
  
	}catch(CloneNotSupportedException c){}  
	
}
}
