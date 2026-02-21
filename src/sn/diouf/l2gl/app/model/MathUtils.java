package sn.ndiayeawa.l2gl.app.model;

public class MathUtils {

    public static double arrondirDeuxDecimales(double valeur) {
        return Math.round(valeur * 100.0) / 100.0;
    }
}