import time

tiempo = time.strftime('%H', time.localtime())
minutos = time.strftime('%M')
horaDeSalida = 17 - int(tiempo)
horaSalidaMinutos = 59 - int(minutos)



def hora():
   
    print("Son las: ", tiempo,":", minutos)
    print("faltan ", horaDeSalida,":", horaSalidaMinutos, "para salir")
   

    
    if int(tiempo) == 18: 
        print("Es Hora de ir a casa")

    elif int(tiempo) == 19:
        print("Son mas de las 7")

    else:
        print("chao")

        return hora





    


