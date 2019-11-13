/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.rest;

import com.hbt.semillero.dto.SaldoDTO;
import com.hbt.semillero.servicios.ejb.IGestionasSaldosLocal;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Clase para crear servicio Rest
 * @author Leo
 * @version
 */
@Path("/GestionarSaldo")
public class GestionasSaldoRest {
    
    @EJB
    private IGestionasSaldosLocal gestionarSaldoEJB;
    
    @GET // metodo de envio
    @Path("/Saldo")//ruta de acceso unica a nuestro recurso
    @Produces //definir el tipo de dato que se vadefinir
    public String servicioRest(){
        return "Hola leo";
        
    }
    
    @GET
    @Path("/ConsultarSaldo")
    @Produces(MediaType.APPLICATION_JSON)
    @QueryParam("idSaldo")
    public SaldoDTO consultarSaldo(@QueryParam("idSaldo")String idSaldo) {
        if(idSaldo!=null) {
            return gestionarSaldoEJB.consultarSaldo(idSaldo.toString());
        }
	return null;
    }
    
    
}
