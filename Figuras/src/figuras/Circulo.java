package figuras;

public class Circulo extends Figura {

	private float radio;
	
	
	public Circulo() {
		
	}

	public Circulo(String nombre, float pradio) {
		super(nombre);
		radio = pradio;
		
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		
		return 2*(float)(Math.PI * radio);
	}

	@Override
	public float calcularSuperficie() {
		
		return (float)Math.PI * radio*radio; // return (float)Math.pow(radio, 2); pow es potencia
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() + (int)radio; 
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj) &&
				obj instanceof Circulo &&
				((Circulo)obj).getRadio() == radio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", radio = ");
		sb.append(radio);
		return super.toString();
	}

}
