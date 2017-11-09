package juegoCartas;

public class JuegoNormal implements ModoDeJuego {
	private Jugador J1;
	private Jugador J2;

	public JuegoNormal(Jugador Jugador1, Jugador Jugador2) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
	}

	public boolean condicion() {
		return !((J1.mazoVacio()) || (J2.mazoVacio()));
	}
}
