package com.lsp.without.lsp;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		List<Member> members = new ArrayList<Member>();
		members.add(new LifetimeMember("Ashwini"));
		members.add(new AnnualMember("Manoj"));
		members.add(new NewEnquiry("Santosh"));
		
		for (Member member : members) {
			member.addToDatabase();
			member.makeBooking();
		}

	}
}
