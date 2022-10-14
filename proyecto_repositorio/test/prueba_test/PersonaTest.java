package prueba_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	private Persona per1;
	
	@Before
	public void setUp() {
		per1 = new Persona("Josu", "Lopez", 19);
	}
	
	@Test
	public void testGetPersona() {
		assertEquals("Josu",per1.getNombre());
	}
	
	@Test
	public void testGetEdad() {
		assertEquals(19,per1.getEdad());
	}

	@Test
	public void testGetApellido() {
		assertEquals("Lopez",per1.getApellido());
	}
	
	@Test
	public void testGetNombreCompleto() {
		assertEquals("Lopez, Josu",per1.getNombreCompleto());
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetnombreCompletoNull() {
		Persona per2 = new Persona("Josu", null, 19);
		assertEquals("Lopez, Josu",per2.getNombreCompleto());
	}
	
	@Test
	public void testEsMayorEdad() {
		assertTrue(per1.esMayorEdad());
	}
	
	@Test
	public void testEsMenorEdad() {
		Persona per2 = new Persona("Josu", "Lopez", 17);
		assertFalse(per2.esMayorEdad());
	}
}
