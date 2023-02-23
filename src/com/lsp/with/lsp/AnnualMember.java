package com.lsp.with.lsp;

public class AnnualMember extends Member implements IDatabase, IBooking {

	public AnnualMember(String name) {
		super(name);
		this.setType("Annual");
	}

	@Override
	public void addToDatabase() {
		System.out.println(this.name + " Added to database.");

	}

	@Override
	public void makeBooking() {
		System.out.println("Booking Made for " + this.name);

	}

}
