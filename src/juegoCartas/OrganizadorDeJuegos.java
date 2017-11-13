package juegoCartas;

import java.util.ArrayList;

public class OrganizadorDeJuegos {

	private ArrayList<Mazo> Mazos;

	public OrganizadorDeJuegos() {
		Mazos = new ArrayList<Mazo>();
	}

	public ArrayList<Carta> buscar(Filtro f) {
		ArrayList<Carta> retorno = new ArrayList<Carta>();
		for (Mazo M : Mazos) {
			retorno.addAll(M.buscar(f));
		}
		return retorno;
	}

	public void add(Mazo M) {
		this.Mazos.add(M);
	}

	public static void main(String[] args) {
		int cantRondas = 3;

		//Creo y asigno las cartas.

		Carta C1 = new Carta("Minion 1");
		Carta C2 = new Carta("Minion 2");
		Carta C3 = new Carta("Minion 3");
		Carta C4 = new Carta("Minion 4");
		Carta C5 = new Carta("Minion 5");
		Carta C6 = new Carta("Minion 6");
		Carta C7 = new Carta("Minion 7");
		Carta C8 = new Carta("Minion 8");
		Carta C9 = new Carta("Minion 9");
		Carta C10 = new Carta("Minion 10");
		Carta C11 = new Carta("Minion 11");
		Carta C12 = new Carta("Minion 12");

		C1.setAtributo("ternura", 18);
		C1.setAtributo("valor", 18);
		C1.setAtributo("fuerza", 18);

		C2.setAtributo("ternura", 14);
		C2.setAtributo("valor", 14);
		C2.setAtributo("fuerza", 14);

		C3.setAtributo("ternura", 18);
		C3.setAtributo("valor", 18);
		C3.setAtributo("fuerza", 18);

		C4.setAtributo("ternura", 14);
		C4.setAtributo("valor", 14);
		C4.setAtributo("fuerza", 14);

		C5.setAtributo("ternura", 18);
		C5.setAtributo("valor", 18);
		C5.setAtributo("fuerza", 18);

		C6.setAtributo("ternura", 14);
		C6.setAtributo("valor", 14);
		C6.setAtributo("fuerza", 14);

		C7.setAtributo("ternura", 18);
		C7.setAtributo("valor", 18);
		C7.setAtributo("fuerza", 18);

		C8.setAtributo("ternura", 14);
		C8.setAtributo("valor", 14);
		C8.setAtributo("fuerza", 14);


		C9.setAtributo("ternura", 5);
		C9.setAtributo("valor", 5);
		C9.setAtributo("fuerza", 105);

		C10.setAtributo("ternura", 14);
		C10.setAtributo("valor", 14);
		C10.setAtributo("fuerza", 14);


		C11.setAtributo("ternura", 18);
		C11.setAtributo("valor", 18);
		C11.setAtributo("fuerza", 18);


		C12.setAtributo("ternura", 14);
		C12.setAtributo("valor", 14);
		C12.setAtributo("fuerza", 14);


		Mazo M = new Mazo();
		Mazo M2 = new Mazo();
		M.agregarCarta(C1);
		M.agregarCarta(C2);
		M.agregarCarta(C3);
		M.agregarCarta(C4);
		M.agregarCarta(C5);
		M.agregarCarta(C6);
		M.agregarCarta(C7);
		M.agregarCarta(C8);
		M.agregarCarta(C9);
		M.agregarCarta(C10);
		M.agregarCarta(C11);
		M.agregarCarta(C12);

		Jugador J1 = new Jugador("Santiago");
		Jugador J2 = new Jugador("Agustin");


		//Creo el organizador de juegos y le a�ado los mazos.


		OrganizadorDeJuegos santi = new OrganizadorDeJuegos();
		santi.add(M);
		santi.add(M2);

		//Creo los filtros.

		FiltroIgual filtroSimple1 = new FiltroIgual("fuerza", 105);
		FiltroIgual filtroSimple2 = new FiltroIgual("valor", 5);
		FiltroIgual filtroSimple3 = new FiltroIgual("ternura", 5);
		FiltroAnd filtroCompuesto1 = new FiltroAnd(filtroSimple1, filtroSimple2);
		FiltroAnd filtroCompuesto2 = new FiltroAnd(filtroCompuesto1, filtroSimple3);

		//Ejecuto el buscar y lo imprimo

		ArrayList<Carta> resultado = santi.buscar(filtroCompuesto2);
		if (!resultado.isEmpty()) {
			for (Carta carta : resultado) {
				System.out.println(carta.getNombre());
			}
		}
		else {
			System.out.println("No hay cartas con las caracteristicas solicitadas");
		}

		
		//Juego una partida por rondas y una partida normal.


		if (M.verificarMazo()) {
			System.out.println("El mazo es correcto y tiene " + M.cantCartas() + " Cartas");
			TipoDeJuego JR = new JuegoRondas(cantRondas);
			TipoDeJuego JN = new TipoDeJuego();
			Juego PartidaRondas = new Juego(J1, J2, M, JR);
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Inicio juego por rondas");
			PartidaRondas.jugar();
			System.out.println("----");
			System.out.println("--Fin de Juego Por Rondas--");
			Juego Partida = new Juego(J1, J2, M, JN);
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("--Inicio de Juego Normal--");
			Partida.jugar();
			System.out.println("----");
			System.out.println("--Fin de Juego Normal--");
			System.out.println("---------------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("El mazo no es correcto");
		}
		 


	}
}
