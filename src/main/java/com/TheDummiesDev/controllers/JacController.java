package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import com.sun.istack.NotNull;
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
   /* @GetMapping("/listaJac")
    public List<Jac> listaJac() {

        return this.service.getListaJac();
    }
    */
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

    @DeleteMapping("/listaJac/{id}")
    public void deleteJac(@PathVariable("id")long id){
       this.service.borrarJac(id);
    }

   /* @PutMapping("/listaJac/{id}")
    public Jac update(@PathVariable("id")long id, @RequestBody Jac actulizarJac){
        return this.service.actualizarJac(id,actulizarJac);
    }

    */
    @PutMapping("/listaJac/{id}")
       public RedirectView actualizarJac(@PathVariable Long id, Jac actJac) {
        this.service.actualizarJac(id, actJac);
        return  new RedirectView("/Jacs");

    }
}
