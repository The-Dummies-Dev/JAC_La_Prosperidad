package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.repositorios.EmpleadoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

//Clase del servicio junta de acción comunal\
@Service
public class EmpleadoService {
//    Empleado empleado1;
//    Empleado empleado2;
//    Empleado empleado3;
//
//    List<Empleado> listaEmpleado;
//
//    //constructor del servicio de Empleado
//    //No he podido referenciar la junta de accion comunal dentro de esta lista por lo que he cambiado el atributo "juntaAccionComunalPertenece" en  la clase Empleado a String, si encuentran una solucion
//    // para que no quede hard coded, bienvenidos sean.
//    public EmpleadoService(){
//        this.empleado1 = new Empleado("Marcos Bautista","macondo777@hotmail.com", "Jac1","Administrador");
//        this.empleado2 = new Empleado("Juan Bolanos","juankz040895@gmail.com","Jac1","Product Owner");
//        this.empleado3 = new Empleado("Raymond Moreno", "Stivensmorenomora1990@gmail.com","Jac1","Desarrollador");
//        this.listaEmpleado = new ArrayList<>();
//        listaEmpleado.add(empleado1);
//        listaEmpleado.add(empleado2);
//        listaEmpleado.add(empleado3);
//
//
//    }
//
//    public Empleado getEmpleado1() {
//        return empleado1;
//    }
//
//    public Empleado getEmpleado2() {
//        return empleado2;
//    }
//
//    public Empleado getEmpleado3() {
//        return empleado3;
//    }
//
//    public List<Empleado> getListaEmpleado() {
//        return listaEmpleado;
//    }

    private EmpleadoRepository repositorioEmp;
    public EmpleadoService(EmpleadoRepository repositorioEmp){
        this.repositorioEmp = repositorioEmp;
    }
    public List<Empleado> getrepositorioEmp(){
        return this.repositorioEmp.findAll();
    }
    public Empleado createEmpleado(Empleado empleado1){
        return this.repositorioEmp.save(empleado1);
    }

}

