package com.cedaniel200.refactorizacion.rename;

public class Termometro {

    SensorTemperatura st;

    public Termometro(SensorTemperatura st) {
        this.st = st;
    }

    public int obtenerTemp(){
        return st.obtenerTemperatura();
    }

    public int converTemp(int ti, int te){
        int temp = -100;
        if(ti == 1){
            // de c a f
            temp = (te * (9/5)) + 32;
        }else if(ti == 2){
            // de f a c
            temp = (te - 32) * (5/9);
        }
        return temp;
    }

}
