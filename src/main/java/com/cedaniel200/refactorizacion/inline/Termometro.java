package com.cedaniel200.refactorizacion.inline;

public class Termometro {

    SensorTemperatura sensorTemperatura;

    public Termometro(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public int obtenerTemperatura(){
        return sensorTemperatura.obtenerTemperatura();
    }

    public int convertirFahrenheitACelsius(int temperaturaAConvertir) {
        int temperaturaResultante;
        temperaturaResultante = (temperaturaAConvertir - 32) * (5 / 9);
        return temperaturaResultante;
    }

    public int convertirCelsiusAFahrenheit(int temperaturaAConvertir) {
        int temperaturaResultante;
        temperaturaResultante = (temperaturaAConvertir * (9/5)) + 32;
        return temperaturaResultante;
    }

}
