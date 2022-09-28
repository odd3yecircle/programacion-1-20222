package co.edu.unbosque.controller;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;


public class Controller {
	
	private Letra l;
	private View v;
	
	public Controller() {
		l = new Letra ();
		v = new View ();
		funcionar();
	}
	
	public void funcionar() {
		l.generarRegueton();
		v.mostrarMensaje(l.getE1().getEst() + "\n" + "\n" + l.getE2().getEst() + "\n" + "\n" + l.getE3().getEst());
		l.getEf().escribirArchivo(v.mostrarDirectorio(), l.getE1().getEst() + "\n" + "\n" + l.getE2().getEst() + "\n" + "\n" + l.getE3().getEst());
		l.getP().escribirPropiedades();
	}
	
	

}
