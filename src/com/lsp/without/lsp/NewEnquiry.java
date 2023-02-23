package com.lsp.without.lsp;

public class NewEnquiry extends Member {

	public NewEnquiry(String name) {
		super(name);
		this.setType("Enquiry");
	}

	@Override
	public void addToDatabase() {
		/*
		 * As per the business requirement, a member who is making an enquiry will be
		 * saved in the db for further followup. So it will be saved in the db.
		 */
		System.out.println(this.name+" Added to database.");

	}

	@Override
	public void makeBooking() {
		/*
		 * As per the business requirement, a member who is making an enquiry must not
		 * be able to make a booking. So we can either throw an exception or do nothing
		 * but to show a message.
		 */
		System.out.println("Cannot make a booking for "+this.name);
		//This is the violation of Liskov Substitution Principle as derived class NewEnquiry is not completely substitutible to the parent class.

	}

}
