package juegoCartas;

import java.util.ArrayList;

public class Maso {

	private ArrayList<Carta> Cartas;

	public Maso()	{
		this.Cartas = new ArrayList<Carta>();
		//agregarCarta(card);
	}

	public void agregarCarta(Carta card) {
		if (card.cantAtributos() >= 3 && card.cantAtributos() <= 6) {
			this.Cartas.add(card);
		}
		else {
			System.out.println("La carta debe tener entre 3 y 6 atributos para agregarla al maso");
		}
	}

	public Carta getCarta() {	//Siempre da la primer carta del paso y la quita del maso
		return this.Cartas.remove(0);
	}

	public boolean esVacio() {		//Devuelve que el paso verdadero si el maso es vacio
		return (this.Cartas.size() == 0);
	}

	public boolean VerificarMaso() { 
		for (int i = 1; i < Cartas.size(); i++) {
			if (! Cartas.get(0).equals(Cartas.get(i)) ){
				return false;
			}
		}
		return true;
	}

	public int cantCartas() {		//Devuelve la cantidad de cartas del Maso
		return this.Cartas.size();
	}
}
