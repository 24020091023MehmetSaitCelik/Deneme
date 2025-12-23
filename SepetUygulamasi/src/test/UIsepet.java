package test;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import tr.edu.istiklal.*;


public class UIsepet extends javax.swing.JFrame {
   DefaultListModel<String> modelim = new DefaultListModel<>();
   ArrayList<Urun> sepetim = new ArrayList<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UIsepet.class.getName());

    public UIsepet() {
        initComponents();
          cmbUrunler.addItem(new Ekmek("ekmek",20,"Tam Buğday", 15.0));
     cmbUrunler.addItem(new CepTelefonu("telefon",50000,"Apple","İphone 16 pro"));
     cmbUrunler.addItem(new Tekstil("Tekstil",250,"Kot Pantolon", 1,"lcw"));
    
    lstSepet.setModel(modelim);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        cmbUrunler = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSepet = new javax.swing.JList<>();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        lblToplam = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbUrunler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Özellikler" }));
        cmbUrunler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUrunlerActionPerformed(evt);
            }
        });

        lstSepet.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSepet);

        btnEkle.setText("Sepete Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnSil.setText("Sepetten Cikar");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        lblToplam.setText("Toplam");

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ürünler", "Tekstil", "Cep Telefonu", "Ekmek" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUrunler, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSil)
                                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUrunler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUrunlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUrunlerActionPerformed
       
    }//GEN-LAST:event_cmbUrunlerActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
   Object secilenObje = cmbUrunler.getSelectedItem();
        
        if (secilenObje instanceof Urun) {
            Urun secilen = (Urun) secilenObje;
            sepetim.add(secilen);
           
            modelim.addElement(secilen.getUrunAdi() + " - " + secilen.getUrunFiyati() + " TL"); 
            toplamiHesapla(); 
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
   int index = lstSepet.getSelectedIndex(); 
        
        if (index != -1) {
            sepetim.remove(index); 
            modelim.remove(index); 
            toplamiHesapla();
        }
}                                      

private void toplamiHesapla() {
   double toplamFiyat = 0;
    double toplamKdv = 0;

    for (Urun u : sepetim) {
        toplamFiyat += u.getUrunFiyati();
        toplamKdv += u.kdvHesapla(); 
    }

    double genelToplam = toplamFiyat + toplamKdv;

    lblToplam.setText("<html>Ürünler: " + toplamFiyat + " TL<br>" +
                      "Toplam KDV: " + toplamKdv + " TL<br>" +
                      "<b>Genel Toplam: " + genelToplam + " TL</b></html>");
    }//GEN-LAST:event_btnSilActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
              String secilen = cmbKategori.getSelectedItem().toString();
    cmbUrunler.removeAllItems(); 

    if (secilen.equals("Cep Telefonu")) {
        cmbUrunler.addItem(new CepTelefonu("telefon",50000,"Apple","İphone 16 pro"));
        cmbUrunler.addItem(new CepTelefonu("telefon",100000,"Apple","İphone 15 pro"));
    } else if (secilen.equals("Ekmek")) {
        cmbUrunler.addItem(new Ekmek("ekmek",20,"Tam Buğday", 15.0));
         cmbUrunler.addItem(new Ekmek("ekmek",10,"Kepekli", 200));
          cmbUrunler.addItem(new Ekmek("ekmek",25,"çavdar", 15.0));
    } 
    else if (secilen.equals("Tekstil")) {
        cmbUrunler.addItem(new Tekstil("Tekstil",250,"Kot Pantolon", 1,"LCW"));
         cmbUrunler.addItem(new Tekstil("Tekstil",350,"tişört", 1,"ZARA"));
          cmbUrunler.addItem(new Tekstil("Tekstil",450,"kazak", 1,"mavi"));
    } 
    }//GEN-LAST:event_cmbKategoriActionPerformed

    public static void main(String args[]) {
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new UIsepet().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSil;
    private javax.swing.JComboBox<Object> cmbKategori;
    private javax.swing.JComboBox<Object> cmbUrunler;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JList<String> lstSepet;
    // End of variables declaration//GEN-END:variables
}
