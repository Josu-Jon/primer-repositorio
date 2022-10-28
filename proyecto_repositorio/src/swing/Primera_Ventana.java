package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Primera_Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Thread t = new Thread();
	
	public Primera_Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setTitle("Mi Primera Ventana!");
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		JButton botonContar = new JButton("Contar");
		this.add(botonContar);
		
		JButton botonParar = new JButton("Parar");
		this.add(botonParar);
		
		setVisible(true);
		
				
		botonContar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = Integer.MIN_VALUE;  !Thread.interrupted() && i < Integer.MAX_VALUE; i++ ) {
							System.out.println(i);
						}
						System.out.println("Hilo terminado");
					}
				});
				
				t.start();
				
			}
		});
		
		botonParar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.interrupt();
			}
		});
	}
}
