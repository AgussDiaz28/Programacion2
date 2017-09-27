
public class SimularJuego {

	public static void main(String[] args) {
		Carta C1 = new Carta();	//Puedo crear cartas con 0 atributos
		Carta C2 = new Carta();
		Carta C3 = new Carta();
		Carta C4 = new Carta();
		Carta C5 = new Carta();
		Carta C6 = new Carta();
		
		C1.setAtributo("ternura", 5);
		C1.setAtributo("valor", 5);
		C1.setAtributo("fuerza", 5);
		
		C2.setAtributo("ternura", 10);
		C2.setAtributo("valor", 10);
		C2.setAtributo("fuerza", 10);
		
		C3.setAtributo("ternura", 5);
		C3.setAtributo("valor", 5);
		C3.setAtributo("fuerza", 5);
		
		C4.setAtributo("ternura", 10);
		C4.setAtributo("valor", 10);
		C4.setAtributo("fuerza", 10);
		
		C5.setAtributo("ternura", 5);
		C5.setAtributo("valor", 5);
		C5.setAtributo("fuerza", 5);
		
		C6.setAtributo("ternura", 10);
		C6.setAtributo("valor", 10);
		C6.setAtributo("fuerza", 10);
		
		
		
		Maso M = new Maso();
		M.agregarCarta(C1);
		M.agregarCarta(C2);
		M.agregarCarta(C3);
		M.agregarCarta(C4);
		M.agregarCarta(C5);
		M.agregarCarta(C6);
		
		Jugador J1 = new Jugador("Santi");
		Jugador J2 = new Jugador("Agus");
		
		Juego prueba = new Juego(J1, J2, M);
		prueba.repartir();
		prueba.partida();
		
	}
}
