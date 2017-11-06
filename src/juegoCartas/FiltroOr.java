package juegoCartas;

public class FiltroOr extends FiltroCompuesto {

	public FiltroOr (Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	public boolean cumple(Carta C) {
		return cond1.cumple(C) || cond2.cumple(C);
	}

}
