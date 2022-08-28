package com.TheDummiesDev;

//Clase Empleado
    public class Empleado {
    private String NombreEmpleado;
    private String emailEmpleado;
    private Jac juntaAccionComunalPertenece;
    private String RolJuntaAccionComuna;
    public Empleado(String NombreEmpleado, String emailEmpleado, Jac juntaAccionComunalPertenece, String RolJuntaAccionComuna) {
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
                ", RolJuntaAccionComuna='" + RolJuntaAccionComuna + '\'' +
                '}';
    }
}
