package main.java.models;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class GameOverPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEATH_IMAGE = "/main/java/images/DeathScreen.png";
	private boolean visable = true;

	private JButton button;
	 

	public  GameOverPanel() {
		

	
	}
	
	


	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(getDeathScreenImage(), 0, 0, null);
	
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Image getDeathScreenImage() {

		ImageIcon i = new ImageIcon(getClass().getResource(DEATH_IMAGE));
		return i.getImage();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed");
	}

}