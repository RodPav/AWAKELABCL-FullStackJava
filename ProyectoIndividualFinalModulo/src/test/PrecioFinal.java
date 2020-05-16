package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Electrodomesticos;

public class PrecioFinal {

	@Test
	public void test() {

		Electrodomesticos elec = new Electrodomesticos(300, "AZUL", 'B', 25);

		int precioFinal = elec.precioFinal();

		assertEquals(430, precioFinal);
	}

}
