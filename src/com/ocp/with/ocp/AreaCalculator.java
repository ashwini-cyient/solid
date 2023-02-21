package com.ocp.with.ocp;

public class AreaCalculator {

	private Shape shapes[];
	public AreaCalculator(Shape shapes[]) {
		this.shapes = shapes;
	}
	
	private double sum() {
		double sum = 0;
		for (int i = 0; i < this.shapes.length; i++) {
			Shape shp = shapes[i];
			shp.area();
			sum = sum + shp.area();
		}
		return sum;
	}
	
	public void output() {
		System.out.println("Sum of the areas of provided shapes using OCP :"+ this.sum());
	}

}
