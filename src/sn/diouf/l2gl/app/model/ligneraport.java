package sn.diouf.l2gl.app.model;

// Un record génère automatiquement constructeur, getters, equals et toString
public record LigneRapport(String immat, String marque, String etat, int km) { }