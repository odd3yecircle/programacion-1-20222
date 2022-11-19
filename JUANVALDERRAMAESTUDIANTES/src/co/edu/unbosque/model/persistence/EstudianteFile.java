package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDAO;
import co.edu.unbosque.model.EstudianteDTO;

public class EstudianteFile {
	
	private String rutabin;
	private EstudianteDAO estdao;
	
	public EstudianteFile() {
		estdao = new EstudianteDAO();
		rutabin = "registro.out";
	}
	
	public String escribirArchivoBin (ArrayList<EstudianteDTO> listest) {
		String mensaje = "Registro exitoso";
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutabin));
			out.writeObject(listest);
			out.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error";
		}
		return mensaje;
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<EstudianteDTO> leerDatos() {
		ArrayList<EstudianteDTO> estdto = new ArrayList<>();
		ObjectInputStream in;
		String mostrar = "";
		
		try {
			in = new ObjectInputStream(new FileInputStream(rutabin));
			estdto = (ArrayList<EstudianteDTO>) in.readObject();
			for (int i = 0; i < estdto.size(); i++) {
				mostrar += estdto.get(i).toString();
			}
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return estdto;
	}

	public String getRutabin() {
		return rutabin;
	}

	public EstudianteDAO getEstdao() {
		return estdao;
	}

	public void setRutabin(String rutabin) {
		this.rutabin = rutabin;
	}

	public void setEstdao(EstudianteDAO estdao) {
		this.estdao = estdao;
	}
	
	

	
}
