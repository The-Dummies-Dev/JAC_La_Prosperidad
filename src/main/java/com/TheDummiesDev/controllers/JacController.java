package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//controlador de la entidad junta de acción comunal (Jac)
@RestController
public class JacController {
    JacService service;
    public JacController(JacService service){

        this.service= service;
    }

    @GetMapping("/listaJac")
    public List<Jac> listaJac() {

        return this.service.getListaJac();
    }

}
