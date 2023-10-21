import sqlite3

#Se abre la base de datos seguida del fichero a utilizar
conn = sqlite3.connect('datos.db')
cursor = conn.cursor()

#Tengo un error en la linea 8 no consigo la forma de imprimir el resultado
rows = cursor.execute("SELECT * FROM Alumnos WHERE Nombre = 'Jonatan'")
for row in rows:
    print(row)
    


cursor.close()
#Se cierra la conexion
conn.close()


