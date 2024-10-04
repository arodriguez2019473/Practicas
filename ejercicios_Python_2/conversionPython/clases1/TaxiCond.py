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


taxicond = TaxiCond()
