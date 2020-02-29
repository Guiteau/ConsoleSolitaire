package solitario.baraja;

/**
 * 
 * @author Diego
 *
 */

public class Descarte extends Baraja {

	private int posicion;

	public Descarte() {

		this.posicion = 0;
		this.baraja = new String[48];

	}

	public void recibeCarta(String carta) {

		this.baraja[this.posicion] = carta;

		posicion++;

	}

	public String[] getBaraja() {

		posicion = 0;

		return baraja;

	}

/*	public String getCartaDeArriba() {

		String carta = "";

		if (posicion != 0) {

			carta = this.baraja[posicion];

		}

		return carta;

	}
*/
	public void setNuevoDescarte(int total) {

		baraja = new String[total]; // hacemos un nuevo array según la cantidad de cartas en el mazo

	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
