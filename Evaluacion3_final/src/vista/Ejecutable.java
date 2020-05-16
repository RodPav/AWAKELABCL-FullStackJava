package vista;

import controlador.Tablero;
import modelo.Carro;


public class Ejecutable {

	public static void main(String[] args) {
	
		Tablero tabla = new Tablero();
        //Carro prueba = new Carro(Carro.carros.kromis);
        
        tabla.crearTablero();
        tabla.insertarCarro();
        tabla.mostrarTablero();

	}

}
