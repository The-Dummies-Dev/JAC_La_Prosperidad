package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/listaJac")
    public Jac createJac(@RequestBody Jac jac){
     return this.service.createJac(jac);
    }

    @GetMapping("/listaJac/{id}")
    public Jac getJac(@PathVariable("id") long id){
        return this.service.getJac(id);
    }

    @DeleteMapping("/listaJac/{id}")
    public void deleteJac(@PathVariable("id")long id){
       this.service.borrarJac(id);
    }


}
