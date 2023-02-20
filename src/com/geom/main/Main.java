package com.geom.main;

import com.geom.calculator.AreaCalculator;
import com.geom.shapes.Circle;
import com.geom.shapes.Square;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Square s1 = new Square(4);
		Square s2 = new Square(4);
		Circle s3 = new Circle(4);
		Circle s4 = new Circle(4);

		Object[] shapes = new Object[4];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		shapes[3] = s4;

		AreaCalculator calculator = new AreaCalculator(shapes);
		calculator.output();

	}

}
