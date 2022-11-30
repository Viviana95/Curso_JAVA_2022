package es.edu.cap.piedrapapeltijera.modelo;

public class Tijera extends PiedraPapelTijeraFactoy {

	public Tijera(){
		this( "tijera", TIJERA);
	}
	public Tijera(String nombre, int numero) {
		super(nombre, numero);
		
	}

	@Override
	public boolean isMe(int numero) {
		
		return numero == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactoy pAll) {
		int result = 0;
		int numRec = pAll.getNumero();
		switch (numRec) {
		case PIEDRA:
			result = -1;
			descripcionResultado = nombre + " perdistes con " + pAll.getNombre();
			break;
		case PAPEL:
			result = 1;
			descripcionResultado = nombre + " ganastes con " + pAll.getNombre();
			break;

		default:
			result = 0;
			descripcionResultado = nombre + " empata con " + pAll.getNombre();
			break;
		}
		return result;
	}

}
