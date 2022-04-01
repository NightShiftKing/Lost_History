package main.java.models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Plants extends GameObjects {
	private static final  String TREE_IMAGE  = "/main/java/images/tree.png";

	public Plants(int x, int y) {
		super(x, y);

	}

	public void draw(Graphics2D g2D) {
		g2D.drawImage(getPlantsImage(), x, y, null);
	}

	public Image getPlantsImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(TREE_IMAGE));
		return i.getImage();
	}

	public void update() {

	}
}
