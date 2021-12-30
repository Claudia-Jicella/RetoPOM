package co.com.despegar.model;

import co.com.despegar.util.OpcionReserva;

public class ReservaVuelos {

    private OpcionReserva opcionReserva;
    private String origen;
    private String destino;
    private String fechaIda;
    private String diaIda;
    private String mesIda;
    private String añoIda;

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

    public String getDiaIda() {
        return diaIda;
    }

    public void setDiaIda(String diaIda) {
        this.diaIda = diaIda;
    }

    public String getMesIda() {
        return mesIda;
    }

    public void setMesIda(String mesIda) {
        this.mesIda = mesIda;
    }

    public String getAñoIda() {
        return añoIda;
    }

    public void setAñoIda(String añoIda) {
        this.añoIda = añoIda;
    }
}