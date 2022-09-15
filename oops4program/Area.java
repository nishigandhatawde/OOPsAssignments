package com.oops4program;

public class Area {
	double Length;
	double Width;
	double Heigth;

	public Area(double Length, double Width, double Height) {
		super();

	}

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	void areaOfTraingle(double Length, double Width, double Height) {
		double Traingle = Length * Width * Height;

		System.out.println("print area of tringle:" + Traingle);
	}

	void areaOfRectangle(double Length, double Height, double Width) {

		double Rectangle = Length * Width;

		System.out.println("print area of Rectangle:" + Rectangle);
	}

	void areaOfSquare(double Length, double Height, double Width) {

		double Square = Length * Length;
		System.out.println("print area of Square:" + Square);

	}

}
