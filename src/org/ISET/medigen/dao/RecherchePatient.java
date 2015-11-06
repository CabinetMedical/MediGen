
package org.ISET.medigen.dao;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RecherchePatient extends javax.swing.JFrame
{   Connecter cn=new Connecter();
    Statement stm;
   
    public RecherchePatient() 
    {
        initComponents();
//affiche les enregistrements de la table patient
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("date de naissance");
        model.addColumn("adresse");
        model.addColumn("telephone");
        model.addColumn("CNAM");
       // tab.setModel(model);
        String req="select * from patient";
        try
       {
           stm=cn.obtenirconnection().createStatement();
       ResultSet res=stm.executeQuery(req);
       
       
      while(res.next())
       {
         model.addRow(new Object[] {res.getInt("id"),res.getString("nom"),res.getString("prenom"),res.getDate("datenais"),res.getString("adresse"),res.getString("tel"),res.getBoolean("cnam")});
       }
      
              }
        catch(SQLException e)
        { System.out.print(e);}
        tab.setModel(model);
    
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGestionPatient = new javax.swing.JPanel();
        saisir = new javax.swing.JLabel();
        txtRech = new javax.swing.JTextField();
        titre = new javax.swing.JLabel();
        tablePatient = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnModifier = new javax.swing.JButton();
        btnRecherche = new javax.swing.JButton();
        btnajouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saisir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saisir.setText("saisir  votre nom de recherche  :");

        txtRech.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechActionPerformed(evt);
            }
        });

        titre.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        titre.setText("Gestions des patients");

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tablePatient.setViewportView(tab);

        javax.swing.GroupLayout panelGestionPatientLayout = new javax.swing.GroupLayout(panelGestionPatient);
        panelGestionPatient.setLayout(panelGestionPatientLayout);
        panelGestionPatientLayout.setHorizontalGroup(
            panelGestionPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionPatientLayout.createSequentialGroup()
                .addGroup(panelGestionPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGestionPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGestionPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGestionPatientLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(saisir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRech, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGestionPatientLayout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(titre))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelGestionPatientLayout.setVerticalGroup(
            panelGestionPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelGestionPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saisir)
                    .addComponent(txtRech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(tablePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        btnModifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModifier.setIcon(new javax.swing.ImageIcon("C:\\Windows\\System32\\config\\systemprofile\\Documents\\NetBeansProjects\\MediGen\\image\\modifier.png")); // NOI18N
        btnModifier.setText("modifier patient");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnRecherche.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRecherche.setIcon(new javax.swing.ImageIcon("C:\\Windows\\System32\\config\\systemprofile\\Documents\\NetBeansProjects\\MediGen\\image\\recherche.png")); // NOI18N
        btnRecherche.setText("recherche patient");
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        btnajouter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnajouter.setIcon(new javax.swing.ImageIcon("C:\\Windows\\System32\\config\\systemprofile\\Documents\\NetBeansProjects\\MediGen\\image\\ajouter.png")); // NOI18N
        btnajouter.setText("ajouter patient");
        btnajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRecherche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnajouter)
                .addGap(18, 18, 18)
                .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifier)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGestionPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGestionPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
    ModifierPatient a=new ModifierPatient();
     a.setVisible(true);
     dispose();        
    }//GEN-LAST:event_btnModifierActionPerformed

    private void txtRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechActionPerformed
       
    }//GEN-LAST:event_txtRechActionPerformed
/// string s= select nom || prenom from patient ; try res=stm.executeQuery  resultset 
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
 DefaultTableModel model= new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("date de naissance");
        model.addColumn("adresse");
        model.addColumn("telephone");
        model.addColumn("cnam");
        String rech=txtRech.getText();
      
         try
   
       {stm=cn.obtenirconnection().createStatement();
       //recherche les patient qui prendre le nom ou adresse ou prenom que nous doit saisir dans la zone de texte txtRech
        String req="select * from patient where nom LIKE '%"+rech+"%'or aderesse LIKE '%"+rech+"%' or prenom LIKE '%"+rech+"%'";
   
       ResultSet res=stm.executeQuery(req);
        
      while(res.next())
       {//affiche les données de l'enregistrement saisir dans la zone 
        model.addRow(new Object[] {res.getInt("id"),res.getString("nom"),res.getString("prenom"),res.getDate("datenais"),res.getString("adresse"),res.getString("tel"),res.getBoolean("cnam")});
       }
      
       }
       catch(SQLException e)
        { 
        JOptionPane.showMessageDialog(null,"n'existe pas ce patient");
        System.out.print(e);
        }
        tab.setModel(model);
        txtRech.setText("");
        
    
    }//GEN-LAST:event_btnRechercheActionPerformed

    private void btnajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterActionPerformed
        // TODO add your handling code here:
        /*AjouterPatient a=new AjouterPatient();
     a.setVisible(true);
     dispose();     *///  
    
    }//GEN-LAST:event_btnajouterActionPerformed

  
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
            java.util.logging.Logger.getLogger(RecherchePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecherchePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecherchePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecherchePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecherchePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JButton btnajouter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGestionPatient;
    private javax.swing.JLabel saisir;
    private javax.swing.JTable tab;
    private javax.swing.JScrollPane tablePatient;
    private javax.swing.JLabel titre;
    private javax.swing.JTextField txtRech;
    // End of variables declaration//GEN-END:variables
}
