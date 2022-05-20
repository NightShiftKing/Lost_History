package main.java.services;

import java.awt.Rectangle;

import javax.swing.JFrame;

import main.java.models.Enemy;
import main.java.models.Player;
import main.java.models.Food;
import main.java.models.Frame;
import main.java.models.GameOver;
import main.java.models.MyPanel;

public class PlayerStatisicsService {

	public boolean enemyCollison = false;

	public int handleHealth(Player player, Enemy enemy , Frame frame , MyPanel panel , GameOver gameOver) {
		int totalHealth = player.getHealth();
		int EHealth = enemy.getEnemyHealth();
		boolean dead = player.isPlayerDeath();

		if (totalHealth <= 0) {
			totalHealth = 0;
			
			dead = true; 
		}

		if ((enemy.x == player.x) && (enemy.y == player.y)) {
			totalHealth = totalHealth - 100;

		}

//		if (player.getFoods() != null) {
//			while ((player.getHealth() < 100) && (player.getFoods().size() != 0)) {
//				totalHealth = totalHealth + (player.getFoods().size() / 5);
//			}
//
//		}

		if ((enemy.x == player.getX()) && (enemy.y == player.getY()) && (player.isAttack() == true)) {
			EHealth = EHealth - 10;
		}

		if (EHealth <= 0) {

			enemy.x = 10000;

		}

		player.setHealth(totalHealth);
		return player.getHealth();

	}

}
