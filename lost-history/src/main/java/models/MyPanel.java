package models;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

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

	private String background = "/images/background.png";

	public MyPanel() {
		JPanel MyPanel = new JPanel();
		MyPanel.setSize(700, 700);
		p = new Player(100, 100);
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
		a.draw(g2D);
		Pl.draw(g2D);

	}

	public Image getBackgroundImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(background));
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
