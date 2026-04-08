
package sn.diouf.l2gl.app.model;

public abstract class Entite implements Identifiable {
    private final Long id; // Final : l'ID ne change jamais après création

    protected Entite(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("L'ID doit être un nombre positif.");
        }
        this.id = id;
    }

    @Override
    public Long getId() { return id; }

    // Chaque classe (Véhicule, Conducteur) devra implémenter sa propre version
    public abstract void afficher();
}