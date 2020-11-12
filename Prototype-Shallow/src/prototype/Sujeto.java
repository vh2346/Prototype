package prototype;
//Aplicación clone()
public class Sujeto implements Persona {
	public Sujeto() {
		System.out.println("el sujeto se llama carlos");
	}
	public Persona clonar() {
		System.out.println("se esta clonando al sujeto");
		Sujeto sujeto1 = null;
		try {
			sujeto1 = (Sujeto) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return sujeto1;
	}

}

