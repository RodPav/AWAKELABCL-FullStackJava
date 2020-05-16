package main;

import java.util.Scanner;

import agenda.Contacto;
import agenda.OperacionesContacto;

public class Ejecutable {

	public static void main(String[] args) {

		menu();

	}

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	public static void menu() {

		int opcion = 0;
		OperacionesContacto ope = new OperacionesContacto();
		
		do {

			
			Contacto nuevoContacto;
			Contacto deleteContacto=new Contacto();
			Contacto contactoExiste =new Contacto();
			
			String nombre = "";
			String telefono = "";
			Scanner scan = new Scanner(System.in);

			escribir("-----MENU AGENDA------");
			escribir("1: Agregar Contacto");
			escribir("2: Existe Contacto");
			escribir("3. Lista Contacto");
			escribir("4. Buscar Contacto");
			escribir("5. Elimina Contacto");
			escribir("6. Agenda Llena");
			escribir("7. Espacio Libre");
			escribir("8. Salir");

			escribir("Ingrese opción: ");

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				escribir("Ingrese Nombre: ");
				nombre = scan.next();
				escribir("Ingresa Numero de Telefono: ");
				telefono = scan.next();

				nuevoContacto = new Contacto(nombre, telefono);
				// contactoAgregado= new Contacto();
				boolean agregado = false;
				agregado = ope.agregarContacto(nuevoContacto);
				if (agregado = true) {
					escribir("Contacto agregado exitosamente en la agenda");
				}
				if (agregado = false) {
					escribir("Contacto ya existe en la agenda");
				}

			case 2:
				escribir("Ingrese nombre de contacto: ");
				nombre = scan.next();
				contactoExiste.setNombre(nombre);
				boolean encontrado=false;
				encontrado=ope.existeContacto(contactoExiste);
				if (encontrado==true) {
					System.out.println("Contacto encontrado");
				}else {
					System.out.println("No se encontró");
				}
				
				
				break;

			case 3:
				ope.listarContactos();
				break;

			case 4:
				// Buscar contacto
				break;

			case 5:
				escribir("Ingrese el nombre del contacto que desea eliminar: ");
				nombre = scan.next();
				deleteContacto.setNombre(nombre);
				boolean eliminado=false;
				eliminado=ope.eliminarContacto(deleteContacto);
				if (eliminado==true) {
					System.out.println("Contacto eliminado");
				}else {
					System.out.println("No se encontró");
				}
				
				break;

			case 6:
				// Agenda
				break;

			case 7:
				// espacioLibre
				break;

			case 8:
				// Salir

				break;

			}

		} while (opcion < 8);

	}

}
