package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	
	// ATRIBUTOS
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	// CONSTRUCTOR
	public Ave(
			String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorPlumas) {
		super.nombre =nombre;
		super.edad =edad;
		super.habitat =habitat;
		super.genero =genero;
		this.colorPlumas = colorPlumas;
		Animal.totalAnimales++;
		listado.add(this);
	}
	
	public Ave(){listado.add(this);}
	
	// MÉTODOS
	public String movimiento(){
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero){
		halcones ++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");		
	}

	public static Animal crearAguila(String nombre, int edad, String genero){
		aguilas ++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");		
	}
	
	// GETTERS Y SETTERS
	public String getColorPlumas() {return colorPlumas;}
	
	public static ArrayList<Ave> getAves() {return listado;}
}