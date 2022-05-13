package main.java.services;

import java.awt.Rectangle;

import main.java.models.Enemy;
import main.java.models.Player;
import main.java.models.Food;

public class PlayerStatisicsService {

	public boolean enemyCollison = false;

	public int handleHealth(Player player, Enemy enemy) {
		int totalHealth = player.getHealth();
		int EHealth = enemy.getEnemyHealth(); 

		if (totalHealth <= 0) {
			totalHealth = 0;
		}

		if ((enemy.x == player.x) && (enemy.y == player.y)) {
			totalHealth = totalHealth - 1;

		}

//		if (player.getFoods() != null) {
//			while ((player.getHealth() < 100) && (player.getFoods().size() != 0)) {
//				totalHealth = totalHealth + (player.getFoods().size() / 5);
//			}
//
//		}
		

		if ((enemy.x == player.x) && (enemy.y == player.y) && (player.attack == true )) {                                 
			EHealth = EHealth - 10; 
		}
		
		if(EHealth <= 0 ) {
			
			enemy.x = 10000; 
			
		}

		player.setHealth(totalHealth);
		return player.getHealth();

	}

}
