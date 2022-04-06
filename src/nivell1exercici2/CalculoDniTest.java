package nivell1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {

	@ParameterizedTest
	@ValueSource(strings = {"47270627S", "12345678Z", "36420222K", "42502082Z", "85138740P", "95071309G", "92471314K", "87352505T", "25508326S", "27804535L" })
	void comprovacio(String dni) {
		
		int esperado = CalculoDni.calcularLletra(dni.substring(0, dni.length()-1));
		int real = dni.charAt(dni.length()-1);
		assertEquals(esperado, real);
	    
	}

}
