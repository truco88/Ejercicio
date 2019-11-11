/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "SALDO")
public class Saldo implements Serializable {

    private String id;
    private Date fechaSaldo;
    private String unidades;
    private BigDecimal totalSaldo;
    private Date fechaCreacion;
    private Persona persona;
    private Cuenta cuenta;

    public Saldo() {

    }

    @Id
    @SequenceGenerator(allocationSize = 1, name = "SALDO_SSID_GENERATOR", sequenceName = "SEQ_SALDO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SALDO_SSID_GENERATOR")
    @Column(name = "SSID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "SSFECHA")
    public Date getFechaSaldo() {
        return fechaSaldo;
    }

    public void setFechaSaldo(Date fechaSaldo) {
        this.fechaSaldo = fechaSaldo;
    }

    @Column(name = "SSUNIDADES")
    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Column(name = "SSSALDO_TOTAL")
    public BigDecimal getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(BigDecimal totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    @Column(name = "SSFECHA_CREACION")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SSPERSONA")
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SSCUENTA")
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.fechaSaldo);
        hash = 47 * hash + Objects.hashCode(this.unidades);
        hash = 47 * hash + Objects.hashCode(this.totalSaldo);
        hash = 47 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 47 * hash + Objects.hashCode(this.persona);
        hash = 47 * hash + Objects.hashCode(this.cuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Saldo other = (Saldo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaSaldo, other.fechaSaldo)) {
            return false;
        }
        if (!Objects.equals(this.unidades, other.unidades)) {
            return false;
        }
        if (!Objects.equals(this.totalSaldo, other.totalSaldo)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        if (!Objects.equals(this.cuenta, other.cuenta)) {
            return false;
        }
        return true;
    }

    

}
