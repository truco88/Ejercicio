/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.dto;

import com.hbt.semillero.entidades.Persona;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Leo
 */
//Clase Cuenta
public class CuentaDTO implements Serializable {

    private String id;
    private Date fechaCreacion;
    private Boolean activo;
    private Persona persona;

    //Constructor de la clase Cuenta
    public CuentaDTO(String id, Date fechaCreacion, Boolean activo, Persona persona) {
        super();
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
        this.persona = persona;
    }
    
    /**
	 * Constructor de la clase.
	 * @param id
	 * @param fechaCreacion
	 * @param activo
	 * @param persona
	 * 
	 */

    public CuentaDTO(){
        
    }

    //Metodos de iniciacion Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 37 * hash + Objects.hashCode(this.activo);
        hash = 37 * hash + Objects.hashCode(this.persona);
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
        final CuentaDTO other = (CuentaDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.activo, other.activo)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        return true;
    }
    
    
    
}
