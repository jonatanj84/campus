import tkinter

from tkinter import Button, Variable, ttk
from turtle import window_height



window = tkinter.Tk()

seleccion = tkinter.StringVar()
e1 = ttk.Radiobutton(window, text='Real Madrid', value = '1', variable=seleccion)
e2 = ttk.Radiobutton(window, text='Etletico Madrid', value = '2', variable=seleccion)
e3 = ttk.Radiobutton(window, text='Barcelona', value = '3', variable=seleccion)
e4 = ttk.Radiobutton(window, text='PSG', value = '4', variable=seleccion)

#Con este paso se ejcuta la ventana
e1.grid(column = 0, row = 1, pady = 10, padx = 10)
e2.grid(column = 0, row = 2, pady = 10, padx = 10)
e3.grid(column = 0, row = 3, pady = 10, padx = 10)
e4.grid(column = 0, row = 4, pady = 10, padx = 10)

def borrar(event):
    seleccion.set(None)          # Reiniciamos el seleccionable
    e1.grid(column = 0, row = 1, pady = 10, padx = 10)
    e2.grid(column = 0, row = 2, pady = 10, padx = 10)
    e3.grid(column = 0, row = 3, pady = 10, padx = 10)
    e4.grid(column = 0, row = 4, pady = 10, padx = 10)
    print("borrar")

boton = tkinter.Button(window, text='Borrar', command= borrar)
boton.grid()
boton.bind('<Button-1>' , borrar)
window.mainloop()




#En este ejercicio tenéis que crear una lista de RadioButton que 
# muestre la opción que se ha seleccionado y que contenga un botón de
#  reinicio para que deje todo como al principio.

#Al principio no tiene que haber una opción seleccionada.