package org.example.U01;

public class TiposDemo {
    public static void main(String[] args){
        Caja<String> lugar= new Caja<>("Lab6");
        Caja<Integer> limite= new Caja<>(30);
        Caja<Sensor> dispositivo= new Caja<>(new Sensor("s01", lugar.obtener()));

        System.out.println(lugar.obtener());
        System.out.println(limite.obtener());
        System.out.println(dispositivo.obtener());
        System.out.println(dispositivo.obtener().id() + " - " + dispositivo.obtener().ubicacion());
    }
    
}
//toString ya tiene el record no es necesario modificar