package com.cedaniel200.refactorizacion.rename;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TemperaturaTest {

    private SensorTemperatura sensorTemperatura;
    private Termometro termometro;

    @Before
    public void setup(){
        sensorTemperatura = mock(SensorTemperatura.class);
        termometro = new Termometro(sensorTemperatura);
    }

    @Test
    public void ceroGradosCelsiusATreintaYDosFharenheit(){
        Assert.assertEquals(32, termometro.converTemp(1, 0));
    }

    @Test
    public void ceroGradosFharenheitATreintaYDosCelsius(){
        Assert.assertEquals(0, termometro.converTemp(2,32));
    }
}
