package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.JacService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class frontControllers {

    JacService service;
    public frontControllers(JacService service){

        this.service= service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/Jacs")
    public String Jacs(Model modelo){
        List<Jac> listaJacs=this.service.getListaJac();
        modelo.addAttribute("juntas",listaJacs);
        return "Jacs";
    }

    @GetMapping("/Jacs/nuevajac")
    public String nuevaJac(Model model){
        model.addAttribute("nuevaJac", new Jac());
        return "nueva-jac";
    }
}
