package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View v;
	private Estudiante est;
	
	public Controller () {
		v = new View(this);
		est = new Estudiante();
		v.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(v.getpI().INGRESAR)) {
			est.getEdao().agregarEstudiante(v.getpI().getIngNom().getText(), v.getpI().getIngCar().getText(), Integer.parseInt(v.getpI().getIngId().getText()));
			est.getEfile().escribirArchivoBin(est.getEdao().getEsts());
		}
		if (e.getActionCommand().equals(v.getpI().LISTAR)) {
			v.getpM().getListado().setText(est.getEfile().leerDatos().toString()+"\n");
		}
		// TODO Auto-generated method stub
		
	}

}
