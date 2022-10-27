package co.edu.unbosque.model;

import java.util.Random;

public class Simon {
	
	private int [] simondice;
	
	public Simon() {
		simondice = new int [4];
	}

	public int[] getSimondice() {
		return simondice;
	}

	public void generarCodigo () {
		
		Random r = new Random();
		
		simondice [0] = r.nextInt(5);
		simondice [1] = r.nextInt(5);
		simondice [2] = r.nextInt(5);
		simondice [3] = r.nextInt(5);
		
		for (int i = 0; i < simondice.length; i++) {
			if (simondice[i] == 0) {
				simondice [i] = r.nextInt(5);
			}
		}
	
	}
	
	public boolean compararNumeros (int [] jugador) {
		
		int i = 0;
		boolean romper = false;
		while (i < 4 && romper == false) {
			if (simondice [i] == jugador [i]) {
				romper = false;
				i++;
			} else {
				romper = true;
			}
		}
		
		return romper;
	}
	
	
	
	

}
