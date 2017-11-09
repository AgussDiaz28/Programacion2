package juegoCartas;

public class JuegoNormal extends JuegoSinRondas {

	public JuegoNormal(Jugador Jugador1, Jugador Jugador2) {
		super(Jugador1, Jugador2);
	}

	public boolean condicion() {
		return (!J1.mazoVacio()) && (J2.mazoVacio());
	}
}