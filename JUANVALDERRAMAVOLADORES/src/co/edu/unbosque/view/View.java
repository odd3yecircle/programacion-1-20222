package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarMensaje (String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
	}

}
