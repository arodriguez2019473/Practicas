Algoritmo ajsajssj
	Definir E Como Entero
	Mientras E<>3 Hacer
		Escribir '====================='
		Escribir 'elija el numero'
		Escribir '1). 1+3+5+....+n'
		Escribir '2). 1*3*5*....*n'
		Escribir '3). salir'
		Leer E
		Si E=1 Entonces
			suma1()
		FinSi
		Si E=2 Entonces
			multiplicacion()
		FinSi
	FinMientras
FinAlgoritmo

Función suma1
	limit <- 0
	Mientras limit MOD 2=0 Hacer
		Escribir 'Ingrese el numero en el que finalice '
		Leer limit
		Si limit MOD 2=0 Entonces
			Escribir 'el dato es par'
		SiNo
			Crearsuma(limit)
		FinSi
	FinMientras
FinFunción

Función multiplicacion
	limit <- 0
	Mientras limit MOD 2=0 Hacer
		Escribir 'Ingrese el numero en el que finalice '
		Leer limit
		Si limit MOD 2=0 Entonces
			Escribir 'el dato es par'
		SiNo
			Crearsuma(limit)
		FinSi
	FinMientras
FinFunción

Función verificar(limit)
	Si limit MOD 2=0 Entonces
		Escribir 'el dato es par'=c
	FinSi
FinFunción

Función Crearsuma(limit)
	impare <- -1
	i <- 0
	Repetir
		i <- i+1
		impare <- impare+2
		valore <- impare
		Escribir valore
	Hasta Que valore>limit-2
	Escribir '----->'
	Leer l
	Limpiar Pantalla
FinFunción
