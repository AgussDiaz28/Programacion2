package juegoCartas;

public class FiltroMayor extends Filtro {

	public FiltroMayor(String atributo, int valor) {
		super(atributo, valor);
	}

	public boolean cumple(Carta C) {
		return C.getValor(this.atributo) > this.valor;
	}

}
