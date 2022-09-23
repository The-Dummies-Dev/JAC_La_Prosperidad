package com.TheDummiesDev.controllers;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.entities.Jac;
import com.TheDummiesDev.servicios.EmpleadoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


//controlador de la entidad Empleado
@RestController
public class EmpleadoController {
    EmpleadoService em1;
    public EmpleadoController(EmpleadoService em1) {
        this.em1 = em1;
    }
   /* @GetMapping("/listaEmpleado")
    public List<Empleado> listaEmpleado() {
        return this.em1.getListaEmpleado();
    }
    */
   /* @PostMapping("/listaEmpleado")
    public Empleado createEmpleado(@RequestBody Empleado emp){
        return this.em1.createEmpleado(emp);
    }
    */
   @PostMapping("/Empleados")
   public RedirectView createEmpleado(@ModelAttribute Empleado empleado, Model model){
       model.addAttribute(empleado);
       this.em1.createEmpleado(empleado);
       return new RedirectView("/Empleados");
   }
    @GetMapping("/listaEmpleado/{id}")
    public Empleado getEmpleado( @PathVariable("id") long id){
        return this.em1.getEmpleado(id);
    }


    @PutMapping("/Empleados/{id}")
    public RedirectView actualizarEmpleado(@PathVariable("id") Long id, Empleado actEmpleado){
     this.em1.actualizarEmpleado(id, actEmpleado);
     return new RedirectView("/Empleados");
    }

    @DeleteMapping("/Empleados/{id}")
    public RedirectView borrarEmpleado(@PathVariable("id") Long id){
        this.em1.borrarEmpleado(id);
        return new RedirectView("/Empleados");
    }


}
