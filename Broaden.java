package main.game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;


public class Broaden implements ActionListener, KeyListener {

	public static Broaden broaden;
	
	public JFrame jframe;
	
	public static boolean running;
	
	public static Renderer renderer;
	
	public static Random random = new Random();
	
	public static String titleMessage;
	
	public static final int WIDTH = 2000, HEIGHT = 2000, SCALE = 2;
	
	public Dimension dim;
	
	public Broaden() {
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		jframe = new JFrame("Broaden - " + titleMessage);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setExtendedState(jframe.getExtendedState()|JFrame.MAXIMIZED_BOTH);
		jframe.setResizable(true);
		jframe.addKeyListener(this);
		jframe.add(renderer = new Renderer());
		update();
	}

	private void update() {
		
	}

	private static void init() {
		int titleMessageNum = random.nextInt(5);
		running = true;
		
		if (titleMessageNum >= 0) {
			titleMessage = "Turgor";
		}
		if (titleMessageNum >= 1) {
			titleMessage = "The Game";
		}
		if (titleMessageNum >= 2) {
			titleMessage = "#Awesome";
		}
		if (titleMessageNum >= 3) {
			titleMessage = "Cheese Nips";
		}
		if (titleMessageNum >= 4) {
			titleMessage = "Dinorsaur Rarrs";
		}
	}

	public static void main(String[] args) {
		init();
		broaden = new Broaden();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		
		renderer.repaint();
	}

	@Override
	public void keyPressed(KeyEvent k) {
		
	}

	@Override
	public void keyReleased(KeyEvent k) {
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
		
	}
}
