package co.edu.unbosque.view;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

import java.awt.*;
import java.util.Random;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private PanelEntrada pE;
	private PanelNumeros pN;
	private JButton terminar;
	
	
	
	public View (Controller cont) {
		
		Random r = new Random();
		setSize(500, 400);
		setResizable(false);
		setTitle("Simon");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		pE = new PanelEntrada();
		pN = new PanelNumeros();
		terminar = new JButton ("Terminar");
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
	
	public void mostrarResultado(boolean roto) {
		if (roto == true) {
			JOptionPane.showMessageDialog(this, "Fallaste");
		} else {
			JOptionPane.showMessageDialog(this, "Felecitaciones");
		}
	}
	

	
	
	
}
