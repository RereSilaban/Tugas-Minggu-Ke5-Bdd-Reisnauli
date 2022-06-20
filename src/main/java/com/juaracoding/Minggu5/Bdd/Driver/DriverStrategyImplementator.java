package com.juaracoding.Minggu5.Bdd.Driver;

import com.juaracoding.Minggu5.Bdd.Utils.Constants;



public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();
		
		default:
			return null;
		}
		
	}
	
}
