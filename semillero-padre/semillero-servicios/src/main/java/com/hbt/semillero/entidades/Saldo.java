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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Leo
 */
@Entity
@Table(name="SALDO")
public class Saldo implements Serializable{
    
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
    @Column(name="SSID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="SSFECHA")
    public Date getFechaSaldo() {
        return fechaSaldo;
    }

    public void setFechaSaldo(Date fechaSaldo) {
        this.fechaSaldo = fechaSaldo;
    }
    
    @Column(name="SSUNIDADES")
    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }
    
    @Column(name="SSSALDO_TOTAL")
    public BigDecimal getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(BigDecimal totalSaldo) {
        this.totalSaldo = totalSaldo;
    }
    
    @Column(name="SSFECHA_CREACION")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Saldo{" + "id=" + id + ", fechaSaldo=" + fechaSaldo + ", unidades=" + unidades + ", totalSaldo=" + totalSaldo + ", fechaCreacion=" + fechaCreacion + ", persona=" + persona + ", cuenta=" + cuenta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.fechaSaldo);
        hash = 59 * hash + Objects.hashCode(this.unidades);
        hash = 59 * hash + Objects.hashCode(this.totalSaldo);
        hash = 59 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 59 * hash + Objects.hashCode(this.persona);
        hash = 59 * hash + Objects.hashCode(this.cuenta);
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
