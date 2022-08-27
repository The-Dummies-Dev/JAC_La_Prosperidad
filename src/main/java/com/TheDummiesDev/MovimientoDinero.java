package com.TheDummiesDev;

//Clase movimento de dinero de la Jac
public class MovimientoDinero {
<<<<<<< HEAD
    //Atributos de la clase MovimientoDinero
    private float montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioRegistraMovimiento;

    //Constructor
    public MovimientoDinero(float montoMovimiento, String conceptoMovimiento, String usuarioRegistraMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
    }

    //Setters and Getters de los atributos de la clase MovientoDinero

=======
private float montoMovimiento;
    private String conceptoMovimiento;
    private String UsuarioRegistraMovimiento;

    public MovimientoDinero(float montoMovimiento, String conceptoMovimiento, String UsuarioRegistraMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.UsuarioRegistraMovimiento = UsuarioRegistraMovimiento;
    }

>>>>>>> 7b91969 (Commit del desarrollador)
    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioRegistraMovimiento() {
<<<<<<< HEAD
        return usuarioRegistraMovimiento;
    }

    public void setUsuarioRegistraMovimiento(String usuarioRegistraMovimiento) {
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
    }
=======
        return UsuarioRegistraMovimiento;
    }

    public void setUsuarioRegistraMovimiento(String UsuarioRegistraMovimiento) {
        this.UsuarioRegistraMovimiento = UsuarioRegistraMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" + "montoMovimiento=" + montoMovimiento + ", conceptoMovimiento=" + conceptoMovimiento + ", UsuarioRegistraMovimiento=" + UsuarioRegistraMovimiento + '}';
    }
    

>>>>>>> 7b91969 (Commit del desarrollador)
}
