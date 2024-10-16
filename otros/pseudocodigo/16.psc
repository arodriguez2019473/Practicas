Algoritmo a
	
	Dimension vec(5)
	vec(1)<-30
	vec(2)<-50
	vec(3)<-75
	vec(4)<-95
	vec(5)<-140
	i<- 1
	band <- Falso
	
	Escribir "Favor ingresar un valor: "
	Leer valor1
	
	Mientras band = Falso y i < 5 Hacer
		
		si vec(i) > valor1 Entonces
			
			Escribir "se debe insertar en la posicion: ",i
			band <- Verdadero
			
		FinSi
		i<-i+1
	FinMientras
	
	
FinAlgoritmo
