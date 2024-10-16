Algoritmo ejercicio
	a <- 33
	b <- 66
	c <- 99
	d <- 30
	Definir E Como Entero
	Escribir 'bienvenidos que desea realizar'
	Mientras dato1<>3 Hacer
		Limpiar Pantalla
		Escribir '1)Presio por ISBN'
		Escribir '2)Presio por lote'
		Escribir '3)Salir'
		Leer dato1
		Si dato1=1 Entonces
			ISBN(a,b,c,d)
		FinSi
		Si dato1=2 Entonces
			porLote()
		FinSi
	FinMientras
FinAlgoritmo

Función ISBN(a,b,c,d)
	guardar <- 0
	Escribir 'Estas en compras por unidad'
	Mientras E<>5 Hacer
		Limpiar Pantalla
		Escribir '1) libros de menos de un año de antiguedad'
		Escribir '2) Libros de un año a tres años de antiguedad'
		Escribir '3) Libros de mas de tres años de antiguedad'
		Escribir '4) Ver libros'
		Escribir '5) salir'
		Leer E
		Si E=1 Entonces
			Limpiar Pantalla
			Escribir 'el presio de cada libro es de : 30.00 Euros'
			Escribir 'deseas adquirir uno de estos libros'
			Escribir '1)si  2)no'
			Leer monto1
			Si monto1=1 Entonces
				guardar <- guardar+30
			FinSi
		SiNo
			Escribir 'se ha cancelado'
		FinSi
		Si E=2 Entonces
			Limpiar Pantalla
			Escribir 'el presio de cada libro es de : 100.00 Euros'
			Escribir 'deseas adquirir uno de estos libros'
			Escribir '1)si  2)no'
			Leer monto1
			Si monto1=1 Entonces
				guardar <- guardar+100
			FinSi
		SiNo
			Escribir 'se ha cancelado'
		FinSi
		Si E=3 Entonces
			Limpiar Pantalla
			Escribir 'el presio de cada libro es de : 300.00 Euros'
			Escribir 'deseas adquirir uno de estos libros'
			Escribir '1)si  2)no'
			Leer monto1
			Si monto1=1 Entonces
				guardar <- guardar+300
			FinSi
		SiNo
			Escribir 'se ha cancelado'
		FinSi
		Si E=4 Entonces
			Limpiar Pantalla
			Escribir 'la cantidad a deber por los libros son'
			Escribir guardar, '.00 Euros'
			Leer datosadas
		FinSi
	FinMientras
FinFunción

Función porLote
	Definir E Como Entero
	a1 <- 30
	a2 <- 100
	a3 <- 300
	guardar <- 0
	Escribir 'Estas en compras por lote'
	Mientras E<>5 Hacer
		Limpiar Pantalla
		Escribir '1) Lote de libros por menos de un año'
		Escribir '2) Lote de libros por un año a 3 años de antiguedad'
		Escribir '3) Lote de libros de 3 años en adelante'
		Escribir '4) Ver cantidad de lotes'
		Escribir '5) Salir'
		Leer E
		Si E=1 Entonces
			Limpiar Pantalla
			Escribir 'El presio por adquirir uno de este lote es de 3,000 Euros'
			Escribir 'Desea adquirir este lote'
			Escribir '1)si  2)no'
			Leer as
			Si as=1 Entonces
				guardar <- guardar+3000
			FinSi
		SiNo
			Escribir 'no se ha deseado adquirir el lote'
		FinSi
		Si E=2 Entonces
			Limpiar Pantalla
			Escribir 'El presio por adquirir uno de este lote es de 10,000 Euros'
			Escribir 'Desea adquirir este lote'
			Escribir '1)si  2)no'
			Leer as
			Si as=1 Entonces
				guardar <- guardar+10000
			FinSi
		SiNo
			Escribir 'no se ha deseado adquirir el lote'
		FinSi
		Si E=3 Entonces
			Limpiar Pantalla
			Escribir 'el presio por adquirir uno de estos lotes es de 45,000'
			Escribir 'Desea adquiri uno de estos lotes'
			Escribir '1)si  2)no'
			Leer as
			Si as=1 Entonces
				guardar <- guardar+45000
			FinSi
		FinSi
		Si E=4 Entonces
			Limpiar Pantalla
			Escribir 'la cantidad que es por la compra por lote es de '
			Escribir guardar, '.00 Euros'
			Leer datosadas
		FinSi
	FinMientras
FinFunción
