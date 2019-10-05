/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.servicios.ejb;



import com.hbt.semillero.miProyecto.Saldo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leo
 */
//Clase GestionarSaldos
public class GestionarSaldos {
    
    private List<Saldo> saldos = new ArrayList<Saldo>();
       
        //Saldo gestioanSaldos = saldos();
        //saldos.add
    
    
    
    //Metodo para consultar saldo
    protected Saldo consultarSaldo(String idPersona, String idCuenta){
        
        
        
        
        return null;
      
        
        
    }
    
    //Metodo para crear saldo
    public Saldo crearSaldo(String id, Date fechaSaldo, Long numCuenta, String nommbrePersona, String unidades, BigDecimal totalSaldo, Date fechaCreacion){
        
        Saldo saldoNuevo ;
        saldoNuevo = new Saldo(); //instanciar
        
        saldoNuevo.setId(id);
        saldoNuevo.setFechaSaldo(fechaSaldo);
        saldoNuevo.setNumCuenta(numCuenta);
        saldoNuevo.setNommbrePersona(nommbrePersona);
        saldoNuevo.setUnidades(unidades);
        saldoNuevo.setTotalSaldo(totalSaldo);
        saldoNuevo.setFechaCreacion(fechaCreacion);
        
        //añadir a la lista de saldos
       
        return saldoNuevo;
        
    }
    
    //Metodo para modificar saldo
    public Saldo modificarSaldo(BigDecimal totalSaldo){
        
        Saldo modificar = new Saldo();
        modificar.getTotalSaldo();
        
        
        return null;
    }
    
    
    
    //Metodo para eliminar cuenta sin saldo
    public Saldo eliminarSaldo(){
        return null;
    
        
        
    }
    
    
    
    
    //Metodo para llenar el saldo inicial
    public Saldo llenarSaldo(String idSaldo){
        Saldo saldoInicial; 
        saldoInicial = new Saldo();//instanciar 
        
        //llenar datos
        saldoInicial.setId(idSaldo);
        saldoInicial.setTotalSaldo(BigDecimal.ZERO);
        
        return saldoInicial;
    }
    
    
    //Metodo para listar los Saldos y eliminar el saldo 2
    public List<Saldo> crearListaSaldos(){
        llenarSaldo("1");
        
        List<Saldo> llenarSaldo;
        llenarSaldo = new ArrayList<Saldo>(); //instanciar
        
        //llenar saldo 2
        Saldo saldoDos = llenarSaldo("2");
        llenarSaldo.add(saldoDos);
        
        
        //llenar saldo 1
        llenarSaldo.add(llenarSaldo("1"));
        
        
        //llenar saldo 3
        Saldo saldoTres = llenarSaldo("3");
        llenarSaldo.add(saldoTres);
        
        
        //for que recorre la lista de saldos
        for(int i=0; i<llenarSaldo.size(); i++){
            
            //condicion para eliminar el saldo 2
            if(llenarSaldo.get(i).getId().equals("2")){
                llenarSaldo.remove(i);               
            }         
        } 
        return llenarSaldo;
    }
}


//que es un array
//como se recorre un array 
//como se le agregan elementos
//como se borran elementos