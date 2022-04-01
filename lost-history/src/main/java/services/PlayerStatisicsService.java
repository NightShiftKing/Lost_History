package main.java.services;

import main.java.models.Enemy;
import main.java.models.Player;
import main.java.models.Food;
public class PlayerStatisicsService {

	public int handleHealth(Player player, Enemy enemy) {
		int totalHealth = player.getHealth();

		if ((enemy.x == player.x) && (enemy.y == player.y)) {
			totalHealth = totalHealth - 1;
		}

		if (player.getFoods() != null) {
			int totalAmountFood = 0;
			
			
			while ((player.getHealth() < 100) && (player.getFoods().size() != 0)) {

				totalHealth = totalHealth + (player.getFoods().size() / 5);

			}

		}

		player.setHealth(totalHealth);
		return player.getHealth();
	}

}
