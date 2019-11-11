/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.servicios.ejb;
import com.hbt.semillero.dto.SaldoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author soporte_it_manizales
 */
@Local
public interface IGestionasSaldosLocal {
    
    
    
    
    public void crearSaldo(SaldoDTO saldoNuevo);
    
    
    
    
    public void modificarSaldo(SaldoDTO saldoNuevo);
    
    
    
    
    public SaldoDTO consultarSaldo(String idSaldo);
    
    
        
    
    public void eliminarSaldo(String idSaldo);
    
    
    
    
    
    public List<SaldoDTO> consultarSaldos();
    
}
