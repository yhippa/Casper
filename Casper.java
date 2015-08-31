package io.github.yhippa;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.Random;

public class Casper {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		try {
			Robot casper = new Robot();
			Random random = new Random();
			while (true) {
				int x = random.nextInt(width);
				int y = random.nextInt(height);
				casper.mouseMove(x, y);
				System.out.println("Moving mouse to (" + x + ", " + y + ")");
				Thread.sleep(5000);
			}
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
