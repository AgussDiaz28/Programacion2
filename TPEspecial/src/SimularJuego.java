
public class SimularJuego {

	public static void main(String[] args) {
		Carta C1 = new Carta();	//Puedo crear cartas con 0 atributos
		Carta C2 = new Carta();
		Carta C3 = new Carta();
		Carta C4 = new Carta();
		Carta C5 = new Carta();
		Carta C6 = new Carta();
		Carta C7 = new Carta();
		Carta C8 = new Carta();
		Carta C9 = new Carta();
		Carta C10 = new Carta();
		Carta C11 = new Carta();
		Carta C12 = new Carta();
		
		
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
		
		C7.setAtributo("ternura", 5);
		C7.setAtributo("valor", 5);
		C7.setAtributo("fuerza", 5);
		
		C8.setAtributo("ternura", 10);
		C8.setAtributo("valor", 10);
		C8.setAtributo("fuerza", 10);
		
		
		C9.setAtributo("ternura", 5);
		C9.setAtributo("valor", 5);
		C9.setAtributo("fuerza", 5);
		
		C10.setAtributo("ternura", 10);
		C10.setAtributo("valor", 10);
		C10.setAtributo("fuerza", 10);
		
		
		C11.setAtributo("ternura", 10);
		C11.setAtributo("valor", 10);
		C11.setAtributo("fuerza", 10);
		
		C12.setAtributo("ternura", 10);
		C12.setAtributo("valor", 10);
		C12.setAtributo("fuerza", 10);
		
		
		Maso M = new Maso();
		M.agregarCarta(C1);
		M.agregarCarta(C2);
		M.agregarCarta(C3);
		M.agregarCarta(C4);
		M.agregarCarta(C5);
		M.agregarCarta(C6);
		M.agregarCarta(C7);
		M.agregarCarta(C8);
		M.agregarCarta(C9);
		M.agregarCarta(C10);
		M.agregarCarta(C11);
		M.agregarCarta(C12);
		
		
		System.out.println("El maso es valido ?" + M.VerificarMaso());
		
		Jugador J1 = new Jugador("Santi");
		Jugador J2 = new Jugador("Agus");
		
		System.out.println(J1.getNombreJugador());
		System.out.println(J2.getNombreJugador());
		
		//JuegoRonda NR = new JuegoRonda(J1, J2, M);
		JuegoNormal JN = new JuegoNormal(J1, J2, M);
		
		//prueba.setRondas(4);
		//prueba.jugar();
		JN.jugar();
		
	}
}
