package com.example.geopunto;

public class GeoPunto {

    private double longitud, latitud;

    /**
     * Constructor que recibe los metodos necesarios longitud y latitud
     * @param latitud
     * @param longitud
     */
    public GeoPunto(double longitud, double latitud) {
        this.longitud = (int) (longitud * 1E6);
        this.latitud = (int) (latitud * 1E6);
    }


    /**
     * Método toString que me devuelve la concatenacion de la latitud y longitud del objeto
     * @return Cadena concatenada
     */
    @Override
    public String toString() {
        return longitud + " lon | " + latitud + " lat";
    }

    /**
     * Metodo que calcula la distancia de un objeto punto con respecto a los datos del otro objeto punto que instancie este metodo
     * @param punto Objeto que contiene lon y lat
     * @return distancia entre objetos
     */
    public double distancia(GeoPunto punto){
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}
