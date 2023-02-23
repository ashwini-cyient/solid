package com.lsp.with.lsp;

public class LifetimeMember extends Member implements IDatabase, IBooking {

	public LifetimeMember(String name) {
		super(name);
		this.setType("Lifetime");
	}

	@Override
	public void addToDatabase() {
		System.out.println(this.name+" Added to database.");

	}

	@Override
	public void makeBooking() {
		System.out.println("Booking Made for "+this.name);

	}

}
