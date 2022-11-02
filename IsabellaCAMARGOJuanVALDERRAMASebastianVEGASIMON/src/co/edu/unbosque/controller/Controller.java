package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;
	private Timer t;
	private Juego j;
	
	public Controller () {
		gui = new View (this);
		j = new Juego();
		gui.setVisible(true);
		gui.getpE().setVisible(false);
		t = new Timer();
		t.schedule(new Temporizador(), 2500);
		cambiarNumeros();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(gui.getpE().UNO)) {
			j.getS().guardarResultado("1");
		} else if (e.getActionCommand().equals(gui.getpE().DOS)) {
			j.getS().guardarResultado("2");
		} else if (e.getActionCommand().equals(gui.getpE().TRES)) {
			j.getS().guardarResultado("3");
		} else if (e.getActionCommand().equals(gui.getpE().CUATRO)) {
			j.getS().guardarResultado("4");
		}
		
		if (e.getActionCommand().equals(gui.getTerminar())) {
			if (j.getS().compararNumeros() == false) {
				gui.mostrarIncorrecto();
				cambiarNumeros();
			} else {
				gui.mostrarCorrecto();
				cambiarNumeros();
			}
		}
	
	
	}
	
	class Temporizador extends TimerTask {
		public void run() {
			gui.getpN().setVisible(false);
			gui.getpE().setVisible(true);
			
		}
		
	}
	
	public void cambiarNumeros() {
		j.getS().setSimondice("");
		j.getS().setJugadordice("");
		j.getS().generarCodigo();
		gui.getpN().mostrarNumeros(j.getS().getSimondice());
		t.schedule(new Temporizador(), 2500);
		gui.getpN().setVisible(true);
		gui.getpE().setVisible(false);
	}
}


