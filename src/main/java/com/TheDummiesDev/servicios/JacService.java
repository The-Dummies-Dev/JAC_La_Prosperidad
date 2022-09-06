package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.repositorios.JacRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Clase del servicio junta de acción comunal
@Service
public class JacService {
    private JacRepository repository;

    //constructor del servicio de la junta de acción comunal
    public JacService(JacRepository repository) {
        this.repository = repository;

    }

    //Metodo getter de la lista Jac (junta de accion comunal).
    public List<Jac> getListaJac() {

        return this.repository.findAll();
    }
}


