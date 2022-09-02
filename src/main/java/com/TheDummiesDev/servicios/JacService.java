package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Jac;

//Clase del servicio junta de acción comunal
public class JacService {
    Jac jac1;

    //constructor del servicio de la junta de acción comunal
    public JacService(){
        this.jac1 = new Jac("La Prosperidad","cl 3 # 3-27","727 6420","1134-5");


    }
    //metedo del servicio de la junta de accion comunal
    public Jac getJac1(){
        return this.jac1;
    }

}
