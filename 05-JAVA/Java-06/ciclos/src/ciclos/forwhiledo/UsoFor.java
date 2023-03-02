package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i <= 10; i++) {
			int array_element = i;
			System.out.println(array_element);
		}
	}
	public void letrasFor() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("soy ---> " + i + ", ");
			char letra = (char)i;
			System.out.println("soy ---> " + letra + ", \n");
			}
	}

}
