Algoritmo sin_titulo
	Definir b Como Entero
	Definir a Como Entero
	Mientras E<>2 Hacer
		Limpiar Pantalla
		Escribir '1.Agregar Datos'
		Escribir '2.salir'
		Leer E
		Si E=1 Entonces
			agregar(a,b)
		FinSi
	FinMientras
FinAlgoritmo

Función agregar(a,b)
	Limpiar Pantalla
	Escribir 'Ingrese cuantos datos desea agregar'
	Leer datos
	Dimensionar lista(datos)
	Para b<-1 Hasta datos Con Paso 1 Hacer
		Escribir 'escriba el dato'
		Leer lista[b]
	FinPara
	Limpiar Pantalla
	Escribir '=========================='
	Para b<-1 Hasta datos Con Paso 1 Hacer
		Escribir 'el dato en la posicion ', b, ' es ', lista[b]
	FinPara
	Escribir 'Deseeas eliminar un dato'
	Escribir '1.si'
	Escribir '2.no'
	Leer as
	Si as=1 Entonces
		Escribir 'que dato deseas eliminar'
		Leer elimm
		Si elimm=datos Entonces
			Escribir 'El elemento fue eliminado presiona enter para finalizar'
			Leer asda
		FinSi
	FinSi
FinFunción
