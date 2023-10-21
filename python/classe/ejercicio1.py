class Veiculo():
    color= "rojo"
    ruedas = 4
    puertas = 4


class Coche(Veiculo):
    velocidad = 0
    cilindrada = 0


Veiculo = Veiculo()


coche = Coche()
print("color: ",Coche.color)
print("Numero de ruedas: ", Coche.ruedas)
print("Numero de puertas: ",Coche.puertas) 
print("velocidad: ", Coche.velocidad)
print("velocidad: ", Coche.cilindrada)
