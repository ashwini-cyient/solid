package com.lsp.with.lsp;

public abstract class Member {

	public String name;
	private String type;

	public Member(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
