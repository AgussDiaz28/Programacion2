package juegoCartas;

public abstract class Filtro {
	protected String atributo;
	protected int valor;
	
	public Filtro(String atributo, int valor) {
		this.atributo = atributo;
		this.valor = valor;
	}
	
	public Filtro() {}

	public abstract boolean cumple(Carta c);
}
