package solitario.tablero;

import solitario.baraja.Descarte;
import solitario.baraja.Mazo;
import solitario.columnas.Columna;
/**
 * 
 * @author Diego
 *
 */

public class Tablero {

	public String toString(Descarte d, Mazo m, Columna c1, Columna c2, Columna c3, Columna c4) {

		String tablero = "";
		
		tablero = "\n= = = = = = = = = = = = = = = = = =";

		tablero += "\n\n\t" + "[" + c1.getUltimaCarta() + "  " + c2.getUltimaCarta() + "  " + c3.getUltimaCarta() + "  "
				+ c4.getUltimaCarta() + "]\t" + m.getCartaDeArriba() + " [d]\n\n";

		tablero += "\n [1] Coge carta    [2] Descartar    [3] Abandonar";

		tablero += "\n\nCartas en el mazo: " + m.getCantidadCartas() + "\n" + "Cartas en el descarte: "
				+ d.getPosicion();

		tablero += "\n\n= = = = = = = = = = = = = = = = = =";
		
		return tablero;
	}

}
