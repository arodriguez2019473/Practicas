Algoritmo ejercicio
	Escribir 'Ingrese el dia y el mes'
	Escribir 'Ingrese el dia'
	Leer dia
	Escribir 'Ingrese el mes'
	Leer mes
	
	Si dia>=1 Y dia<=31 Y mes>=1 Y mes<=12 Entonces
		Seg�n mes Hacer
			, 1:
				DDA <- dia
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 2:
				DDA <- dia+31
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 3:
				DDA <- dia+59
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 4:
				DDA <- dia+90
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 5:
				DDA <- dia+120
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 6:
				DDA <- dia+151
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 7:
				DDA <- dia+181
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 8:
				DDA <- dia+212
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 9:
				DDA <- dia+243
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 10:
				DDA <- dia+273
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 11:
				DDA <- dia+304
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			, 12:
				DDA <- dia+334
				Escribir 'el ', dia, ' ,del ', mes, ' ,es el dia ', DDA, ' del a�o'
			De Otro Modo:
				Escribir 'el dato es incorrecto'
		FinSeg�n
	SiNo
		Escribir 'los datos no son correctos'
	FinSi
FinAlgoritmo
