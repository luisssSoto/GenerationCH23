package hilos.lass.formathread;

public class Hilo2 implements Runnable {
	private String nombre;
	
	public Hilo2(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public void run() {
		System.out.println("Inicio del Thread o Hilo: " + this.getNombre());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("numero de veces: " + i + " " + this.getNombre());
			
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
