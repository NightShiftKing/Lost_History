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
	ArrayList<Items> bagItems;
	
	
	private static final String PLAYER_IMAGE = "/main/java/images/steve.png";
	private static final String HEALTH_BAR = "/main/java/images/health.png";
	
	
	
	
	// TODO inventory ArrayList<String>

	int velx = 0;
	int vely = 0;
	
	
	
	public Player(int x, int y, ArrayList<Food> foods) {
		super(x,y);
		Food food = new Food("Rations");
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
	
	


	public ArrayList<Items> getBagItems() {
		return bagItems;
	}


	public void setBagItems(ArrayList<Items> bagItems) {
		this.bagItems = bagItems;
	}

	

	public int getWater() {
		return water;
	}


	public void setWater(int water) {
		this.water = water;
	}


	public void draw(Graphics2D g2D){
		g2D.drawImage(getPlayerImages(), x, y, null);
		g2D.drawImage(getHealthBarImage(), -20, -25, null );
		g2D.setColor(Color.RED);
		g2D.fillRect(17, 60, health, 20);
	
		
		
	}
	
	
	public void update() {
		
	
		
		
			x+=velx;
			y+=vely;
			if(x < -40) {
				x=-40;
			}
			if(y < 0) {
				y = 0;
			}
			if(x > 1680 ) {
				x = 1680;
			}
			if(y > 1850) {
				y = 1850;
			}
	}
	
public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_D) {
			velx = 3;
		} else if(key==KeyEvent.VK_A) {
			velx = -3;
		} else if(key==KeyEvent.VK_W) {
			vely = -3;
		} else if(key==KeyEvent.VK_S) {
			vely = 3;
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
	
	public Image getPlayerImages(){
		ImageIcon i = new ImageIcon(getClass().getResource(PLAYER_IMAGE));
		return i.getImage();
		
		
	
	}
	
	public Image getHealthBarImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(HEALTH_BAR));
		return i.getImage();
	}
	
}

