package com.Strategy;

public class MembershipCreator {
	MembershipRegistration member;
	void  setMemberType(MembershipRegistration member){
		 this.member=member;
	 }
	
	
	void register(){
		member.joinmembership();
	}

}
