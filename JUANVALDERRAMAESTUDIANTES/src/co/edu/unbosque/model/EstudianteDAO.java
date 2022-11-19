package co.edu.unbosque.model;

import java.util.ArrayList;

public class EstudianteDAO {

	ArrayList <EstudianteDTO> ests;

	public EstudianteDAO() {
		ests = new ArrayList<EstudianteDTO>();
	}

	public ArrayList<EstudianteDTO> getEsts() {
		return ests;
	}

	public void agregarEstudiante (String nom, String carr, int id) {
		ests.add(new EstudianteDTO(id, nom, carr));
	}
	
	
	
}
