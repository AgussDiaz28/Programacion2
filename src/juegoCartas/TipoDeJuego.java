package juegoCartas;

public class TipoDeJuego{

	public TipoDeJuego() {
	}

	public boolean condicion(Jugador J1,Jugador J2) {
		return !((J1.mazoVacio()) || (J2.mazoVacio()));
	}
}
