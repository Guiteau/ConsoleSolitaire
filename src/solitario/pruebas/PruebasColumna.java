package solitario.pruebas;

import solitario.columnas.Columna;

public class PruebasColumna {

	public static void main(String[] args) {

	Columna col = new Columna();
	
	//MÉTODOS: 
	// * void tirada(String carta) - FUNCIONA 
	// boolean isLegal() - FUNCIONA
	// getPaloCarta(String carta) - FUNCIONA
	// int getValorCarta(String carta) - FUNCIONA
	// String getUltimaCarta() - FUNCIONA
	// String getConjuntoCartas() - FUNCIONA
	
	String cartas;
		
		col.tirada("12\u2660");
//		col.tirada("4\u2660");
		col.tirada("11\u2663");
		col.tirada("10\u2665");
		col.tirada("9\u2666");
		col.tirada("7\u2663");
		col.tirada("6\u2665");
		col.tirada("5\u2666");
	//	col.tirada("9\u2660");
	//	col.tirada("8\u2660");
	//	col.tirada("9\u2660");
	//	col.tirada("9\u2665");
		col.tirada("2\u2663");
	/*	col.tirada("6\u2665");
		col.tirada("5\u2666");
		col.tirada("3\u2663");
		col.tirada("2\u2665");
		col.tirada("1\u2666");
		
		System.out.println(col.getConjuntoCartas());
		
		System.out.println(col.getPaloCarta("5\u2666"));
		System.out.println(col.getPaloCarta("12\u2660"));
		System.out.println(col.getPaloCarta("4\u2663"));
		System.out.println(col.getPaloCarta("4\u2665"));
		*/
	
	cartas = col.getConjuntoCartas();
	
	System.out.println(col.isLegal());
	
	System.out.println(cartas);
	
/*	System.out.println(col.getPaloCarta("9\u2666"));
	
	System.out.println(col.getValorCarta("9\u2666"));*/
	
	System.out.println(col.getUltimaCarta());
	
	}

}
