
public class JuegoNormal extends Juego {

	public JuegoNormal(Jugador Jugador1, Jugador Jugador2, Maso Maso) {
		super(Jugador1, Jugador2, Maso);

	}

	public void jugar() {
		
		this.repartirCartas();
		Jugador[] jugadores;
		jugadores = new Jugador[2];
		
		Jugador ganador = this.J1;
		Jugador oponente = this.J2;
		
		ganador.getNombreJugador();
		oponente.getNombreJugador();
		
		System.out.println("El  primer ganador es " + ganador);
		System.out.println("El  primer oponente es " + oponente);
		
		while (!(this.J1.masoVacio()) || !(this.J2.masoVacio())) {
			jugadores = this.jugarMano(ganador , oponente );
			ganador = jugadores[0];
			oponente = jugadores[1];
		}
	}
}
