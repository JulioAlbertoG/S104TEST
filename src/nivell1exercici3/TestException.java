package nivell1exercici3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestException {
/*
 * @Test se usa para identificarla como prueba unitaria
 * @DisplayName("Cualquier nombre") se usa para que identifiquemos con una cadena a este método de testeo
 */
	@Test
	@DisplayName("Exception Test")
	void test() {
		
		Exception thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> 
		 {
	        ExceptionClass.Exception();
	  });	
		

	}
}
