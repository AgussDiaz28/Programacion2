package juegoCartas;

public abstract class Juego {

	protected Jugador J1;
	protected Jugador J2;
	protected Maso M;
	protected int totalCartas;

	public Juego(Jugador Jugador1,Jugador Jugador2,Maso Maso) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
		this.M = Maso;
		this.totalCartas = this.M.cantCartas();
	}

	public void repartirCartas() {
		int descartar;
		int cantidadCartas = this.M.cantCartas();
		if (cantidadCartas >= 2) {	//Si tengo dos cartas solamente y hay empate hay bucle infinito

			if ((cantidadCartas % 2) == 0) //Devuelve 0 si es par, 1 si es impar
				descartar = 0;
			else {
				descartar = 1;
			}
			for (int i=0; i < cantidadCartas-descartar; i++) {
				this.J1.addCarta(this.M.getCarta());
				i++;
				this.J2.addCarta(this.M.getCarta());
			}
		}
	}

	public Jugador[] jugarMano(Jugador ganador,Jugador oponente) {
		Jugador aux;
		int resultado;

		Jugador[] jugadores;
		jugadores = new Jugador[2];

		Carta carta1 = ganador.getCarta();
		Carta carta2 = oponente.getCarta();

		resultado = carta1.compararCartas(carta2,ganador.elegirAtributo(carta1));

		if (resultado == 1){	//VOLVIO A GANAR EL MISMO JUGADOR
			ganador.addCarta(carta1);
			ganador.addCarta(carta2);
			System.out.println("Ganador de la mano es: " + ganador.getNombreJugador());
		}else if (resultado == -1){ //PERDIO EL ULTIMO GANADOR
			oponente.addCarta(carta1);
			oponente.addCarta(carta2);
			aux = ganador;
			ganador = oponente;
			oponente = aux;
			System.out.println("El Ganador de la mano es: " + ganador.getNombreJugador());
		}else if (resultado == 0){ //EMPATE
			ganador.addCarta(carta1);
			oponente.addCarta(carta2);
			System.out.println("Empataron");
		}



		jugadores[0] = ganador;
		jugadores[1] = oponente;

		return jugadores ;

	}

	public void resultado() {
		if (this.J1.masoVacio()){
			System.out.println("Gano el jugador: " + this.J2.getNombreJugador() );
		}else if (this.J2.masoVacio()) {
			System.out.println("Gano el jugador: " + this.J1.getNombreJugador());
		}else if (this.J1.cartasRestantes() > this.J2.cartasRestantes() ) {
			System.out.println("Gano el jugador: " + this.J1.getNombreJugador());
		}else if (this.J1.cartasRestantes() < this.J2.cartasRestantes() ) {
			System.out.println("Gano el jugador: " + this.J2.getNombreJugador() );
		}else {
			System.out.println("Empataron");
		}
	}

	public abstract void jugar();
}
