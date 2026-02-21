package sn.diouf.l2gl.app.model;

public class Module {

    private String code;
    private String libelle;
    private double coefficient;

    // Constructeur complet
    public Module(String code, String libelle, double coefficient) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Code module invalide");
        }
        if (libelle == null || libelle.isBlank()) {
            throw new IllegalArgumentException("Libellé module invalide");
        }
        if (coefficient <= 0) {
            throw new IllegalArgumentException("Coefficient doit être > 0");
        }

        this.code = code;
        this.libelle = libelle;
        this.coefficient = coefficient;
    }

    // Constructeur surchargé
    public Module(String code, String libelle) {
        this(code, libelle, 1.0);
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public String toString() {
        return "Module{code=" + code + ", libelle=" + libelle + ", coefficient=" + coefficient + "}";
    }
}