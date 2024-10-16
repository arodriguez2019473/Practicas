Algoritmo ejercicio
	
	Escribir "Introduzca los datos"	
	Escribir "a = ";Leer a
	Escribir "b = ";Leer b
	Escribir "c = ";Leer c
	
	d = b ^ 2 - 4 * a * c ; e = 2 * a
	
	si d = 0 Entonces
		
		Escribir "x1 = x2 ",-b/e
		
	SiNo
		si d > 0 Entonces
			Escribir "x1 = ",(-b+raiz(d))/e
			Escribir "x2 = ",(-b-raiz(d))/e
			
		SiNo
			Escribir "x1 = ", -b/ e, "+", raiz(- d) /e,"i"
			
			escribir "x2 =", - b / e, "-", raiz(- d) / e, "i"
			
		FinSi
		
		
	FinSi
	
	
	
FinAlgoritmo
