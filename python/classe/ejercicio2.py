

class Alumno:
    nombre = ""
    nota = 0

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
        print("Nombre: ", nombre, "/ nota: ", nota)

    def aprobado(self):
        if self.nota < 5:
            print("reprobado")
        elif self.nota  >= 5:
            print("Aprobado")
        


a = Alumno("jose", 10)
print(a.aprobado())





        
   

    




        

