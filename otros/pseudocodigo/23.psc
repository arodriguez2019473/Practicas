Algoritmo ejercicio
	Definir E Como Entero
	Definir Dato, Raiz01, Raiz02, Suce como Real
	
	Mientras E <> 2 Hacer
		Borrar Pantalla
		Escribir "elegir  1)calcular  2)salir"
		Leer E
		si E = 1 Entonces
			
			entradaDatos(Dato, Raiz01, Raiz02, Suce)
			
		FinSi
		
	FinMientras
		
FinAlgoritmo

Funcion entradaDatos(Dato, Raiz01, Raiz02, Suce)
		
	Mientras Dato <= 0 o Dato > 100 Hacer
		
	Escribir "Ingrese un numero entre 0 y 100"
	Leer Dato
	Dato = redon(Dato)
				
	FinMientras
	prosc(Dato, Raiz01, Raiz02, Suce)

FinFuncion

Funcion prosc(Dato, Raiz01, Raiz02, Suce)
	
	Definir num como entero
	num = Dato
	Raiz01 = raiz(num)
	Raiz02 = -Raiz01
	Suce = 0
	
	Mientras num >= 0 Hacer
		Suce = Suce + raiz(num)
		Escribir Suce
		num = num-1
		
	FinMientras
	
	resultado(Dato, Raiz01, Raiz02, Suce)
	
FinFuncion


Funcion resultado (Dato, Raiz01, Raiz02, Suce)
	
	Escribir "dato base = ",Dato
	Escribir "Raiz01 = ", Raiz01
	Escribir "Raiz02 = ", Raiz02
	Escribir "valor al sumar los terminos ", Suce
	Leer asadnasd
	
FinFuncion
