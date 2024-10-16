Algoritmo ejercicio
	
	Definir a,suma Como Real
	entradaDeDatos(a,suma)		
FinAlgoritmo

funcion entradaDeDatos(a,suma)
	
	Mientras a<= 0 o a> 100 Hacer
		
		Escribir "por favor introduzca un numero entero que sea entre 1 y 100"
		Leer a
		a = redon(a)
		Escribir "el dato base es " a
		
	FinMientras
	calcular(a,suma)
FinFuncion

Funcion calcular(a,suma)

	Definir i Como Entero
	
	Mientras a<>0 Hacer
		suma = suma+1/a
		a = a - 1
		i = i + 1
	Fin Mientras
	
	Escribir "contabilizado ",i," terminos"
	Escribir "el valor de la sumatoria es ", suma
	
FinFuncion