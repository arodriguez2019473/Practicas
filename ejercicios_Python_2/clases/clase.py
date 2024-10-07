class claseA:

    color: str = ''
    tamanio: int = 0
    habitaciones: int = 0

    def __init__(self, colorValue, tamanioValue, habitacionesValue):
        self.color = colorValue
        self.tamanio = tamanioValue
        self.habitaciones = habitacionesValue

    def abrir_puerta(self):
        print("La puerta se ha abierto")
    
    def encender_luces(self):
        print("las luces encendidas")
    
    def pintar(self, nuevo_color):

        self.color = nuevo_color
        print(f"la casa ahora es {nuevo_color}")

mi_casa = claseA("roja", "grande", 3)  # crear una casa roja, grande y con 3 habitaciones
print(mi_casa.color)  # imprime "roja"
mi_casa.abrir_puerta()  # imprime "La puerta se ha abierto"
mi_casa.pintar("azul")  # Cambia el color de la casa a " azul "