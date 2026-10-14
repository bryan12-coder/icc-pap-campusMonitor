package org.example.models;

import java.util.function.Function;

public class Lectura<T> {
    private String idSensor;
    private T valor;
    private String unidad;
    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }
    public String getIdSensor() {
        return idSensor;
    }
    public T getValor() {
        return valor;
    }
    public String getUnidad() {
        return unidad;
    }
    public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad){
        if(conversor== null){
            throw new IllegalArgumentException("El conversor no puede ser nulo");
            
        }
        R nuevoValor=conversor.apply(valor);
            if(nuevoValor== null){
                throw new IllegalArgumentException("El resultado no puede ser nulo");
            }
        return new Lectura<> (idSensor, nuevoValor ,nuevaUnidad);
    }

    

    
}
