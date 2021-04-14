package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal  {
	
	// ATRIBUTOS
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	// CONSTRUCTOR
	public Pez(
			String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorEscamas, 
			int cantidadAletas) {
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Animal.totalAnimales++;
		listado.add(this);
	}
	
	public Pez(){listado.add(this);}
	
	// MÉTODOS
	public String movimiento(){
		return "nadar";
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero){
		salmones++;
		return new Reptil(nombre, edad, "oceano", genero, "rojo", 6);		
	}

	public static Animal crearBacalao(String nombre, int edad, String genero){
		bacalaos++;
		return new Reptil(nombre, edad, "gris", genero, "rojo", 6);
	}
	
	// GETTERS Y SETTERS
	public static ArrayList<Pez> getPeces() {return listado;}
	
	public String getColorEscamas() {return colorEscamas;}
	
	public int getCantidadAletas() {return cantidadAletas;}
}
