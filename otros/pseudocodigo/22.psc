Algoritmo ejercicio
	Escribir 'se parecen o no'
	Mientras E<>3 Hacer
		Escribir '1) El primer algoritmo'
		Escribir '2) El segundo algoritmo'
		Escribir '3) Finalizar'
		Leer E
		Si E=1 Entonces
			primerAlgoritmo()
		FinSi
		Si E=2 Entonces
			segundoAlgoritmo()
		FinSi
	FinMientras
FinAlgoritmo

Función primerAlgoritmo
	i <- 1
	Leer dato
	Escribir 'numero de serie de palas cargadoras'
	Mientras dato<>78345 Hacer
		Escribir dato
		i <- i+1
		Leer dato
	FinMientras
	Escribir dato
	i <- i+1
	Leer dato
	Escribir 'numeros de serie de retroexcavadoras'
	Mientras dato<>33287 Hacer
		Escribir dato
		i <- i+1
		Leer dato
	FinMientras
	Escribir dato
	i <- i+1
	Leer dato
	Escribir 'numero de serie de dumpers'
	Mientras dato<>63287 Hacer
		Escribir dato
		i <- i+1
		Leer dato
	FinMientras
	Escribir dato
	Escribir 'finalizacion la extracion el total de maquinas es ', i
FinFunción

Función segundoAlgoritmo
	i <- 1
	Leer dato
	Escribir 'numero de serie de palas cargadoras'
	Mientras dato<>63287 Hacer
		Escribir dato
		Si dato=78345 Entonces
			Escribir 'numeros de serie retroexcavadoras'
		FinSi
		Si dato=33287 Entonces
			Escribir 'numeros de serie de dumpers'
		FinSi
		i <- i+1
		Leer dato
	FinMientras
	Escribir dato
	Escribir 'Finalizado la extraccion el total de maquinas es ', i
FinFunción
