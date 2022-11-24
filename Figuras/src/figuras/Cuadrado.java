package figuras;

import figuras.exceptions.FiguraException;

public class Cuadrado extends Figura {
	
	private float lado;
	
	public Cuadrado() {}

	/**
	 * @param lado
	 */
	public Cuadrado(String pNombre, float plado) throws FiguraException{
		super(pNombre);
		this.lado = plado;
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) throws FiguraException {
		if(lado < 0)
			throw new FiguraException("Hay un error");
		this.lado = lado;
	}


	@Override
	public float calcularPerimetro() {
		return lado*4;
	}

	@Override
	public float calcularSuperficie() {
		return lado*lado;
	}

	@Override
	public boolean equals(Object obj) {  //recibe un object
		return super.equals(obj) &&     //equal padre que compara el nom
				obj instanceof Cuadrado  &&   // 
				((Cuadrado)obj).getLado()==lado; //si es lado es igual parametro y clase
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() + (int)lado;  //redondea a entero
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado=");
		sb.append("lado");
		return sb.toString();
	}
	

}
