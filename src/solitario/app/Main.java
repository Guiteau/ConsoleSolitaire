package solitario.app;

import java.util.Scanner;

import solitario.baraja.Descarte;
import solitario.baraja.Mazo;
import solitario.columnas.Columna;
import solitario.tablero.Tablero;

/**
 * 
 * @author Diego
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcion = 0, columna, movimientos = 0, cantidadCartas = 0, cont = 0;
		boolean ningunMovimiento = false, descartado = false, repetir = true;
		String mensaje = "", respuesta;

		Mazo mazo = new Mazo();
		Descarte descarte = new Descarte();
		Columna c1 = new Columna();
		Columna c2 = new Columna();
		Columna c3 = new Columna();
		Columna c4 = new Columna();
		Tablero tablero = new Tablero();

		cantidadCartas = mazo.getCantidadCartas();
		
		System.out.println(" __                   _            \r\n" + 
				"(_  _ |o_|_ _.._o _  |_) _. _o _ _ \r\n" + 
				"__)(_)|| |_(_|| |(_) |_)(_|_>|(_(_)\r\n");

		while (repetir) {

			System.out.println(tablero.toString(descarte, mazo, c1, c2, c3, c4));

			respuesta = entrada.next();

			try {

				opcion = Integer.parseInt(respuesta);
				repetir = false;

				if (opcion > 3 | opcion < 1) {

					System.out.println("\n\t\tELIGE OTRA OPCIÓN");
					repetir = true;

				}

			} catch (NumberFormatException e) {

				System.out.println("\n\t\tELIGE OTRA OPCIÓN");

			}

		}

		while (opcion != 3 && !ningunMovimiento && !descartado) {

			if (opcion == 1) {

				System.out.println("Elige columna 1, 2, 3, 4");

				columna = entrada.nextInt();

				switch (columna) {

				case 1:

					c1.tirada(mazo.getCartaDeArriba());

					if (c1.isLegal()) {

						mazo.descartaCarta();

					}

					break;
				case 2:

					c2.tirada(mazo.getCartaDeArriba());

					if (c2.isLegal()) {

						mazo.descartaCarta();

					}

					break;
				case 3:

					c3.tirada(mazo.getCartaDeArriba());

					if (c3.isLegal()) {

						mazo.descartaCarta();

					}

					break;
				case 4:

					c4.tirada(mazo.getCartaDeArriba());

					if (c4.isLegal()) {

						mazo.descartaCarta();

					}

					break;
				default:

					System.out.println("\t\tNO EXISTE ESA COLUMNA");

					break;
				}

				if (mazo.getCantidadCartas() == 0) {

				//	descarte.recibeCarta(mazo.getCartaDeArriba());
					mazo.barajaMazo(descarte.getBaraja());
					cantidadCartas = mazo.getCantidadCartas();
					cont = 0;
					descarte.setNuevoDescarte(mazo.getCantidadCartas()); // aquí hacemos un nuevo array calculando la
																			// cantidad de cartas del mazo
				}

				movimientos++;

			} else if (opcion == 2) {

				cont++;

				if (cont == cantidadCartas) {

					ningunMovimiento = true;

				} else if (mazo.getCantidadCartas() > 1) {

					descarte.recibeCarta(mazo.getCartaDeArriba());
					mazo.descartaCarta();

					movimientos++;

				} else {

					descarte.recibeCarta(mazo.getCartaDeArriba());
					mazo.barajaMazo(descarte.getBaraja());
					cantidadCartas = mazo.getCantidadCartas();
					cont = 0;
					descarte.setNuevoDescarte(mazo.getCantidadCartas());

				}

			}

			if (mazo.getCantidadCartas() == 0 & descarte.getCantidadCartas() == 0) {

				descartado = true;

			}

			if (!ningunMovimiento && !descartado) { // si no se coloca, hay que meter dos veces el último
															// descarte para que
				// acabe la partida

				repetir = true;

				while (repetir) {

					System.out.println(tablero.toString(descarte, mazo, c1, c2, c3, c4));
					respuesta = entrada.next();

					try {

						opcion = Integer.parseInt(respuesta);
						repetir = false;

						if (opcion > 4 | opcion < 1) {

							System.out.println("\n\t\tELIGE OTRA OPCIÓN");
							repetir = true;

						}

					} catch (NumberFormatException e) {

						System.out.println("\n\t\tELIGE OTRA OPCIÓN");

					}

				}
			}

		}

		System.out.println("\nFIN DEL JUEGO");

		mensaje = (ningunMovimiento != true && descarte.getCantidadCartas() == 0 && mazo.getCantidadCartas() == 0)
				? "\nHAS GANADO"
				: "\nINTÉNTALO DE NUEVO";

		System.out.println(mensaje);
		System.out.println("\nCantidad de movimientos: " + movimientos);

		entrada.close();

	}

}
