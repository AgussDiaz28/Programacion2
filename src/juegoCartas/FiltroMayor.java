package juegoCartas;

public class FiltroMayor extends FiltroSimple {

	public FiltroMayor(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		if (C.getValor(this.atributo) != -1) {
			return C.getValor(this.atributo) > this.valor;
		}
		else {
			return false;
		}
	}

}
