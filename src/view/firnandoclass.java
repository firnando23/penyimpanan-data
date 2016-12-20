/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import koneksi.koneksi;
import implementasi.kelassaya;
import cinterfase.cinterface;
import model.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author microsoft
 */
public class firnandoclass extends javax.swing.JFrame {
    List <model> record = new ArrayList<>();
    cinterface firnandoservice;
    int row;

    /**
     * Creates new form firnandoclass
     */
    public firnandoclass() {
        initComponents();
        firnandoservice = new kelassaya();
        this.refresdata();
    }
    private void baru(){
         jBTN_BARU.setEnabled(false);
        jBTN_SIMPAN.setEnabled(true);
        jBTN_UBAH.setEnabled(false);
        jBTN_HAPUS.setEnabled(false);
        jTX_NAMA.setEditable(true);
        jTX_NOMOR.setEditable(true);
        jTA_ALAMAT.setEditable(true);
        jTX_EMAIL.setEditable(true);
        bersih();
        
    }
    private void bersih2(){
        jBTN_BARU.setEnabled(true);
        jBTN_SIMPAN.setEnabled(false);
        jBTN_UBAH.setEnabled(false);
        jBTN_HAPUS.setEnabled(false);
        jTX_NAMA.setEditable(false);
        jTX_NOMOR.setEditable(false);
        jTA_ALAMAT.setEditable(false);
        jTX_EMAIL.setEditable(false);
        bersih();
    }
    
    private void bersih(){
         jTX_ID.setText("");
        jTX_NAMA.setText("");
        jTX_NOMOR.setText("");
        jTA_ALAMAT.setText("");
        jTX_EMAIL.setText("");
        jTX_NAMA.requestFocus();
    }
    
    void panggildata (){
        try {
        record = firnandoservice.tampil();
    } catch (Exception e) {
    }
    }
    void isitabel(){
        Object data[][] = new Object[record.size()][5];
int x=0;
for(model teman : record){
data[x][0]=teman.getId();
data[x][1]=teman.getNama();
data[x][2]=teman.getNohp();
data[x][3]=teman.getEmail();
data[x][4]=teman.getAlamat();
x++;
}
String judul[]={"ID","Nama","Nomor Handphone","Email","Alamat"};
jTBL_Teman.setModel(new DefaultTableModel(data,judul));
    }

