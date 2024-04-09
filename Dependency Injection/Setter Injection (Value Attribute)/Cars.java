package com.ebaad.SpringSetterInjection;
public class Cars {
	// The default value of milleage is set in the xml file using property tag
	private int milleage;
	
	public void setMilleage(int milleage) {
		this.milleage=milleage;
	}
	
	public int getMilleage() {
		return milleage;
	}
}

