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
	private Font fuente;
	
	public PanelNumeros() {
		setLayout(new GridLayout(1,5));
		fuente = new Font("Lucida Sans Unicode", Font.PLAIN, 35);
		num = new JLabel ("Numeros");
		numgen1 = new JLabel ("");
		numgen2 = new JLabel ("");
		numgen3 = new JLabel ("");
		numgen4 = new JLabel ("");
		num.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		numgen1.setFont(fuente);
		numgen2.setFont(fuente);
		numgen3.setFont(fuente);
		numgen4.setFont(fuente);
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
