package solitario.baraja;

/**
 * 
 * @author Diego
 *
 */

public class Mazo extends Baraja {

	public Mazo() {

		super.generaBaraja();
		super.barajar();

	}
/*
	public void tiraCarta(boolean tiradaLegal) {

		String[] aux = new String[baraja.length];

		if (tiradaLegal == true) {

			for (int i = 0; i < baraja.length; i++) {

				aux[i] = baraja[i];

			}

			this.baraja = new String[aux.length - 1];

			for (int i = 0; i < baraja.length; i++) {

				baraja[i] = aux[i];

			}

		}

	}
*/
	public String descartaCarta() {

		String carta;
		String[] aux = new String[baraja.length];

		carta = getCartaDeArriba();

		if (baraja.length == 1) {

			carta = baraja[0];
			baraja = new String[1];
			
			setCantidadCartas(getCantidadCartas()-1);

		} else {

			for (int i = 0; i < baraja.length; i++) {

				aux[i] = baraja[i];

			}
			
			setCantidadCartas(getCantidadCartas()-1);

			this.baraja = new String[aux.length - 1]; // creamos una nueva baraja con una posición menos

			for (int i = 0; i < baraja.length; i++) {

				baraja[i] = aux[i]; // completamos la baraja nuevo

			}

		}

		return carta;

	}

	public String[] barajaMazo(String[] conjuntoCartas) {

		String[] mazo;
		int vacio = 0;

		for (int i = 0; i < conjuntoCartas.length; i++) {

			if (conjuntoCartas[i] == null) {

				vacio++;

			}

		}
		
		mazo = new String[conjuntoCartas.length - vacio];

		for (int i = 0; i < mazo.length; i++) {

			if (conjuntoCartas[i] != null) {

				mazo[i] = conjuntoCartas[i];

			}

		}

		setBaraja(mazo);
		setCantidadCartas(mazo.length);

		return getBaraja();

	}
/*
	public String toString() {
		
		String cadena = "";
		
		for (int i = 0; i < baraja.length; i++) {
			
			cadena += baraja[i]+" ";
		}
		
		return cadena;
	}
	*/
}
