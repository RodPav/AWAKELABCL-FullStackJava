package agenda;

import java.util.ArrayList;
import java.util.List;

import main.Ejecutable;

public class OperacionesContacto implements IContacto {

	public Contacto[] listaContactos = new Contacto[15];

	@Override
	public int buscaContacto(OperacionesContacto contactoBuscado) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean agregarContacto(Contacto nuevoContacto) {

		boolean agregado = false;
		for (int i = 0; i < listaContactos.length; i++) {
			if (listaContactos[i] == null) {
				if (existeContactoAgregar(nuevoContacto)) {
					agregado = false;

				} else {
					listaContactos[i] = nuevoContacto;
					//System.out.println("Agregado " + listaContactos[i].toString());
					agregado = true;

				}
			}

		}
		// Ejecutable.menu();
		return agregado;

	}

	@Override
	public boolean eliminarContacto(Contacto contacto) {

		for (int i = 0; i < listaContactos.length; i++) {
			if (listaContactos[i].getNombre().equals(contacto.getNombre())) {
				listaContactos[i] = null;
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean comparaContactos(OperacionesContacto contactoA, OperacionesContacto contactoB) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeContactoAgregar(Contacto nuevoContacto) {

		for (int i = 0; i < listaContactos.length; i++) {
			if (listaContactos[i]==nuevoContacto) {
				return true;
			}
		}

		return false;
	}
	
	public boolean existeContacto(Contacto nuevoContacto) {

		// Contacto contacto = new Contacto();
		for (int i = 0; i < listaContactos.length; i++) {
			if (listaContactos[i].getNombre().equals(nuevoContacto.getNombre())) {
				System.out.println("Contacto encontrado: "+listaContactos[i]);
				return true;
			}
		}

		return false;
	}

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	@Override
	public void listarContactos() {
		System.out.println("Lista de Contactos: ");
		for (int i = 0; i < listaContactos.length; i++) {
			if (listaContactos[i] != null) {
				System.out.println(listaContactos[i].toString());
			} else {
				System.out.println("[vacio]");
			}
		}
		// Ejecutable.menu();

	}

}
