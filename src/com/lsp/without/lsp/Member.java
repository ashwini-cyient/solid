package com.lsp.without.lsp;

public abstract class Member {

	public String name;
	private String type;

	public Member(String name) {
		this.name = name;
	}
	public abstract void makeBooking();
	
	public abstract void addToDatabase();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
