package org.example.U01;

import java.util.function.Function;

public class MetodoDemo {

    public static void maint(String[] args){
        Caja<String> Original= new Caja<String>("Algoritmo");
        //Mapear el valor String de la caja a un Integer
        Integer longitud= Original.mapear(texto -> texto.length());
        String etiqueta= Original.mapear(texto -> "Materia: " + texto);


        System.out.println("Original" + Original.obtener());
        System.out.println("Longitud"+ longitud);
        System.out.println(etiqueta);


        //Function<String,Integer> fun= texto -> texto.length(); 
        //Integer longitud1= Original.mapear(fun);



    }
    
}
