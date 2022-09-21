package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class frontControlEmpleados {

    EmpleadoService serviceEmp;

    public frontControlEmpleados(EmpleadoService serviceEmp) {
        this.serviceEmp = serviceEmp;
    }

    @GetMapping("/Empleados")
    public String Empleados(Model modelo){
        List<Empleado> listaEmpleados=this.serviceEmp.getListaEmpleado();
        modelo.addAttribute("empleados",listaEmpleados);
        return "Empleados";
    }
    @GetMapping("/Empleados/nuevoempleado")
    public String nuevoEmpleado(Model model){
        model.addAttribute("nuevoEmpleado", new Empleado());
        return "nuevo-empleado";
    }
    @GetMapping("Empleados/{id}")
    public String actualizarEmpleado(@PathVariable("id") Long id, Model modelEmp){
        Empleado empleadoFind = this.serviceEmp.getEmpleado(id);
        modelEmp.addAttribute("empleadoFind", empleadoFind);
        return "actualizar-empleado";
    }
}
