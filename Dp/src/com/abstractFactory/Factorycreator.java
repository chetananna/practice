package com.abstractFactory;

public class Factorycreator {

	
	static AbstractFactory getInstance(String factoryType){
		if (factoryType.equalsIgnoreCase("member")) {
			return new Membershipfactory();
			
		}
		if (factoryType.equalsIgnoreCase("dcg")) {
			return new DcgFactory();
			
		}
		return null;
	}
}
