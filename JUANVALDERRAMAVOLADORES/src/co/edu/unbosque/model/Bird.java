package co.edu.unbosque.model;

public class Bird extends Animal {
	
	private String favouritefood;
	
	public Bird() {
		this.favouritefood = "Lombrices";
		this.fictional = false;
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Nido";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "la tierra";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "formacion";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Comiendo";
	}
	
	public String buildNest() {
		return "Costruyendo un hogar";
	}
	
	public String layEggs() {
		return "Poniendo huevos";
	}
	
	public String getFavouriteFood() {
		return favouritefood;
	}
	
	public boolean isFictional() {
		return this.fictional;
	}


	
	
	
	

}
