package juegoCartas;

public abstract class FiltroSimple implements Filtro {

	protected String atributo;
	protected int valor;

	public FiltroSimple(String atributo, int valor) {
		this.atributo = atributo;
		this.valor = valor;
	}

}
