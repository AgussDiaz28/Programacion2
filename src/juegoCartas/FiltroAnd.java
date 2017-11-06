package juegoCartas;

public class FiltroAnd extends FiltroCompuesto {

	public FiltroAnd (Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	public boolean cumple(Carta C) {
		return cond1.cumple(C) && cond2.cumple(C);
	}

}
