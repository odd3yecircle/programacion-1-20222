package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelIngreso extends JPanel {
	
	private JLabel id;
	private JTextField ingId;
	private JLabel nombre;
	private JTextField ingNom;
	private JLabel carrera;
	private JTextField ingCar;
	private JButton ingresar;
	private JButton listar;
	private Font fuente;
	private Font fuente2;
	private Color color;
	private Color color2;
	public static final String INGRESAR = "Ingresar";
	public static final String LISTAR = "Listar";
	private static final int ANCHO = 5;
	private static final int ALTO = 20;
	
	public PanelIngreso () {
		color = new Color(211, 122, 0);
		color2 = new Color(67, 142, 0);
		setLayout(new GridLayout(4, 2));
		setBackground(new Color(138, 255, 60));
		fuente = new Font("Lucida Sans Unicode", Font.PLAIN, 25);
		fuente2 = new Font("Lucida Sans Unicode", Font.PLAIN, 15);
		id = new JLabel("ID");
		id.setFont(fuente);
		id.setForeground(color);
		ingId = new JTextField();
		ingId.setSize(ANCHO, ALTO);
		ingId.setFont(fuente2);
		nombre = new JLabel("Nombre");
		nombre.setFont(fuente);
		nombre.setForeground(color);
		ingNom = new JTextField();
		ingNom.setSize(ANCHO, ALTO);
		ingNom.setFont(fuente2);
		carrera = new JLabel("Carrera");
		carrera.setFont(fuente);
		carrera.setForeground(color);
		ingCar = new JTextField();
		ingCar.setSize(ANCHO, ALTO);
		ingCar.setFont(fuente2);
		ingresar = new JButton("Ingresar");
		ingresar.setFont(fuente);
		ingresar.setBackground(color2);
		ingresar.setForeground(Color.WHITE);
		ingresar.setActionCommand(INGRESAR);
		listar = new JButton ("Listar");
		listar.setFont(fuente);
		listar.setBackground(color2);
		listar.setForeground(Color.WHITE);
		listar.setActionCommand(LISTAR);
		
		add(id);
		add(ingId);
		add(nombre);
		add(ingNom);
		add(carrera);
		add(ingCar);
		add(ingresar);
		add(listar);
	}

	public JTextField getIngId() {
		return ingId;
	}

	public JTextField getIngNom() {
		return ingNom;
	}

	public JTextField getIngCar() {
		return ingCar;
	}

	public JButton getIngresar() {
		return ingresar;
	}

	public JButton getListar() {
		return listar;
	}
	
	

}
