package org.example.U01;
//Clase generica

import java.util.function.Function;

public class Caja<T> {
    //dato generico
    private final T valor;
    public Caja(T valor){
        this.valor= valor;
    }
    //Metodo generico
    //Getter
    public T obtener(){
        return valor;
    }
    //Metodo gnerico --> Retornar x cosa
    public <R> R mapear(Function<T,R> operacion){//Llama a la funcion,Devuelva un R
        R resultado= operacion.apply(valor); //El apply hace que se ejecute la funcion
        return resultado; //Aplica la funcion de mapeo

    }
    
}
