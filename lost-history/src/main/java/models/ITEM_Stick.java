package main.java.models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ITEM_Stick extends Items {
	private static final  String STICK_IMAGE  = "/main/java/images/Stick.png";


	public ITEM_Stick(int x, int y) {
		super(x, y);
		
	}
	
	public void draw(Graphics2D g2D) {
		g2D.drawImage(getPlantsImage(), x, y, null);
	}

	public Image getPlantsImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(STICK_IMAGE));
		return i.getImage();
	}

}
