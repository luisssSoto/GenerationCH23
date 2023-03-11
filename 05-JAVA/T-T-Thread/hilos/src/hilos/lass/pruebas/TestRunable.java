package hilos.lass.pruebas;

import hilos.lass.formathread.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hilo2 hilo1 = new Hilo2("Pedro");
		Thread hilo1A = new Thread(hilo1);
		hilo1A.start();
		
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Mariano")).start();
	}

}
