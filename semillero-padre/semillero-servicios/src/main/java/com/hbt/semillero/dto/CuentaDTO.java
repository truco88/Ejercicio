/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.dto;

import com.hbt.semillero.entidades.Persona;
import java.io.Serializable;
import java.util.Date;

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
    
}
