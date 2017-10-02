package juegoCartas;

public class Jugador {
	private Mazo mazo;
	private String Nombre;

	public Jugador(String Nombre) {
		this.Nombre = Nombre;
		this.mazo = new Mazo();
	}

	public String getNombreJugador() {
		return this.Nombre;
	}

	public Carta getCarta() {
		return mazo.getCarta();
	}

	public void addCarta(Carta C1) {
		this.mazo.agregarCarta(C1);
	}

	public String elegirAtributo(Carta C) {
		int cantAtributos = C.cantAtributos();
		int pos = (int) (Math.random() * cantAtributos);
		return C.getNombreAtributo(pos);
	}

	public boolean mazoVacio() {
		return this.mazo.esVacio();
	}

	public int cartasRestantes() {
		return this.mazo.cantCartas();
	}
}
