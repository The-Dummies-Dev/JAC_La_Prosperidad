package com.TheDummiesDev;

//Clase movimento de dinero de la Jac
public class MovimientoDinero {
    //Atributos de la clase MovimientoDinero
    private float montoMovimiento;
    private String conceptoMovimiento;
    private Empleado usuarioRegistraMovimiento;

    //Constructor

    public MovimientoDinero(float montoMovimiento, String conceptoMovimiento, Empleado usuarioRegistraMovimiento) {
        this.setMontoMovimiento(montoMovimiento);
        this.setConceptoMovimiento(conceptoMovimiento);
        this.setUsuarioRegistraMovimiento(usuarioRegistraMovimiento);
    }

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

    public Empleado getUsuarioRegistraMovimiento() {
        return usuarioRegistraMovimiento;
    }

    public void setUsuarioRegistraMovimiento(Empleado usuarioRegistraMovimiento) {
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" + "montoMovimiento=" + getMontoMovimiento() + ", conceptoMovimiento=" + getConceptoMovimiento() + ", UsuarioRegistraMovimiento=" + usuarioRegistraMovimiento + '}';
    }
}
