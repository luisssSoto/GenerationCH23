Algoritmo ejercicio1
	Definir n1, n2, n3 Como Entero
	Imprimir "Introduce the first number: "
	Leer n1
	Imprimir "Introduce the second number: "
	Leer n2
	Imprimir "Introduce the third number: "
	Leer n3
	N<-n1+n2+n3
	Dimension numDisorder(N)
	Dimension numOrder(N)
	Imprimir numDisorder[0]
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		numDisorder(i)<-i
		Escribir numDisorder(i)
		Imprimir numDisorder(i)
		Si numDisorder[i]>numDisorder[i+1]
			Entonces
			numOrder[i]<-n1
			Imprimir "This is the order greater to less: " + listnumOrder
		FinSi
	FinPara

	
FinAlgoritmo
