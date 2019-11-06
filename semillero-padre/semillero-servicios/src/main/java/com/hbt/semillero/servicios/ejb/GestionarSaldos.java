package com.hbt.semillero.servicios.ejb;

import com.hbt.semillero.entidades.Persona;
import com.hbt.semillero.miProyecto.CuentaDTO;
import com.hbt.semillero.miProyecto.SaldoDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Clase GestionarSaldos, el objetivo del proyecto es que al final podamos validar el saldo total
public class GestionarSaldos {

    //Lista de saldos globales 
    private List<SaldoDTO> saldos = new ArrayList<SaldoDTO>();

    public List<SaldoDTO> consultarSaldos() {
        return saldos;

    }

    /**
     * metodo para retornar un solo saldo de la consulta
     *
     * @param id del saldo
     * @return si existe saldo lo retona saldoaRecorrer sino retorna null
     */
    public SaldoDTO consultarSaldo(String id) {

        //se utiliza mas para consultas
        for (SaldoDTO saldoaRecorrer : saldos) {
            if (saldoaRecorrer.getId().equals(id)) {
                return saldoaRecorrer;
            }
        }
        return null;
    }

    /**
     * Metodo para consultar saldo
     *
     * @param idPersona Id de persona ingresado
     * @param idCuenta Id de cuenta ingresado
     * @return Si el saldo esta vacio o null devulve null, si el id de persona
     * es null y el id de la cuenta es null devuelve la lista de saldos, si se
     * ingresan datos en los campos se devuelve el resultado de la consulta
     */
    protected List<SaldoDTO> consultarSaldo(Long idPersona, String idCuenta) {

        //isEmpty metodo que comprueba si un String esta vacio o no, devuelve verdadero si la cadena esta vacia de lo contrario devuelve falso.
        if (saldos == null || saldos.isEmpty()) {
            return null;
        }

        //condicion para validar que los datos Cuenta y Persona no fueron ingresads me devuelve la lista de saldos
        if ((idPersona == null) && (idCuenta == null)) {
            return saldos;
        }

        List<SaldoDTO> resultadoConsulta = new ArrayList<SaldoDTO>();
        for (int i = 0; i < saldos.size(); i++) {

            SaldoDTO saldo = saldos.get(i);

            //condicion para validar que se ingresaron datos en el campo Persona y Cuenta y me retorna esos datos
            if ((saldo.getCuenta() != null && saldo.getCuenta().getId().equals(idCuenta))
                    || (saldo.getPersona() != null && saldo.getPersona().getId().equals(idPersona))) {
                resultadoConsulta.add(saldo);
                continue;
            }

            //Condicion para validar que se ingreso un dato en el campo Cuenta y no en el campo Persona
            if ((saldos.get(i).getCuenta().getId().equals(idCuenta)) && (idPersona == null)) {
                resultadoConsulta.add(saldos.get(i));
            }

            //Condicion para validar que se ingreso un dato en el campo Person y no en el campo Cuenta
            if (saldos.get(i).getPersona().getId().equals(idPersona) && (idCuenta == null)) {
                resultadoConsulta.add(saldos.get(i));
            }

        }
        return resultadoConsulta;
    }

    /**
     * Metodo para crear saldo
     *
     * @param id
     * @param fechaSaldo
     * @param unidades
     * @param totalSaldo
     * @param fechaCreacion
     * @param persona
     * @param cuenta
     * @return Saldo nuevo creado
     */
    public SaldoDTO crearSaldo(String id, Date fechaSaldo, String unidades, BigDecimal totalSaldo, Date fechaCreacion, Persona persona, CuentaDTO cuenta) {

        SaldoDTO saldoNuevo;
        saldoNuevo = new SaldoDTO(); //instanciar

        saldoNuevo.setId(id);
        saldoNuevo.setFechaSaldo(fechaSaldo);
        saldoNuevo.setUnidades(unidades);
        saldoNuevo.setTotalSaldo(totalSaldo);
        saldoNuevo.setFechaCreacion(fechaCreacion);
        saldoNuevo.setPersona(persona);
        saldoNuevo.setCuenta(cuenta);

        //añadimos a la lista de saldos
        //saldos.set(0, saldoNuevo); //sobreescribir una posisicon en la lista de saldos
        saldos.add(saldoNuevo);
        return saldoNuevo;

    }

    /**
     * Metodo para modificar saldo
     *
     * @param totalSaldo
     * @param idModificar saldo a modificar
     * @return saldo modificado
     */
    public SaldoDTO modificarSaldo(BigDecimal totalSaldo, String idModificar) {
        if (saldos != null) {

            for (int i = 0; i < saldos.size(); i++) {

                if (saldos.get(i).getId().equals(idModificar)) {
                    saldos.get(i).setTotalSaldo(totalSaldo);
                    return saldos.get(i);
                }
            }

        }
        return null;

    }

    /**
     * Metodo para eliminar saldo
     *
     * @param idEliminar id del saldo a eliminar
     * @return retorna True si el saldo se elimino o False si el saldo es null
     */
    public Boolean eliminarSaldo(String idEliminar) {
        //Condicion para validar que el campo del saldo no este vacio
        if (saldos != null) {

            //For que recorre la lista de saldos
            for (int i = saldos.size()-1; i >= 0; i--) {

                if (saldos.get(i).getId().equals(idEliminar)) {
                    saldos.remove(i);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    //Metodo para llenar el saldo inicial
    public SaldoDTO llenarSaldo(String idSaldo) {
        SaldoDTO saldoInicial;
        saldoInicial = new SaldoDTO();//instanciar

        Persona personaInicial = new Persona();

        personaInicial.setId("2");
        saldoInicial.setPersona(personaInicial);

        //llenar datos
        saldoInicial.setId(idSaldo);
        saldoInicial.setTotalSaldo(BigDecimal.ZERO);

        return saldoInicial;
    }

    //Metodo para listar los Saldos y eliminar el saldo 2
    public List<SaldoDTO> crearListaSaldos() {
        llenarSaldo("1");

        List<SaldoDTO> llenarSaldo;
        llenarSaldo = new ArrayList<SaldoDTO>(); //instanciar

        //llenar saldo 2
        SaldoDTO saldoDos = llenarSaldo("2");
        llenarSaldo.add(saldoDos);

        //llenar saldo 1
        llenarSaldo.add(llenarSaldo("1"));

        //llenar saldo 3
        SaldoDTO saldoTres = llenarSaldo("3");
        llenarSaldo.add(saldoTres);

        //for que recorre la lista de saldos
        for (int i = 0; i < llenarSaldo.size(); i++) {

            //condicion para eliminar el saldo 2
            if (llenarSaldo.get(i).getId().equals("2")) {
                llenarSaldo.remove(i);
            }
        }
        saldos.addAll(llenarSaldo);
        return llenarSaldo;
    }

    //TODO hacer get y set de la lista de saldos
}
