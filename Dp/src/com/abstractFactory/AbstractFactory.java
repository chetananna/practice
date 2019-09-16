package com.abstractFactory;

abstract class AbstractFactory {
	
    abstract Dcg getDcgType(String dcg);
    abstract MembershipType getMembershipType(String Membership);
}
