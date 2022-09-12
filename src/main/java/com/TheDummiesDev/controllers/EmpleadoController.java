package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//controlador de la entidad Empleado
@RestController
public class EmpleadoController {
    EmpleadoService em1;
    public EmpleadoController(EmpleadoService em1) {
        this.em1 = em1;
    }
    @GetMapping("/listaEmpleado")
    public List<Empleado> listaEmpleado() {
        return this.em1.getListaEmpleado();
    }
    @PostMapping("/listaEmpleado")
    public Empleado createEmpleado(@RequestBody Empleado emp){
        return this.em1.createEmpleado(emp);
    }

    @GetMapping("/listaEmpleado/{id}")
    public Empleado getEmpleado( @PathVariable("id") long id){
        return this.em1.getEmpleado(id);
    }
    @DeleteMapping("/listaEmpleado/{id}")
    public void deleteEmpleado(@PathVariable("id")long id){
        this.em1.borrarEmpleado(id);
    }


}
