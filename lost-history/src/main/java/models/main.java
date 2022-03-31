package models;

import javax.swing.JFrame;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class main {

	static final Logger logger = Logger.getLogger(main.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		logger.info("code is working");

		new Frame();

	}

}
