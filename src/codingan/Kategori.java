/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public abstract class Kategori extends javax.swing.JFrame implements Kuis{

    
    int menit = 2;
    int detik = 0;
    Timer timer;
    String namap,soals,jawabanA,jawabanB,jawabanC,jawabanD,jawaban;
    int skor = 0;
    int acak = 1;
  
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
   public void namapemain()
   {
   ResultSet rs = Koneksi.executeReadQuerry("select * from pemain");
      try
      {
         while (rs.next())
         {
            namap=(rs.getString("namapemain"));
         }
      } 
      catch (Exception e) 
      {
         e.printStackTrace();
      }   
   }
   
   public abstract void soal();
  
}
