/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.dto;

import java.util.Date;

/**
 *
 * @author Leo
 */
// Clase Personas 
public class PersonasDTO {

    private String id;
    private String nombre;
    private String cedula;
    private Boolean sexo;
    private Date fechaNacimiento;
    
    //Constructor de la clase Personas
    public PersonasDTO(String id, String nombre, String cedula, Boolean sexo, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos de iniciacion Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
