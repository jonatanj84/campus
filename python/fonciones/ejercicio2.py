from re import I


def numerosPrimos():
    numero = int (input("ingresa tu valor: "))
    if numero > 1:
        contador = 0

        for i in range(2, numero):

            resto = numero % i

            if resto == 0:
                contador+=1
        
        if contador == 0:
            print("Es primo")

        else:
             print("No es primo")

numerosPrimos()