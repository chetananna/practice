package com.factory;

public class GsConnect extends Dbconnector{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		port="Gourmet";
		System.out.println("This is the implementation of db for the Gourmet"+port);
	}
	

}
