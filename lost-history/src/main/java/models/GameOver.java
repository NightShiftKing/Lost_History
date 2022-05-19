package main.java.models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameOver extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean visable = false; 
	public GameOver() {
		JPanel GameOver = new JPanel();
		GameOver.setSize(1000,1000);
		GameOver.setVisible(visable);
		 JButton button1 = new JButton("B1");
		 button1.setSize(100,100);
	       	button1.setBackground(Color.WHITE);
	        button1.setBorderPainted(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.fillRect(0, 0, 10000, 10000);
		
	}

	public boolean isVisable() {
		return visable;
	}

	public void setVisable(boolean visable) {
		this.visable = visable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	



}