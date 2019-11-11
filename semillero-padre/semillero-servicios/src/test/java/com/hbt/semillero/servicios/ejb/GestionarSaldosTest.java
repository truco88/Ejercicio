
package com.hbt.semillero.servicios.ejb;



import com.hbt.semillero.entidades.Persona;
import com.hbt.semillero.dto.SaldoDTO;
import com.hbt.semillero.entidades.Cuenta;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class GestionarSaldosTest {

    //primer test
    @Test
    public void crearSaldoTest() {

        GestionarSaldos gestionarSaldo = new GestionarSaldos();
        SaldoDTO saldosTest = gestionarSaldo.crearSaldo("100", new Date(), "5", new BigDecimal(500), new Date(), null, null);
        Assert.assertEquals("100", saldosTest.getId());

    }

    @Test
    public void consultarSaldo() {
        GestionarSaldos gestionarSaldo = new GestionarSaldos();
        List<SaldoDTO> saldosTest2 = gestionarSaldo.consultarSaldo("1", "1");
        Assert.assertNull(saldosTest2);

        //Test para validar que no se envian datos en ninguno de los campos
        List<SaldoDTO> saldoTest3 = gestionarSaldo.consultarSaldo(null, null);
        Assert.assertNull(saldoTest3);

        //Test para validar que el primer campo envia datos y el segundo no 
        List<SaldoDTO> saldoTest4 = gestionarSaldo.consultarSaldo("1", null);
        Assert.assertNull(saldoTest4);

        //Test para validar que el segundo campo envia datos y el primero no
        List<SaldoDTO> saldoTest5 = gestionarSaldo.consultarSaldo(null, "1");
        Assert.assertNull(saldoTest5);

        //
        gestionarSaldo.crearListaSaldos();
        List<SaldoDTO> saldoTest6 = gestionarSaldo.consultarSaldo("2", null);
        Assert.assertNotNull(saldoTest6);
    }
    
    /**
     * Test para crear saldo 
     */
    @Test
    public void crearSaldosTest() {
        
        //Se crean los objetos persona y segundaPersona
        Persona persona = new Persona();
        Persona segundaPersona = new Persona();

        //Creamos los datos que va a tener el objeto persona
        persona.setId("1");
        persona.setFechaNacimiento(new Date());
        persona.setCedula("1053782623");
        persona.setNombre("Leo");
        persona.setSexo(Boolean.TRUE);
        

        //Creamos los datos que va a tener el objeto segundaPersona
        persona.setId("2");
        persona.setFechaNacimiento(new Date());
        persona.setCedula("1053782634");
        persona.setNombre("Juliana");
        persona.setSexo(Boolean.TRUE);
            
        
        //Creamos los objetos cuenta1, cuenta2 y cuenta3.
        Cuenta cuenta3 = new Cuenta();
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();

        //Creamos los datos que va a tener el objeto cuenta3
        cuenta3.setId("3");
        cuenta3.setPersona(persona);
        cuenta3.setFechaNacimiento(new Date());
        cuenta3.setEstado("Activo");

        //Creamos los datos que va a tener el objeto cuenta1
        cuenta1.setId("1");
        cuenta1.setPersona(segundaPersona);
        cuenta1.setFechaNacimiento(new Date());
        cuenta1.setEstado("Inactivo");
        

        //Creamos los datos que va a tener el objeto cuenta2
        cuenta2.setId("2");
        cuenta2.setPersona(persona);
        cuenta2.setFechaNacimiento(new Date());
        cuenta2.setEstado("Activo");

        //Test para validar saldo creado en el objeto persona con numero de cuenta cuenta3
        GestionarSaldos gestionSaldo = new GestionarSaldos();
        SaldoDTO testSaldo = gestionSaldo.crearSaldo("1", new Date(), "5", new BigDecimal(500), new Date(), persona, cuenta3);
        Assert.assertNotNull(testSaldo);
        
        //Test para validar saldo creado en el objeto segundaPersona con nuemro de cuenta cuenta1
        SaldoDTO testSaldo1 = gestionSaldo.crearSaldo("2", new Date(), "6", new BigDecimal(600), new Date(), segundaPersona, cuenta1);
        Assert.assertNotNull(testSaldo1);

        //Test para validar saldo creado en el objeto persona con nuemro de cuenta cuenta2
        SaldoDTO testSaldo2 = gestionSaldo.crearSaldo("3", new Date(), "7", new BigDecimal(700), new Date(), persona, cuenta2);
        Assert.assertNotNull(testSaldo2);

        //test que valida la lista de saldos creados
        List<SaldoDTO> resultadoSaldos = gestionSaldo.consultarSaldos();
        Assert.assertNotNull(resultadoSaldos);
        Assert.assertEquals(resultadoSaldos.size(), 3);

    }
    
    //crear un metodo que pruebe metodo de consulta, llamar varias veces, la primera vez no va a tener saldo, sugunda enviarle un id null, la tercera vez enviamos id creado, la cuarta vez uno que no exista 
    @Test
    public void recorrerSaldo(){
        
        GestionarSaldos gestionarSaldos = new GestionarSaldos();
        
        
        //sin saldo
        SaldoDTO testSaldo = gestionarSaldos.consultarSaldo("");
        Assert.assertNull(testSaldo);
        
        SaldoDTO testSaldo1 = gestionarSaldos.crearSaldo("2", new Date(), "7", new BigDecimal(700), new Date(), null, null);
        Assert.assertNotNull(testSaldo1);

        //id null
        SaldoDTO testSaldo2 = gestionarSaldos.consultarSaldo(null);
        Assert.assertNull(testSaldo2);

        
        //id creado
        SaldoDTO testSaldo5 = gestionarSaldos.consultarSaldo("2");
        Assert.assertNotNull(testSaldo5);

        
        //id no existe
        SaldoDTO testSaldo7 = gestionarSaldos.consultarSaldo("4");
        Assert.assertNull(testSaldo7);
        
        SaldoDTO testSaldo4 = gestionarSaldos.crearSaldo("4", new Date(), "9", new BigDecimal(900), new Date(), null, null);
        Assert.assertNotNull(testSaldo4);

    }
    
    @Test
    public void modificarSaldoTest(){
        
        GestionarSaldos gestionarSaldo = new GestionarSaldos();
        
        //Saldo existente
        SaldoDTO testModificar = gestionarSaldo.crearSaldo("2", new Date(), "9", new BigDecimal(600), new Date(), null, null);
        Assert.assertNotNull(testModificar);
        
        SaldoDTO testModificar1 = gestionarSaldo.modificarSaldo(new BigDecimal(600), "2");
        Assert.assertNotNull(testModificar1.getTotalSaldo(), "2");
        gestionarSaldo.crearSaldo("2", new Date(), "9", new BigDecimal(600), new Date(), null, null);
        
        //Saldo id no existente
        SaldoDTO testModificar2 = gestionarSaldo.modificarSaldo(null, "4");
        Assert.assertNull(testModificar2);
        
        //Saldo con id vacio
        SaldoDTO testModificar3 = gestionarSaldo.modificarSaldo(null, "");
        Assert.assertNull(testModificar3);
        
    }
    
    @Test
    public void eliminarSaldoTest(){
        
        GestionarSaldos gestionarSaldos = new GestionarSaldos();
        
        
        //Test con saldo a eliminar
        SaldoDTO testEliminar = gestionarSaldos.crearSaldo("2", new Date(), "6", new BigDecimal(600), new Date(), null, null);
        Assert.assertNotNull(testEliminar);

        Boolean testEliminar2 = gestionarSaldos.eliminarSaldo("2");
        Assert.assertTrue(testEliminar2);
        gestionarSaldos.crearSaldo("2", new Date(), "6", new BigDecimal(600), new Date(), null, null);
        
        //Test con lista vacia
        Boolean testEliminar3 = gestionarSaldos.eliminarSaldo("");
        Assert.assertFalse(testEliminar3);
        
        //Test con saldo null
        Boolean testEliminar4 = gestionarSaldos.eliminarSaldo(null);
        Assert.assertFalse(testEliminar4);
        
    }
    
}
