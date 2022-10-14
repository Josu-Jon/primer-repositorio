package prueba_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testElevar() {
		assertEquals(9, Calculadora.elevar(3, 2));
		assertEquals(1, Calculadora.elevar(1, 0));
		assertEquals(0, Calculadora.elevar(0, 2));
	}

}
