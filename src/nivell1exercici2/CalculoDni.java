package nivell1exercici2;

public class CalculoDni {
	
	public static char calcularLletra(String dni) {
		 String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		 int numDni = Integer.parseInt(dni);
		 int resto = numDni%23;
         return caracteres.charAt(resto);
		
		
	}

}
