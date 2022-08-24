package com.TheDummiesDev;

//Clase movimento de dinero de la Jac
public class MovimientoDinero {
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
        return usuarioRegistraMovimiento;
    }

    public void setUsuarioRegistraMovimiento(String usuarioRegistraMovimiento) {
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
    }
}
