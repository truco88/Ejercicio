
package com.hbt.semillero.dto;

import com.hbt.semillero.entidades.Cuenta;
import com.hbt.semillero.entidades.Persona;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//Clase Saldo
public class SaldoDTO implements Serializable{

    private String id;
    private Date fechaSaldo;
    private String unidades;
    private BigDecimal totalSaldo;
    private Date fechaCreacion;
    private Persona persona;
    private Cuenta cuenta;

    //Constructor vacio de la clase Saldo
    public SaldoDTO() {
        super();

    }

     //Constructor de la clase Saldo

    public SaldoDTO(String id, Date fechaSaldo, String unidades, BigDecimal totalSaldo, Date fechaCreacion, Persona persona, Cuenta cuenta) {
        super();
        this.id = id;
        this.fechaSaldo = fechaSaldo;
        this.unidades = unidades;
        this.totalSaldo = totalSaldo;
        this.fechaCreacion = fechaCreacion;
        this.persona = persona;
        this.cuenta = cuenta;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    

    

}
