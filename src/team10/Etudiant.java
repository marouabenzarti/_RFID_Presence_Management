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
public class Etudiant {
 int id;   
 int cin;
 String nom;
 String prenom;
 String classe;

    public Etudiant(int id, int cin, String nom, String prenom, String classe) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }
 
}
