package com.TheDummiesDev.entities;

import javax.persistence.*;

//Clase movimento de dinero
@Entity
@Table(name="MovimientoDinero")
public class movimientoDinero {

    //Atributos de la clase MovimientoDinero
    @Id
    private Long idRegistroMoviminetoDinero;
    @Column(name="montoMovimiento")
    private float montoMovimiento;
    @Column(name="conceptoMovimiento")
    private String conceptoMovimiento;
    @ManyToOne(optional = true)
    @JoinColumn(name="idCedula")
    private Empleado usuarioRegistraMovimiento;

    //Constructor


    public movimientoDinero() {
    }

    public movimientoDinero(Long idRegistroMoviminetoDinero, float montoMovimiento, String conceptoMovimiento, Empleado usuarioRegistraMovimiento) {
        this.idRegistroMoviminetoDinero=idRegistroMoviminetoDinero;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
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
    public Long getIdRegistroMoviminetoDinero() {
        return idRegistroMoviminetoDinero;
    }


    public void setIdRegistroMoviminetoDinero(Long idRegistroMoviminetoDinero) {
        this.idRegistroMoviminetoDinero = idRegistroMoviminetoDinero;
    }


}
