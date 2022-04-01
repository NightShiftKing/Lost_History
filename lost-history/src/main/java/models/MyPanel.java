package main.java.models;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import main.java.services.PlayerStatisicsService;

public class MyPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Need to fix timer
	Player p;

	Enemy En;

	Animals a;

	Plants Pl;
	public Timer gamelooptimer;
	
	PlayerStatisicsService playerService = new PlayerStatisicsService();
	
	static final Logger logger = Logger.getLogger(MyPanel.class);
	
	private static final String BACKGROUND_IMAGE = "/main/java/images/background.png";

	public MyPanel() {
		JPanel MyPanel = new JPanel();
		MyPanel.setSize(700, 700);
		ArrayList<Food> starterFoods = new ArrayList<>();
		Food food = new Food("Rations");
		starterFoods.add(food);
		p = new Player(100, 100, starterFoods);
		En = new Enemy(200, 200);
		a = new Animals(150, 250);
		Pl = new Plants(250, 300);
		addKeyListener(new KeyInput(p));

		setFocusable(true);

		gamelooptimer = new Timer(10, this);
		gamelooptimer.start();

	}

	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(getBackgroundImage(), 0, 0, null);

		p.draw(g2D);
		En.draw(g2D);
		playerService.handleHealth(p, En);
		logger.info("PlayerHealth = " + String.valueOf(p.getHealth()));
		a.draw(g2D);
		Pl.draw(g2D);

	}

	public Image getBackgroundImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(BACKGROUND_IMAGE));
		return i.getImage();

	}

	public void actionPerformed(ActionEvent e) {

		repaint();
		En.update();
		p.update();
		a.update();
		Pl.update();

	}

}
