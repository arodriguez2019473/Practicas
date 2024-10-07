from Persona import *
from Taxi import *

class TaxiCond:
    
    def __init__(self,taxi: Taxi, persona: Persona) :
        self.vehiculo_taxi = taxi   
        self.conductorTaxi = persona

    def getDatos(self):

        print("matricula con ", self.vehiculo_taxi.matricula)
        print("el distrito es ", self.vehiculo_taxi.distrito)
        print("con un tipo de motor", self.vehiculo_taxi.tipoMotor)      


taxicond = TaxiCond

taxi = Taxi(None,None,None,0)
taxi.Taxi(taxi.ciudad,taxi.matricula,taxi.distrito,taxi.tipoMotor)

persona = Persona(None,None,0,False,0)

persona.setNombre(persona.nombre)
taxi.setmatricula(taxi.matricula)
taxi.setDistrito(taxi.distrito)
taxi.setTipoMotor(taxi.tipoMotor)

print("El nombre del dueño del taxi es:",persona.nombre)
print("La matricula de el taxi es:",taxi.matricula)
print("El distrito donde se encuentra es:",taxi.distrito)
print("El tipo de motor que tienen es:",taxi.tipoMotor)


