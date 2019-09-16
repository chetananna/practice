package com.Strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("creates TastecardMembership");
		MembershipCreator mc=new MembershipCreator();
		mc.setMemberType(new TastecardMembership());
		mc.register();
		
		System.out.println("============================");
		System.out.println("creates GourmetMembership");
	
		mc.setMemberType(new GourmetMembership());
		mc.register();
		
	}

}
