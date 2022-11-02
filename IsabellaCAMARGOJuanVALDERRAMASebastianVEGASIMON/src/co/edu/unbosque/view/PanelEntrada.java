package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelEntrada extends JPanel {
	
	private static final long serialVersionUID= 1L;
	
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton cuatro;
	private Font fuente;
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	
	public PanelEntrada() {
		setLayout(new GridLayout(2, 2, 25 , 25));
		fuente = new Font("Lucida Sans Unicode", Font.PLAIN, 35);
		uno = new JButton("1");
		uno.setActionCommand(UNO);
		uno.setBackground(new Color(250, 225, 135));
		uno.setFont(fuente);
		dos = new JButton("2");
		dos.setActionCommand(DOS);
		dos.setBackground(new Color(93, 173, 226));
		dos.setFont(fuente);
		tres = new JButton ("3");
		tres.setActionCommand(TRES);
		tres.setBackground(new Color(160, 217, 149));
		tres.setFont(fuente);
		cuatro = new JButton ("4");
		cuatro.setActionCommand(CUATRO);
		cuatro.setBackground(new Color(255, 18, 184));
		cuatro.setFont(fuente);
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
