package main.java.models;

import main.java.models.Player;
public class Items extends GameObjects {
	
public boolean allowpickup; 
public String name; 

	public Items(int x , int y ) {
	super(x,y);
	

	}

	public boolean isAllowpickup() {
		return allowpickup;
	}

	public void setAllowpickup(boolean allowpickup) {
		this.allowpickup = allowpickup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
