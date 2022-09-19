package com.TheDummiesDev.entities;


import javax.persistence.*;

//Clase Empleado
    @Entity
    @Table(name = "empleado")
public class Empleado {
    @Id
    private long idCedula;
    @Column(name = "NombreEmpleado")
    private String NombreEmpleado;
    @Column(name = "emailEmpleado")
    public String emailEmpleado;

    @ManyToOne(optional = true)
    @JoinColumn(name = "nitJac")
    private  Jac juntaAccionComunalPertenece;
    @Column(name = "RolJuntaAccionComuna")
    public String RolJuntaAccionComuna;

    public Empleado(){

    }

    public Empleado(long idCedula, String NombreEmpleado, String emailEmpleado, Jac juntaAccionComunalPertenece, String RolJuntaAccionComuna) {
        this.idCedula = idCedula;
        this.NombreEmpleado = NombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
        this.RolJuntaAccionComuna = RolJuntaAccionComuna;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public Jac getJuntaAccionComunalPertenece() {
        return this.juntaAccionComunalPertenece;
    }

    public void setjuntaAccionComunalPertenece(Jac juntaAccionComunalPertenece) {
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
    }

    public String getRolJuntaAccionComuna() {
        return RolJuntaAccionComuna;
    }

    public void SetRolJuntaAccionComuna(String RolJuntaAccionComuna) {
        this.RolJuntaAccionComuna = RolJuntaAccionComuna;
    }

    public String getemailEmpleado() {
        return emailEmpleado;
    }

    public void setemailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }


    public long getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(long idCedula) {
        this.idCedula = idCedula;
    }
}
