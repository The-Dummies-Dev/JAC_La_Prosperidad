package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.movimientoDinero;
import com.TheDummiesDev.servicios.movimientoDineroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        return ("/MovimientoDinero");
    }

}
