package com.ocp.without.ocp;

public class AreaCalculator {

	private Object shapes[];

	public AreaCalculator(Object shapes[]) {
		this.shapes = shapes;
	}

	private double sum() {
		double sum = 0;
		for (int i = 0; i < this.shapes.length; i++) {
			Object obj = shapes[i];
			if (obj instanceof Square) {
				Square square = ((Square) obj);
				sum = sum + square.length * square.length;
			} else if (obj instanceof Circle) {
				Circle circle = (Circle) obj;
				sum = sum += Math.PI * circle.radius * circle.radius;
			}

		}
		return sum;

	}
	
	public void output() {
		System.out.println("Sum of the areas of provided shapes :"+ this.sum());
	}

}
