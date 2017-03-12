/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosyalmedyaapp;

import javax.swing.JOptionPane;

/**
 *
 * @author samet
 */
public class Frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Login
     */
    public Frm_Login() {
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

        txt_kullaniciAdi = new javax.swing.JTextField();
        btn_giris = new javax.swing.JButton();
        lbl_kullaniciAdi = new javax.swing.JLabel();
        lbl_sifre = new javax.swing.JLabel();
        btn_kayıtOl = new javax.swing.JButton();
        txtp_sifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GİRİŞ");

        btn_giris.setText("Giriş");
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        lbl_kullaniciAdi.setText("Kullanıcı Adı");

        lbl_sifre.setText("Şifre");

        btn_kayıtOl.setText("Kayıt Ol");
        btn_kayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_kullaniciAdi)
                    .addComponent(lbl_sifre))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kullaniciAdi)
                    .addComponent(txtp_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kayıtOl)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_kayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_kullaniciAdi))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_sifre)
                                .addComponent(txtp_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        // TODO add your handling code here:
        String kullaniciad = txt_kullaniciAdi.getText();
        String sifre = String.copyValueOf(txtp_sifre.getPassword());
        boolean girisyap = false;
        for (Kullanici kisi : Kullanici.Kullanicilar) {
            if ((kisi.KullaniciAdi.compareTo(kullaniciad) == 0) && (kisi.Sifre.compareTo(sifre) == 0)) {
                girisyap = true;
                break;
            }
        }
        if (girisyap) {
            Frm_KullaniciSayfasi newkullanicisayfasi = new Frm_KullaniciSayfasi();
            newkullanicisayfasi.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Kullanici Adi ya da Şifre Geçersiz! ");
            
        }
    }//GEN-LAST:event_btn_girisActionPerformed

    private void btn_kayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtOlActionPerformed
        // TODO add your handling code here:
            Frm_KayitOl kytol = new Frm_KayitOl();
            kytol.setVisible(true);
            this.dispose();
        
        
    }//GEN-LAST:event_btn_kayıtOlActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kullanici testk=new Kullanici();
                testk.Adi="Samet";
                testk.Soyadi="Kaya";
                testk.KullaniciAdi="q";
                testk.Sifre="1";
                testk.Cinsiyet="Erkek";
                Kullanici.Kullanicilar.add(testk);
                
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_kayıtOl;
    private javax.swing.JLabel lbl_kullaniciAdi;
    private javax.swing.JLabel lbl_sifre;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JPasswordField txtp_sifre;
    // End of variables declaration//GEN-END:variables
}