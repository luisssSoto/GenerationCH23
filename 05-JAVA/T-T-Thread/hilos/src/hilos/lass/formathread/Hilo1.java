package hilos.lass.formathread;

public class Hilo1 extends Thread{
	
	public Hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
	System.out.println("Se inicia el Thread o Hilo: " + this.getName());
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	System.out.println("Termina el Thread o Hilo: " + this.getName());
	}
}
