/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.miProyecto;

import com.hbt.semillero.entidades.Persona;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Leo
 */
//Clase Saldo
public class Saldo {
    private String id;
    private Date fechaSaldo;
    private Long numCuenta;
    private String nommbrePersona;
    private String unidades;
    private BigDecimal totalSaldo;
    private Date fechaCreacion;
    private Persona persona;
    private Cuenta cuenta;
    public Saldo(){
        
    }
    
    //Constructor de la clase Saldo
    public Saldo(String id, Date fechaSaldo, Long numCuenta, String nommbrePersona, String unidades, BigDecimal totalSaldo, Date fechaCreacion) {
        this.id = id;
        this.fechaSaldo = fechaSaldo;
        this.numCuenta = numCuenta;
        this.nommbrePersona = nommbrePersona;
        this.unidades = unidades;
        this.totalSaldo = totalSaldo;
        this.fechaCreacion = fechaCreacion;
    }
    
    
    //Metodos de iniciacion Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaSaldo() {
        return fechaSaldo;
    }

    public void setFechaSaldo(Date fechaSaldo) {
        this.fechaSaldo = fechaSaldo;
    }

    public Long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNommbrePersona() {
        return nommbrePersona;
    }

    public void setNommbrePersona(String nommbrePersona) {
        this.nommbrePersona = nommbrePersona;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public BigDecimal getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(BigDecimal totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void size(String saldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(String cero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
