package juegoCartas;

public class Juego {

	protected Jugador J1;
	protected Jugador J2;
	protected Mazo M;
	private TipoDeJuego politica;

	protected Juego(Jugador Jugador1, Jugador Jugador2, Mazo mazo, TipoDeJuego politica) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
		this.M = mazo;
		this.politica = politica;
	}

	public void jugar() {
		this.repartirCartas();
		int cont = 1;
		Jugador[] jugadores = new Jugador[2];
		Jugador ganador = this.J1;
		Jugador oponente = this.J2;

		while (politica.condicion(J1,J2)) { 
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

	public void repartirCartas() {
		int descartar;
		int cantidadCartas = M.cantCartas();
		if (cantidadCartas >= 2) {

			if ((cantidadCartas % 2) == 0) //Devuelve 0 si es par, 1 si es impar
				descartar = 0;
			else {
				descartar = 1;
			}
			for (int i=0; i < cantidadCartas-descartar; i++) {
				J1.addCarta(this.M.getCarta());
				i++;
				J2.addCarta(this.M.getCarta());
			}
		}
	}

	public Jugador[] jugarMano(Jugador ganador, Jugador oponente) {
		Jugador aux;
		int resultado;

		Jugador[] jugadores;
		jugadores = new Jugador[2];

		Carta carta1 = ganador.getCarta();
		Carta carta2 = oponente.getCarta();

		resultado = carta1.compararCartas(carta2,ganador.elegirAtributo(carta1));

		if (resultado == 1) {	//VOLVIO A GANAR EL MISMO JUGADOR
			ganador.addCarta(carta1);
			ganador.addCarta(carta2);
			System.out.println("Ganador de la mano es: " + ganador.getNombreJugador());
		}
		else if (resultado == -1) { //PERDIO EL ULTIMO GANADOR
			oponente.addCarta(carta1);
			oponente.addCarta(carta2);
			aux = ganador;
			ganador = oponente;
			oponente = aux;
			System.out.println("El Ganador de la mano es: " + ganador.getNombreJugador());
		}
		else if (resultado == 0) { //EMPATE
			ganador.addCarta(carta1);
			oponente.addCarta(carta2);
			System.out.println("Empataron");
		}

		jugadores[0] = ganador;
		jugadores[1] = oponente;

		return jugadores ;
	}

	public void resultado() {
		if (J1.mazoVacio()) {
			System.out.println("Gano el jugador: " + J2.getNombreJugador());
		}
		else if (J2.mazoVacio()) {
			System.out.println("Gano el jugador: " + J1.getNombreJugador());
		}
		else if (J1.cartasRestantes() > this.J2.cartasRestantes() ) {
			System.out.println("Gano el jugador: " + J1.getNombreJugador());
		}
		else if (J1.cartasRestantes() < this.J2.cartasRestantes() ) {
			System.out.println("Gano el jugador: " + J2.getNombreJugador());
		}
		else {
			System.out.println("Empataron");
		}
	}

}
