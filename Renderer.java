package main.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Renderer extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Background Image Here
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Broaden.WIDTH, Broaden.HEIGHT);
	}
}
