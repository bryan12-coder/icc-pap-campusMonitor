
package org.example;

import org.example.models.Lectura;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        runLectura();//PC1.1a
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
}
