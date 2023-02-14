package com.quirino.metodos;

public class Clase02 {

    public static void    direccion(String nombre, String calle, String Municipio, String Estado, String numero){

        System.out.println("Su nombre es:"
                 + nombre
                + "Su calle es:" + calle
                + "Su municipio es:" + Municipio
                + "Su estado es:" + Estado
                + "Su numero de casa es" + numero
        );
    }
    public static void  midireccion(){
        direccion("Emanuel", "Reforma", "Jalacingo", "Veracruz","30");
        direccion("Uriel", "18 de Marzo", "Teziutlan","Puebla","23");
        direccion("Oscar", "Independencia", "Jalacingo","Veracruz", "20");
        direccion("Monse","Hidaldo", "Altotonga", "Veracruz","21");
        direccion("Jacinto","Bugambilias","Teziutlan","Puebla","333");

    }
}
