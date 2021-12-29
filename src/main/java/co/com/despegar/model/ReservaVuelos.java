package co.com.despegar.model;

import co.com.despegar.util.OpcionReserva;

public class ReservaVuelos {

    private OpcionReserva opcionReserva;
    private String origen;
    private String destino;
    private String fechaIda;



    public ReservaVuelos() {
    }

    public OpcionReserva getOpcionReserva() {
        return opcionReserva;
    }

    public void setOpcionReserva(OpcionReserva opcionReserva) {
        this.opcionReserva = opcionReserva;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

}