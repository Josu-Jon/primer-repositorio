package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class EjemploTabla extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public EjemploTabla() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("Nombre");
		modeloTabla.addColumn("Apellido");
		modeloTabla.addColumn("Nacimiento");
		
		String[] fila = {"Josu", "Lopez", "8-2-2003"};
		
		JTable tabla= new JTable(modeloTabla);
		
		JScrollPane jpanel =new JScrollPane(tabla);
		
		
		
		jpanel.add(tabla);
		
		add(jpanel);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new EjemploTabla();
			}
		});
	}
}
