package com.TheDummiesDev.entities;

// Clase de la junta de acción comunal (Jac).
public class Jac {
    //Atributos de la clase Jac
    private String nombreJac;
    private String direccionJac;
    private String telefonoJac;
    private String nitJac;

   // constructor
    public Jac(String nombreJac, String direccionJac, String telefonoJac, String nitJac) {
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

    public String getNitJac() {
        return nitJac;
    }

    public void setNitJac(String nitJac) {
        this.nitJac = nitJac;
    }


    @Override
    public String toString() {
        return "Jac{" + "direccionJac=" + direccionJac + ", telefonoJac=" + telefonoJac + ", nitJac=" + nitJac + '}';
    }
}


