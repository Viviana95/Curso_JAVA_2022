package es.edu.cap.piedrapapeltijera.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class PiedraPapelTijeraFactoy {
	public static final int PIEDRA = 1;
	public static final int PAPEL  = 2;
	public static final int TIJERA = 3;
	
	protected String descripcionResultado;
	private static List<PiedraPapelTijeraFactoy>elementos;
	protected String nombre;
	protected int numero;
	/**
	 * @param numero
	 */
	
	//construct
	public PiedraPapelTijeraFactoy(String nombre,int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	
	//access
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	
	//metodos de negocio
	public abstract boolean isMe(int numero);
	public abstract int comparar(PiedraPapelTijeraFactoy pAll);
	
	public static PiedraPapelTijeraFactoy getInstance(int num) {
		//padre conoce a sus hijos
		elementos = new ArrayList<PiedraPapelTijeraFactoy>();
		elementos.add( new Piedra());
		elementos.add( new Papel());
		elementos.add( new Tijera());
		
	    for(PiedraPapelTijeraFactoy piedraPapelTijeraFactoy : elementos)
	    	if(piedraPapelTijeraFactoy.isMe(num))
	    		return piedraPapelTijeraFactoy;
		return null;
	};
	
	
	
}
