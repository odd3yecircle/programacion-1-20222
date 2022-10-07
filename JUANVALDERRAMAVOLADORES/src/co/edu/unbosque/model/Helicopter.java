package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Los Cobos";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Helipuerto";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Bogota";
	}

	@Override
	public int calculateEmptySeats() {
		this.capacity = 8;
		this.seatsfilled = 4;
		// TODO Auto-generated method stub
		return this.capacity - this.seatsfilled;
	}

	@Override
	public String goingTo() {
		// TODO Auto-generated method stub
		return "Torre Colpatria";
	}

}
