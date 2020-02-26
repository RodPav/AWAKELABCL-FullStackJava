package controlador;

import java.util.Random;

import modelo.*;

public class Tablero {
	
	private Carro kromi= new Carro();

	private final Integer TAMANIO_KROMIS = 3;

	public char[][] Carro = new char[15][15];

	public void generarKromi() {
		Random r = new Random();

		int posFila = 0;

		int posCol = 0;

		posFila = (int) (Math.random() * 11 + 1);

		posCol = (int) (Math.random() * 14 + 1);

		System.out.println(posFila);
		System.out.println(posCol);

		for (int i = posFila; i <= posFila + 2; i++) {

			// for (int j = posCol; j < 15;) {

			Carro[posFila][posCol] = 'K';

			//System.out.print("-" + Carro[posFila][posCol] + "-\n");

			
	


		}
		mostrarTablero(Carro[posFila][posCol]);

	}

	public void mostrarTablero(char carro2) {

		for (int i = 0; i < 14; i++) {

			for (int j = 0; j < 14; j++) {
				
				System.out.print("[]");
	

			}
			System.out.println("");
		}

	}

}
