package com.lsp.without.lsp;

public class LifetimeMember extends Member {

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
