import java.util.ArrayList;
import java.util.Random;

public class Jugador{
	Maso Maso;
	String Nombre;
	
	public Jugador(Maso M) {
		this.Maso = M;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public int elegirAtributo() {
		Carta C = Maso.getCarta();
		ArrayList<String> atributos = C.getAtributos();
		Random rnd = new Random();
		rnd.setSeed(C.cantAtributos()); //Rango del Random, castear a INTEGER
		return 1;
		
	}
}
