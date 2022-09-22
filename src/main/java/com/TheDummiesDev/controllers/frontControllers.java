package com.TheDummiesDev.controllers;
import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.entities.Usuario;
import com.TheDummiesDev.servicios.JacService;
import com.TheDummiesDev.servicios.ServicioUsuarios;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class frontControllers {

    JacService service;
    ServicioUsuarios serviceUs;


    //constructor para el front de Jac
    public frontControllers(JacService service, ServicioUsuarios serviceUs ){
        this.service= service;
        this.serviceUs = serviceUs;
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal != null){
            //System.out.println(principal.getClaims());
            Usuario usuario = this.serviceUs.getOrCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);

        }
        return "index";
    }

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

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
    @GetMapping("/Jacs/{id}")
    public String actualizarJac(@PathVariable("id") Long id, Model model){
        Jac jacFind = this.service.getJac(id);
        model.addAttribute("jacFind", jacFind);
        return "actualizar-jac";
    }

    //aqui se hace uso de los servicios de usuario





}



