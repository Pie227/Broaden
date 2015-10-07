package main.game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;

public class Broaden {
	public static Broaden broaden;
	
	public JFrame jframe;
	
	public static Renderer renderer;
	
	public static Random random = new Random();
	
	public String titleMessage;
	
	public static final int WIDTH = 1000, HEIGHT = 850, SCALE = 2;
	
	public Dimension dim;
	
	public Broaden() {
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		jframe = new JFrame("Broaden -- ");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setExtendedState(jframe.getExtendedState()|JFrame.MAXIMIZED_BOTH);
		jframe.setResizable(true);
		jframe.add(renderer = new Renderer());
		init();
	}
	
	private void init() {
		
	}

	public static void main(String[] args) {
		broaden = new Broaden();
	}
}