    void refresdata(){
        panggildata();
isitabel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTX_ID = new javax.swing.JTextField();
        jTX_NAMA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTX_NOMOR = new javax.swing.JTextField();
        jTX_EMAIL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_ALAMAT = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBL_Teman = new javax.swing.JTable();
        jBTN_UBAH = new javax.swing.JButton();
        jBTN_SIMPAN = new javax.swing.JButton();
        jBTN_BARU = new javax.swing.JButton();
        jBTN_HAPUS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("DATA TEMAN");

        jLabel1.setText("ID");

        jTX_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTX_IDActionPerformed(evt);
            }
        });

        jLabel2.setText("NAMA");

        jLabel3.setText("NOMOR TELEPON");

        jLabel5.setText("EMAIL");

        jLabel4.setText("ALAMAT");

        jTA_ALAMAT.setColumns(20);
        jTA_ALAMAT.setRows(5);
        jScrollPane1.setViewportView(jTA_ALAMAT);

        jTBL_Teman.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBL_Teman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBL_TemanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTBL_Teman);

        jBTN_UBAH.setText("UBAH");
        jBTN_UBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_UBAHActionPerformed(evt);
            }
        });

        jBTN_SIMPAN.setText("SIMPAN");
        jBTN_SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_SIMPANActionPerformed(evt);
            }
        });

        jBTN_BARU.setText("BARU");
        jBTN_BARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_BARUActionPerformed(evt);
            }
        });

        jBTN_HAPUS.setText("HAPUS");
        jBTN_HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_HAPUSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(496, 496, 496)
                                    .addComponent(jBTN_UBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBTN_SIMPAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBTN_BARU, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBTN_HAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTX_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTX_NAMA, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(jTX_NOMOR)
                                    .addComponent(jTX_EMAIL)
                                    .addComponent(jScrollPane1))))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTX_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTX_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTX_NOMOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTX_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTN_UBAH)
                        .addGap(18, 18, 18)
                        .addComponent(jBTN_SIMPAN)
                        .addGap(18, 18, 18)
                        .addComponent(jBTN_BARU)
                        .addGap(18, 18, 18)
                        .addComponent(jBTN_HAPUS)))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTX_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTX_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTX_IDActionPerformed

    private void jTBL_TemanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBL_TemanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBL_TemanMouseClicked

    private void jBTN_UBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_UBAHActionPerformed
        // TODO add your handling code here:
        String id = jTX_ID.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(this,"Data Kosong");
        }else{
            try {
                model teman= new model();
                teman.setId(jTX_ID.getText());
                teman.setNama(jTX_NAMA.getText());
                teman.setNohp(jTX_NOMOR.getText());
                teman.setEmail(jTX_EMAIL.getText());
                teman.setAlamat(jTA_ALAMAT.getText());
                firnandoservice.edit(teman);
                JOptionPane.showMessageDialog(this,"Data Telah Berhasil Di Edit");
                panggildata();
                refresdata();
            } catch (SQLException z) {
                System.out.println("gagal mengedit"+z);
            }
        }
    }//GEN-LAST:event_jBTN_UBAHActionPerformed

    private void jBTN_SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_SIMPANActionPerformed
        // TODO add your handling code here:
        String nama = jTX_NAMA.getText();

        try {
            model teman= new model();
            teman.setId(jTX_ID.getText());
            teman.setNama(jTX_NAMA.getText());
            teman.setNohp(jTX_NOMOR.getText());
            teman.setEmail(jTX_EMAIL.getText());
            teman.setAlamat(jTA_ALAMAT.getText());
            firnandoservice.simpan(teman);
            JOptionPane.showMessageDialog(this,"Data Telah Tersimpan");
            panggildata();
            refresdata();

        } catch (SQLException z) {
            System.out.println("Gagal Disimpan"+z);
            // JOptionPane.showMessageDialog(this,"Data gagaal ");
        }
    }//GEN-LAST:event_jBTN_SIMPANActionPerformed

    private void jBTN_BARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_BARUActionPerformed
        // TODO add your handling code here:
        baru();
    }//GEN-LAST:event_jBTN_BARUActionPerformed

    private void jBTN_HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_HAPUSActionPerformed
        // TODO add your handling code here:
        String kode = jTX_ID.getText();
        String nama  = jTX_NAMA.getText();
        String nomor = jTX_NOMOR.getText();
        String email = jTX_EMAIL.getText();
        String alamat= jTX_EMAIL.getToolTipText();
        // if(id.trim().equals("") && nama.trim().equals("")){
            //JOptionPane.showMessageDialog(this,"Data Kosong");
            //}else{
            try {
                firnandoservice.hapus(jTBL_Teman.getValueAt(row, 0).toString());
                JOptionPane.showMessageDialog(this,"Data Telah Terhapus");
                panggildata();
                refresdata();
            } catch (SQLException z) {
                System.out.println("Gagal Dihapus"+z);
            }
    }//GEN-LAST:event_jBTN_HAPUSActionPerformed

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
            java.util.logging.Logger.getLogger(firnandoclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firnandoclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firnandoclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firnandoclass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firnandoclass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTN_BARU;
    private javax.swing.JButton jBTN_HAPUS;
    private javax.swing.JButton jBTN_SIMPAN;
    private javax.swing.JButton jBTN_UBAH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_ALAMAT;
    private javax.swing.JTable jTBL_Teman;
    private javax.swing.JTextField jTX_EMAIL;
    private javax.swing.JTextField jTX_ID;
    private javax.swing.JTextField jTX_NAMA;
    private javax.swing.JTextField jTX_NOMOR;
    // End of variables declaration//GEN-END:variables
}
