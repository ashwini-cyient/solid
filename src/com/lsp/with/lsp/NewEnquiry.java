package com.lsp.with.lsp;

public class NewEnquiry extends Member implements IDatabase {

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
		System.out.println(this.name + " Added to database.");

	}

	/*
	 * As per the business requirement, a member who is making an enquiry must not
	 * be able to make a booking. So we have made our design in a way that
	 * NewEnquiry implements IDatabase in order to save the enquirers in the db but
	 * by design it doesn't have any means to make a booking. This way Liskov
	 * Substitution Principle is followed.
	 * 
	 */

}
