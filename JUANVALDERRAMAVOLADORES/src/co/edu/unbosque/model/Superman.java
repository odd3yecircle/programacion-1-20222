package co.edu.unbosque.model;

public class Superman extends Kryptonian {
	
	public int radioactivity;

	public Superman() {
		this.radioactivity = 129;
		this.planetorigin = "Krypton";
		this.fictional = true;
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Volando";
	}

	@Override
	public String leapBuilding() {
		// TODO Auto-generated method stub
		return "por los rascacielos";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "kryptonita";
	}
	
	public String stopBullet() {
		return "uy quieto socio";
	}
	
	public int getRadioactivity () {
		return this.radioactivity;
	}
	
	public String getPlanetorigin() {
		return this.planetorigin;
	}
	
	@Override
	public boolean isFictional() {
		return this.fictional;
	}

	
	
	
	

}
