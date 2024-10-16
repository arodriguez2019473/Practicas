Algoritmo ejercicio
	Escribir 'Introduce el precio'
	Leer a
	b <- a
	Para i<-1 Hasta 6 Hacer
		Escribir 'ingresa la inflacion del mes: ', i
		Leer c
		b <- b*(1+c/100)
	FinPara
	Escribir 'el presio deberia ser de: ', b
FinAlgoritmo
