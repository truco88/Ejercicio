/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbt.semillero.servicios.ejb;

import com.hbt.semillero.dto.SaldoDTO;
import com.hbt.semillero.entidades.Saldo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leo
 */
@Stateless
public class GestionarSaldosBean implements IGestionasSaldosLocal {

    @PersistenceContext
    private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearSaldo(SaldoDTO saldoDTO) {

        Saldo saldo = convertirSaldoDTOToSaldo(saldoDTO);
        em.persist(saldo);

    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void modificarSaldo(SaldoDTO saldoModificar) {
        Saldo saldo = new Saldo();
        saldo.setId(saldoModificar.getId());
        em.merge(saldo);

    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public SaldoDTO consultarSaldo(String id) {
        Saldo saldo = em.find(Saldo.class, id);
        SaldoDTO saldoDTO = convertirSaldoToSaldoDTO(saldo);
        return saldoDTO;
    }

    
    public void eliminarSaldo(String idSaldo) {

    }

   
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<SaldoDTO> consultarSaldos() {
        List<SaldoDTO> resultadosSaldoDTO = new ArrayList<SaldoDTO>();// conjunto de elementos que almacena datos con cierto orden
        List<Saldo> resultados = em.createQuery("select s from Saldo s").getResultList();// c hace referencia a toda la entidad
        for (Saldo saldo : resultados) {
            resultadosSaldoDTO.add(convertirSaldoToSaldoDTO(saldo));
        }

        return resultadosSaldoDTO;

    }

    /**
     * Metodo encargado para transpasar informacion de un lado a otro, no
     * incluye manipulacion de datos SOLO los metodos (em) son los que necesitan
     * transaccionalidad
     *
     */
    private Saldo convertirSaldoDTOToSaldo(SaldoDTO saldoDTO) {
        Saldo saldo = new Saldo();
        if (saldoDTO.getId() != null) {
            saldo.setId(saldoDTO.getId());
        }
        saldo.setFechaCreacion(saldoDTO.getFechaCreacion());
        saldo.setFechaSaldo(saldoDTO.getFechaSaldo());
        saldo.setTotalSaldo(saldoDTO.getTotalSaldo());
        saldo.setUnidades(saldoDTO.getUnidades());
        saldo.setPersona(saldoDTO.getPersona());
        saldo.setCuenta(saldoDTO.getCuenta());

        return saldo;

    }

    private SaldoDTO convertirSaldoToSaldoDTO(Saldo saldo) {
        SaldoDTO saldoDTO = new SaldoDTO();
        if (saldo.getId() != null) {
            saldoDTO.setId(saldo.getId().toString());
        }
        saldoDTO.setFechaCreacion(saldo.getFechaCreacion());
        saldoDTO.setFechaSaldo(saldo.getFechaSaldo());
        saldoDTO.setTotalSaldo(saldo.getTotalSaldo());
        saldoDTO.setUnidades(saldo.getUnidades());
        saldoDTO.setPersona(saldo.getPersona());
        saldoDTO.setCuenta(saldo.getCuenta());

        return saldoDTO;

    }

}
