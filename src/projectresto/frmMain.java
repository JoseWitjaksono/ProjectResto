/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectresto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Witjaksono
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setTanggal();
        harga();
        Kasir();
    }
    int no_nota;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbMenu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        tfTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfKembali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDiskon = new javax.swing.JTextField();
        bPrint = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bDelete1 = new javax.swing.JButton();
        bTotal = new javax.swing.JButton();
        tfTumbal = new javax.swing.JTextField();
        tfJumlah = new javax.swing.JSpinner();
        bBack = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfTumbal2 = new javax.swing.JSpinner();
        tfHal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbTanggal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel1.setText("Nama Menu");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 200, 31);

        cbMenu.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        cbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indomie Rebus", "Telur Ceplok", "Es Teh", "Kopi" }));
        cbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMenuMouseClicked(evt);
            }
        });
        cbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenuActionPerformed(evt);
            }
        });
        cbMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbMenuKeyPressed(evt);
            }
        });
        jPanel2.add(cbMenu);
        cbMenu.setBounds(20, 50, 198, 31);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Jumlah");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 200, 31);

        jLabel3.setFont(new java.awt.Font("Aspergit", 0, 12)); // NOI18N
        jLabel3.setText("BACK | NEXT");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 280, 80, 31);
        jPanel2.add(tfHarga);
        tfHarga.setBounds(20, 170, 200, 29);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tbData.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Tanggal", "Kasir", "Menu", "Jumlah", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 570, 230);

        tfTotal.setEditable(false);
        tfTotal.setText("0");
        jPanel4.add(tfTotal);
        tfTotal.setBounds(30, 290, 200, 29);

        jLabel8.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel8.setText("Total Harga");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 260, 200, 31);

        tfBayar.setText("0");
        jPanel4.add(tfBayar);
        tfBayar.setBounds(30, 360, 200, 29);

        jLabel9.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel9.setText("Bayar");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 330, 200, 31);

        tfKembali.setEditable(false);
        tfKembali.setText("0");
        jPanel4.add(tfKembali);
        tfKembali.setBounds(350, 360, 200, 29);

        jLabel10.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel10.setText("Kembali");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(350, 330, 200, 31);

        jLabel11.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel11.setText("Total Diskon");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(350, 260, 200, 31);

        tfDiskon.setEditable(false);
        jPanel4.add(tfDiskon);
        tfDiskon.setBounds(350, 290, 200, 29);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(240, 10, 590, 420);

        bPrint.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        bPrint.setText("PRINT");
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });
        jPanel2.add(bPrint);
        bPrint.setBounds(20, 400, 190, 30);

        bSave.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        bSave.setText("SAVE");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel2.add(bSave);
        bSave.setBounds(20, 310, 190, 30);

        bDelete1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        bDelete1.setText("DELETE");
        bDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete1ActionPerformed(evt);
            }
        });
        jPanel2.add(bDelete1);
        bDelete1.setBounds(20, 340, 190, 30);

        bTotal.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        bTotal.setText("TOTAL HARGA");
        bTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTotalActionPerformed(evt);
            }
        });
        jPanel2.add(bTotal);
        bTotal.setBounds(20, 370, 190, 30);
        jPanel2.add(tfTumbal);
        tfTumbal.setBounds(0, 0, 0, 0);

        tfJumlah.setValue(1);
        tfJumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tfJumlahStateChanged(evt);
            }
        });
        tfJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfJumlahKeyPressed(evt);
            }
        });
        jPanel2.add(tfJumlah);
        tfJumlah.setBounds(20, 110, 200, 30);

        bBack.setText("<<");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        jPanel2.add(bBack);
        bBack.setBounds(20, 280, 50, 30);

        bNext.setText(">>");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });
        jPanel2.add(bNext);
        bNext.setBounds(160, 280, 50, 30);

        jLabel13.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel13.setText("Harga");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 140, 200, 31);

        tfTumbal2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tfTumbal2StateChanged(evt);
            }
        });
        jPanel2.add(tfTumbal2);
        tfTumbal2.setBounds(119, 10, 29, 0);

        tfHal.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jPanel2.add(tfHal);
        tfHal.setBounds(120, 250, 90, 30);

        jLabel14.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel14.setText("Nota No :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 250, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 840, 440);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        lbTanggal.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lbTanggal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lbTanggal);
        lbTanggal.setBounds(70, 60, 120, 31);

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selamat Datang");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 20, 140, 31);

        tfNama.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        tfNama.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tfNama);
        tfNama.setBounds(170, 20, 120, 31);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(579, 0, 260, 120);

        jLabel4.setFont(new java.awt.Font("SquareFont", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KANTIN smk TELKOM");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 0, 470, 50);

        jLabel6.setFont(new java.awt.Font("SquareFont", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WARUNG PAK YOYOK");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 40, 370, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\logo12.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 100, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 120);

        setSize(new java.awt.Dimension(856, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        int jml = Integer.parseInt(tfJumlah.getValue().toString());
        if("".equals(tfJumlah.getValue()) || "".equals(tfHarga.getText()))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String MN = "";
            if(cbMenu.getSelectedItem().equals("Indomie Rebus"))
            {
                MN = "1";
            }
            if(cbMenu.getSelectedItem().equals("Telur Ceplok"))
            {
                MN = "2";
            }
            if(cbMenu.getSelectedItem().equals("Es Teh"))
            {
                MN = "3";
            }
            if(cbMenu.getSelectedItem().equals("Kopi"))
            {
                MN = "4";
            }           
          String SQL = "INSERT INTO tb_transaksi (id_nota,tanggal_transaksi,kasir,menu,jumlah,harga)"+"VALUES('"+no_nota+"','"+lbTanggal.getText()+"','"+tfNama.getText()+"','"+MN+"','"+tfJumlah.getValue()+"','"+tfHarga.getText()+"')";
          int status = KoneksiDB.execute(SQL);
          if(status == 1){
              JOptionPane.showMessageDialog(this,"Data berhasil ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
              selectData();
          } else {
              JOptionPane.showMessageDialog(this,"Data GAGAL ditambahkan","Sukses",JOptionPane.WARNING_MESSAGE);
          }
        }
        
    }//GEN-LAST:event_bSaveActionPerformed

    private void bTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTotalActionPerformed
        // TODO add your handling code here:
        selectData();
        total();
        kembali();
    }//GEN-LAST:event_bTotalActionPerformed

    private void bDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelete1ActionPerformed
        // TODO add your handling code here:
        int baris = tbData.getSelectedRow();
        if(baris != -1)
        {
            String NIS = tbData.getValueAt(baris,0).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE id_transaksi='"+tfTumbal.getText()+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1)
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "GAGAL", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Yang Akan Di Hapus", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    
    }//GEN-LAST:event_bDelete1ActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        // TODO add your handling code here:
        int baris = tbData.getSelectedRow();
        if(baris != -1)
        {
            tfTumbal.setText(tbData.getValueAt(baris, 0).toString());
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Warung Sandhy Putra");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)");
        try
        {
            tbData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannont Print%s%n", e.getMessage());
        }
        
    }//GEN-LAST:event_bPrintActionPerformed

    private void cbMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbMenuKeyPressed

    }//GEN-LAST:event_cbMenuKeyPressed

    private void cbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMenuMouseClicked

    }//GEN-LAST:event_cbMenuMouseClicked

    private void cbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenuActionPerformed
        // TODO add your handling code here:
        harga();
    }//GEN-LAST:event_cbMenuActionPerformed

    private void tfJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJumlahKeyPressed

    }//GEN-LAST:event_tfJumlahKeyPressed

    private void tfJumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tfJumlahStateChanged
        // TODO add your handling code here:
        harga();
    }//GEN-LAST:event_tfJumlahStateChanged


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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bDelete1;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bTotal;
    private javax.swing.JComboBox<String> cbMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfDiskon;
    private javax.swing.JLabel tfHal;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JSpinner tfJumlah;
    private javax.swing.JTextField tfKembali;
    private javax.swing.JLabel tfNama;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfTumbal;
    private javax.swing.JSpinner tfTumbal2;
    // End of variables declaration//GEN-END:variables

        
}

