
public class Jugador {
	private Maso Maso;
	private String Nombre;
	private int cantAtributos;

	public Jugador(String Nombre) {
		this.Nombre = Nombre;
		this.Maso = new Maso();
	}

	public String getNombre() {
		return this.Nombre;
	}
	
	public Carta getCarta() {
		return Maso.getCarta();
	}

	public void addCarta(Carta C1) {
		this.Maso.agregarCarta(C1);
	}

	public String elegirAtributo(Carta C) {
		cantAtributos = C.cantAtributos();
		int pos = (int) (Math.random() * cantAtributos);
		return C.getNombreAtributo(pos);
	}
	
	public boolean masoVacio() {
		return this.Maso.esVacio();
	}
}
