package juegoCartas;


public class JuegoRonda extends Juego {

	private int rondas;

	public JuegoRonda(Jugador Jugador1, Jugador Jugador2, Mazo mazo) {
		super(Jugador1, Jugador2, mazo);

	}

	public void jugar() {
		this.repartirCartas();
		int cont = 0;
		Jugador[] jugadores = new Jugador[2];
		Jugador ganador = this.J1;
		Jugador oponente = this.J2;

		while ((!this.J1.mazoVacio()) && (!this.J2.mazoVacio()) && (this.rondas > cont)) { 
			System.out.println("----");
			System.out.println("Mano numero: " + cont );

			jugadores = this.jugarMano(ganador,oponente);
			ganador = jugadores[0];
			oponente = jugadores[1];
			cont++;
		}

		System.out.println("----");
		System.out.println("Resultado Final");
		this.resultado();
	}

	public void setRondas(int rondas) {
		this.rondas = rondas;
	}
}