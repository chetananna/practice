package com.factory;

public class fetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     dbfactory dbf=new dbfactory();
		
		Dbconnector db=dbf.getDbInstance("tastecard");
		System.out.println("connecting to tastecard");
		db.connect();
		db=dbf.getDbInstance("gourmet");
		System.out.println("connecting to gourmet");
		db.connect();
	}

}
