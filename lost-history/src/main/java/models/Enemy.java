package main.java.models;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Enemy extends GameObjects {
	private static final String ENEMY_IMAGE = "/main/java/images/Enemy.png";

	int speed = 3;

	public Enemy(int x, int y) {
		super(x, y);

	}

	public void draw(Graphics2D g2D) {
		g2D.drawImage(getEnemyImage(), x, y, null);
	}

	public Image getEnemyImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(ENEMY_IMAGE));
		return i.getImage();
	}

	public void update() {
		y += speed;

		if (y < -15) {
			speed = 3;
		}

		if (y > 850) {
			speed = -3;
		}
		
	}
}
