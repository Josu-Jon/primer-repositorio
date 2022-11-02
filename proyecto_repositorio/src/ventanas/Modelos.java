package ventanas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Modelos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public Modelos () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
		
		List<Person> persona = new ArrayList<>();
		persona.add(new Person("Josu", "Lopez", LocalDate.of(1901, 9, 29)));
		persona.add(new Person("Jon", "Arribas", LocalDate.of(1901, 9, 29)));
		persona.add(new Person("Pedro", "De la fuente", LocalDate.of(1901, 9, 29)));
		/*
		 * Si tengo una clase y quiero mostarla en un Jlist, JTable o JComboBox 
		 * le paso un arrayList con los objetos a el modelo y luego le pido que me muestre el modelo.
		 * Para ello hacemos un override del toString para que muestre lo que queremos. 
		 */
		
		DefaultListModel<Person> modeloLista = new DefaultListModel<>();
		modeloLista.addAll(persona);
		
		JList<Person> lista = new JList<>(modeloLista);
		
		JPanel panel = new JPanel();
		panel.add(lista);
		
		this.add(panel);
		
		pack();
		}
}
