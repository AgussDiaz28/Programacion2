package juegoCartas;

import java.util.ArrayList;

public class Mazo {

	private ArrayList<Carta> Cartas;

	public Mazo() {
		this.Cartas = new ArrayList<Carta>();
	}

	public void agregarCarta(Carta card) {
		if (Cartas.get(0).mismoTipo(card)) {
			this.Cartas.add(card);
		}
	}

	public Carta getCarta() {	//Siempre da la primer carta del paso y la quita del mazo
		return this.Cartas.remove(0);
	}

	public boolean esVacio() {		//Devuelve que el paso verdadero si el mazo es vacio
		return (this.Cartas.size() == 0);
	}

	public boolean verificarMazo() { 
		for (int i=1; i < Cartas.size(); i++) {
			if (!Cartas.get(0).mismoTipo(Cartas.get(i))) {
				return false;
			}
		}
		return true;
	}

	public int cantCartas() {		//Devuelve la cantidad de cartas del mazo
		return this.Cartas.size();
	}

	public Mazo buscar(Filtro filtro) {
		Mazo retorno = new Mazo();
		for (Carta C : Cartas) {
			if (filtro.cumple(C)) {
				this.agregarCarta(C);
			}
		}
		return retorno;
	}
	
}
