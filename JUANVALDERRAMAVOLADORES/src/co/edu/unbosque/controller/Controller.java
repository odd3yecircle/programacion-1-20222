package co.edu.unbosque.controller;

import co.edu.unbosque.model.SkyInhabitants;
import co.edu.unbosque.view.View;

public class Controller {
	
	SkyInhabitants si;
	View v;
	
	public Controller() {
		this.si = new SkyInhabitants ();
		this.v = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		v.mostrarMensaje("Soy un pájaro \n" +
						 "Despego desde: " + si.getB().takeoff() + "\n" +
						 "Vuelo en: " + si.getB().fly() + "\n" +
						 "Aterrizo en: " + si.getB().land() + "\n" + "\n" +
						 "Estoy: " + si.getB().buildNest() + ", " + si.getB().layEggs() + " y " + si.getB().eat() + " " + si.getB().getFavouriteFood()
						 , "Pajaro");
		if (si.getB().isFictional() == false) {
			v.mostrarMensaje("Pdt: Soy un animal verdadero", "Pájaro");
		}
		
		v.mostrarMensaje("Soy un hidroavion \n" +
				         "Despego desde: " + si.getSp().takeoff() + "\n" +
				         "Vuelo en: " + si.getSp().fly() + "\n" +
				         "Aterrizo en: " + si.getSp().land() + " " + si.getSp().goingTo() + "\n" + "\n" +
				         "Tengo capacidad para " + si.getSp().calculateEmptySeats() + " personas más" + "\n" +
				         "Utilizo " + si.getSp().getFloaters() + " como flotadores", "Hidroavion");
		
		v.mostrarMensaje("Soy un helicoptero \n" +
				 		 "Despego desde: " + si.getH().takeoff() + "\n" +
			 		 	 "Vuelo en: " + si.getH().fly() + "\n" +
			 		 	 "Aterrizo en: " + si.getH().land() + " " + si.getH().goingTo() + "\n" + "\n" +
			 		 	 "Tengo capacidad para " + si.getH().calculateEmptySeats() + " personas más" + "\n" +
			 		 	 "Tengo " + si.getH().getBlades() + " aspas", "Helicoptero");
		
		v.mostrarMensaje("Soy Superman \n" +
						 "Despego desde: " + si.getSm().takeoff() + "\n" +
						 "Vuelo en: " + si.getSm().fly() + "\n" +
						 "Aterrizo en: " + si.getSm().land() + " y salto " + si.getSm().leapBuilding() + "\n" + "\n" +
						 
						 "Vengo de: " + si.getSm().getPlanetorigin() + "\n" +
						 "*le disparan* *lo evade* " + si.getSm().stopBullet() + "\n" +
						 "Tengo " + si.getSm().getRadioactivity() + " niveles de radioactividad, y consumo " + si.getSm().eat(), "Superman");
		
		if (si.getSm().isFictional() == true) {
			v.mostrarMensaje("Pdt: Soy un animal ficticio", "Superman");
		}

		
	}
	
	
	

}
