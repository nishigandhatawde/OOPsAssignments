package com.oops4program;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Area area=new Area();
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the three side:");
		
		double Length =s.nextDouble();
		double Width =s.nextDouble();
		double Height =s.nextDouble();
		
		
		
		if(Length==Width || Length==Height || Width==Height) {
			
			area.areaOfSquare(Length,Width,Height);
			
		}
		else  {
			
			area.areaOfRectangle(Length,Width,Height);
		
		
			area.areaOfTraingle(Length, Width, Height);
			
			if(Height== Length+Width || Length==Height+Width || Height==Length+Width){
	            System.out.println("Right-Angle Triangle");
			}
	            else {
	            	System.out.println("NotRight-Angle Triangle");
	            }
			
		}

}
}

