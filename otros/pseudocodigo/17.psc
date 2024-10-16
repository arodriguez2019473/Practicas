Algoritmo EJERCICIO

//	datos2 <- receptor2
//	Dimension lista1[datos2]
//	
//	datos3 <- receptor3
//	Dimension lista1[datos3]
//	
	Definir a como entero
	definir b Como Entero
	definir c Como Entero
	
	Mientras E <> 4
		
		Escribir "ingrese datos en cualquiera de las 3 tablas"
		Escribir "1) tabla1"
		Escribir "2) tabla2"
		Escribir "3) tabla3"
		Leer a
		
		
		si E = 1 Entonces
			
			datos1 <- receptor1
			Dimension lista1[datos1]
			
			
			Escribir "cuantos datos deseeas en la tabla"
			Leer receptor1
			
			Para i<-1 Hasta datos1 Con Paso 1 Hacer
				Escribir "Ingrese un numero para la posición ",i 
				Leer lista1[i]
			FinPara
			
			
		FinSi
		
		
	FinMientras
	
	
FinAlgoritmo

SubProceso tablas
	
	
	
FinSubProceso
