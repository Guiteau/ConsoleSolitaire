package solitario.pruebas;

import solitario.baraja.Baraja;

public class PruebasBaraja {

	public static void main(String[] args) {


		Baraja b = new Baraja();
		
		String[] baraja = new String[] { "1\u2665", "2\u2665", "3\u2665", "4\u2665", "5\u2665", "6\u2665", "7\u2665",
				"8\u2665", "9\u2665", "10\u2665", "11\u2665", "12\u2665", "1\u2666", "2\u2666", "3\u2666", "4\u2666",
				"5\u2666", "6\u2666", "7\u2666", "8\u2666", "9\u2666", "10\u2666", "11\u2666", "12\u2666", "1\u2665",
				"2\u2663", "3\u2663", "4\u2663", "5\u2663", "6\u2663" };;

		
	//	String [] aux = new String [48];				
				
				
		b.generaBaraja();
		
		System.out.println(b.toString());
		
  //    aux = b.getBaraja();
		
		b.barajar();
		
		System.out.println(b.toString());
		
		System.out.println();
		
		b.setBaraja(baraja);
		
		System.out.println(b.toString());
		
		b.barajar();
		
		System.out.println();
		
		System.out.println(b.toString());

	}

}
