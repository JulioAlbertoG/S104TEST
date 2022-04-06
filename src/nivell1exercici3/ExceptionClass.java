package nivell1exercici3;

public class ExceptionClass {

	private static int [] arr = new int[] {1,2,3};
	
	public static void Exception() {
		
			System.out.println(arr[10]);
		
	}
	public static void getMessage() {
		System.err.println("Has sobrepassat  l'array");
	}
}
