Algoritmo ejercicio
	Escribir 'Ingrese el numero de generacion: '
	Leer n
	Escribir 'cual es el tama�o inicial del terreno: '
	Leer supin
	Toca <- supin
	Para i<-1 Hasta n Hacer
		Escribir 'cuantos herederos hay en la generacion ', i, '?'
		Leer Hgen
		Toca <- Toca/Hgen
	FinPara
	Escribir 'El tama�o para el actual es de ', Toca
FinAlgoritmo
