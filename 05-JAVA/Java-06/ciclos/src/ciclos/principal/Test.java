package ciclos.principal;
import ciclos.forwhiledo.UsoWhile;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.CicloDo;
import ciclos.control.DoSwitch;
public class Test {

	public static void main(String[] args) {
		//Exercise 1
		UsoWhile while1 = new UsoWhile();
		while1.cicloW();
		
		//Exercise 2
		UsoWhile while2 = new UsoWhile();
		while2.centinelaW();
		
		//Exercise 3
		UsoWhile bandera3 = new UsoWhile();
		bandera3.banderaW();
		
		//Exercise 4
		UsoFor for1 = new UsoFor();
		for1.cicloFor();
		
		//Exercise 5
		UsoFor for2 = new UsoFor();
		for2.letrasFor();
		
		//Exercise 6
		CicloDo doWhile1 = new CicloDo();
		doWhile1.digitosDo();
		
		//Exercise 7
		DoSwitch switch1 = new DoSwitch();
		switch1.controlador();
	}
}

