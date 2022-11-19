package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {
	
	private PanelIngreso pI;
	private PanelMostrar pM;
	
	public View (Controller cont) {
		setSize(500,500);
		setResizable(false);
		setTitle("SALA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1));
		pI = new PanelIngreso();
		pM = new PanelMostrar();
		add(pI);
		add(pM);
		pI.getIngresar().addActionListener(cont);
		pI.getListar().addActionListener(cont);
	}

	public PanelIngreso getpI() {
		return pI;
	}

	public PanelMostrar getpM() {
		return pM;
	}

	
	

}
