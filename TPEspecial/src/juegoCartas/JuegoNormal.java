package juegoCartas;

public class JuegoNormal extends Juego {

	public JuegoNormal(Jugador Jugador1, Jugador Jugador2, Mazo mazo) {
		super(Jugador1, Jugador2, mazo);

	}

	public void jugar() {

		this.repartirCartas();

		Jugador[] jugadores;
		jugadores = new Jugador[2];

		int cont = 0;

		Jugador ganador = this.J1;
		Jugador oponente = this.J2;

		while ( (!this.J1.mazoVacio()) && (!this.J2.mazoVacio()) && (cont < (this.totalCartas/2) ) ) {
			System.out.println("----");
			System.out.println("Mano numero: " + cont );

			jugadores = this.jugarMano(ganador , oponente );
			ganador = jugadores[0];
			oponente = jugadores[1];
			cont++;
		}

		System.out.println("----");
		System.out.println("Resultado Final");
		this.resultado();

	}
}