package com.cedaniel200.refactorizacion.extractclass;

public class Termometro {

    SensorTemperatura sensorTemperatura;

    public Termometro(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public int obtenerTemperatura(){
        return sensorTemperatura.obtenerTemperatura();
    }

    public int convertirFahrenheitACelsius(int temperaturaAConvertir) {
        return (temperaturaAConvertir - 32) * (5 / 9);
    }

    public int convertirCelsiusAFahrenheit(int temperaturaAConvertir) {
        return (temperaturaAConvertir * (9/5)) + 32;
    }

}
