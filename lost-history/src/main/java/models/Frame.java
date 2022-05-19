package main.java.models;

import java.awt.*;

import javax.swing.*;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;

	public Frame() {
		// this controls the panel

		MyPanel panel;
		
		GameOver GameOver;
		
		GameOver = new GameOver();

		panel = new MyPanel();
		
			panel.setVisable(panel.visable);
			GameOver.setVisable(GameOver.visable);
			
		

		// this controls the frame
		JFrame frame = new JFrame();
		frame.setSize(2000, 2000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(GameOver); 
		frame.add(panel);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		

	}

}
