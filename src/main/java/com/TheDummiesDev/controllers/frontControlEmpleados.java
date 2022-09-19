package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
