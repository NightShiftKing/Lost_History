package models;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;




public class Player extends GameObjects {
	int health = 100;
	int stamina = 100;
	int food = 100;
	int water = 100;
	int stealth = 100;
	boolean sneak = false;
	

	private String PlayerImage = "/images/newsteve.png";
	
	// TODO inventory ArrayList<String>

	int velx = 0;
	int vely = 0;
	
	
	
	public Player(int x, int y) {
		super(x,y);
	}
	
	
	public void draw(Graphics2D g2D){
		g2D.drawImage(getPlayerImage(), x, y, null);
		g2D.drawRect(0, 0, 100, 25);
		
		g2D.setColor(Color.red);
		g2D.fillRect(0, 0, health, 25);
		g2D.setColor(Color.BLACK);
		g2D.drawRect(0, 26, stamina, 25);
		g2D.setColor(Color.CYAN);
		g2D.fillRect(0, 26, stamina, 25);
	}
	
	
	public void update() {
		
	
		
		
			x+=velx;
			y+=vely;
			if(x < -15) {
				x=-15;
			}
			if(y < 0) {
				y = 0;
			}
			if(x > 650 ) {
				x = 650;
			}
			if(y > 620) {
				y = 620;
			}
	}
	
public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_D) {
			velx = 4;
		} else if(key==KeyEvent.VK_A) {
			velx = -4;
		} else if(key==KeyEvent.VK_W) {
			vely = -4;
		} else if(key==KeyEvent.VK_S) {
			vely = 4;
		}
		
	}
	public void keyReleased(KeyEvent e) {
	int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_D) {
			velx = 0;
		} else if(key==KeyEvent.VK_A) {
			velx = 0;
		} else if(key==KeyEvent.VK_W) {
			vely = 0;
		} else if(key==KeyEvent.VK_S) {
			vely = 0;
		}
	}
	
	public Image getPlayerImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(PlayerImage));
		return i.getImage();
		
	
	
	}
	
		
	
	
	
}

