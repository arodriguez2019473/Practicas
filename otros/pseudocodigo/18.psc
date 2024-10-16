Algoritmo ejemplo
	
	Limpiar Pantalla
	
	escribir ""
	escribir "captura de números .."
	escribir ""
	
	definir cantNumeros como entero
	escribir "cuántos números quieres capturar ?" sin saltar
	leer cantNumeros
	
	escribir ""
	
	definir M como entero
	dimension vNumero[cantNumeros] 
	escribir ""
	escribir "captura de números  ... "
	escribir""
	escribir "presione  para continuar ..."
	esperar tecla 
	
	escribir ""
	Para M<-1 hasta cantNumeros con paso 1 Hacer
		escribir "cuál es el elemento en la posición ",M,"  ? " Sin Saltar
		leer vNumero[M]
	FinPara
	
	escribir ""
	escribir "los números capturados son ... "
	escribir""
	escribir "presione  para continuar ..."
	esperar tecla 
	
	
	escribir ""
	Para M<-1 hasta cantNumeros con paso 1 Hacer
		escribir "el elemento en la posición ",M,"  es ",vNumero[M]
	FinPara
	
	
	escribir ""
	escribir "presione  para continuar ..."
	esperar tecla 
	limpiar pantalla
	
FinAlgoritmo


  