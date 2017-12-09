/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team10;

/**
 *
 * @author sabri
 */
public class Salle {
    int jour;
    String nom;
    String seance;
    String classe;
    String matiere;
    Prof prof;

    public Salle(int jour, String nom, String seance, String classe, String matiere, Prof prof) {
        this.jour = jour;
        this.nom = nom;
        this.seance = seance;
        this.classe = classe;
        this.matiere = matiere;
        this.prof = prof;
    }
    
    
}
