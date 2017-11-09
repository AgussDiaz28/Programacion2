package juegoCartas;

public class JuegoRondas implements ModoDeJuego {

	private Jugador J1;
	private Jugador J2;
	private int cantRondas;
	private int rondasJugadas;

	public JuegoRondas(Jugador Jugador1, Jugador Jugador2, int cantRondas) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
		this.cantRondas = cantRondas;
	}

	public boolean condicion() {
		boolean condicion = !((J1.mazoVacio()) || (J2.mazoVacio()) || (this.cantRondas < this.rondasJugadas));
		rondasJugadas++;
		return condicion;
	}
}
