package com.cedaniel200.refactorizacion.extractfunction;

public class Termometro {

    public static final int CELSIUS_A_FAHRENHEIT = 1;
    public static final int FAHRENHEIT_A_CELSIUS = 2;
    SensorTemperatura sensorTemperatura;

    public Termometro(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public int obtenerTemperatura(){
        return sensorTemperatura.obtenerTemperatura();
    }

    public int convertirGradosSegunTipo(int tipoConversion, int temperaturaAConvertir){
        int temperaturaResultante = -100;
        if(tipoConversion == CELSIUS_A_FAHRENHEIT){
            temperaturaResultante = (temperaturaAConvertir * (9/5)) + 32;
        }else if(tipoConversion == FAHRENHEIT_A_CELSIUS){
            temperaturaResultante = (temperaturaAConvertir - 32) * (5/9);
        }
        return temperaturaResultante;
    }

}
