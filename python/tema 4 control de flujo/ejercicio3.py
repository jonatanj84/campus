listaNumeros = []
contador = 1

while contador <= 101:
    
    numero = contador
    listaNumeros.append(numero)
    contador+=1
    
for lista in listaNumeros:
    listaOrdenada = sorted(listaNumeros, reverse=True)
    print(listaOrdenada[lista])
