package com.TheDummiesDev;

//Clase Empleado
public class Empleado {
    //Atributos de la clase Empleado
    private String nombreEmpleado;
    private String emailEmpleado;
    private String juntaAccionComunalPertence;
    private String rolJuntaAccionComunal;

    //Constructor de la clase
    public Empleado(String nombreEmpleado, String emailEmpleado, String juntaAccionComunalPertence, String rolJuntaAccionComunal) {
        this.nombreEmpleado = nombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.juntaAccionComunalPertence = juntaAccionComunalPertence;
        this.rolJuntaAccionComunal = rolJuntaAccionComunal;
    }

    //Getters and Setters de la clase Empleado
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getJuntaAccionComunalPertence() {
        return juntaAccionComunalPertence;
    }

    public void setJuntaAccionComunalPertence(String juntaAccionComunalPertence) {
        this.juntaAccionComunalPertence = juntaAccionComunalPertence;
    }

    public String getRolJuntaAccionComunal() {
        return rolJuntaAccionComunal;
    }

    public void setRolJuntaAccionComunal(String rolJuntaAccionComunal) {
        this.rolJuntaAccionComunal = rolJuntaAccionComunal;
    }
}
