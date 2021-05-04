package Saptamana1.com;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanouInfo extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel scoreLabel;
	private JLabel nameLabel;
	private JLabel timeLabel;
	
	public PanouInfo() {

		scoreLabel = new JLabel("  Scorul tau este : 0 ");
		nameLabel  = new JLabel("Player 1");
		timeLabel  = new JLabel("Timp :");
		layoutComponents();
		String username = JOptionPane.showInputDialog("Daca vrei sa joci tasteaza-ti username-ul ");
		int ok = JOptionPane.OK_OPTION;
		if ( ok == 0) {
			nameLabel.setText(username);
		}else if(ok ==1) {
			System.exit(0);
		}
	}
	public void layoutComponents() {
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		
		// Coloana 1
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 20);
		add(nameLabel , gc);
		
		// Coloana 2
		gc.gridx = 1;
		gc.gridy = 0;
		add(scoreLabel , gc);
		
		//Coloana 3
		gc.gridx = 2;
		gc.gridy = 0;
		gc.insets = new Insets(0, 35, 0, 0);
		add(timeLabel , gc);
		
	}
	public void updateLabel(int score) {
       scoreLabel.setText("Scorul tau este : " + score);
    }
	
	public void updateTime(int secunde) {
		timeLabel.setText("Timp : " + secunde);
	}
}
