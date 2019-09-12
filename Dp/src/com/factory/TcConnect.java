package com.factory;

public class TcConnect extends Dbconnector{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		port="tastecard";
		System.out.println("This is the implementation of db for the taste card"+port);
	}
	

}
