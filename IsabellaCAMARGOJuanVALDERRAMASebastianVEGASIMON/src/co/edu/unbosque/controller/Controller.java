package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;
	private Juego j;
	
	public Controller () {
		gui = new View (this);
		j = new Juego();
		gui.setVisible(true);
		j.getS().generarCodigo();
		gui.getpN().mostrarNumeros(j.getS().getSimondice());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
