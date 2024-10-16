Algoritmo ejercicio
	i <- 1
	a <- 0
	Para i<-1 Hasta 20 Hacer
		Escribir 'ingrese la capacidad del camion ', i
		Leer ca
		Mientras (b+c)<=ca Hacer
			Si c>0 Entonces
				Escribir 'Ingrese el numero'
				b <- b+c
			FinSi
			a <- a+1
			Escribir 'Ingrese el peso'
			Leer c
			Repetir
				Si i<20 Entonces
					Escribir 'no carga hasta despachar el camion: ', i, ' la carga del camion ', i+1
				FinSi
			Hasta Que i=20
		FinMientras
	FinPara
FinAlgoritmo
