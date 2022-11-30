package es.edu.cap.piedrapapeltijera.modelo;

public class Papel extends PiedraPapelTijeraFactoy {

	public Papel(){
		this( "papel", PAPEL);
	}
	public Papel(String nombre, int numero) {
		super(nombre, numero);
		
	}

	@Override
	public boolean isMe(int numero) {
		
		return numero==PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactoy pAll) {
		int result = 0;
		int numRec = pAll.getNumero();
		switch (numRec) {
		case TIJERA:
			result = -1;
			descripcionResultado = nombre + "perdistes con " + pAll.getNombre();
			break;
		case PIEDRA:
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
