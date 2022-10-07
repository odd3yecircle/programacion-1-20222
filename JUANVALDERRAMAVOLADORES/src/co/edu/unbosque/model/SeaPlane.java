package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	
	public SeaPlane() {
		this.wheels = "No tiene";
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
	
	

}
