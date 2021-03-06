/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingan;

import java.sql.ResultSet; //mengimport class untuk menyediakan hasil dari sebuah pernyataan SQL.
import javax.swing.table.DefaultTableModel; //mengimport tabel
/**
 *
 * @author user
 */
public class Highscore extends javax.swing.JFrame {
/*JFrame digunakan untuk mendesain model tampilan yang didalamnya dapat kita
tempatkan komponen-komponen yang dibutuhkan dalam game ini. 
Jadi class Highscore extends javax.swing.JFrame merupakan deklarasi dari class Mulai
yang extends, jadi extends disini digunakan untuk mempermudah dalam memakai beberapa kelas
yang telah dibuat sebelumnya. Extends disini mewarisi semua fungsi dan semua fields (variabel) yang
ada di dalam kelas parent-nya yaitu javax.swing.JFrame. Jadi kelas yang diwarisi disebut sebagai kelas "child" 
sedangkan kelas yang mewarisi disebut dengan class "parent". Perlu diketahui bahwa sebuah class hanya 
diperbolehkan meng-extends satu parent saja, tidak boleh lebih.
*/
    /**
     * Creates new form Highscore
     */
    public Highscore() {
        initComponents();
        setLocationRelativeTo(null);
        skortertinggi();
        
        /*
        Merupakan constructor Highscore, terlihat ada pemanggilan sebuah method yaitu
        initComponets(); yang merupakan method yang di generate oleh netbeans secara
        default. setLocationRalativeTo(c:null) digunakan untuk membuat posisi Frame berada
        di tengah-tengah screen. Terdapat method skortertinggi();, yang dimana method ini memanggil
        score yang telah masuk ke dalam database yang telah dibuat.
        */
    }
    
   
    /*
    Membuat method public void skortertinggi().
    Digunakan statement try...catch untuk menangani error.
    Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat 
    membuat program tetap berjalan tanpa dihentikan secara langsung. 
    Error yang ditangani oleh try..catch biasa disebut dengan exception.
    */
   public void skortertinggi(){
   try
   {     
            ResultSet rs = Koneksi.executeReadQuerry("select * from score natural join pemain order by nilai desc limit 10"); 
            DefaultTableModel table = (DefaultTableModel) tabelscore.getModel();
            table.setRowCount(0);
            int peringkat[]={1,2,3,4,5,6,7,8,9,10};
            int i=0;
            while(rs.next())
            {
                table.addRow(new Object[]{ peringkat[i] , (rs.getString("namapemain")), (rs.getInt("nilai"))});
                i++;
            }
             /*
            Digunakan untuk mengeksekusi query sql yang telah dibuat, hasilnya akan disimpan ke dalam
            objek rs (ResultSet). Method executeQuery() akan menghasilkan nilai kembalian berupa objek ResultSet.Method ini biasanya digunakan untuk mengambil data dari database.
            Setelah mendapatkan data dari database MySQL, selanjutnya kita bisa tampilkan dengan perulangan. 
            Perulangan tersebut akan mengulang sebanyak isi tabelnya, atau dengan kata lain “Ulangi selama rs masih punya isi”.
            Cara mengambil nilai dari objek rs menggunakan method get blala dengan parameter nama kolom di tabel database. 
            Disini kami menggunakan getString dikarenakan nilai yang kami mau ambil bertipe string, dan begitu juga sebaliknya
            jika nilai yang kami mau ambil bertipe data integer. 
            */
    } catch (Exception e)
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelscore = new javax.swing.JTable();
        Menu = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 520));
        setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(470, 510));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("SKOR TERTINGGI");

        tabelscore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null},
                {"2", null, null},
                {"3", null, null}
            },
            new String [] {
                "PERINGKAT", "NAMA", "SKOR"
            }
        ));
        jScrollPane1.setViewportView(tabelscore);

        Menu.setBackground(new java.awt.Color(204, 102, 0));
        Menu.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        Menu.setText("MENU");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuawal().setVisible(true);
            }
        });
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Highscore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Highscore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Highscore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Highscore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Highscore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelscore;
    // End of variables declaration//GEN-END:variables
}
