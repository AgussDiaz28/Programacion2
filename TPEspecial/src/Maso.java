import java.util.ArrayList;

public class Maso {

	private ArrayList<Carta> Cartas;

	public Maso()	{
		this.Cartas = new ArrayList<Carta>();
		//agregarCarta(card);
	}

	public void agregarCarta(Carta card) {	//Agrego cartas al maso, falta validar
//		if (this.Cartas.get(0).equals(card) ) {}	//El equals se fija si son del mismo tipo de cartas? Eso no va en el VerificarMaso?
			this.Cartas.add(card);
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
