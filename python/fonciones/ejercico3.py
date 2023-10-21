
import calendar

def esBifiesto():
  year = int(input("Introduce un año y vamos a ver si es bisiesto... "))

  if(year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)):
      print("¡El año es bisiesto!")
  else:
      print("El año no es bisiesto!")

print(esBifiesto())




