package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal  {
	
	// ATRIBUTOS
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	// CONSTRUCTOR
	public Mamifero(
			String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			boolean pelaje, 
			int patas) {
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.pelaje = pelaje;
		this.patas = patas;
		Animal.totalAnimales++;
		listado.add(this);
	}
	
	public Mamifero(){listado.add(this);}
	
	// MÉTODOS
	public static Animal crearCaballo(String nombre, int edad, String genero){
		 caballos++;
		 return new  Mamifero(nombre, edad, "pradera", genero, true, 4); 
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero){
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4); 
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	
	// GETTERS Y SETTERS
	public static ArrayList<Mamifero> getMamiferos() {return listado;}

	public int getPatas() {return patas;}
}