package main.java.models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class GameOver  implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final  String DEATH_IMAGE = "/main/java/images/DeathScreen.png";
	                                           
	JButton button; 
	int x = 0;
	int y = 0;

	public GameOver(int x, int y) {
	
	}
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(getDeathScreenImage(), x, y, null);
		
		button = new JButton();
		button.setLocation(0, 0);
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLUE);
		button.setText("Play Again?");
		
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