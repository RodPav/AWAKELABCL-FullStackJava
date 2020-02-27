package controlador;

import modelo.Carro;

public class Tablero {

	public static int FILA = 15, COL = 15;
	public static Casillas[][] TABLERO = new Casillas[FILA][COL];
	public Carro[] nCarros = new Carro[0];

	/*----Crear tabla----*/
	public void crearTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				TABLERO[i][j] = new Casillas();
			}
		}
	}

	// Colocar carro en el tablero.
	public void insertarCarro() {

		// insertar Kromis
		int contK = 0;
		while (contK < 3) {
			int posFila = (int) (Math.random() * 12);
			int posCol = (int) (Math.random() * 15);

			for (int i = posFila; i <= posFila + 2; i++) {

				Tablero.TABLERO[i][posCol].vacios = " K";
			}

			contK++;
		}

		// insertar Caguanos
		int contC = 0;
		while (contC < 4) {
			int posFila = (int) (Math.random() * 15);
			int posCol = (int) (Math.random() * 13);

			for (int j = posCol; j <= posCol + 1; j++) {

				Tablero.TABLERO[posFila][j].vacios = " C";

			}

			contC++;
		}

		// insertar Trupallas
		int contT = 0;
		while (contT < 10) {
			int posFila = (int) (Math.random() * Tablero.FILA);
			int posCol = (int) (Math.random() * Tablero.COL);

			for (int i = posFila; i <= 15; i++) {

				for (int j = posCol; j <= 15; j++) {

					Tablero.TABLERO[posFila][posCol].vacios = " T";

				}
			}
			contT++;
		}
	}

	public void mostrarTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(TABLERO[i][j].vacios + " ");
			}
			System.out.println();
		}
	}
}
