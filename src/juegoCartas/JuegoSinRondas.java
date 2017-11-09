package juegoCartas;

public abstract class JuegoSinRondas implements ModoDeJuego {
	protected Jugador J1;
	protected Jugador J2;

	protected JuegoSinRondas(Jugador Jugador1, Jugador Jugador2) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
	}
}
