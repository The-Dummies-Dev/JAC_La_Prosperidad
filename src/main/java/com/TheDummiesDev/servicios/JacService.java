package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Jac;

import java.util.ArrayList;
import java.util.List;

//Clase del servicio junta de acción comunal
public class JacService {
    Jac jac1;
    Jac jac2;
    List<Jac> listaJac;

    //constructor del servicio de la junta de acción comunal
    public JacService(){
        this.jac1 = new Jac("La Prosperidad","cl 3 # 3-27","727 6420","1134-5");
        this.jac2 = new Jac("La Paz","cl 34 # 12-45","7274523","12234-4");
        this.listaJac = new ArrayList<>();
        listaJac.add(jac1);
        listaJac.add(jac2);

    }

    //Metodo getter de la lista Jac (junta de accion comunal).
    public List<Jac> getListaJac() {
        return this.listaJac;
    }
    //Getter para consultar jac1
    public Jac getJac1(){
        return this.jac1;
    }

}
