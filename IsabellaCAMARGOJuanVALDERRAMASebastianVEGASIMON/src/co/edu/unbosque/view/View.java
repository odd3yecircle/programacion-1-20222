package co.edu.unbosque.view;

import javax.swing.*;

import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.*;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private PanelEntrada pE;
	private PanelNumeros pN;
	private JButton terminar;
	private static final String TERMINAR = "terminar";
	
	
	
	public View (Controller cont) {
		
		setSize(500, 300);
		setResizable(false);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		pE = new PanelEntrada();
		pN = new PanelNumeros();
		pE.setBorder(new EmptyBorder(10, 10, 10, 10));
		pN.setBorder(new EmptyBorder(10, 10, 10, 10));
		pN.setBackground(Color.LIGHT_GRAY);
		pE.setBackground(new Color(84, 84, 84));
		terminar = new JButton ("Terminar");
		terminar.setActionCommand(TERMINAR);
		terminar.setBackground(Color.LIGHT_GRAY);
		terminar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		add(pN, BorderLayout.NORTH);
		add(pE, BorderLayout.CENTER);
		add(terminar, BorderLayout.SOUTH);
		pE.getUno().addActionListener(cont);
		pE.getDos().addActionListener(cont);
		pE.getTres().addActionListener(cont);
		pE.getCuatro().addActionListener(cont);
		terminar.addActionListener(cont);
	
	}


	public PanelEntrada getpE() {
		return pE;
	}


	public void setpE(PanelEntrada pE) {
		this.pE = pE;
	}


	public PanelNumeros getpN() {
		return pN;
	}


	public void setpN(PanelNumeros pN) {
		this.pN = pN;
	}

	public static String getTerminar() {
		return TERMINAR;
	}


	public void mostrarCorrecto () {
		JLabel correcto = new JLabel("¡Secuencia exitosa!");
		correcto.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 18));
		correcto.setForeground(new Color(255, 109, 184));
		JOptionPane.showMessageDialog(this, correcto, "¡Bien!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarIncorrecto() {
		JLabel incorrecto = new JLabel("¡Fallaste!");
		incorrecto.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 18));
		JOptionPane.showMessageDialog(this, incorrecto, "¡Para la próxima!", JOptionPane.ERROR_MESSAGE);
	}
	
	
}

