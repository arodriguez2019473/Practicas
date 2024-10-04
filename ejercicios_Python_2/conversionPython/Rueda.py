class Rueda:

    tipo: str = None
    grosor: float = 0   
    diametro: float = 0
    marca: str = None

    def __init__(self, tipo: str , grosor: float, diametro: float, marca: str) :
        
        self.tipo = tipo
        self.grosor = grosor
        self.diametro = diametro
        self.marca = marca
    
    def setTipo (self,tipo:str):
        tipo = input("Ingresa el tipo de tu rueda:")
        self.tipo = tipo
    
    def setDiametro(self, diametro:float):
        diametro = float(input("Ingresa el diametro de la rueda:"))
        self.diametro = diametro

    def setGrosor (self, grosor:float):
        grosor: float = float(input("Ingresa el grosor de la rueda:"))
        self.grosor = grosor

    def setMarca(self,marca:str):
        marca = input("Ingresa la marca de la rueda:")
        self.marca = marca

    def settamanio (self, diametro: float, grosor:float):

        if diametro > 1.5 and grosor <= 0.4:
            print("La rueda es para un vehiculo grande")

        elif diametro<= 1.4 and diametro >= 0.8 and grosor <= 0.25:
            print("La rueda es para un vehiculo mediano")

        else:
            print("el grosor para la rueda es inferior al recomendado")


rueda = Rueda(None,0.00,0.00,None)
rueda.setTipo(rueda.tipo)
rueda.setDiametro(rueda.diametro)
rueda.setGrosor(rueda.grosor)
rueda.setMarca(rueda.marca)
rueda.settamanio(rueda.diametro, rueda.grosor)

