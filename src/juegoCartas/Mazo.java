package juegoCartas;

import java.util.ArrayList;

public class Mazo {

	private ArrayList<Carta> Cartas;

	public Mazo() {
		this.Cartas = new ArrayList<Carta>();
	}

	public void agregarCarta(Carta card) {
		if (card.cantAtributos() >= 3 && card.cantAtributos() <= 6) {
			this.Cartas.add(card);
		}
		else {
			System.out.println("La carta debe tener entre 3 y 6 atributos para agregarla al mazo");
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
}
