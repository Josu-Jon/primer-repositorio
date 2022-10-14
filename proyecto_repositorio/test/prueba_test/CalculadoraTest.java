package prueba_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		assertEquals(9, Calculadora.elevar(3, 2));
	}

}
