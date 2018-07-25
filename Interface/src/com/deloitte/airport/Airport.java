package com.deloitte.airport;

import com.deloitte.fly.Flyer;
import com.deloitte.fly.Helicopter;
import com.deloitte.fly.SeaPlane;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airport metropolisAirport = new Airport();
		Helicopter copter= new Helicopter();
		SeaPlane sPlane= new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
		
		
	}

	private void givePermissionToLand(Flyer f) {
		// TODO Auto-generated method stub
		f.land();
	}

}
