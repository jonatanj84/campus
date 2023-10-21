f = open('archivo.txt', 'w')
f.write('usuario1\n')
f.write('usuario2\n')
f.write('usuario3\n')
f.close()

f = open('archivo.txt', 'r')
datos = f.read()
f.close()

print(datos)


f = open('archivo.txt', 'a')
nuevos_usuarios = 'usuario4 \n usuario5 \n usuario6'
f.write(nuevos_usuarios)
f.close()