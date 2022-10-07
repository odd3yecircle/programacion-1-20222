package co.edu.unbosque.model;

public class SkyInhabitants {
	
	Bird b;
	SeaPlane sp;
	Helicopter h;
	Superman sm;
	
	public SkyInhabitants() {
		this.b = new Bird();
		this.sp = new SeaPlane();
		this.h = new Helicopter();
		this.sm = new Superman();
	}

	public Bird getB() {
		return b;
	}

	public SeaPlane getSp() {
		return sp;
	}

	public Helicopter getH() {
		return h;
	}

	public Superman getSm() {
		return sm;
	}	

}
