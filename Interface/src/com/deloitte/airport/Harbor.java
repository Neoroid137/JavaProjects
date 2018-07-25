package com.deloitte.airport;

import com.deloitte.fly.SeaPlane;

public class Harbor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harbor bostonHarbor = new Harbor();
		RiverBarge barge = new RiverBarge();
		SeaPlane sPlane = new SeaPlane();
		
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane)
		
	}

	private void givePermissionToDock(Sailor s) {
		// TODO Auto-generated method stub
		s.dock();
		
	}

}
