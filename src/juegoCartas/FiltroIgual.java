package juegoCartas;

public class FiltroIgual extends Filtro {

	public FiltroIgual(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		return C.getValor(this.atributo) == this.valor;
	}

}
