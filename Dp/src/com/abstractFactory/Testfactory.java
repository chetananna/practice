package com.abstractFactory;

public class Testfactory {
	public static void main(String[] args) {
		AbstractFactory dcgType = Factorycreator.getInstance("dcg");
		Dcg tc = dcgType.getDcgType("tastecard");
		tc.getDcgType();
		AbstractFactory member = Factorycreator.getInstance("member");
		 MembershipType trial = member.getMembershipType("trial");
		System.out.println(trial.duration());
		System.out.println(trial.rate());
	
	}

}
