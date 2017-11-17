package juegoCartas;

public class JuegoRondas extends TipoDeJuego {
	private int cantRondas;
	private int rondasJugadas;

	public JuegoRondas(int cantRondas) {
		this.cantRondas = cantRondas;
	}

	public boolean condicion(Jugador J1,Jugador J2) {
		boolean condicion = (super.condicion(J1,J2) && !(this.cantRondas < this.rondasJugadas));
		rondasJugadas++;
		return condicion;
	}
}
