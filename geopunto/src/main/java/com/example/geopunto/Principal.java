package com.example.geopunto;


public class Principal {

    public static void main(String[] main) {
        GeoPunto z, w;
        z = new GeoPunto(-77.0262437,-12.1042164);
        w = new GeoPunto(-77.0273485,-12.1062619);


        System.out.println("Distancia: " + z.distancia(w));
    }

}
