
paises =[input("ingresa el pais: ")]

contador = 0

while contador < len(paises):
    pais = input("ingresa el  pais o ingresa cero para terminar: ")
  
    contador =+ 1

    if  pais not in paises and pais != '0':
        paises.append(pais)
       
    elif pais  in paises:
        print("Este pais esta repetido ingresa otro")
    
    elif pais == '0':
        print(",".join(sorted(paises)))
        print("Fin")
        break
    




        



       
 


    


   






