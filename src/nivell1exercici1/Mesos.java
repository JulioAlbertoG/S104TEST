package nivell1exercici1;

import java.util.ArrayList;

public class Mesos {

	private static ArrayList<String> llistaMesos;
	
	public Mesos() {
		omplir();
	}
	
	public int getCount() {
		return llistaMesos.size();
	}
	
	public ArrayList<String> getMes() {
		
		
		return llistaMesos;
	}
	
	
	private static void omplir() {
		llistaMesos = new ArrayList<String>();
		
		llistaMesos.add("Gener");
		llistaMesos.add("Febrer");
		llistaMesos.add("Març");
		llistaMesos.add("Abril");
		llistaMesos.add("Maig");
		llistaMesos.add("Juny");
		llistaMesos.add("Juliol");
		llistaMesos.add("Agost");
		llistaMesos.add("Setembre");
		llistaMesos.add("Octubre");
		llistaMesos.add("Novembre");
		llistaMesos.add("Desembre");
	}
}
