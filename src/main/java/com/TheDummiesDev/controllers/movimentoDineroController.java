package com.TheDummiesDev.controllers;
import com.TheDummiesDev.entities.movimientoDinero;
import com.TheDummiesDev.servicios.movimientoDineroService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class movimentoDineroController {

    movimientoDineroService service;

    public  movimentoDineroController(movimientoDineroService service){
        this.service = service;
    }
    @GetMapping("/listaMovimientoDinero")
    public List<movimientoDinero> listaMovimientoDinero() {

        return this.service.getListaMovimientoDinero();
    }
    /*
    @PostMapping("/listaMovimientoDinero")
    public movimientoDinero createMoviemientoDinero(@RequestBody movimientoDinero movimiento){

        return this.service.createMovimientoDinero(movimiento);
    }
     */
    @PostMapping("/listaMovimientoDinero")
    public RedirectView createMovimientoD(@ModelAttribute movimientoDinero movimientoD, Model model ){
       model.addAttribute(movimientoD);
       this.service.createMovimientoDinero(movimientoD);
       return new RedirectView("/MovimientoDinero");
    }


    @GetMapping("/listaMovimientoDinero/{id}")
    public movimientoDinero getMovimientoDinero(@PathVariable("id") long id){
        return this.service.getMovimiento(id);
    }

    @PutMapping("/MovimientoDinero/{id}")
    public RedirectView actualizarMovimientoD(@PathVariable("id")Long id, movimientoDinero actMovimientoD){
        this.service.actualizarMovimentoD(id,actMovimientoD);
        return new RedirectView("/MovimientoDinero");
    }
    @DeleteMapping("/MovimientoDinero/{id}")
    public RedirectView borrarMovimientoD(@PathVariable("id") Long id){
        this.service.borrarmovimiento(id);
        return new RedirectView("/MovimientoDinero");
    }

}
