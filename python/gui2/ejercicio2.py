
from cProfile import label
from cgitb import text
from tkinter import Frame, Label, Listbox, Tk, ttk
import tkinter

ventana = Tk()

lista = Label(ventana, text= "Lenguajes de preogramacion ")
#label= tkinter.Label(ventana, text="Lenggajes de preogramacion")
lista.place(x=10, y=10)

lista2 = Listbox(ventana, height=10)
lista2.insert(0, "Python.")
lista2.insert(1, "C/C++" )
lista2.insert(2, "C#")
lista2.insert(3, "Kotlin")
lista2.insert(4, "Swift")
lista2.insert(5, "PHP")
lista2.insert(6, "Javascrept")

lista2.place(x=30, y= 30)

ventana.mainloop()


#En este segundo ejercicio, tendréis que crear una interfaz sencilla la 
# cual debe de contener una lista de elementos seleccionables, también 
# debe de tener un label con el texto que queráis.