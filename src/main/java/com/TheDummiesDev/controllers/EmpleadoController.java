package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//controlador de la entidad Empleado
@RestController
public class EmpleadoController {
    EmpleadoService servicio;
    public EmpleadoController(){

        this.servicio = new EmpleadoService();
    }

    @GetMapping("/listaEmpleado")
    public List<Empleado> listaJac() {
        return this.servicio.getListaEmpleado();
    }

    @GetMapping("/Empleado1")
    public Empleado Empleado1(){
        return this.servicio.getEmpleado1();
    }
}
