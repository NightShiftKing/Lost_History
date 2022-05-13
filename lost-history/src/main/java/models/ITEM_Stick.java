package main.java.models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ITEM_Stick extends Items {
	private static final  String STICK_IMAGE  = "/main/java/images/Stick.png";
	 
	

	public ITEM_Stick(int x , int y) {
		super(x, y);
		super.allowpickup = true; 
		super.setName("Evil Staff");
	}
	
	public void draw(Graphics2D g2D) {
		g2D.drawImage(getPlantsImage(), x, y, null);
	}

	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static String getStickImage() {
		return STICK_IMAGE;
	}

	public Image getPlantsImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(STICK_IMAGE));
		return i.getImage();
	}
	
	
	

}
