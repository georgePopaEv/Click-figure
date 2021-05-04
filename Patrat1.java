package Saptamana1.com;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Patrat1 extends JComponent {
	
	private static final long serialVersionUID = 1L;
	protected int heightDraw = 50;
	protected int widthDraw = 50;
	
	public void paintComponent(Graphics g ) {
		super.paintComponents(g);
		
		g.setColor(Color.blue);
		g.fillRect(0, 0, 50, 50);
	}

}
