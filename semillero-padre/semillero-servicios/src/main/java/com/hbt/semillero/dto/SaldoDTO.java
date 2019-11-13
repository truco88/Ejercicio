
package com.hbt.semillero.dto;

import com.hbt.semillero.entidades.Cuenta;
import com.hbt.semillero.entidades.Persona;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final SaldoDTO other = (SaldoDTO) obj;
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
