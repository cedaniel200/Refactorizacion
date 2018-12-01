package com.cedaniel200.refactorizacion.solucion;

public class Termometro {

    private Celsius celsius;
    private Fahrenheit fahrenheit;
    private SensorTemperatura sensorTemperatura;

    public Termometro(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
        this.fahrenheit = new Fahrenheit();
        this.celsius = new Celsius();
    }

    public int obtenerTemperatura(){
        return sensorTemperatura.obtenerTemperatura();
    }

    public int convertirFahrenheitACelsius(int temperaturaAConvertir){
        return fahrenheit.aCelsius(temperaturaAConvertir);
    }

    public int convertirCelsiusAFahrenheit(int temperaturaAConvertir) {
        return celsius.aFahrenheit(temperaturaAConvertir);
    }
}