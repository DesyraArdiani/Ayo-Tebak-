
package codingan;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
DriverManager: adalah sebuah class yang mengelola dirver;
Driver: adalah interface yang menangani komunikasi dengan database.
Connection: adalah interface yang menyediakan method untuk menghubungi database;
Statement: adalah inteface untuk mengeksekusi query;
ResultSet: adalah interface untuk menampung data hasil query.
Kode di atas maksudnya adalah mengimpor class dan interface yang kita butuhkan.
*/

public class Koneksi {
    //Menyiapkan paramter JDBC untuk koneksi ke database
    static final Connection CONN = connect();
    
    //Menyiapkan objek yang diperlukan untuk mengelola database
    Connection con;
    Statement stm;
    
    //Programnya belum dapat dieksekusi jika kita belum menambahkan library MySQL JDBC Driver ke dalam proyek.
    public void config(){
        /*
        Melakukan koneksi ke database
        harus dibungkus dalam blok try/catch
        */
        try {
            //Sebelum mulai membuat koneksi ke server, kita harus tentukan dulu driver yang akan digunakan.
            Class.forName("com.mysql.cj.jdbc.Driver"); //register driver yang akan dipakai, kita menggunakan driver "com.mysql.jdbc.Driver" untuk database MySQL.
            
            //Setelah memilih driver, selanjutnya kita lakukan koneksi ke database dengan parameter yang sudah dibuat. 
            //buat koneksi ke database
            con=DriverManager.getConnection("jdbc:mysql://localhost/cobakuis?serverTimezone=UTC", "root", "");
            
            //Selanjutnya kita membutuhkan objek Statement untuk mengeksekusi Query MySQL.
            // buat objek statement
            stm = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static Connection connect() {
      Connection conn = null;
      String url = "jdbc:mysql://localhost/cobakuis?serverTimezone=UTC";
      try {
         
         conn = DriverManager.getConnection(url, "root", "");
         System.out.println("Connection enstablished");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }

   static void executeUpdateQuerry(String querry) {
       try {
         Statement stt = CONN.createStatement();
         stt.executeUpdate(querry);

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   static ResultSet executeReadQuerry(String querry) {
      ResultSet rs = null;
      try {
         Statement stt = CONN.createStatement();
         rs = stt.executeQuery(querry);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return rs;
   }
   
   public static void addscore(String nama, int skor){
       int id = getId(nama);
       try{
           String sql = "INSERT INTO score (nilai, id_pemain) VALUES ("+skor+","+id+")";
           java.sql.Connection conn = (Connection) Koneksi.connect();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
       }catch(HeadlessException | SQLException e){
           System.out.println("Gagal"+e.getMessage());
       }
       
   }
   
   public static int getId(String nama){
        int nilai = 0;
        try {
            String sql = "SELECT id_pemain FROM pemain WHERE namapemain = '"+ nama +"'";
            
            java.sql.Connection conn = (Connection) Koneksi.connect();
            java.sql.Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(sql);
            
//          nilai = rs.getInt("id_pemain");
            while(rs.next()){
                nilai = rs.getInt("id_pemain");    
              
            }

        }catch (HeadlessException | SQLException e) {
            System.out.println("Id Gagal diambil" + e.getMessage());
        }
        return nilai;
    }

   
   public static void main(String[] args) {

      try {
         CONN.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      // [MYSQL BUSY]
   }
    

}
