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

    private final By pasajerosYClase = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
    private final By buscarBotonAplicar = By.xpath ("//div[@class=\"stepper__room__footer \"]//a[@class=\"sbox5-3-btn -md -primary\"]");


    private final By buscarBotonBuscar = By.xpath("//div[@class=\"sbox5-button-container--1X4O8\"]");
    private final By buscarBotonSeleccionar = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a");
    private final By buscarBotonContinuar = By.xpath("/html/body/span[21]/upselling-popup/div/div[3]/div/div/button");

    //Validacion
    private final By metodoDePago = By.xpath("//span[@class=\"eva-3-h4 form-title -eva-3-pr-xlg -eva-3-pl-xlg -eva-3-ml-sm -eva-3-mr-sm\"]");



    public ReservaVuelosPagina(ReservaVuelos reservaVuelos, WebDriver webDriver) {
        super(webDriver);
        this.reservaVuelos = reservaVuelos;
    }
    //Funciones
    public void llenarCamposObligatorios() throws InterruptedException {

        switch (reservaVuelos.getOpcionReserva()){
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
        Thread.sleep(2000);
        click(confirmacionDeOrigen);


        click(destino);
        borrarTexto(destino);
        escribir(destino,reservaVuelos.getDestino());
        Thread.sleep(4000);
        click(confirmacionDelDestino);

        scrollDown(seleccionFechaIda);
        Thread.sleep(2000);
        click(seleccionFechaIda);


        scrollDown(fechaIda);
        Thread.sleep(2000);
        click(fechaIda);

        scrollDown(pasajerosYClase);
        Thread.sleep(4000);
        click(pasajerosYClase);

        scrollDown(buscarBotonAplicar);
        Thread.sleep(4000);
        click(buscarBotonAplicar);

        scrollDown(buscarBotonBuscar);
        Thread.sleep(4000);
        click(buscarBotonBuscar);

        scrollDown(buscarBotonSeleccionar);
        Thread.sleep(4000);
        click(buscarBotonSeleccionar);

        scrollDown(buscarBotonContinuar);
        Thread.sleep(4000);
        click(buscarBotonContinuar);

        Thread.sleep(10000);
    }

    public String validadcionMetodoPago () {
        String resultadoValidacionMP = getText(metodoDePago).trim ();
        return resultadoValidacionMP;

    }


    //Funciones
    public void detallesDePago() throws InterruptedException {

        switch (reservaVuelos.getOpcionReserva()){
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
        Thread.sleep(2000);
        click(confirmacionDeOrigen);


        click(destino);
        borrarTexto(destino);
        escribir(destino,reservaVuelos.getDestino());
        Thread.sleep(4000);
        click(confirmacionDelDestino);

        Thread.sleep(2000);
        click(seleccionFechaIda);


        scrollDown(fechaIda);
        Thread.sleep(2000);
        click(fechaIda);

        Thread.sleep(4000);
        click(pasajerosYClase);

        Thread.sleep(4000);
        click(buscarBotonAplicar);

        Thread.sleep(4000);
        click(buscarBotonBuscar);

        Thread.sleep(4000);
        click(buscarBotonSeleccionar);

        Thread.sleep(4000);
        click(buscarBotonContinuar);

        Thread.sleep(10000);
    }


}




