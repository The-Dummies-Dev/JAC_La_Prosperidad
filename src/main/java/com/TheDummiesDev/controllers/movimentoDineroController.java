package com.TheDummiesDev.controllers;
import com.TheDummiesDev.entities.movimientoDinero;
import com.TheDummiesDev.servicios.movimientoDineroService;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/listaMovimientoDinero")
    public movimientoDinero createMoviemientoDinero(@RequestBody movimientoDinero movimiento){

        return this.service.createMovimientoDinero(movimiento);
    }
    @DeleteMapping("/listamovimientoDinero/{id}")
    public void deleteMovimientoDinero(@PathVariable("id")long id){

        this.service.borrarmovimiento(id);
    }
    @GetMapping("/listaMovimientoDinero/{id}")
    public movimientoDinero getMovimientoDinero(@PathVariable("id") long id){
        return this.service.getMovimiento(id);
    }
}
