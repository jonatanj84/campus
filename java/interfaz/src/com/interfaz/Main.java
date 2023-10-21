package com.interfaz;

public class Main {

    static CocheCRUD cocheCRUD;
    
    public static void main(String[] args) {

       CocheCRUD cocheCRUD = new CocheCRUDImpl();

       
        cocheCRUD.save();
        


       /*cocheCRUD.save(new CocheCRUD());
       cocheCRUD.findall();
       cocheCRUD.delete(cocheCRUD);*/


       /*Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl() */
       
    }

}
