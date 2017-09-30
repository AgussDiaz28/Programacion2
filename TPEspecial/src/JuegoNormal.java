
public class JuegoNormal extends Juego {

	public JuegoNormal(Jugador Jugador1, Jugador Jugador2, Maso Maso) {
		super(Jugador1, Jugador2, Maso);

	}

	public void jugar() {

		this.repartirCartas();
		
		Jugador[] jugadores;
		jugadores = new Jugador[2];
		
		int cont = 0;
		
		Jugador ganador = this.J1;
		Jugador oponente = this.J2;
		
		while ( (!this.J1.masoVacio()) && (!this.J2.masoVacio()) && (cont < (this.totalCartas/2) ) ) {
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
