package juegoCartas;

import java.util.ArrayList;

public class Carta {

	private ArrayList<String> atributos;
	private ArrayList<Integer> valores;
	private String nombre;

	public Carta() {
		this.atributos = new ArrayList<String>();
		this.valores = new ArrayList<Integer>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int compararCartas(Carta c1,String p) {
		int pos = c1.getPosAtributo(p);
		if (this.valores.get(pos) == c1.getValor(pos)) {
			return 0; // EMPATE
		}
		else if (this.valores.get(pos) < c1.getValor(pos)) {
			return -1; //PERDIO EL QUE LLAMO
		}
		else {
			return 1; //GANO EL QUE LLAMO
		}
	}

	public boolean mismoTipo(Carta card) {
		for (int i=0; i < this.atributos.size(); i++) {
			if (this.atributos.get(i)  != card.getNombreAtributo(i)) {
				return false;
			}
		}
		return true;
	}

	public void setAtributo(String atributo ,Integer valores) {
		this.atributos.add(atributo);
		this.valores.add(valores);
	}

	private int getPosAtributo(String p) {
		for (int i=0; i < this.atributos.size(); i++) {
			if (this.atributos.get(i) == p ) {
				return i;
			}
		}
		return -1; //Valor Absurdo, cartas de mazos distintos
	}

	public int getValor(int pos) {
		return this.valores.get(pos);
	}

	public String getNombreAtributo(int pos) {
		return this.atributos.get(pos);
	}

	public ArrayList<String> getAtributos() {
		ArrayList<String> arreglo = new ArrayList<String>();
		if (this.atributos.size() > 0) {
			for (int i=0; i < this.atributos.size(); i++) { 
				arreglo.add(this.atributos.get(i));
			}
		}
		return arreglo;
	}

	public int cantAtributos() {
		return this.atributos.size();
	}

}
