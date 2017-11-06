package juegoCartas;

public abstract class FiltroCompuesto implements Filtro {
	protected Filtro cond1;
	protected Filtro cond2;
	
	public FiltroCompuesto(Filtro f1, Filtro f2) {
		this.cond1 = f1;
		this.cond2 = f2;
	}

}
