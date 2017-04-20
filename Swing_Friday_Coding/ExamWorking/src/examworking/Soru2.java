/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examworking;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samet
 */
public class Soru2 extends javax.swing.JFrame {
    DefaultTableModel dtm;
     DefaultTableModel dtm2;
    /**
     * Creates new form Soru2
     */
    public Soru2() {
        initComponents();
        dtm= new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"NO","ADI","SOYADI","BÖLÜM","MAAS"});
        tbl_personel.setModel(dtm);
        
         dtm2= new DefaultTableModel();
        dtm2.setColumnIdentifiers(new Object[]{"BÖLÜM","MAAS"});
        tbl_ortalama.setModel(dtm2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ekle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_personel = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ortalama = new javax.swing.JTable();
        btn_aktar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ekle.setText("EKLE");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 40, -1, -1));

        tbl_personel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_personel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 223));

        tbl_ortalama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_ortalama);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 440, 220));

        btn_aktar.setText("AKTAR");
        btn_aktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aktarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aktar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        // TODO add your handling code here:
        Personel p1= new Personel("ahmet","ak","müdürlük",2000);
        dtm.addRow(new Object[]{p1.No,p1.Adi,p1.Soyadi,p1.Birim,p1.Maas});
        Personel p2= new Personel("pelin","ağaç","müdürlük",2000);
        dtm.addRow(new Object[]{p2.No,p2.Adi,p2.Soyadi,p2.Birim,p2.Maas});
        Personel p3= new Personel("hakan","peker","yazılım",2000);
        dtm.addRow(new Object[]{p3.No,p3.Adi,p3.Soyadi,p3.Birim,p3.Maas});
        
       
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_aktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aktarActionPerformed
        // TODO add your handling code here:

        double ytoplam=0;
        int y=0;
           double mtoplam=0;
           int m=0;
           
        for (int i = 0; i < dtm.getRowCount(); i++) {
            if(dtm.getValueAt(i, 3).toString().compareTo("yazılım")==0)
            {
                ytoplam+=Double.parseDouble(dtm.getValueAt(i, 4).toString());
                y++;
            }
            if(dtm.getValueAt(i, 3).toString().compareTo("müdürlük")==0)
            {
                mtoplam+=Double.parseDouble(dtm.getValueAt(i, 4).toString());
                m++;
            }
                        
        }
        
        dtm2.addRow(new Object[]{"müdürlük",mtoplam/m});
                dtm2.addRow(new Object[]{"yazılım",ytoplam/y});
       
        
    }//GEN-LAST:event_btn_aktarActionPerformed

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
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aktar;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_ortalama;
    private javax.swing.JTable tbl_personel;
    // End of variables declaration//GEN-END:variables
}