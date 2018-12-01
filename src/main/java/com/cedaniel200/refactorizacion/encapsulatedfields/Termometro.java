package com.cedaniel200.refactorizacion.encapsulatedfields;

public class Termometro {

    Celsius celsius;
    Fahrenheit fahrenheit;
    SensorTemperatura sensorTemperatura;

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