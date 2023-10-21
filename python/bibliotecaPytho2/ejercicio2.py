
from ast import List
from functools import reduce


numero = [2, 5, 12, 20, 3, 14, 16, 19, 17, 6]

def numerosPares(x):
    if x % 2 == 0:
        return True

    return False

res = filter(numerosPares, numero)

print(list(res) )

res = filter(numerosPares, numero)

def suma(a, b):
    return a + b
resultado = reduce(suma, list(res))
print(resultado)


#def suma(a, b):
#    return a + b
#resulatado = reduce(suma, list(res))
#print(resulatado)








# En este segundo ejercicio, tenéis que crear una aplicación que obtendrá
# los elementos impares de una lista pasada por parámetro con filter y realizará 
# una suma de todos estos elementos obtenidos mediante reduce.