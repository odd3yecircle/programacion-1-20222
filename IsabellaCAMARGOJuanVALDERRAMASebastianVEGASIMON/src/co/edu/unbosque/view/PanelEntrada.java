package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelEntrada extends JPanel {
	
	private static final long serialVersionUID= 1L;
	
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	
	public PanelEntrada() {
		setLayout(new GridLayout(2, 2));
		uno = new JButton("1");
		uno.setActionCommand(UNO);
		dos = new JButton("2");
		dos.setActionCommand(DOS);
		tres = new JButton ("3");
		tres.setActionCommand(TRES);
		cuatro = new JButton ("4");
		cuatro.setActionCommand(CUATRO);
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
	}

	public JButton getUno() {
		return uno;
	}

	public void setUno(JButton uno) {
		this.uno = uno;
	}

	public JButton getDos() {
		return dos;
	}

	public void setDos(JButton dos) {
		this.dos = dos;
	}

	public JButton getTres() {
		return tres;
	}

	public void setTres(JButton tres) {
		this.tres = tres;
	}

	public JButton getCuatro() {
		return cuatro;
	}

	public void setCuatro(JButton cuatro) {
		this.cuatro = cuatro;
	}
	
	
	
	
	
}
