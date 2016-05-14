package com.example.geopunto;


public class GeoPuntoAlt extends GeoPunto{

    protected double altitud;
    /**
     * Constructor que recibe los metodos necesarios longitud y latitud
     *
     * @param longitud
     * @param latitud
     */
    public GeoPuntoAlt(double longitud, double latitud, double altitud) {
        super(longitud, latitud);
        this.altitud = altitud;
    }

    @Override
    public double distancia(GeoPunto punto) {

        return super.distancia(punto);
    }


}
