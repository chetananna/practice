package com.abstractFactory;

public class DcgFactory extends AbstractFactory{

	@Override
	Dcg getDcgType(String dcg) {
		// TODO Auto-generated method stub
		if (dcg.equalsIgnoreCase("tastecard")) {
			return new Tc();
			
		}
		if (dcg.equalsIgnoreCase("gourmet")) {
			return new Gs();
			
		}
		return null;
	}

	@Override
	MembershipType getMembershipType(String membership) {
		// TODO Auto-generated method stub
		return null;
	}

}
