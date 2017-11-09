package juegoCartas;

public abstract class JuegoConRondas implements ModoDeJuego {

	protected Jugador J1;
	protected Jugador J2;
	protected int cantRondas;

	protected JuegoConRondas(Jugador Jugador1, Jugador Jugador2, int cantRondas) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
		this.cantRondas = cantRondas;
	}
}
