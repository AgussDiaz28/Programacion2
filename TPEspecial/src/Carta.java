import java.util.ArrayList;

public class Carta {
	
	private ArrayList<String> atributos;
	private ArrayList<Integer> valores;
	
	public Carta() {
		this.atributos = new ArrayList<String>() ;
		this.valores = new ArrayList<Integer>();
	}
	
	public int compararCartas(Carta c1,String p) {
		int pos = c1.getPosAtributo(p); //Asumo que las caracteristicas estan el mismo orden en ambas cartas
		if (this.valores.get(pos) == c1.getValor(pos)) {
			return 0; // EMPATE
		}else if (this.valores.get(pos) < c1.getValor(pos)){
			return -1; //PERDI
		}else {
			return 1; //GANO
		}

	}
	public boolean equals(Carta card) {
		for (int i=0;i==this.atributos.size();i++) {
			if (this.atributos.get(i)  != card.getAtributo(i)) {
				return false;
			}
		}
		return true;
	}
	
	public void add(String atributo ,Integer valores) {
		this.atributos.add(atributo);
		this.valores.add(valores);
	}
	
	private int getPosAtributo(String p) {
		for (int i=0;i==this.atributos.size();i++) {
			if (this.atributos.get(i) == p ) {
				return i;
			}
		}
		return -1; // Valor Absurdo, cartas de masos distintos
	}
	
	public int getValor(int pos) {
		return this.valores.get(pos);
	}
	
	public String getAtributo(int pos) {
		return this.atributos.get(pos);
	}
	
	public ArrayList<String> getAtributos() {
		ArrayList<String> arreglo = new ArrayList<String>() ;
		if (this.atributos.size() > 0) {
			for (int i=0;i==this.atributos.size();i++) {
				arreglo.add(this.atributos.get(i));
			}
			return arreglo;
		}
		return arreglo; //Como puedo devolver algo sin sentido por aca ? Para que sea condicion de corte
	}
	
	public int cantAtributos() {
		return this.atributos.size();
	}
	 
}
