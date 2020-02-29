package solitario.columnas;

/**
 * 
 * @author Diego
 *
 */

public class Columna {

	private String[] conjuntoCartas;
	private int posicion;
	private boolean legal;

	public Columna() {

		conjuntoCartas = new String[12];
		posicion = 0;
		legal = false;

	}

	public void tirada(String carta) {

		if (posicion == 0) {

			conjuntoCartas[posicion] = carta;

			++posicion;

			legal = true;

		} else if (posicion < 12) {

			if (getPaloCarta(conjuntoCartas[posicion - 1]) != getPaloCarta(carta)
					&& getValorCarta(conjuntoCartas[posicion - 1]) > getValorCarta(carta)) { // comprobamos que no sea
																								// del mismo palo y que
																								// sea de un valor
																								// inferior

				conjuntoCartas[posicion++] = carta;

				legal = true;

			} else {

				System.out.println();
				System.out.println("\t\tTIRADA ILEGAL");

				// mismo palo, valor igual o inferior

				legal = false;

			}

		} else {

			System.out.println();
			System.out.println("\t\tTIRADA ILEGAL, COLUMNA LLENA");

			// la columna alcanzó su límite de 12 cartas

			legal = false;

		}

	}

	public boolean isLegal() {
		return legal;
	}

	public int getPaloCarta(String carta) {

		char ultimo;
		
/*		char ; //SI FUERA CON BARAJA ESPAÑOLA ME INTERESA EL PENÚLTIMO CARÁCTER QUE ES DIFERENTE PARA TODOS
 			  //COMO TENDRÉ QUE RETORNAR UN INT, TUVE QUE ELEGIR EL MÉTODO DE ABAJO
		
		penultimo = carta.charAt(carta.length() - 2);
		
		return Character.getNumericValue(penultimo);

		*/
		
		ultimo = carta.charAt(carta.length() - 1);

		return (int) ultimo; // retornamos el entero que será diferente para cada palo, sólo me interesa el
								// número final

	}

	public int getValorCarta(String carta) { // con esto obtenemos el valor de la carta

		int valor, i = 0;
		String numCarta = "";

		while (Character.isDigit(carta.charAt(i))) {

			numCarta += carta.charAt(i);

			i++;
		}
		
		//SI SE TUVIERA QUE HACER CON BARAJA ESPAÑOLA
		
/*		while (carta.charAt(i) != ' ') {
			
			numCarta += carta.charAt(i);
			
			i++;
		}*/
		

		valor = Integer.parseInt(numCarta);

		return valor;

	}

	public String getUltimaCarta() {

		String carta = " ";
		int i = 0;
		
		if (posicion != 0 && posicion < conjuntoCartas.length) {

			while (conjuntoCartas[i] != null) {

				i++;
			}

			carta = conjuntoCartas[i - 1];

		} else {
					
		//	carta = conjuntoCartas[conjuntoCartas.length-1];
			
			carta = "X";
			
		}
		
		return carta;

	}

	public String getConjuntoCartas() {

		String fila = "";

		for (int i = 0; i < conjuntoCartas.length; i++) {

			fila += conjuntoCartas[i] + " ";

		}

		return fila;
	}

	public int getPosicion() {
		return posicion;
	}

	
}
