package com.cedaniel200.refactorizacion.rename;

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
        assertEquals(32, termometro.converTemp(1, 0));
    }

    @Test
    public void ceroGradosFharenheitATreintaYDosCelsius(){
        assertEquals(0, termometro.converTemp(2,32));
    }

    @Test
    public void cienGradosCelsiusADoscientosDoceFahrenheit(){
        assertEquals(212, termometro.converTemp(1, 100));
    }

    @Test
    public void doscientosDoceGradosFahrenheitACienCelsius(){
        assertEquals(100, termometro.converTemp(2, 212));
    }
}
