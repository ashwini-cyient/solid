package com.ocp.with.ocp;

public class Square implements Shape {
	private double length;

	public Square(double length) {
		super();
		this.length = length;
	}

	@Override
	public double area() {
		return Math.pow(this.length,2);
	}

}
