package com.oops5program;

public class Main {
public static void main(String[] args) {
	A a= new A();
	a.div(10, 20);
	System.out.println("div:"+a);
	A a1=new A();
	a1.sub(20,10);
	System.out.println("sub:"+a1);
	A a2=new A();
	a2.sum(10, 20);
	System.out.println("sum:"+a2);
	A a3=new A();
	a3.mul(10, 20);
	System.out.println("mul:"+a3);
}
}
