/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team10;

import db.ConnectionToDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import serial.RFIDReader;
import serial.RFIdListener;
import serial.*;

/**
 *
 * @author Raed
 */
public class Lecture {

    private static String last;

    public static void main(String[] args) {
        RFIDReader r = new RFIDReader();
        r.start(new RFIdListener() {

            @Override
            public void onRead(String tagId) {
                try {
                    if (!Objects.equals(last, tagId)) {
                        last = tagId;
                        System.out.println("GITOO " + tagId);

                   }
                    
                    
            //User.setMsg("Erreur d'ajout : " + e);
                    // ResultSet r1 =s.executeQuery("insert into ficheetudiant (id,date,evenement,entree,sortie) values ('"+ tagId+ "','"+ dateFormat.format(date)+"','eve1','NULL','NULL');");
                } catch (Exception ex) {
                    Logger.getLogger(Lecture.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void enregistrer(String tagid){
        //                        //date
//                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//                    Date date = new Date();
//                    System.out.println(dateFormat.format(date));
//                    //cnx
//                    java.sql.Connection c = null;
//                    PreparedStatement p = null;
//                    String s = "INSERT INTO ficheetudiant (idtag,date,evenement,entree,sortie)VALUES ('" + tagId + "','" + dateFormat.format(date) + "','even1','11:30:00','11:30:00')";
//                    //String s = "INSERT INTO ficheetudiant VALUES ('1','00-E2-00-60-03-14-FD-05-18-00-00-00','" + dateFormat.format(date) + "','even1','11:30:00','11:30:00')";
//
//                    c = ConnectionToDB.connection();
//                    p = c.prepareStatement(s);
//                    /*p.setString(1,log);
//                     p.setString(1,mdp);
//                     p.setString(1,cat);*/
//                    int x = p.executeUpdate();
//                    //User.setMsg("Donnees ajoutees avec succes");
//                    System.out.println("Donnees ajoutees avec succes");
    }

}
