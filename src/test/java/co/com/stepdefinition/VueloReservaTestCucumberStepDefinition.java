package co.com.stepdefinition;

import co.com.despegar.configuracion.WebUI;
import co.com.despegar.model.ReservaVuelos;
import co.com.despegar.pagina.ReservaVuelosPagina;
import co.com.despegar.util.OpcionReserva;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class VueloReservaTestCucumberStepDefinition extends WebUI {

    private ReservaVuelos cliente;
    private ReservaVuelosPagina reservaVuelosPagina;


    @Given("que el ejecutivo  de Sofka se encuentra en la página web de Despegar en la opcion Vuelos")
    public void queElEjecutivoDeSofkaSeEncuentraEnLaPáginaWebDeDespegarEnLaOpcionVuelos() {
        clienteGeneral();
        generalSetup();
    }

    @When("que el ejecutivo selecciona la opcion Solo ida, llene los campos obligatorios y confirme la acción")
    public void queElEjecutivoSeleccionaLaOpcionSoloIdaLleneLosCamposObligatoriosYConfirmeLaAcción() throws InterruptedException {
            ReservaVuelosPagina reservaVuelosPagina = new ReservaVuelosPagina(cliente, driver);
            reservaVuelosPagina.llenarCamposObligatorios();
            Assertions.assertEquals(reservaVuelosPagina.validadcionMetodoPago(),
                    "¿Cómo deseas pagar?","No son iguales");

        }

    @Then("el sistema debera mostrar las opciones de pago")
    public void elSistemaDeberaMostrarLasOpcionesDePago () {{quiteDriver();}

    }
    private void clienteGeneral() {
        cliente = new ReservaVuelos();
        cliente.setOpcionReserva(OpcionReserva.SOLO_IDA);
        cliente.setOrigen(" Bogota");
        cliente.setDestino(" Medellin");
        cliente.setFechaIda("2022-01-11");
    }
}