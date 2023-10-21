def areaDeTriangulo():
    altura = int(input("Ingresa la altura en cm: "))
    
    base = int(input("Ingresa la base cm: "))
 
    area = (base * altura) / 2
    print("El area del triangulo es: ", area, "cm")
    

areaDeTriangulo()



def areaCiculo():
    radio = int(input("Ingresa el radio en cm: "))
    π = 3.14

    areaC =   π * radio**2
    print("El area del circulo es: ", areaC, "cm")

areaCiculo()



