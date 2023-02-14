package com.quirino.metodos;

public class Clase01 {

        public static void nombre(String nombre, String color, int edad) {
            System.out.println (
                    "Su nombre es " + nombre
                    + "y tienes" + edad + "años"
                    + "su color favorito  es" + color
            );
        }

        public void tunombreyedad() {

            nombre("Emanuel", "Azul", Integer.parseInt("24"));
            nombre("Ariel", "Rojo", Integer.parseInt("20"));
            nombre("Uriel", "Morado", Integer.parseInt("23"));
            nombre("Oscar", "Verde", Integer.parseInt("21"));
            nombre("Saul","Amarillo", Integer.parseInt("19"));




        }
    }


