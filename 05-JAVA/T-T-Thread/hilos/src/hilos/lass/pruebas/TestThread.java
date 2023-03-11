package hilos.lass.pruebas;

import hilos.lass.formathread.Hilo1;
import hilos.lass.formathread.Hilo2;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread hilo1 =  new Hilo1("Juan");
		System.out.println(hilo1.getState());
		hilo1.start();
		
		Thread hilo2 = new Hilo1("Maria");
		System.out.println(hilo2.getState());
		hilo2.start();
		
		Thread hilo3 = new Hilo1("Raul");
		System.out.println(hilo3.getState());
		hilo3.start();
		
		
		System.out.println(hilo1.getState());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(hilo1.getState());
	}
}
