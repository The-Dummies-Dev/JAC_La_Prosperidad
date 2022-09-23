package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


import java.util.List;

//controlador de la entidad junta de acción comunal (Jac)
@RestController
public class JacController {
    JacService service;
    public JacController(JacService service){

        this.service= service;
    }

    @PostMapping("/listaJac")
    public RedirectView createJac(@ModelAttribute Jac jac, Model model){
        model.addAttribute(jac);
        this.service.createJac(jac);
        return new RedirectView("/Jacs");
    }

    @GetMapping("/listaJac/{id}")
    public Jac getJac(@PathVariable("id") long id){
        return this.service.getJac(id);
    }



    @DeleteMapping("/Jacs/{id}")
    public RedirectView eliminarJac(@PathVariable("id") Long id){
        this.service.borrarJac(id);
        return new RedirectView("/Jacs");
    }


    @PutMapping("/Jacs/{id}")
       public RedirectView actualizarJac(@PathVariable("id") Long id, Jac actJac) {
        this.service.actualizarJac(id, actJac);
        return  new RedirectView("/Jacs");

    }
}
