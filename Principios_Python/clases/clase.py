class claseA:

    def __init__(self, color, tamaño, habitaciones):
        
        self.color = color
        self.tamaño = tamaño
        self.habitaciones = habitaciones

    def abrir_puerta(self):
        print("La puerta se ha abierto")
    
    def encender_luces(self):
        print("las luces encendidas")
    
    def pintar(self, nuevo_color):

        self.color = nuevo_color
        print(f"la casa ahora es {nuevo_color}")

mi_casa = claseA("roja", "grande", 3)  # Crear una casa roja, grande y con 3 habitaciones
print(mi_casa.color)  # Imprime: roja
mi_casa.abrir_puerta()  # Imprime: ¡La puerta se ha abierto!
mi_casa.pintar("azul")  # Cambia el color de la casa a azul
