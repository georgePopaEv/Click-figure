package Saptamana1.com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanouPanel1 extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	Dimension sizeDraw = new Dimension(50, 50);

	Timer t;
	int score = 0;
	int secunde = 60	;
	PanouInfo p;

	public PanouPanel1(PanouInfo control) {
		setLayout(null);
		setSize(700, 700);
		setBackground(Color.cyan);
		t = new Timer(1000, this);
		t.start();

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();

				for (Component c : getComponents()) {
					if (c instanceof Cerc1 || c instanceof Patrat1) {

						if ((c.getX() <= x) && (x <= c.getX() + 50) && (c.getY() <= y) && (y <= c.getY() + 50)) {

							remove(c);
							score++;
							control.updateLabel(score);
							control.updateTime(secunde);
							repaint();

						}

					}
				}

			}
		});

	}

	public int randPosX() {
		int randPosX = (int) Math.floor(Math.random() * 600);
		return randPosX;
	}

	public int randPosY() {
		int randPosY = (int) Math.floor(Math.random() * 600);
		return randPosY;
	}

	public int randomizer() {
		int randomizer = (int) Math.floor(Math.random() * 100);
		return randomizer;
	}

	public void actionPerformed(ActionEvent e) {
		int randomizer = randomizer();
		if (secunde > 0) {
			if (randomizer > 50) {

				Patrat1 patrat1 = new Patrat1();
				int xp = randPosX();
				int yp = randPosY();
				patrat1.setLocation(xp, yp);
				patrat1.setSize(sizeDraw);
				this.add(patrat1);
				patrat1.setVisible(true);
			} else {

				Cerc1 cerc1 = new Cerc1();
				int x = randPosX();
				int y = randPosY();
				cerc1.setLocation(x, y);
				cerc1.setSize(sizeDraw);
				this.add(cerc1);
				cerc1.setVisible(true);
			}
			secunde--;
		} else {
			t.stop();

			for (Component c : getComponents()) {
				if (c instanceof Cerc1 || c instanceof Patrat1) {
					remove(c);

					repaint();

				}
			}

			JOptionPane.showMessageDialog(this, "Joc terminat, final score: " + score + "\n" + "Ai ratat " + (60-score) + " forme") ;
			int ok = JOptionPane.OK_OPTION;
			if ( ok == 0) {
				
				System.exit(0);
			}
			

		}
		repaint();
	}

}
