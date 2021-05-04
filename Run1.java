package Saptamana1.com;

import javax.swing.SwingUtilities;

public class Run1 {
	public static void main( String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new MainFrame1();
				
			}
		});
	}

}
