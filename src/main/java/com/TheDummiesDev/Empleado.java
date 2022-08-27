package com.TheDummiesDev;

//Clase Empleado
public class Empleado {
<<<<<<< HEAD
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
=======
    private String NombreEmpleado;
//    private String Usuario;
 //   private String Contraseña;
    private String emailEmpleado;
    private String juntaAccionComunalPertenece;
    private String RolJuntaAccionComuna;
    private int idEmpleado;
    


    public Empleado(String NombreEmpleado, String juntaAccionComunalPertenece, String RolJuntaAccionComuna, String emailEmpleado,int idEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
        this.RolJuntaAccionComuna = RolJuntaAccionComuna;
        this.idEmpleado=idEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getJuntaAccionComunalPertenece() {
        return juntaAccionComunalPertenece;
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


    public int idEmpleado() {
        return idEmpleado;
    }

    public void idEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "NombreEmpleado=" + NombreEmpleado + ", juntaAccionComunalPertenece=" + juntaAccionComunalPertenece + ", RolJuntaAccionComuna\u00f1a=" + RolJuntaAccionComuna + ", emailEmpleado=" + emailEmpleado + ",  idEmpleado=" + idEmpleado + '}';
    }

>>>>>>> 7b91969 (Commit del desarrollador)
}
