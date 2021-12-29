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

    //Background
    @Given("que el ejecutivo  de Sofka se encuentra en la página web de Despegar en la opcion Vuelos")
    public void queElEjecutivoDeSofkaSeEncuentraEnLaPáginaWebDeDespegarEnLaOpcionVuelos() {

        try {
            generalSetup();
        } catch (Exception exception){
            Assertions.fail(exception.getMessage(),exception);
            quiteDriver();

        }
    }

    //Escenario 1
    @When("que el ejecutivo selecciona la opcion Solo ida, llene los campos obligatorios y confirme la acción")
    public void queElEjecutivoSeleccionaLaOpcionSoloIdaLleneLosCamposObligatoriosYConfirmeLaAcción() throws InterruptedException {
        try {
            clienteGeneral();
            reservaVuelosPagina = new ReservaVuelosPagina(cliente, driver);
            reservaVuelosPagina.llenarCamposObligatorios();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);
        }
    }

    @Then("el sistema debera mostrar las opciones de pago")
    public void elSistemaDeberaMostrarLasOpcionesDePago() {

        try {
            Assertions.assertEquals(reservaVuelosPagina.validadcionMetodoPago(),
                "¿Cómo deseas pagar?", "No son iguales");

        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);

        }
    }

    private void clienteGeneral() {
        cliente = new ReservaVuelos();
        cliente.setOpcionReserva(OpcionReserva.SOLO_IDA);
        cliente.setOrigen(" Bogota");
        cliente.setDestino(" Neiva");
        cliente.setFechaIda("2022-01-12");
    }

    //Escenario 2
    @When("que el ejecutivo llena los campos obligatorios y escoja dos pasajeros adultos en clase economica")
    public void queElEjecutivoLlenaLosCamposObligatoriosYEscojaDosPasajerosAdultosEnClaseEconomica() throws InterruptedException {
        try {
            clienteGeneral();
            reservaVuelosPagina = new ReservaVuelosPagina(cliente,driver);
            reservaVuelosPagina.detallesDePago();

        }catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);}
    }

    @Then("el sistema debera mostrar los detalles del pago")
    public void elSistemaDeberaMostrarLosDetallesDelPago() {



    }
}
