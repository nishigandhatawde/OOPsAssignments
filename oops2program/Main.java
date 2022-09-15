package com.oops2program;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	Map<String,Cordinate> mt =new HashMap<String,Cordinate>();
    mt.put("point1",new  Cordinate(10,20));
    mt.put("point2",new  Cordinate(20,30));
    mt.put("point3",new  Cordinate(10,30));
    System.out.println("In Traingle");
    Cordinate mc = mt.get("point1");
    System.out.println("vertex A has these coordinates:- "+mc.getX()+" "+ mc.getY());
    Cordinate mc1 = mt.get("point2");
    System.out.println("Vertex B vertex has these coordinates:- "+mc1.getX()+" "+ mc1.getY());
    Cordinate mc2 = mt.get("point3");
    System.out.println("Vertex C vertex has these coordinates:- "+mc2.getX()+" "+ mc2.getY());
//calculate area of traingle
    Triangle t= new Triangle();
             t.area();
//calculate are of rect
      Rectangle r =new Rectangle();
         r.area();
//calculate area of square
      Square s =new Square();
             s.area();
                     /*  Scanner sc = new Scanner(System.in);
                       System.out.println("MENU:");
                       System.out.println("1.Area of triangle");
                       System.out.println("2.Area of Square");
                       System.out.println("3.Area of rectangle");
                       System.out.println("Please enter any of the above option: ");
                       int num = sc.nextInt();
                       switch(num) 
                       {
						case 1:System.out.println("Enter all the details plz:"); 
						 t.area(); 
						case 2:System.out.println("Enter all the details plz:"); 
						 s.area();  
						
						case 3:System.out.println("Enter all the details plz:"); 
						 r.area();  
						       
						default:
							throw new IllegalArgumentException("Unexpected value: " + num);
						}*/
}
}
