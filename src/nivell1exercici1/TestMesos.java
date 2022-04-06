package nivell1exercici1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestMesos {
/*
	*Con el @test se facilita que lo reconozca con todos los métodos de prueba
	@Test
	public void test() {
		*si escribimos fail, automáticamente fallará
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void testMesos() {
		
		Mesos mesosAll = new Mesos();
		int resultado = mesosAll.getCount();
		int esperado = 12;
		assertEquals(esperado, resultado);
		
	}
	@Test
	public void testNull() {
		Mesos mesosAll = new Mesos();
		int resultado = mesosAll.getCount();
		
		assertNotNull(resultado);
		
	}	
	
	@Test
	public void testAgost() {
		
		Mesos mesosAll = new Mesos();
		String resultado = mesosAll.getMes().get(7);
		assertEquals("Agost", resultado);
		
	}
	

}
