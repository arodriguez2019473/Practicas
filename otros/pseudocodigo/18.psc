Algoritmo ejemplo
	
	Limpiar Pantalla
	
	escribir ""
	escribir "captura de n�meros .."
	escribir ""
	
	definir cantNumeros como entero
	escribir "cu�ntos n�meros quieres capturar ?" sin saltar
	leer cantNumeros
	
	escribir ""
	
	definir M como entero
	dimension vNumero[cantNumeros] 
	escribir ""
	escribir "captura de n�meros  ... "
	escribir""
	escribir "presione  para continuar ..."
	esperar tecla 
	
	escribir ""
	Para M<-1 hasta cantNumeros con paso 1 Hacer
		escribir "cu�l es el elemento en la posici�n ",M,"  ? " Sin Saltar
		leer vNumero[M]
	FinPara
	
	escribir ""
	escribir "los n�meros capturados son ... "
	escribir""
	escribir "presione  para continuar ..."
	esperar tecla 
	
	
	escribir ""
	Para M<-1 hasta cantNumeros con paso 1 Hacer
		escribir "el elemento en la posici�n ",M,"  es ",vNumero[M]
	FinPara
	
	
	escribir ""
	escribir "presione  para continuar ..."
	esperar tecla 
	limpiar pantalla
	
FinAlgoritmo


  