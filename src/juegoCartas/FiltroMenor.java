package juegoCartas;

public class FiltroMenor extends FiltroSimple {

	public FiltroMenor(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		return C.getValor(this.atributo) < this.valor;
	}

}
