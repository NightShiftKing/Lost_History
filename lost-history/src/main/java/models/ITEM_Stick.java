package main.java.models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ITEM_Stick extends Items {
	private static final  String STICK_IMAGE  = "/main/java/images/Stick.png";
	int ObjHeight;
	int ObjWidth; 

	public ITEM_Stick(int x, int y) {
		super(x, y);
		
	}
	
	public void draw(Graphics2D g2D) {
		g2D.drawImage(getPlantsImage(), x, y, null);
	}

	public int getObjHeight() {
		return ObjHeight;
	}

	public void setObjHeight(int objHeight) {
		ObjHeight = objHeight;
	}

	public int getObjWidth() {
		return ObjWidth;
	}

	public void setObjWidth(int objWidth) {
		ObjWidth = objWidth;
	}

	public static String getStickImage() {
		return STICK_IMAGE;
	}

	public Image getPlantsImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(STICK_IMAGE));
		return i.getImage();
	}

}
