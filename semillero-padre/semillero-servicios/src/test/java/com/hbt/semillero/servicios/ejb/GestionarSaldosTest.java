/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.servicios.ejb;

import com.hbt.semillero.miProyecto.Saldo;
import java.math.BigDecimal;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Leo
 */
//clase para realizar el test de saldos
@Test
public class GestionarSaldosTest {
    
   //primer test
    @Test
    public void crearSaldoTest(){
        
        GestionarSaldos gestionarSaldo =  new GestionarSaldos();
        Saldo saldosTest = gestionarSaldo.crearSaldo("100" , new Date() , 123456789L, "Leonardo", "5", new BigDecimal(500), new Date());
        Assert.assertEquals("100", saldosTest.getId());
        
    }
}
