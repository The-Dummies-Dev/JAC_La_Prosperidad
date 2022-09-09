package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        return this.em1.getrepositorioEmp();
    }
    @PostMapping("/listaEmpleado")
    public Empleado createEmpleado(@RequestBody Empleado emp){
        return this.em1.createEmpleado(emp);
    }

}
