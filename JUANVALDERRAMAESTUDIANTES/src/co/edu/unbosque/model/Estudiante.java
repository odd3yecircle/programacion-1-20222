package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EstudianteFile;

public class Estudiante {
	
	private EstudianteDAO edao;
	private EstudianteFile efile;
	
	public Estudiante() {
		
		this.edao = new EstudianteDAO();
		this.efile = new EstudianteFile();
		
	}

	public EstudianteDAO getEdao() {
		return edao;
	}
	
	public EstudianteFile getEfile() {
		return efile;
	}
	
	
	

}
