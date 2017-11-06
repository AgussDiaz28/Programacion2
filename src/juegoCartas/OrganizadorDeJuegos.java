package juegoCartas;

import java.util.ArrayList;

public class OrganizadorDeJuegos {
	private ArrayList<Mazo> Mazos;
	
	public ArrayList<Mazo> buscar(Filtro f) {
		ArrayList<Mazo> retorno = new ArrayList<Mazo>();
		for (Mazo M : Mazos) {
			Mazos.add(M.buscar(f));
		}
		return retorno;
	}
	
}
