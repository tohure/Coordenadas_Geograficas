package com.example.geopunto;


public class Principal {

    public static void main(String[] main) {

        GeoPunto lista[] = new GeoPunto[3];

        lista[0] = new GeoPunto(-1.5, 3.0);
        lista[1] = new GeoPuntoAlt(-1.2, -3.0,999);
        lista[2] = new GeoPuntoAlt(-1.5, 3.0,9999);

        for (GeoPunto aLista : lista) {
            if (aLista instanceof GeoPuntoAlt) {
                if (((GeoPuntoAlt) aLista).altitud >= 1000){
                    System.out.println("GeoPunto Distance Muy Alta=" + ((GeoPuntoAlt) aLista).altitud);
                }else{
                    System.out.println("GeoPunto Distance Normal Alt: " + aLista);
                }
            }else{
                System.out.println("GeoPunto Distance Normal: " + aLista);
            }
        }

    }

}
