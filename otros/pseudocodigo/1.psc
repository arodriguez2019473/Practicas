Algoritmo ejercicio
	Para i<-1 Hasta 35 Hacer
		Leer nota
		Si nota>=5 Entonces
			aprobados <- aprobados+1
		SiNo
			suspenso <- suspenso+1
		FinSi
		Si nota=10 Entonces
			dieces <- dieces+1
		FinSi
		Si nota=0 Entonces
			ceros <- ceros+1
		FinSi
		Escribir '% de aprobados es: ', (aprobados/35)*100
		Escribir '% de suspendidos es: ', (suspenso/35)*100
		Escribir 'obtiene un total de dieces: ', dieces, ' alumnos'
		Escribir 'obtiene un total de 0: ', ceros, ' alumnos'
	FinPara
FinAlgoritmo
