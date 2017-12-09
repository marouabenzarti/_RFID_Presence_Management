/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team10;

import db.ConnectionToDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabri
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    public Authentification() {
        initComponents();
       init_Panel();
        Admin_Button.addActionListener(new Admin_Action());             
       User_Button.addActionListener(new User_Action());
       Retour_Button.addActionListener(new Retour_Action() );
       Retour_Button.addActionListener(new Connexion_Action() );
       
        
    }
 class Admin_Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
           jLabel1.setVisible(true);
           jLabel2.setVisible(true); 
           Pass_TextField.setVisible(true);
           Login_TextField.setVisible(true);
           User_Button.setVisible(false);
           Retour_Button.setVisible(true);
           Connexion_Button.setVisible(true);
           
        }}
 class User_Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           jLabel3.setVisible(true);
          CIN_TextField.setVisible(true);
           Admin_Button.setVisible(false);
           Retour_Button.setVisible(true);
           Connexion_Button.setVisible(true);
        }}
 class Retour_Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           init_Panel();
        }}
 public void init_Panel(){
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        Login_TextField.setVisible(false);
        CIN_TextField.setVisible(false);
        Retour_Button.setVisible(false);
        Connexion_Button.setVisible(false);
        User_Button.setVisible(true);
        Admin_Button.setVisible(true);
        Pass_TextField.setVisible(false);
 }
 class Connexion_Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            String login =Login_TextField.getText()          ;                     /* login */
            String cin =CIN_TextField.getText()            ;                     /* cin */ 
            String mdp =Pass_TextField.getText()      ; 
            java.sql.Connection c = null;
            PreparedStatement p = null;
            c = ConnectionToDB.connection();
            
            if (Login_TextField.isVisible()){
            
            try {
                p = c.prepareStatement("Select motdepasse from administrateur where login=?");
                p.setString(1, login);
                ResultSet r = p.executeQuery();
                r.next();
                String mdpentree=r.getString(1);

                  if (mdp.equals(mdpentree)){
                      System.out.println("ok");
                /*******************
                         page suivante
                        *******************/
                  }
                  else{
                      /********************
                           toast : verifier mot de passe
                       *********************/
                  }
            } catch (SQLException ex) {
                Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
                /**************
                
                toast : verifier login
                        
                     **************/   
            }
            
            }
            else{
                
                
                  try {
                p = c.prepareStatement("Select nom,prenom from etudiant where cin=?");
                p.setString(1, cin);
                ResultSet r = p.executeQuery();
                r.next();
                String prenom=r.getString(1);
                String nom=r.getString(2);

                  
                      System.out.println(prenom +" "+ nom);
                      
                     
                /*******************
                         
                         * 
                         * 
                         * 
                         *         ( Bienvenue nom + " " + prenom )
                         * 
                         * 
                         * 
                 
                         * 
                        *******************/
                  
                 
            } catch (SQLException ex) {
                Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
                /**************
                
                toast : verifier cin
                        
                     **************/   
            }
            
            }
            
          
        }}
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        User_Button = new javax.swing.JButton();
        Admin_Button = new javax.swing.JButton();
        Login_TextField = new javax.swing.JTextField();
        Pass_TextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CIN_TextField = new javax.swing.JTextField();
        Connexion_Button = new javax.swing.JButton();
        Retour_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setLayout(null);

        User_Button.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        User_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        User_Button.setForeground(new java.awt.Color(40, 19, 19));
        User_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/user.png"))); // NOI18N
        User_Button.setText("User");
        jPanel1.add(User_Button);
        User_Button.setBounds(200, 20, 170, 30);

        Admin_Button.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        Admin_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        Admin_Button.setForeground(new java.awt.Color(24, 10, 10));
        Admin_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/man-with-tie.png"))); // NOI18N
        Admin_Button.setText("Admin");
        jPanel1.add(Admin_Button);
        Admin_Button.setBounds(50, 20, 150, 30);

        Login_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(Login_TextField);
        Login_TextField.setBounds(120, 80, 130, 40);

        Pass_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass_TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(Pass_TextField);
        Pass_TextField.setBounds(120, 170, 130, 40);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 80, 80, 30);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 170, 90, 30);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("CIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 120, 90, 40);

        CIN_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIN_TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CIN_TextField);
        CIN_TextField.setBounds(270, 120, 130, 40);

        Connexion_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        Connexion_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/connection.png"))); // NOI18N
        Connexion_Button.setText("Connexion");
        Connexion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Connexion_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Connexion_Button);
        Connexion_Button.setBounds(130, 250, 170, 40);

        Retour_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        Retour_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/return.png"))); // NOI18N
        Retour_Button.setText("Retour");
        Retour_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retour_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Retour_Button);
        Retour_Button.setBounds(300, 250, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/arriere.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-230, -180, 970, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_TextFieldActionPerformed

    private void Pass_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass_TextFieldActionPerformed

    private void Retour_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retour_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Retour_ButtonActionPerformed

    private void Connexion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Connexion_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Connexion_ButtonActionPerformed

    private void CIN_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIN_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIN_TextFieldActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Button;
    private javax.swing.JTextField CIN_TextField;
    private javax.swing.JButton Connexion_Button;
    private javax.swing.JTextField Login_TextField;
    private javax.swing.JPasswordField Pass_TextField;
    private javax.swing.JButton Retour_Button;
    private javax.swing.JButton User_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
