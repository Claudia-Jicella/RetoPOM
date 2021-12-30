package co.com.despegar.pagina;

import co.com.despegar.model.ReservaVuelos;
import co.com.despegar.pagina.comun.AccionComunDeLaPagina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReservaVuelosPagina extends AccionComunDeLaPagina {

    private final ReservaVuelos reservaVuelos;

    //casos de prueba de entrada


    private final By opcionReservaIdayVuelta = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[1]/label/span");
    private final By opcionReservaSoloIda = By.xpath("//span[text()=\"Solo ida\"]");
    private final By opcionReservaMultidestino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[3]/label/span");
    private final By origen = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    private final By confirmacionDeOrigen = By.xpath("/html/body/div[4]/div/div[1]/ul/li/span");
    private final By destino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
    private final By confirmacionDelDestino = By.xpath("/html/body/div[4]/div/div[1]/ul/li[1]/span");
    private final By seleccionFechaIda = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div");
    private final By fechaIda = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[12]/div");
    private final By pasajeros = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
    private final By adultos = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
    private final By buscarBotonAplicar = By.xpath("//div[@class=\"stepper__room__footer \"]//a[@class=\"sbox5-3-btn -md -primary\"]");
    private final By buscarBotonBuscar = By.xpath("//div[@class=\"sbox5-button-container--1X4O8\"]");
    private final By buscarBotonSeleccionar = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a");
    private final By buscarBotonContinuar = By.xpath("/html/body/span[21]/upselling-popup/div/div[3]/div/div/button");

    //Validacion escenario 1
    private final By metodoDePago = By.xpath("//span[@class=\"eva-3-h4 form-title -eva-3-pr-xlg -eva-3-pl-xlg -eva-3-ml-sm -eva-3-mr-sm\"]");

    //Validacion escenario 1
    private final By detallesDelPago = By.xpath("//*[@id=\"checkout-content\"]/div[2]/pricebox/div[1]/p");


    public ReservaVuelosPagina(ReservaVuelos reservaVuelos, WebDriver webDriver) {
        super(webDriver);
        this.reservaVuelos = reservaVuelos;
    }

    //Funciones
    public void llenarCamposObligatorios() throws InterruptedException {

        switch (reservaVuelos.getOpcionReserva()) {
            case IDA_Y_VUELTA:
                click(opcionReservaIdayVuelta);
                break;
            case SOLO_IDA:
                click(opcionReservaSoloIda);
                break;
            case MULTIDESTINO:
                click(opcionReservaMultidestino);
                break;
            default:
        }

        click(origen);
        borrarTexto(origen);
        escribir(origen, reservaVuelos.getOrigen());
        explicitWaitTime(origen);
        click(confirmacionDeOrigen);


        click(destino);
        borrarTexto(destino);
        escribir(destino, reservaVuelos.getDestino());
        explicitWaitTime(confirmacionDelDestino);
        click(confirmacionDelDestino);

        scrollDown(seleccionFechaIda);
        explicitWaitTime(seleccionFechaIda);
        click(seleccionFechaIda);


        scrollDown(fechaIda);
        explicitWaitTime(fechaIda);
        click(fechaIda);

        scrollDown(pasajeros);
        explicitWaitTime(pasajeros);
        click(pasajeros);

        scrollDown(buscarBotonAplicar);
        explicitWaitTime(buscarBotonAplicar);
        click(buscarBotonAplicar);

        scrollDown(buscarBotonBuscar);
        explicitWaitTime(origen);
        click(buscarBotonBuscar);

        scrollDown(buscarBotonSeleccionar);
        explicitWaitTime(buscarBotonSeleccionar);
        click(buscarBotonSeleccionar);

        scrollDown(buscarBotonContinuar);
        explicitWaitTime(buscarBotonContinuar);
        click(buscarBotonContinuar);

    }

    public String validadcionMetodoPago() {
        return getText(metodoDePago).trim();

    }

    //Funciones
    public void detallesDePago() throws InterruptedException {

        switch (reservaVuelos.getOpcionReserva()) {
            case IDA_Y_VUELTA:
                click(opcionReservaIdayVuelta);
                break;
            case SOLO_IDA:
                click(opcionReservaSoloIda);
                break;
            case MULTIDESTINO:
                click(opcionReservaMultidestino);
                break;
            default:
                //ALERTA INFORMATIVA CON UN LOG
        }

        click(origen);
        borrarTexto(origen);
        escribir(origen, reservaVuelos.getOrigen());
        explicitWaitTime(origen);
        click(confirmacionDeOrigen);


        click(destino);
        borrarTexto(destino);
        escribir(destino, reservaVuelos.getDestino());
        explicitWaitTime(confirmacionDelDestino);
        click(confirmacionDelDestino);

        scrollDown(seleccionFechaIda);
        explicitWaitTime(seleccionFechaIda);
        click(seleccionFechaIda);


        scrollDown(fechaIda);
        explicitWaitTime(fechaIda);
        click(fechaIda);

        scrollDown(pasajeros);
        explicitWaitTime(pasajeros);
        click(pasajeros);


        explicitWaitTime(adultos);
        click(adultos);

        explicitWaitTime(buscarBotonAplicar);
        click(buscarBotonAplicar);

        explicitWaitTime(buscarBotonBuscar);
        click(buscarBotonBuscar);

        explicitWaitTime(buscarBotonSeleccionar);
        click(buscarBotonSeleccionar);

        explicitWaitTime(buscarBotonContinuar);
        click(buscarBotonContinuar);

    }

    public String validacionDetallePago() {
        return getText(detallesDelPago).trim();
    }
}




