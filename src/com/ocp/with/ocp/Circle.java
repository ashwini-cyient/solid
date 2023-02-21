package com.ocp.with.ocp;

public class Circle implements Shape {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	

}
