package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.repositorios.EmpleadoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

//Clase del servicio junta de acción comunal
@Service
public class EmpleadoService {

    private EmpleadoRepository repositorioEmp;
    public EmpleadoService(EmpleadoRepository repositorioEmp){

        this.repositorioEmp = repositorioEmp;
    }
    public List<Empleado> getListaEmpleado(){

        return this.repositorioEmp.findAll();
    }
    public Empleado createEmpleado(Empleado empleado1){
        return this.repositorioEmp.save(empleado1);
    }

    public Empleado getEmpleado(long id){
        return this.repositorioEmp.findById(id).orElseThrow();
    }
    public void borrarEmpleado(long id){
        this.repositorioEmp.deleteById(id);
    }

    public Empleado actualizarEmpleado(Long id, Empleado e){
        Empleado empleadoActual=repositorioEmp.findById(id).orElseThrow();
        empleadoActual.setIdCedula(e.getIdCedula());
        empleadoActual.setNombreEmpleado(e.getNombreEmpleado());
        empleadoActual.setemailEmpleado(e.getemailEmpleado());
        empleadoActual.setRolJuntaAccionComuna(e.getRolJuntaAccionComuna());
        empleadoActual.setjuntaAccionComunalPertenece(e.getJuntaAccionComunalPertenece());
        return this.repositorioEmp.save(empleadoActual);
    }

}


