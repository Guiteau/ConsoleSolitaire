package solitario.baraja;

/**
 * 
 * @author Diego
 *
 */

public class Baraja {

	protected String[] baraja;
	protected int cantidadCartas;

	public String[] generaBaraja() { // creamos la baraja

		// BARAJA FRANCESA

		this.baraja = new String[] { "1\u2665", "2\u2665", "3\u2665", "4\u2665", "5\u2665", "6\u2665", "7\u2665",
				"8\u2665", "9\u2665", "10\u2665", "11\u2665", "12\u2665", "1\u2666", "2\u2666", "3\u2666", "4\u2666",
				"5\u2666", "6\u2666", "7\u2666", "8\u2666", "9\u2666", "10\u2666", "11\u2666", "12\u2666", "1\u2663",
				"2\u2663", "3\u2663", "4\u2663", "5\u2663", "6\u2663", "7\u2663", "8\u2663", "9\u2663", "10\u2663",
				"11\u2663", "12\u2663", "1\u2660", "2\u2660", "3\u2660", "4\u2660", "5\u2660", "6\u2660", "7\u2660",
				"8\u2660", "9\u2660", "10\u2660", "11\u2660", "12\u2660" };

		// BARAJA ESPAÑOLA
		/*
		 * this.baraja = new String[] { "[1 ORO]", "[2 ORO]", "[3 ORO]", "4", "[5 ORO]",
		 * "[6 ORO]", "[7 ORO]", "[8 ORO]", "[9 ORO]", "[10 ORO]", "[11 ORO]",
		 * "[12 ORO]", "[1 COP]", "[2 COP]", "[3 COP]", "[4 COP]", "[5 COP]", "[6 COP]",
		 * "[7 COP]", "[8 COP]", "[9 COP]", "[10 COP]", "[11 COP]", "[12 COP]",
		 * "[1 BAS]", "[2 BAS]", "[3 BAS]", "[4 BAS]", "[5 BAS]", "[6 BAS]", "[7 BAS]",
		 * "[8 BAS]", "[9 BAS]", "[10 BAS]", "[11 BAS]", "[12 BAS]", "[1 ESP]",
		 * "[2 ESP]", "[3 ESP]", "[4 ESP]", "[5 ESP]", "[6 ESP]", "[7 ESP]", "[8 ESP]",
		 * "[9 ESP]", "[10 ESP]", "[11 ESP]", "[12 ESP]" };
		 */

		// BARAJAS DE PRUEBA

		/*
		 * this.baraja = new String[] { "1\u2665", "2\u2665", "3\u2665", "4\u2665",
		 * "5\u2665", "6\u2665", "7\u2665", "8\u2665", "9\u2665", "10\u2665",
		 * "11\u2665", "12\u2665" };
		 */
		
	/*	  this.baraja = new String[] { "1\u2665", "2\u2663", "3\u2660", "4\u2666",
		  "5\u2665", "1\u2665", "2\u2666", "3\u2663", "4\u2660", "5\u2663"}; */
		 
		cantidadCartas = baraja.length;

		return this.baraja;

	}

	public void barajar() { // aquí la barajamos

		String[] aux = new String[baraja.length];
		boolean completa = false;
		int huecos = 0, posicion, cont = 0;

		while (!completa) {

			posicion = (int) Math.floor(Math.random() * (baraja.length - 1 - 0 + 1) + (0));

			if (aux[posicion] == null) { // si hay hueco vacío, mete carta

				aux[posicion] = baraja[cont];

				cont++;
				huecos++;

			}

			if (huecos == baraja.length) { // si se han completado todos los huecos, salte

				completa = true;

			}

		}

		for (int i = 0; i < this.baraja.length; i++) {

			this.baraja[i] = aux[i];

		}

	}

	public String getCartaDeArriba() {

		String carta;

		if (baraja.length == 0) {

			carta = "";

		} else {

			carta = this.baraja[baraja.length - 1];

		}

		return carta;

	}

	public String[] getBaraja() {
		return baraja;
	}

	public void setBaraja(String[] baraja) { // lo usaremos cuando recibamos las cartas del descarte
		this.baraja = baraja;
	}

	public int getCantidadCartas() {
		return cantidadCartas;
	}

	public void setCantidadCartas(int cantidadCartas) {
		this.cantidadCartas = cantidadCartas;
	}

}
