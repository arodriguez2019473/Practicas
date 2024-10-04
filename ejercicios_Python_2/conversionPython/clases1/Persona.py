class Persona:

    nombre: str = None
    apellidos: str = None
    edad: int = 0
    casado: bool = False
    DPI: int = 0

    def __init__(self, nombre:str, apellidos: str, edad: int, casado: bool, DPI: int):
        
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        self.casado = casado
        self.DPI = DPI

    def setNombre(self,nombre:str):
        nombre = input("Ingresa el nuevo nombre:")
        self.nombre = nombre
    
persona = Persona(None,None,0,False,0)
persona.setNombre(persona.nombre)
print(persona.nombre)