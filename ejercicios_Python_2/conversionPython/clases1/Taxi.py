class Taxi:

    ciudad: str = None
    matricula: str = None
    distrito: str = None
    tipoMotor: int = 0

    def __init__(self,ciudad:str,matricula:str,distrito:str,tipoMotor:int):
        self.ciudad = ciudad
        self.matricula = matricula
        self.distrito = distrito
        self.tipoMotor = tipoMotor

    def Taxi(self,ciudad:str, matricula: str, distrito:str, tipoMotor:int ):
        ciudad = "guatemala"
        self.ciudad = ciudad
        self.matricula = matricula
        self.distrito = distrito
        self.tipoMotor = tipoMotor

    def setmatricula(self, matricula: str):
        matricula = input("Ingresa la matricula:")
        self.matricula = matricula

    def setDistrito(self, distrito: str):
        distrito = input("Ingresa el distrito:")
        self.distrito = distrito

    def setTipoMotor(self, tipoMotor: int):

        print("Ingrese el numero 1 o 2")
        print("1) motor a disel")
        print("2) motor electrico")
        tipoMotor = int(input("Ingrese el motor:"))

        if tipoMotor == 1:
            tipoMotor: str = "motor a disel"
        elif tipoMotor == 2:
            tipoMotor: str = "motor electrico"
        else:
            print("debe elegir entre 1 y 2")

        self.tipoMotor = tipoMotor

    


# taxi = Taxi(None,None,None,0)
# taxi.Taxi(taxi.ciudad,taxi.matricula,taxi.distrito,taxi.tipoMotor)

# taxi.setmatricula(taxi.matricula)
# taxi.setDistrito(taxi.distrito)
# taxi.setTipoMotor(taxi.tipoMotor)

# print(taxi.matricula)
# print(taxi.distrito)
# print(taxi.tipoMotor)
