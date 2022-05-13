package main.java.models;

import java.awt.Rectangle;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class GameObjects extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x;
	public int y;
	public int height;
	public int width;

	



	public GameObjects(int x, int y) {
		this.x = x;
		this.y = y;

	}

}
