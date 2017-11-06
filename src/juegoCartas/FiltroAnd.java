package juegoCartas;

public class FiltroAnd extends Filtro {
	private Filtro cond1;
	private Filtro cond2;

	public FiltroAnd (Filtro f1, Filtro f2) {
		this.cond1 = f1;
		this.cond2 = f2;
	}

	public boolean cumple(Carta C) {
		return cond1.cumple(C) && cond2.cumple(C);
	}

}
