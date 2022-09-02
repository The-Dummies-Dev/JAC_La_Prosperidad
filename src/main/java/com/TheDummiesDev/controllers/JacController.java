package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//controlador de la entidad junta de acción comunal (Jac)
@RestController
public class JacController {
    JacService servicio;
    public JacController(){
        this.servicio = new JacService();
    }

    @GetMapping("/Jac")
    public Jac Jac1() {
        return this.servicio.getJac1();
    }
}
