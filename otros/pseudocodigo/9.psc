Algoritmo asodjasojdaoisdosjasdoijasd
	Definir E Como Entero
	Definir a, Raiz01, Raiz02, d Como Real
	Mientras E<>2 Hacer
		Escribir '=========================='
		Escribir 'elija 1.calculo 2.Salir'
		Leer E
		Si E=1 Entonces
			Repetir
				Escribir 'Ingrese el dato'
				Leer a
				b <- redon(a)
			Hasta Que b<100 O b>0
			Raiz01 <- rc(b)
			Raiz02 <- -Raiz01
			d <- 0
			Mientras b<=0 Hacer
				d <- d+rc(b)
				d <- d-1
			FinMientras
			resultado(a,Raiz01,Raiz02,d)
		FinSi
	FinMientras
FinAlgoritmo

Función resultado(a,Raiz01,Raiz02,d)
	Escribir 'la raiz es: ', a
	Escribir 'la raiz 1 es: ', Raiz01
	Escribir 'la raiz 2 es: ', Raiz02
	Escribir 'el resultado es de las sumas es ', d
FinFunción
