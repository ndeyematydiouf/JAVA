
package sn.diouf.l2gl.app.model;

public class Vehicule extends Entite {
    private String immat;
    private String marque;
    private int km;

    public Vehicule(Long id, String immat, String marque, int km) {
        super(id);
        this.immat = immat;
        this.marque = marque;
        this.km = km;
    }

    @Override
    public void afficher() {
        System.out.println("Vehicule: " + immat + " (" + marque + ") - " + km + " km");
    }

    // Getters nécessaires pour le flux de données
    public String getImmat() { return immat; }
    public String getMarque() { return marque; }
    public int getKm() { return km; }
}