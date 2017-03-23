/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        lbl_ad_hata.setVisible(false);
        lbl_soyad_hata.setVisible(false);
        lbl_email_hata.setVisible(false);
        lbl_telefon_hata.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ad = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        btn_kaydol = new javax.swing.JButton();
        lbl_ad_hata = new javax.swing.JLabel();
        txt_soyad = new javax.swing.JTextField();
        lbl_soyad_hata = new javax.swing.JLabel();
        lbl_soyad = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        lbl_email_hata = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_telefon = new javax.swing.JTextField();
        lbl_telefon_hata = new javax.swing.JLabel();
        lbl_telefon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ad.setText("Ad");
        getContentPane().add(lbl_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 42, -1, -1));
        getContentPane().add(txt_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 39, 195, -1));

        btn_kaydol.setText("KAYDOL");
        btn_kaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydolActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kaydol, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 287, -1, -1));

        lbl_ad_hata.setForeground(new java.awt.Color(204, 0, 0));
        lbl_ad_hata.setText("jLabel2");
        getContentPane().add(lbl_ad_hata, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 42, -1, -1));
        getContentPane().add(txt_soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 68, 195, -1));

        lbl_soyad_hata.setForeground(new java.awt.Color(204, 0, 0));
        lbl_soyad_hata.setText("jLabel2");
        getContentPane().add(lbl_soyad_hata, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 71, -1, -1));

        lbl_soyad.setText("Soyad");
        getContentPane().add(lbl_soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 71, -1, -1));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 195, -1));

        lbl_email_hata.setForeground(new java.awt.Color(204, 0, 0));
        lbl_email_hata.setText("jLabel2");
        getContentPane().add(lbl_email_hata, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        lbl_email.setText("Email");
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
        getContentPane().add(txt_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 195, -1));

        lbl_telefon_hata.setForeground(new java.awt.Color(204, 0, 0));
        lbl_telefon_hata.setText("jLabel2");
        getContentPane().add(lbl_telefon_hata, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        lbl_telefon.setText("Telefon");
        getContentPane().add(lbl_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydolActionPerformed
        // TODO add your handling code here:
        String Ad = txt_ad.getText();
        String iDesen = "[^A-z]"; //1. durum
        String iDesen2 = "[\\W\\d]";//2. durum
        Pattern pattern = Pattern.compile(iDesen);
        Matcher matcher = pattern.matcher(Ad);

        if (matcher.find()) {
            lbl_ad_hata.setText("Geçerli Bir Ad Giriniz");
            lbl_ad_hata.setVisible(true);
        } else {
            lbl_ad_hata.setVisible(false);
        }
        String Soyad = txt_soyad.getText();
        matcher = pattern.matcher(Soyad);

        if (matcher.find()) {
            lbl_soyad_hata.setText("Geçerli Bir Soyad Giriniz");
            lbl_soyad_hata.setVisible(true);
        } else {
            lbl_soyad_hata.setVisible(false);
        }
        
        String email = txt_mail.getText();
        iDesen2 = "\\A[A-z]\\w+@((yahoo)|(gmail)).com";//2. durum
        pattern = Pattern.compile(iDesen2);
        matcher = pattern.matcher(email);
        if (!matcher.find()) {
            lbl_email_hata.setText("Geçerli Bir Email Giriniz");
            lbl_email_hata.setVisible(true);
        } else {
            lbl_email_hata.setVisible(false);
        }
        
        String telefon = txt_telefon.getText();
        iDesen2 = "\\b\\d{4}\\-\\d{7}\\b";//2. durum
        pattern = Pattern.compile(iDesen2);
        matcher = pattern.matcher(telefon);
        if (!matcher.find()) {
            lbl_telefon_hata.setText("Geçerli Bir Telefon Giriniz");
            lbl_telefon_hata.setVisible(true);
        } else {
            lbl_telefon_hata.setVisible(false);
        }
        

    }//GEN-LAST:event_btn_kaydolActionPerformed

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
    private javax.swing.JButton btn_kaydol;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_ad_hata;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_email_hata;
    private javax.swing.JLabel lbl_soyad;
    private javax.swing.JLabel lbl_soyad_hata;
    private javax.swing.JLabel lbl_telefon;
    private javax.swing.JLabel lbl_telefon_hata;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_telefon;
    // End of variables declaration//GEN-END:variables
}
