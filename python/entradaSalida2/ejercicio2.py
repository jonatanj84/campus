
import pickle


class Veiculo():
    def __init__(self, marca, puertas, color):
        self.marca = marca
        self.puertas = puertas
        self.color = color

veiculo = Veiculo("Ford", 4 , "Rojo")
#con este metodo se guardan datos en un ficher se utiliza wb por que son datos binarios
f = open('datos.bin', 'wb')
pickle.dump(veiculo, f)
f.close()

#con este metodo recuperamos informacion del fichero
veiculo = open ('datos.bin', 'rb')
Ford = pickle.load(veiculo)
veiculo.close()

print(type(Ford))
print(Ford.color)






#En este segundo ejercicio, tendréis que crear un archivo py y 
# dentro crearéis una clase Vehículo, haréis un objeto de ella, 
# lo guardaréis en un archivo y luego lo cargamos.