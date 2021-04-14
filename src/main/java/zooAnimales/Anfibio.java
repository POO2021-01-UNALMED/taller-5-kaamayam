package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	// ATRIBUTOS
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public  static int salamandras;
	public String colorPiel;
	private boolean venenoso;
	
	// CONSTRUCTOR
	public Anfibio(
			String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorPiel, 
			boolean venenoso) {
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Animal.totalAnimales++;
		
		listado.add(this);
	}
	
	public Anfibio(){listado.add(this);}
	
	// M�TODOS
	public String movimiento(){
		return "saltar";
	}
	
	public String getColorPiel() {
		return colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}
	
	public static Animal crearRana(String nombre, int edad, String genero){
		ranas ++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}

	public static Animal crearSalamandra(String nombre, int edad, String genero){
		salamandras ++;
		return new Anfibio(nombre, edad, "selva", genero, "negro", false);
	}
	
	public static ArrayList<Anfibio> getAnfibios() {return listado;}
}
