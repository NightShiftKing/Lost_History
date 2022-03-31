package models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Plants extends GameObjects {
	private String image = "/images/tree.png";

	public Plants(int x, int y) {
		super(x, y);

	}

	public void draw(Graphics2D g2D) {
		g2D.drawImage(getPlantsImage(), x, y, null);
	}

	public Image getPlantsImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(image));
		return i.getImage();
	}

	public void update() {

	}
}
