package com.TheDummiesDev.entities;


import javax.persistence.*;

//Clase Empleado
    @Entity
    @Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NombreEmpleado")
    private String NombreEmpleado;
    @Column(name = "emailEmpleado")
    private String emailEmpleado;
    @Column(name = "juntaAccionComunalPertenece")
    private String juntaAccionComunalPertenece;
    @Column(name = "RolJuntaAccionComuna")
    private String RolJuntaAccionComuna;

    public Empleado(String NombreEmpleado, String emailEmpleado, String juntaAccionComunalPertenece, String RolJuntaAccionComuna) {
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

    public String getJuntaAccionComunalPertenece() {
        return this.juntaAccionComunalPertenece;
    }

    public void setjuntaAccionComunalPertenece(String juntaAccionComunalPertenece) {
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
    }

    public String getRolJuntaAccionComunal() {
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

    @Override
    public String toString() {
        return "Empleado{" +
                "NombreEmpleado='" + NombreEmpleado + '\'' +
                ", emailEmpleado='" + emailEmpleado + '\'' +
                ", Junta de accion comunal Empleado='" + juntaAccionComunalPertenece + '\'' +
                ", RolJuntaAccionComuna='" + RolJuntaAccionComuna + '\'' +
                '}';
    }
}
