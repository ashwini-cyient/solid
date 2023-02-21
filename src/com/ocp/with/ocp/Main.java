package com.ocp.with.ocp;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Square s1 = new Square(2);
		Square s2 = new Square(4);
		Circle s3 = new Circle(2);
		Circle s4 = new Circle(4);

		Shape[] shapes = new Shape[4];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		shapes[3] = s4;

		AreaCalculator calculator = new AreaCalculator(shapes);
		calculator.output();

	}

}
