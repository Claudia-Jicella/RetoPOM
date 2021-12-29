package co.com.despegar.runner;

import co.com.despegar.configuracion.WebUI;
import co.com.despegar.model.ReservaVuelos;
import co.com.despegar.pagina.ReservaVuelosPagina;
import co.com.despegar.util.OpcionReserva;
import org.junit.jupiter.api.*;

public class VueloReservaTest extends WebUI {

    private ReservaVuelos cliente;


    @BeforeEach
    public void configurarReserva(){
        clienteGeneral();
        generalSetup();

    }

    @Test
    public void ReservarCamposObligatorios() throws InterruptedException {
        ReservaVuelosPagina reservaVuelosPagina = new ReservaVuelosPagina(cliente,driver);
        reservaVuelosPagina.llenarCamposObligatorios();

        Assertions.assertEquals(reservaVuelosPagina.validadcionMetodoPago(),"¿Cómo deseas pagar?","No son iguales");

    }

    @AfterEach
    public void cerrarReserva() {quiteDriver();}


    private void clienteGeneral(){
        cliente = new ReservaVuelos();
        cliente.setOpcionReserva(OpcionReserva.SOLO_IDA);
        cliente.setOrigen(" Bogota");
        cliente.setDestino(" medellin");
        cliente.setFechaIda("2022-01-11");

    }
}