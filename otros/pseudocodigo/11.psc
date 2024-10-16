Algoritmo ejercicio
	Escribir 'Ingrese el numero de generacion: '
	Leer n
	Escribir 'cual es el tamaño inicial del terreno: '
	Leer supin
	Toca <- supin
	Para i<-1 Hasta n Hacer
		Escribir 'cuantos herederos hay en la generacion ', i, '?'
		Leer Hgen
		Toca <- Toca/Hgen
	FinPara
	Escribir 'El tamaño para el actual es de ', Toca
FinAlgoritmo
