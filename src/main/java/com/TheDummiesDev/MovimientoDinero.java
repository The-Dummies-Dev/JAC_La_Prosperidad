package com.TheDummiesDev;

//Clase movimento de dinero de la Jac
public class MovimientoDinero {
    //Atributos de la clase MovimientoDinero
    private float montoMovimiento;
    private String conceptoMovimiento;
    private Empleado usuario;

    //Constructor
    public MovimientoDinero(float montoMovimiento, String conceptoMovimiento, Empleado usuario) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;

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

    public Empleado getUsuario() {
        return this.usuario;
    }
}
