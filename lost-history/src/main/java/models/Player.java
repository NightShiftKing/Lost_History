package main.java.models;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;




public class Player extends GameObjects {
	int health = 100;
	int stamina = 100;
	ArrayList<Food> foods;
	int water = 100;
	int stealth = 100;
	boolean sneak = false;
	
	
	private static final String PLAYER_IMAGE = "/main/java/images/newsteve.png";
	
	// TODO inventory ArrayList<String>

	int velx = 0;
	int vely = 0;
	
	
	
	public Player(int x, int y, ArrayList<Food> foods) {
		super(x,y);
		Food food = new Food("Rations", 5);
		foods.add(food);
		this.foods = foods;
		
	}
	
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getStamina() {
		return stamina;
	}


	public void setStamina(int stamina) {
		this.stamina = stamina;
	}


	public ArrayList<Food> getFoods() {
		return foods;
	}


	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}


	public int getStealth() {
		return stealth;
	}


	public void setStealth(int stealth) {
		this.stealth = stealth;
	}


	public boolean isSneak() {
		return sneak;
	}


	public void setSneak(boolean sneak) {
		this.sneak = sneak;
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
		ImageIcon i = new ImageIcon(getClass().getResource(PLAYER_IMAGE));
		return i.getImage();
		
	
	
	}
	
		
	
	
	
}

