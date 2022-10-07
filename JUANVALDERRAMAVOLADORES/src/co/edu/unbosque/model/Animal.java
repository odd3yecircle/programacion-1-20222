package co.edu.unbosque.model;

public abstract class Animal implements Flyer {
	
	protected boolean fictional;
	
	public abstract String eat();
	public abstract boolean isFictional();

}
