package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Electrodomesticos;

public class Test_Consumo_Color {

	@Test
	public void test() {
		
		Electrodomesticos elec = new Electrodomesticos(150, "LILA", 'C', 18);
		
		char consumo=elec.getConsumoEnergetico();
		
		assertEquals('C', consumo);
		
		String color=elec.getColor();
		
		assertEquals("BLANCO", color);
	}

}
