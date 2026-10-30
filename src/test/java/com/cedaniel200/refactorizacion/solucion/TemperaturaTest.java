package com.cedaniel200.refactorizacion.solucion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TemperaturaTest {

    private SensorTemperatura sensorTemperatura;
    private Termometro termometro;

    @BeforeEach
    public void setup(){
        sensorTemperatura = mock(SensorTemperatura.class);
        termometro = new Termometro(sensorTemperatura);
    }

    @Test
    public void ceroGradosCelsiusATreintaYDosFharenheit(){
        assertEquals(32, termometro.convertirCelsiusAFahrenheit( 0));
    }

    @Test
    public void ceroGradosFharenheitATreintaYDosCelsius(){
        assertEquals(0, termometro.convertirFahrenheitACelsius(32));
    }
}
