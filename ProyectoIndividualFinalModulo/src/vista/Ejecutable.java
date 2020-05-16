package vista;

import java.util.ArrayList;

import modelo.Electrodomesticos;
import modelo.Lavadora;
import modelo.Television;

/**
 * 
 * 
 * @author rpavez
 *
 */
public class Ejecutable {
	/**
	 * Clase principal en donde se crea el Array que almacena 10 objetos de Electrodomesticos
	 * e imprime los precios finales de todos
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<Electrodomesticos>();

		electrodomesticos.add(new Electrodomesticos(300, "rojo", 'B', 25));
		electrodomesticos.add(new Television());
		electrodomesticos.add(new Lavadora(1000, "negro", 'C', 300, 10));
		electrodomesticos.add(new Television(500, "lila", 'E', 70, 32, true));
		electrodomesticos.add(new Television(200, "azul", 'X', 15, 50, false));
		electrodomesticos.add(new Electrodomesticos());
		electrodomesticos.add(new Lavadora());
		electrodomesticos.add(new Television(400, 90));
		electrodomesticos.add(new Electrodomesticos(450, 20));
		electrodomesticos.add(new Lavadora(100, 15));

		int totalElectrodomesticos = 0;
		int totalTV = 0;
		int totalLava = 0;
		int totalElec=0;

		for (Electrodomesticos electrodomestico : electrodomesticos) {

			if (electrodomestico instanceof Television) {

				totalTV = totalTV + electrodomestico.precioFinal();

			}else if (electrodomestico instanceof Lavadora) {

				totalLava = totalLava + electrodomestico.precioFinal();

			}else{
				
				totalElec = totalElec + electrodomestico.precioFinal();
			}

			totalElectrodomesticos = totalElectrodomesticos + electrodomestico.precioFinal();

		}
		System.out.println("Precio final Electrodomestico: " + totalElec);
		System.out.println("Precio final Lavadora: " + totalLava);
		System.out.println("Precio final TV: " + totalTV);
		System.out.println("Total final Electrodomesticos: " + totalElectrodomesticos);

	}
}
