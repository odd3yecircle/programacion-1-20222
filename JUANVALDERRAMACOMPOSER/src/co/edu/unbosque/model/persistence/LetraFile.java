package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class LetraFile {
	
	public int escribirArchivo(String ruta, String letra) {
		File f = new File(ruta);
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter (fw);
			
			pw.println(letra);
			
			fw.close();
			
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

}
