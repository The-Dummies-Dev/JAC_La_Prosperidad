package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.movimientoDinero;
import com.TheDummiesDev.servicios.movimientoDineroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class frontControlMovimientoDinero {

    movimientoDineroService movimientoService;

    public frontControlMovimientoDinero(movimientoDineroService movimientoService) {
        this.movimientoService = movimientoService;
    }

    @GetMapping("/MovimientoDinero")
    public String movimentoDinero(Model modelMov) {
        List<movimientoDinero> listaMov = this.movimientoService.getListaMovimientoDinero();
        modelMov.addAttribute("movimientoD", listaMov);
        return ("MovimientoDinero");
    }
    @GetMapping("/MovimientoDinero/nuevomovimientoDinero")
    public String nuevoMovimientoD(Model model){
        model.addAttribute("nuevoMovimientoD", new movimientoDinero());
        return "nuevo-movimientoDinero";

    }
    @GetMapping("/MovimientoDinero/{id}")
    public String actualizarMovimientoD(@PathVariable("id") Long id, Model modelMov){
        movimientoDinero movimientoDFind=this.movimientoService.getMovimiento(id);
        modelMov.addAttribute("movimientoDFind",movimientoDFind);
        return "actualizar-movimientoDinero";
    }

}
