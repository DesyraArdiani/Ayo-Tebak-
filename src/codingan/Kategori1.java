/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingan;

import javax.swing.*;
import java.awt.Color;
import javax.swing.Timer;
import java.sql.*;
import com.mysql.cj.jdbc.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.util.Random;
/**
 *
 * @author acer
 */
public class Kategori1 extends Kategori {
    /**
     * Creates new form Gambar
     */
    
    
    void wkt()
    {    
        min.setText(""+menit);
        sec.setText(""+detik);
        timer = new Timer(1000,  e -> {
        if(detik==0){
             detik=60;
             menit--;
         }
        
        if(menit==0){
        min.setForeground(Color.red);
        sec.setForeground(Color.red);
        tengah.setForeground(Color.red);
        }
        
         if(menit<0){
         menit=0;
         detik=0;
         timer.stop();
         }else{
         detik--;
         min.setText(""+menit);
         sec.setText(""+detik);
         }
         });
         sec.setText(Integer.toString(detik));
         timer.setInitialDelay(0);
         timer.start();
    };

    
    public Kategori1()
    {
        initComponents();
        setLocationRelativeTo(null);
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        wkt();  
        namapemain();
        soal();
    }
    
    
    @Override
   public void namapemain()
   {
       namapemain.setText(namap);
   }
     
  
   public void soal(){
//   Random random = new Random();
//   int no[] ={8,9,10,11,12};
//   int a = 1 + random.nextInt(6); soanya dia saya ga acak

   System.out.println(acak); 
   rs = Koneksi.executeReadQuerry("select * from gambar where id_gambar = "+acak+""); 
   
   try 
   {    
         if ( acak <= 8) 
         {
            rs.next();
            
         if (JawabanA.isSelected() && JawabanA.getText().equals(jawaban)){
            skor+=10;
         }
         
         if (JawabanB.isSelected()&& JawabanB.getText().equals(jawaban)){
            skor+=10;
         }
        
         if (JawabanC.isSelected()&& JawabanC.getText().equals(jawaban)){
            skor+=10;
         }
        
         if (JawabanD.isSelected() && JawabanD.getText().equals(jawaban)){
            skor+=10;
         }
         if ( acak == 8 ){
            jLabel2.setText("Selamat Soal Telah Berakhir"  );
            soals=(rs.getString("nama_gambar"));
            soal.setIcon(new ImageIcon(soals));
            jawabanA=("Selamat");
            jawabanB=("Soal");
            jawabanC=("Telah");
            jawabanD=("Berakhir");
            soal.setText(soals);
            JawabanA.setText(jawabanA);           
            JawabanB.setText(jawabanB);    
            JawabanC.setText(jawabanC);
            JawabanD.setText(jawabanD);
            jawaban=(rs.getString("jawaban_gambar"));
            acak++;
         }
         
            soals=(rs.getString("nama_gambar"));
            soal.setIcon(new ImageIcon(soals));
            jawabanA=(rs.getString("optionA"));
            jawabanB=(rs.getString("optionB"));
            jawabanC=(rs.getString("optionC"));
            jawabanD=(rs.getString("optionD"));
            soal.setText(soals);
            JawabanA.setText(jawabanA);           
            JawabanB.setText(jawabanB);    
            JawabanC.setText(jawabanC);
            JawabanD.setText(jawabanD);
            jawaban=(rs.getString("jawaban_gambar"));
            acak++;
            
         }
         
         System.out.println(skor);
      }  
        catch (Exception e) 
        {
         e.printStackTrace();
        }
   }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JawabanA = new javax.swing.JRadioButton();
        JawabanB = new javax.swing.JRadioButton();
        JawabanC = new javax.swing.JRadioButton();
        JawabanD = new javax.swing.JRadioButton();
        Kembali = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        soal = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        tengah = new javax.swing.JLabel();
        namapemain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        buttonGroup1.add(JawabanA);
        JawabanA.setInheritsPopupMenu(true);
        JawabanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanAActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanB);
        JawabanB.setText("optiB");
        JawabanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanBActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanC);
        JawabanC.setText("optiC");
        JawabanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanCActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanD);
        JawabanD.setText("optiD");
        JawabanD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanDActionPerformed(evt);
            }
        });

        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Next.setText("NEXT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("TEBAK GAMBAR");

        sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sec.setText("00");

        min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min.setText("00");

        tengah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tengah.setText(":");

        namapemain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namapemain.setText("NAMA PEMAIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Kembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JawabanA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JawabanB, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JawabanC, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(JawabanD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(namapemain))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(min)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tengah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(soal, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min)
                    .addComponent(tengah)
                    .addComponent(sec)
                    .addComponent(namapemain))
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JawabanC)
                    .addComponent(JawabanA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JawabanB)
                    .addComponent(JawabanD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(Kembali))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JawabanDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanDActionPerformed

    private void JawabanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanBActionPerformed

    private void JawabanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanCActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        if (acak<=8){
        soal();
        }
        else{
            this.setVisible(false);
            Score score = new Score();
            score.ambil_skor(skor);
            score.setVisible(true);
        }
    }//GEN-LAST:event_NextActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mulai().setVisible(true);
            }
        });
    }//GEN-LAST:event_KembaliActionPerformed

    private void JawabanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanAActionPerformed

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
            java.util.logging.Logger.getLogger(Kategori1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kategori1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kategori1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kategori1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Kategori1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton JawabanA;
    private javax.swing.JRadioButton JawabanB;
    private javax.swing.JRadioButton JawabanC;
    private javax.swing.JRadioButton JawabanD;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Next;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel min;
    public javax.swing.JLabel namapemain;
    public javax.swing.JLabel sec;
    public javax.swing.JLabel soal;
    public javax.swing.JLabel tengah;
    // End of variables declaration//GEN-END:variables
}
