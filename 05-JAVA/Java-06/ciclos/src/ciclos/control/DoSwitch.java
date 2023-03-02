package ciclos.control;

import java.util.Scanner;
import ciclos.forwhiledo.*;

public class DoSwitch {
	public void controlador() {
		Scanner s = new Scanner(System.in);
		Menus mp = new Menus();
		UsoWhile uw1 = new UsoWhile();
		UsoFor uf1 = new UsoFor();
		CicloDo cd1 = new CicloDo();
		int opcion = 0;
		do {
			mp.menuPrincipal();
			System.out.println("Introduca una opcion: ");
			opcion = s.nextInt();
			switch(opcion) {
			case 1:
				uw1.cicloW();
			break;
			case 2:
				uw1.banderaW();
			break;	
			case 3:
				uw1.centinelaW();
			break;
			case 4:
				uf1.cicloFor();
			break;
			case 5:
				uf1.letrasFor();
			break;
			case 6:
				cd1.digitosDo();
			break;
			case 7:
				uf1.letrasFor();
			break;
			}
			
		} while (opcion > 0 && opcion < 7);

	}
}
