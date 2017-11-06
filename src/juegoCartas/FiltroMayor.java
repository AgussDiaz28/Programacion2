package juegoCartas;

public class FiltroMayor extends FiltroSimple {

	public FiltroMayor(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		return C.getValor(this.atributo) > this.valor;
	}

}
