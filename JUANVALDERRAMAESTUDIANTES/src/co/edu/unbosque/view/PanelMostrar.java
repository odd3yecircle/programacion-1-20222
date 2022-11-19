package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelMostrar extends JPanel{
	
	private JTextArea listado;

	public PanelMostrar() {
		listado = new JTextArea();
		listado.setEditable(false);
		listado.setSize(750, 250);
		listado.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		add(listado);
	}

	public JTextArea getListado() {
		return listado;
	}	

}
