package com.oops11program;

public class Main {
public static void main(String[] args) {
	Electronics e=new Electronics();
	e.setId(10);
	e.setSemiconductorType("silicon");
	e.setDateofManufacturing("29-08-2022");
	
	System.out.println("id:"+e.getId());
	System.out.println("semiconductor type:"+e.getSemiconductorType());
	System.out.println("date of manufacturing:"+e.getDateofManufacturing());
	
}
}
