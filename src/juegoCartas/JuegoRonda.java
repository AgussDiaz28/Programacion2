package juegoCartas;


public class JuegoRonda extends JuegoConRondas {

	private int rondasJugadas;

	public JuegoRonda(Jugador Jugador1, Jugador Jugador2, int cantRondas) {
		super(Jugador1, Jugador2, cantRondas);
		rondasJugadas = 0;
	}

	public boolean condicion() {
		boolean condicion = (!J1.mazoVacio()) && (J2.mazoVacio()) && (this.cantRondas > this.rondasJugadas);
		rondasJugadas++;
		return condicion;
	}

}