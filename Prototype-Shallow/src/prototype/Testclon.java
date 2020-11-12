package prototype;

public class Testclon {
	public static void main(String[] args) {
		Clonefactory clonador = new Clonefactory();
		
		Sujeto carlos = new Sujeto();
		Sujeto cloncarlos = (Sujeto) clonador.getClone(carlos);
		System.out.println(carlos);
		System.out.println(cloncarlos);
	
	}
}
