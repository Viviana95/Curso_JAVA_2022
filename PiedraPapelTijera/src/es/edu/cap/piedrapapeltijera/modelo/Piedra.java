package es.edu.cap.piedrapapeltijera.modelo;

public class Piedra extends PiedraPapelTijeraFactoy {

	
	public Piedra(){
		this( "piedra", PIEDRA);
	}
	public Piedra(String nombre, int numero) {
		super(nombre, numero);
	}

	@Override
	public boolean isMe(int numero) {
		
		return numero == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactoy pAll) {
		int result = 0;
		int numRec = pAll.getNumero();
		switch (numRec) {
		case PAPEL:
			result = -1;
			descripcionResultado = nombre + "perdistes con " + pAll.getNombre();
			break;
		case TIJERA:
			result = 1;
			descripcionResultado = nombre + "ganastes con " + pAll.getNombre();
			break;

		default:
			result = 0;
			descripcionResultado = nombre + "empata con " + pAll.getNombre();
			break;
		}
		return result;
	}

}
