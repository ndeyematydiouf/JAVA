package sn.diouf.l2gl.app.model;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InMemoryCrud<Vehicule> repo = new InMemoryCrud<>();

        // Création
        repo.create(new Vehicule(1L, "DK-100-AA", "Toyota", 8000));
        repo.create(new Vehicule(2L, "DK-200-BB", "Peugeot", 22000));

        // Rapport via Streams
        System.out.println("--- GÉNÉRATION DU RAPPORT ---");
        List<LigneRapport> rapport = repo.findAll().stream()
                .map(v -> new LigneRapport(v.getImmat(), v.getMarque(), "ACTIF", v.getKm()))
                .toList();

        rapport.forEach(System.out::println);

        // Filtrage Maintenance
        System.out.println("\n--- VÉHICULES À RÉVISER ---");
        repo.findAll().stream()
                .filter(v -> v.getKm() > 20000)
                .forEach(Vehicule::afficher);
    }
}