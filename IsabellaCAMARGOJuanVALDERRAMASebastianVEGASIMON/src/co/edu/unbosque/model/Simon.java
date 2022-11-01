package co.edu.unbosque.model;

import java.util.Random;
import java.util.Timer;

public class Simon {
	
	private String simondice;
	private String jugadordice;

	
	public Simon() {
		simondice = "";
		jugadordice = "";

	}

	public String getSimondice() {
		return simondice;
	}

	public void setSimondice(String simondice) {
		this.simondice = simondice;
	}

	public String getJugadordice() {
		return jugadordice;
	}
	
	public void generarCodigo () {
	
		Random r = new Random();
		
		while (simondice.length() < 4) {
			simondice += "" + (r.nextInt(4) + 1) ;
		}
		
	}
	
	public void guardarResultado(String ingreso) {
		jugadordice += ingreso;
	}
	
	public boolean compararNumeros () {
		if (simondice.equals(jugadordice) == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	

}
