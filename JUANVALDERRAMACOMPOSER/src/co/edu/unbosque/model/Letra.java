package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.LetraFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Letra {
	
	private Estrofa e1;
	private Estrofa e2;
	private Estrofa e3;
	private LetraFile ef;
	private Propiedades p;
	
	public Letra() {
		this.e1 = new Estrofa();
		this.e2 = new Estrofa();
		this.e3 = new Estrofa();
		this.ef = new LetraFile();
		this.p = new Propiedades();
	}

	public Estrofa getE1() {
		return e1;
	}

	public Estrofa getE2() {
		return e2;
	}


	public Estrofa getE3() {
		return e3;
	}

	public LetraFile getEf() {
		return ef;
	}

	public Propiedades getP() {
		return p;
	}

	public void generarRegueton() {
		e1.crearEstrofa();
		e2.crearEstrofa();
		e3.crearEstrofa();
	}
	
	public void gestionarProperties() {
		p.escribirPropiedades();
	}
	
	
}
