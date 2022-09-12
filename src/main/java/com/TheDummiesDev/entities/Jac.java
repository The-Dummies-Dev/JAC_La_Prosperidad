package com.TheDummiesDev.entities;

import javax.persistence.*;

// Clase de la junta de acción comunal (Jac).
@Entity
@Table(name="JuntasAccionComunal")
public class Jac {
    //Atributos de la clase Jac

    @Column(name = "nombreJac")
    private String nombreJac;
    @Column(name = "direccionJac")
    private String direccionJac;
    @Column(name = "telefonoJac")
    private String telefonoJac;
    @Id
    private Long nitJac;

   // constructor
    public Jac() {

    }
    public Jac(String nombreJac, String direccionJac, String telefonoJac, Long nitJac) {
        this.nombreJac = nombreJac;
        this.direccionJac = direccionJac;
        this.telefonoJac = telefonoJac;
        this.nitJac = nitJac;

    }

    public String getNombreJac() {
        return nombreJac;
    }

    public void setNombreJac(String nombreJac) {
        this.nombreJac = nombreJac;
    }


    public String getDireccionJac() {
        return direccionJac;
    }

    public void setDireccionJac(String direccionJac) {
        this.direccionJac = direccionJac;
    }

    public String getTelefonoJac() {
        return telefonoJac;
    }

    public void setTelefonoJac(String telefonoJac) {
        this.telefonoJac = telefonoJac;
    }

    public Long getNitJac() {
        return nitJac;
    }

    public void setNitJac(Long nitJac) {
        this.nitJac = nitJac;
    }


}


