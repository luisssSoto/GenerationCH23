package clases;

public class NuevoHola {
	
	private String nombre;
	public NuevoHola(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void saludo() {
		System.out.println("Hola desde Java con sts de nuez");	
	}
	public void saludoConNombre() {
		System.out.println("Hola tu eres : "+this.nombre);
		
	}
	
}