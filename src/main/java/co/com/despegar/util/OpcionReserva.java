package co.com.despegar.util;

public enum OpcionReserva {

    IDA_Y_VUELTA("Ida y vuelta"),
    SOLO_IDA("Solo ida"),
    MULTIDESTINO("Multidestino");

    private final String value;

    public String getValue (){return value;}

    OpcionReserva(String value) {
        this.value = value;
    }
}


