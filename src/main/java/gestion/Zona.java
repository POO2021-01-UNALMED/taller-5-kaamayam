package gestion;

import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(){}
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	
	public ArrayList<Animal> getAnimales() {return animales;}
	
	public int cantidadAnimales(){return animales.size();}
	
	public void agregarAnimales(Animal anim) {animales.add(anim);}
	
	public String getNombre() {return this.nombre;}
	public Zoologico getZoo() {return this.zoo.get(0);}
}
