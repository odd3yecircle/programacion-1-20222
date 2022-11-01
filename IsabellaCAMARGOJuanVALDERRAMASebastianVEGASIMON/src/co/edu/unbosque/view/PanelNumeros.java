package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;


public class PanelNumeros extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel num;
	private JLabel numgen1;
	private JLabel numgen2;
	private JLabel numgen3;
	private JLabel numgen4;
	
	public PanelNumeros() {
		setLayout(new GridLayout(1,5));
		num = new JLabel ("Numeros");
		numgen1 = new JLabel ("");
		numgen2 = new JLabel ("");
		numgen3 = new JLabel ("");
		numgen4 = new JLabel ("");
		add(num);
		add(numgen1);
		add(numgen2);
		add(numgen3);
		add(numgen4);
	}

	
	public void mostrarNumeros (String numeros) {
		numgen1.setText("" + numeros.charAt(0));
		numgen2.setText("" + numeros.charAt(1));
		numgen3.setText("" + numeros.charAt(2));
		numgen4.setText("" + numeros.charAt(3));
		
	}

}
