package personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona implements Comparable<Persona>{
	private int id;
	private int edad;
	private String nombre;
	/**
	 * 
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param edad
	 * @param nombre
	 */
	public Persona(int id, int edad, String nombre) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && id == other.id && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int compareTo(Persona o) {
		return ((Integer)edad).compareTo(o.getEdad());
	}
	
	
	
	
}
