package juegoCartas;

import java.util.ArrayList;
import java.util.HashMap;

public class Carta {

	private HashMap<String, Integer> atributos;
	private String nombre;

	public Carta(String nombre) {
		this.atributos = new HashMap<String, Integer>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int compararCartas(Carta c1, String p) {
		if (this.atributos.get(p).equals(c1.getValor(p))) {
			return 0; // EMPATE
		}
		else if (this.atributos.get(p) < c1.getValor(p)) {
			return -1; //PERDIO EL QUE LLAMO
		}
		else {
			return 1; //GANO EL QUE LLAMO
		}
	}

	public boolean mismoTipo(Carta card) {
		if (this.cantAtributos() != card.cantAtributos()) {
			return false;
		}
		for (String A : atributos.keySet()) {
			if (!card.hasKey(A)) {
				return false;
			}
		}
		return true;
	}

	public void setAtributo(String atributo ,Integer valor) {
		this.atributos.put(atributo, valor);
	}

	public int getValor(String atributo) {
		if (atributos.containsKey(atributo)) {
			return this.atributos.get(atributo);
		}
		else {
			return -1;
		}
	}

	public ArrayList<String> getAtributos() {
		ArrayList<String> arreglo = new ArrayList<String>();
		if (this.atributos.size() > 0) {
			for (String A : atributos.keySet()) {
				arreglo.add(A);
			}
		}
		return arreglo;
	}

	public int cantAtributos() {
		return this.atributos.size();
	}

	public boolean hasKey(String A){
		return this.atributos.containsKey(A);
	}

}
