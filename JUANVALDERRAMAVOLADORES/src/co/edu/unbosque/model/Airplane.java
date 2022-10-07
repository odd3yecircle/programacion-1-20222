package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer {
	
	protected int capacity;
	protected int seatsfilled;
	
	public abstract int calculateEmptySeats();
	
}
