package sn.diouf.l2gl.app;

import sn.diouf.l2gl.app.model.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("TD2 OK - Java fonctionne");

        // ===== Etudiants =====
        Etudiant e1 = new Etudiant("2026-001", "Awa");
        Etudiant e2 = new Etudiant("2026-002");

        System.out.println(e1);
        System.out.println(e2);

        // ===== Modules =====
        Module m1 = new Module("JAVA", "Programmation Java", 2.0);
        Module m2 = new Module("ALGO", "Algorithmique");

        System.out.println(m1);
        System.out.println(m2);

        // ===== Note valide =====
        Note n1 = new Note(e1, m1, 17.5);
        System.out.println(n1);

        // ===== Test note invalide =====
        try {
            Note n2 = new Note(e2, m2, 25);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur attendue : " + ex.getMessage());
        }

        // ===== BILAN FINAL =====
        System.out.println("\nBILAN TD2:");
        System.out.println("Etudiants créés: " + Etudiant.getCompteur());
        System.out.println("Dernière note: 17.5/20");
        System.out.println("Points (coeff): " + n1.points());
    }
}