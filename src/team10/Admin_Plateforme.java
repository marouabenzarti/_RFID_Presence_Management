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
public class Admin_Plateforme extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Plateforme
     */
    public Admin_Plateforme() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crée_evnt = new javax.swing.JButton();
        Ajout_etud = new javax.swing.JButton();
        Liste_event = new javax.swing.JButton();
        Déconnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(150, 150));
        getContentPane().setLayout(null);

        crée_evnt.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        crée_evnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/calendar-add-event-button-with-plus-sign.png"))); // NOI18N
        crée_evnt.setText("Créer événement");
        crée_evnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crée_evntActionPerformed(evt);
            }
        });
        getContentPane().add(crée_evnt);
        crée_evnt.setBounds(90, 50, 240, 60);

        Ajout_etud.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Ajout_etud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/Add.png"))); // NOI18N
        Ajout_etud.setText("Ajouter étudiant");
        Ajout_etud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajout_etudActionPerformed(evt);
            }
        });
        getContentPane().add(Ajout_etud);
        Ajout_etud.setBounds(90, 120, 240, 60);

        Liste_event.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Liste_event.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/list.png"))); // NOI18N
        Liste_event.setText("Evenements d'aujourd'hui");
        getContentPane().add(Liste_event);
        Liste_event.setBounds(90, 190, 240, 60);

        Déconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/logout.png"))); // NOI18N
        Déconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DéconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(Déconnexion);
        Déconnexion.setBounds(358, 12, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team10/images/6.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 2000));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-245, -100, 860, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ajout_etudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajout_etudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ajout_etudActionPerformed

    private void crée_evntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crée_evntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crée_evntActionPerformed

    private void DéconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DéconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DéconnexionActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Plateforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Plateforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Plateforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Plateforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Plateforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajout_etud;
    private javax.swing.JButton Déconnexion;
    private javax.swing.JButton Liste_event;
    private javax.swing.JButton crée_evnt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
