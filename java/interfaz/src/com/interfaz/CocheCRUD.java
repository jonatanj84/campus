package com.interfaz;

import java.util.List;

public interface CocheCRUD {

   


    void save();

    List<Coche> findall();

    void delete(Coche coche);

}
