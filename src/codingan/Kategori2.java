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
import java.util.Random;


public class Kategori2 extends Kategori{

    /**
     * Creates new form Teknologi
     */
    
    
   
    public void wkt(){    
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
    
    public Kategori2() {
        initComponents();
        setLocationRelativeTo(null);
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        wkt();
        soal();
        namapemain();
    }
    
   public void namapemain(){
       super.namapemain();
       namapemain.setText(namap);
     
   }
   
   public void soal(){
   //Random random = new Random();
   //int a = 8 + random.nextInt(9);
   System.out.println(acak);
   rs = Koneksi.executeReadQuerry("select * from pertanyaan where id_pertanyaan = "+acak+"");
      try{
           if ( acak <= 10) 
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
        
         //while (rs.next()) {
            soals=(rs.getString("jenis_pertanyaan"));
            jawabanA=(rs.getString("optiA"));
            jawabanB=(rs.getString("optiB"));
            jawabanC=(rs.getString("optiC"));
            jawabanD=(rs.getString("optiD"));
            soal.setText(soals);
            JawabanA.setText(jawabanA);
            JawabanB.setText(jawabanB);
            JawabanC.setText(jawabanC);
            JawabanD.setText(jawabanD);
            jawaban=(rs.getString("jawaban_teknologi"));
            acak++;
         }
           
         System.out.println(skor);
      } 
         catch (Exception e) {
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
        jPanel2 = new javax.swing.JPanel();
        JawabanA = new javax.swing.JRadioButton();
        JawabanB = new javax.swing.JRadioButton();
        JawabanC = new javax.swing.JRadioButton();
        JawabanD = new javax.swing.JRadioButton();
        Next = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        tengah = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        soal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namapemain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 520));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        buttonGroup1.add(JawabanA);
        JawabanA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JawabanA.setInheritsPopupMenu(true);
        JawabanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanAActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanB);
        JawabanB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JawabanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanBActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanC);
        JawabanC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JawabanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanCActionPerformed(evt);
            }
        });

        buttonGroup1.add(JawabanD);
        JawabanD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JawabanD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JawabanDActionPerformed(evt);
            }
        });

        Next.setText("NEXT");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min.setText("00");

        tengah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tengah.setText(":");

        sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sec.setText("00");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setText("TEBAK TEKNOLOGI");

        namapemain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namapemain.setText("NAMA PEMAIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tengah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sec)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(Kembali)
                        .addGap(352, 352, 352)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JawabanB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JawabanA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JawabanC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JawabanD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(soal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(namapemain)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(min)
                        .addComponent(tengah)
                        .addComponent(sec)
                        .addComponent(namapemain)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(soal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JawabanC)
                    .addComponent(JawabanA))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JawabanB)
                    .addComponent(JawabanD))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(Kembali))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 750, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JawabanDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanDActionPerformed
 
    private void JawabanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanCActionPerformed

    private void JawabanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanAActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        if (acak<=10){
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

    private void JawabanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JawabanBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JawabanBActionPerformed
    
    
   
    /**
     * @param args the command line arguments
     */
    
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kategori2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kategori2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kategori2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kategori2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori2().setVisible(true);
               
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel min;
    public javax.swing.JLabel namapemain;
    public javax.swing.JLabel sec;
    public javax.swing.JLabel soal;
    public javax.swing.JLabel tengah;
    // End of variables declaration//GEN-END:variables
}
