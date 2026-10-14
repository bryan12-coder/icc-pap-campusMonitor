
package org.example;

import org.example.models.Lectura;
import org.example.models.Reporte;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        runLectura();//PC1.1a
        runTransformaciones();//PC1.1b
    }
    private static void runLectura(){
        Lectura<Double> temperatura = new Lectura<>(
            "S01", 22.5, "°C");
    Lectura<Integer> lectura1 = new Lectura<>("S02", 18, "Personas");

    System.out.println("Lecturas de CampusMonitor");
    System.out.println(temperatura.getIdSensor() + " | " + temperatura.getValor() + " " + temperatura.getUnidad());
    System.out.println(lectura1.getIdSensor() + " | " + lectura1.getValor() + " " + lectura1.getUnidad());

    System.out.println("Valores recuperados sin casting:");
    System.out.println("Temperatura: " + temperatura.getValor());
    System.out.println("Ocupación: " + lectura1.getValor());



    }
    private static void runTransformaciones(){
        Lectura<Double> temperatura = new Lectura<>(
            "S01", 22.5, "°C");
    Lectura<Integer> ocupacion = new Lectura<>("S02", 18, "Personas");
    Lectura<Double> fahrenheit= temperatura.transformar(c -> c * 9.0 /5.0 + 32 , "°F");
    Lectura<String>  ocupacionTexto=ocupacion.transformar(a -> a + " Personas ", " Texto ");
     System.out.println(" Originales "+  temperatura.getIdSensor() + " " +temperatura.getValor()+ " " + temperatura.getUnidad());
     System.out.println(" tranformado "+ fahrenheit.getIdSensor() + " " + fahrenheit.getValor()+ " " + fahrenheit.getUnidad());
     System.out.println(" Originales " + ocupacion.getIdSensor() + " "  +  ocupacion.getValor()+ " " + ocupacion.getUnidad());
     System.out.println(" tranformado "+ ocupacionTexto.getIdSensor() + " " + ocupacionTexto.getValor()+  " "  + ocupacionTexto.getUnidad());

     // Double -> Reporte
     Lectura<Double> temperatura2 = new Lectura<>(
        "S01", 22.5, "°C");
     Lectura<Reporte> reporte= temperatura2.transformar(valor -> new Reporte(temperatura2.getIdSensor(), temperatura2.getValor(), temperatura2.getUnidad()), "reporte");

     System.out.println("Transformada a Reporte " + " " + reporte.getIdSensor() + " " + reporte.getValor() + " "  + reporte.getUnidad());



    
    
    
        

    }
}
