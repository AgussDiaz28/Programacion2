
public class Jugador {
	private Maso Maso;
	private String Nombre;

	public Jugador(String Nombre) {
		this.Nombre = Nombre;
		this.Maso = new Maso();
	}

	public String getNombreJugador() {
		return this.Nombre;
	}
	
	public Carta getCarta() {
		return Maso.getCarta();
	}

	public void addCarta(Carta C1) {
		this.Maso.agregarCarta(C1);
	}

	public String elegirAtributo(Carta C) {
		int cantAtributos = C.cantAtributos();
		int pos = (int) (Math.random() * cantAtributos);
		return C.getNombreAtributo(pos);
	}
	
	public boolean masoVacio() {
		return this.Maso.esVacio();
	}
	
	public int cartasRestantes() {
		return this.Maso.cantCartas();
	}
}
