package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	
	private String floaters;
	
	public SeaPlane() {
		this.wheels = "No tiene";
		this.floaters = "canoas";
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Aeropuerto ElDorado";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aeropuerto";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Volando";
	}

	@Override
	public int calculateEmptySeats() {
		// TODO Auto-generated method stub
		this.capacity = 24;
		this.seatsfilled = 12;
		return this.capacity - this.seatsfilled;
	}

	@Override
	public String goingTo() {
		// TODO Auto-generated method stub
		return "Cartagena";
	}

	@Override
	public String getWheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}
	
	public String getFloaters() {
		return this.floaters;
	}
	
	

}
