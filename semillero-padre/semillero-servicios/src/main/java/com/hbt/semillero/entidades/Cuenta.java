/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.entidades;


import java.io.Serializable;
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
@Table(name = "CUENTA")
public class Cuenta implements Serializable {

    private String id;
    private Date fechaNacimiento;
    private String estado;
    private Persona persona;

    public Cuenta() {

    }

    @Id
    @SequenceGenerator(allocationSize = 1, name = "CUENTA_SCID_GENERATOR", sequenceName = "SEQ_CUENTA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUENTA_SCID_GENERATOR")    
    @Column(name = "SCID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "SCFECHA_CREACION")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Column(name = "SCESTADO")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSONA")
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + ", persona=" + persona + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + Objects.hashCode(this.persona);
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
        final Cuenta other = (Cuenta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        return true;
    }

}
