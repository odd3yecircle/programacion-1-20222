package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	
	public void mostrarMensaje (String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public String mostrarDirectorio() {
		JFileChooser chooser = new JFileChooser();
		chooser.showSaveDialog(null);
		File f = chooser.getSelectedFile();
		return f.getPath();
	}

}
