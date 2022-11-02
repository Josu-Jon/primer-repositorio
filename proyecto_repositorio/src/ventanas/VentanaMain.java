package ventanas;

import javax.swing.SwingUtilities;

public class VentanaMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Modelos();
			}
		});
	}
}
