package co.com.despegar.runner;

import co.com.despegar.configuracion.WebUI;
import co.com.despegar.model.ReservaVuelos;
import co.com.despegar.pagina.ReservaVuelosPagina;
import co.com.despegar.util.OpcionReserva;
import org.junit.jupiter.api.*;


public class VueloReservaTest extends WebUI {

    private ReservaVuelos cliente;
    private ReservaVuelosPagina reservaVuelosPagina;


    @BeforeEach
    public void configurarReserva() {
        try {
            clienteGeneral();
            generalSetup();
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            quiteDriver();
        }
    }

    @Test
    public void ReservarCamposObligatorios() throws InterruptedException {
        try {
            reservaVuelosPagina = new ReservaVuelosPagina(cliente, driver);
            reservaVuelosPagina.llenarCamposObligatorios();

            Assertions.assertEquals
                    (reservaVuelosPagina.validadcionMetodoPago(), "¿Cómo deseas pagar?", "No son iguales");

        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            quiteDriver();
        }
    }


    @AfterEach
    public void cerrarReserva() {
        quiteDriver();
    }

    private void clienteGeneral () {
        cliente = new ReservaVuelos();
        cliente.setOpcionReserva(OpcionReserva.SOLO_IDA);
        cliente.setOrigen(" Cali");
        cliente.setDestino(" Bogota");
        cliente.setFechaIda("2022-01-12");

    }

}