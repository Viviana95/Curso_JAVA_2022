/**
 * 
 */
package figuras;

/**
 * @author vtrujill
 *Es la clase padre 
 */

public abstract class Figura  implements Comparable<Figura>{
	private String nombre;
	private static int cantFiguras;

	// constructores

	public Figura() {
		super();
		cantFiguras ++;
	}

	
	public Figura(String nombre) {
		this();
		this.nombre = nombre;
	}

	// accesos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public static int getCantFiguras() {
		return cantFiguras;
	}

	public static void clear() {
		cantFiguras = 0;
	}

	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();

	@Override
	public int hashCode() {
		return nombre == null ? 0 : nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if (obj instanceof Figura) {
			Figura fig = (Figura) obj;
			bln = fig.getNombre() != null && fig.getNombre().equals(nombre);
		}
		return bln;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre= ");
		sb.append(nombre);
		return sb.toString();
	}
	@Override
	public int compareTo(Figura o) {
		return nombre.compareTo(o.getNombre());
		//return (-1)*nombre.compareTo(o.getNombre()); inversa
	}

	
	

}
