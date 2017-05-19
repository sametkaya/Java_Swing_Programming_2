/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab12;

import bp2_lab10.Hasta;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author samet
 */
public class Soru1 extends javax.swing.JFrame {

    /**
     * Creates new form Soru1
     */
    public Soru1() {
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

        btn_tutaryaz = new javax.swing.JButton();
        btn_tutar = new javax.swing.JButton();
        btn_kontrol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tutaryaz.setText("Tutar Yaz");
        btn_tutaryaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutaryazActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tutaryaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, -1, -1));

        btn_tutar.setText("Tutar");
        btn_tutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        btn_kontrol.setText("kontrol");
        btn_kontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kontrolActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tutaryazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutaryazActionPerformed
        DataOutputStream dos = null;
        try {
            // TODO add your handling code here:
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_LAB2PU");
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT s FROM Satis s");
            // q.setParameter("did", doktorlar.get(cmb_doktorlar.getSelectedIndex()).getId());
            List<Satis> satislar = q.getResultList();
            dos = new DataOutputStream(new FileOutputStream("satislar.txt"));

            for (Satis satis : satislar) {
                dos.write(satis.getTutar());
            }
            dos.flush();
            dos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Soru1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Soru1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_tutaryazActionPerformed

    private void btn_tutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutarActionPerformed
        // TODO add your handling code here:
  
      
            // TODO add your handling code here:
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_LAB2PU");
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT m FROM Musteri m");
            List<Musteri> musteriler = q.getResultList();
            for (Musteri musteri : musteriler) {
                q = em.createQuery("SELECT s FROM Satis s WHERE s.idMusteri=:id");
                q.setParameter("id", musteri.getId());
                List<Satis> satislar = q.getResultList();
                int toplam = 0;

                for (Satis satis : satislar) {
                    toplam += satis.getTutar();
                }
                
                System.out.println(musteri.getId()+" "+toplam);

            }
//            
//            Query q = em.createQuery("SELECT sum(s.tutar) FROM Satis s Group By s.idMusteri ");
//            List<Object> satislar = q.getResultList();
//            for (Object satis : satislar) {
//                System.out.println(""+(Long)satis);
//        }
            

            
    }//GEN-LAST:event_btn_tutarActionPerformed

    private void btn_kontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kontrolActionPerformed
        // TODO add your handling code here:
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_LAB2PU");
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("SELECT m FROM Musteri m");
            List<Musteri> musteriler = q.getResultList();
        
        for (Musteri musteri : musteriler) {
             Path p= Paths.get("musteriler\\"+musteri.getId()+".txt");
             try {
                 p.toRealPath();
             } catch (IOException ex) {
                 System.out.println(musteri.getId()+" numaralı müsteri dosyası bulunamadı");
             }
        }
        
    }//GEN-LAST:event_btn_kontrolActionPerformed

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
            java.util.logging.Logger.getLogger(Soru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soru1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kontrol;
    private javax.swing.JButton btn_tutar;
    private javax.swing.JButton btn_tutaryaz;
    // End of variables declaration//GEN-END:variables
}