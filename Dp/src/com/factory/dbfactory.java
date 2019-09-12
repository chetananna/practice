package com.factory;

public class dbfactory {

	
	public Dbconnector getDbInstance(String database){
		if (database=="tastecard") {
			return new TcConnect();
			
		}
		else
			return new GsConnect();
		
	}
}
