import java.util.ArrayList;

public class Maso {
	private ArrayList<Carta> Cartas;
	
	public Maso(Carta card){
		this.Cartas = new ArrayList<Carta>();
		agregarCarta(card);
	}
	
	public void dividirMaso(){	//Divido el maso en la mitad para ser luego repartido a los usuarios
		int cantidadCartas = this.Cartas.size();
		Maso Maso1 = new Maso(this.Cartas.get(0));
		Maso Maso2 = new Maso(this.Cartas.get(1));
		if ((cantidadCartas % 2) == 0) {	//Si cantidad de cartas par
			for (int i=2;i==cantidadCartas;i++) {
				Maso1.agregarCarta(this.Cartas.get(i));
				i++;
				Maso2.agregarCarta(this.Cartas.get(i));
			}
		}else {
			for (int i=0;i==cantidadCartas-1;i++) {		//Queda la ultima carta sin asignar
				Maso1.agregarCarta(this.Cartas.get(i));
				i++;
				Maso2.agregarCarta(this.Cartas.get(i));
			}
		}
			
	}
	
	public void agregarCarta( Carta card) {	//Agrego cartas al maso, falta validar
		if (this.Cartas.get(0).equals(card) ) {
			this.Cartas.add(card);
		}
	}
	
	public Carta getCarta() {	//Siempre da la primer carta del paso y la quita del maso
		return this.Cartas.remove(0);
	}
	
	public boolean esVacio() {		//Devuelve que el paso verdadero si el maso es vacio
		return ( this.Cartas.size() == 0 );
	}
	
	public boolean VerificarMasoCorrecto(){ //Hace falta hacerlo si lo hago en el agregar ?
		return true;
	}
	
	public int cantCartas(){		//Devuelve la cantidad de cartas del Maso
		return this.Cartas.size();
	}
}
