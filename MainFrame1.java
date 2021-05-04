package Saptamana1.com;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame1 extends JFrame {
	private static final long serialVersionUID = 1L;

	private PanouPanel1 panouPanel1;
	JLabel labelScore;
	JLabel pozitie;
	private PanouInfo panouInfo;

	public MainFrame1() {
		super("Jocul cu patratele si cercuri");
		setSize(700, 700);
		setLayout(new BorderLayout());
		setResizable(false);
//		setBackground(Color.cyan);

//		labelScore = new JLabel("Score : ");
//		labelScore.setFont(new Font("TimesRoman", Font.ITALIC, 20));
//		add(labelScore, BorderLayout.SOUTH);
		
//		pozitie = new JLabel("Pozitie (  :   ) ");
//		add(pozitie, BorderLayout.NORTH);
		
		panouInfo = new PanouInfo();
		add(panouInfo, BorderLayout.NORTH);
		
		panouPanel1 = new PanouPanel1(panouInfo);
		add(panouPanel1, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
//	   public void updateLabel(int score) {
//	        labelScore.setText("Scorul tau este : " + score);
//	    }
//	public void updateScore(int score) {
//		labelScore
//	}

}
