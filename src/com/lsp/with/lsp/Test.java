package com.lsp.with.lsp;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		List<IDatabase> members = new ArrayList<IDatabase>();
		members.add(new LifetimeMember("Ashwini"));
		members.add(new AnnualMember("Manoj"));
		members.add(new NewEnquiry("Santosh"));
		
		for (IDatabase member : members) {
			member.addToDatabase();
			
		}
		
		

	}
}

