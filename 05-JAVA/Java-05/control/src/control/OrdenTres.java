package control;

import java.util.Scanner;

public class OrdenTres {
	public void mayorAMenor() {
		// TODO Auto-generated method stub
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Dame el primer valor: ");
		int n1 = sn1.nextInt();
		System.out.println("Dame el segundo valor: ");
		int n2 = sn1.nextInt();
		System.out.println("Dame el tercer valor: ");
		int n3 = sn1.nextInt();
		
		int [] list1 = {};
		int num1 = 0;
		
		boolean cambios = true;
		while (cambios == true) {
			cambios = false;
			for (int i=0; i<list1.length; i++) {
				if (list1[i] > list1[i++]) {
					cambios = true;
					num1 = list1[i];
					list1[i] = list1[i++];
					list1[i++] = num1;
				if(list1[i] == list1[i++]) {
					System.out.println("Los elementos son iguales");
				}
				else {
					System.out.println("No hubo coincidencias");
				}
				}
			}
		}
		System.out.println(list1);
		
		
	}
}

