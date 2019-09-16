package com.abstractFactory;

public class Membershipfactory extends AbstractFactory{

	@Override
	Dcg getDcgType(String dcg) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	MembershipType getMembershipType(String membership) {
		// TODO Auto-generated method stub
		if (membership.equalsIgnoreCase("annual")) {
			return new Annual();
			
		}
		if (membership.equalsIgnoreCase("trial")) {
			return new Trial();
			
		}
		return null;
	}

}
