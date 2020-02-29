package solitario.pruebas;

import solitario.baraja.Mazo;
import solitario.columnas.Columna;

public class PruebasUsoTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mazo m = new Mazo();
	//	Descarte d = new Descarte();
		Columna c1 = new Columna();
		
		String ultima;
		
		@SuppressWarnings("unused")
		String [] baraja = new String[48];
		
		baraja = m.getBaraja();
		
		ultima = m.getCartaDeArriba();
		
		System.out.println("Última carta "+ultima);
		
		c1.tirada(m.getCartaDeArriba());
		
		ultima = m.getCartaDeArriba();
		
		System.out.println("Última carta "+ultima);
		
		
	}

}
