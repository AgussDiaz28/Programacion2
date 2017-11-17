package juegoCartas;

public class FiltroIgual extends FiltroSimple {

	public FiltroIgual(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		if (C.getValor(this.atributo) != -1) {
			return C.getValor(this.atributo) == this.valor;
		}
		else {
			return false;
		}
	}

}
