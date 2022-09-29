package co.edu.unbosque.model;

import java.util.Random;

public class Estrofa {
	
	private String est;

	public Estrofa() {
		this.est = "";
		
	}
	
	public String getEst() {
		return est;
	}

	public void crearEstrofa() {
		
		String [][] cuadro = new String [4][6];
		
		cuadro[0][0] = "Mami";
		cuadro[0][1] = "yo quiero";
		cuadro[0][2] = "encendelte";
		cuadro[0][3] = "suave";
		cuadro[0][4] = "hasta que salga el sol";
		cuadro[0][5] = "sin anestesia";
		
		cuadro[1][0] = "Bebe";
		cuadro[1][1] = "yo puedo";
		cuadro[1][2] = "amalte";
		cuadro[1][3] = "lento";
		cuadro[1][4] = "toda la noche";
		cuadro[1][5] = "sin complomiso";
		
		cuadro[2][0] = "Plincess";
		cuadro[2][1] = "yo vengo";
		cuadro[2][2] = "a ligal";
		cuadro[2][3] = "rapido";
		cuadro[2][4] = "hasta el amanecel";
		cuadro[2][5] = "feis to feis";
		
		cuadro[3][0] = "Mamasota";
		cuadro[3][1] = "voy a";
		cuadro[3][2] = "jugal";
		cuadro[3][3] = "fuelte";
		cuadro[3][4] = "todo el dia";
		cuadro[3][5] = "sin miedo";
		
		Random random = new Random ();
		
		String frase1 = cuadro[random.nextInt(4)][0] + " " + cuadro[random.nextInt(4)][1] + " " + cuadro[random.nextInt(4)][2] + " " + cuadro[random.nextInt(4)][3] + " " + cuadro[random.nextInt(4)][4] + " " + cuadro[random.nextInt(4)][5];
		String frase2 = cuadro[random.nextInt(4)][0] + " " + cuadro[random.nextInt(4)][1] + " " + cuadro[random.nextInt(4)][2] + " " + cuadro[random.nextInt(4)][3] + " " + cuadro[random.nextInt(4)][4] + " " + cuadro[random.nextInt(4)][5];
		String frase3 = cuadro[random.nextInt(4)][0] + " " + cuadro[random.nextInt(4)][1] + " " + cuadro[random.nextInt(4)][2] + " " + cuadro[random.nextInt(4)][3] + " " + cuadro[random.nextInt(4)][4] + " " + cuadro[random.nextInt(4)][5];
		String frase4 = cuadro[random.nextInt(4)][0] + " " + cuadro[random.nextInt(4)][1] + " " + cuadro[random.nextInt(4)][2] + " " + cuadro[random.nextInt(4)][3] + " " + cuadro[random.nextInt(4)][4] + " " + cuadro[random.nextInt(4)][5];
		
		est = frase1 + "\n" + frase2 + "\n" + frase3 + "\n" + frase4 + "\n";
	
	}
	
	
	
	
	

}
