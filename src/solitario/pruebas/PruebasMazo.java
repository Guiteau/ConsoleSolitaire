package solitario.pruebas;

import solitario.baraja.Mazo;

public class PruebasMazo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mazo m = new Mazo();

		System.out.println(m.toString());

		System.out.println(m.getCartaDeArriba());

//		m.tiraCarta(true);

		System.out.println(m.toString());

		System.out.println(m.getCartaDeArriba());
		
//		m.tiraCarta(true);

		System.out.println(m.toString());
/*		
		System.out.println(m.descartaCarta());
		System.out.println(m.descartaCarta());
		System.out.println(m.descartaCarta());
*/		
		while(m.getCantidadCartas() != 0) {
			
			m.descartaCarta();
			
		}
		
		System.out.println("hola");
		
		System.out.println(m.toString());

	}

}
