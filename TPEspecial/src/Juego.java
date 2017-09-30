
public abstract class Juego {

	Jugador J1;
	Jugador J2;
	Maso M;

	public Juego(Jugador Jugador1,Jugador Jugador2,Maso Maso) {
		this.J1 = Jugador1;
		this.J2 = Jugador2;
		this.M = Maso;
	}

	public void repartirCartas() {
		int descartar;
		int cantidadCartas = this.M.cantCartas();
		if (cantidadCartas > 2) {

			if ((cantidadCartas % 2) == 0) 
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
		String atributo;
		Jugador[] jugadores;
		jugadores = new Jugador[2];

		System.out.println("El ultimo ganador era " + ganador.getNombreJugador());
		
		Carta carta1 = ganador.getCarta();
		Carta carta2 = oponente.getCarta();

		atributo = ganador.elegirAtributo(carta1);

		resultado = carta1.compararCartas(carta2,atributo);

		switch (resultado) {
		case 1:
			ganador.addCarta(carta1);
			ganador.addCarta(carta2);
			break;
		case -1:
			oponente.addCarta(carta1);
			oponente.addCarta(carta2);
			aux = ganador;
			ganador = oponente;
			oponente = aux;
			break;
		case 0:
			ganador.addCarta(carta1);
			oponente.addCarta(carta2);
			break;

		default:
			break;
		}
		
		jugadores[0] = ganador;
		jugadores[1] = oponente;
		
		System.out.println("Ganador al final de la mano era " + jugadores[0].getNombreJugador());
		System.out.println("El perdedor al final de la ronda fue " + jugadores[1].getNombreJugador());
		
		return jugadores ;

	}
	
	public abstract void jugar();
}
