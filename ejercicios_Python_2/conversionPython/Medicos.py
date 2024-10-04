class Medicos:
    
    nombre: str = None
    apellidos: str = None
    edad: str = 0
    casado: bool = False
    numeroDocumentoIdentidad: int = 0
    especialidad: str = None

    def __init__(self, nombre: str, apellidos: str, edad: str, casado: str, dpi: str, especialidad: str):
        
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        self.casado = casado
        self.numeroDocumentoIdentidad = dpi
        self.especialidad = especialidad

    def calculoParaMultiplicar(self, edad1):
        edad1 = edad1 % 5
        edad1 = round(edad1)
        edad1 = 5-edad1
        print("el multiplo de 5 es" ,edad1)
    
    def setNombre(self, nombre):
        print("se cambia el nombre a", nombre)
        self.nombre = nombre

    def getNombre(self) -> str: # <------------------------------------ ten en cuenta que es un get osea que muestra el dato de este
        return print(self.nombre) 

    def setApellido(self, apellido):
        print("se cambia el apellido a", apellido)
        self.apellidos = apellido

    def setEdad(self, edad):
        print("se cambia la edad a", edad)
        self.edad = edad

    def setCasado(self, casado):
        print("se ha cambiado el estado de casado a", casado)
        self.casado = casado

    def setDPI(self,dpi):
        print("se ha cambiado el DPI", dpi)
        self.numeroDocumentoIdentidad = dpi

    def setEspecialidad(self, espe):
        print("se ha cambiado la especialidad",espe)
        self.especialidad = espe

medico = Medicos("pepe","gal",30,True,12123,"dormir")
medico.calculoParaMultiplicar(medico.edad)

parametro1: str = medico.getNombre()
print(medico.apellidos)