
package codingan;

public class Mulai extends javax.swing.JFrame {
/*JFrame digunakan untuk mendesain model tampilan yang didalamnya dapat kita
tempatkan komponen-komponen yang dibutuhkan dalam game ini. 
Jadi class Mulai extends javax.swing.JFrame merupakan deklarasi dari class Mulai
yang extends, jadi extends disini digunakan untuk mempermudah dalam memakai beberapa kelas
yang telah dibuat sebelumnya. Extends disini mewarisi semua fungsi dan semua fields (variabel) yang
ada di dalam kelas parent-nya yaitu javax.swing.JFrame. Jadi kelas yang diwarisi disebut sebagai kelas "child" 
sedangkan kelas yang mewarisi disebut dengan class "parent". Perlu diketahui bahwa sebuah class hanya 
diperbolehkan meng-extends satu parent saja, tidak boleh lebih.
*/
    
    /**
     * Creates new form Mulai
     */
    
    public Mulai() {
        initComponents();
        setLocationRelativeTo(null);
        
        /*
        Merupakan constructor Mulai, terlihat ada pemanggilan sebuah method yaitu
        initComponets(); yang merupakan method yang di generate oleh netbeans secara
        default. setLocationRalativeTo(c:null) digunakan untuk membuat posisi Frame berada
        di tengah-tengah screen.
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        KATEGORI = new javax.swing.JLabel();
        GAMBAR = new javax.swing.JButton();
        TEKNOLOGI = new javax.swing.JButton();
        KEMBALI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(757, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        KATEGORI.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        KATEGORI.setText("KATEGORI");
        getContentPane().add(KATEGORI);
        KATEGORI.setBounds(300, 30, 190, 90);

        GAMBAR.setBackground(new java.awt.Color(204, 102, 0));
        GAMBAR.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        GAMBAR.setText("GAMBAR");
        GAMBAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMBARActionPerformed(evt);
            }
        });
        getContentPane().add(GAMBAR);
        GAMBAR.setBounds(80, 190, 180, 60);

        TEKNOLOGI.setBackground(new java.awt.Color(204, 102, 0));
        TEKNOLOGI.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        TEKNOLOGI.setText("TEKNOLOGI");
        TEKNOLOGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEKNOLOGIActionPerformed(evt);
            }
        });
        getContentPane().add(TEKNOLOGI);
        TEKNOLOGI.setBounds(470, 190, 180, 60);

        KEMBALI.setBackground(new java.awt.Color(204, 102, 0));
        KEMBALI.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        KEMBALI.setText("KEMBALI");
        KEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KEMBALIActionPerformed(evt);
            }
        });
        getContentPane().add(KEMBALI);
        KEMBALI.setBounds(80, 400, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -130, 780, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KEMBALIActionPerformed
        /*
         Merupakan sebuah method ActionPerformed dari Button Kembali. Saat kita mengklik Button kembali, button
        tersebut akan mengaktifkan ActionEvent. 
        Kelas atau inner class yang bertindak sebagai obyek pendengar action event harus mengimplementasikan 
        interface ActionListener untuk merespon adanya action event serta mendeklarasikan ulang metoda actionPerformed. 
        Method actionPerformed memerlukan kelas ActionEvent sebagai argumen parameternya.
        */
        
        /*
         Code disini digunakan untuk menampilkan frame yang kita klik. Disini digunakan 
        setVisible(true) yang merupakan fungsi yang digunakan untuk mengatur hasil agar dapat 
        ditampilkan/Aktifkan Visible Frame. Saat kita mengaturnya/menyetelnya ke setVisible(false), maka
        kita tidak dapat melihat apa pun di layar.
        
        Class anyonmous  yang berasal dari Runnable, class anonim ini menggantikan method run dari 
        interface runnable yang dapat dijalankan. Kemudian class ini dibuat instance-nya dan
        diteruskan ke method EventQueue.invokeLater, yang merupakan method statis. Method ini menambahkan
        objek ke eventQueue. Di EventQueue terdapat banyak events. Terdapat Thread yang terus mengumpulkan data
        dari antrian ini. Setelah Thread mencapai class anonim, maka ia akan menjalankan method run(), yang akan
        membuat instance objek class Menuawal dan mengaturnya agar terlihat.
        */
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuawal().setVisible(true);
            }
        });
    }//GEN-LAST:event_KEMBALIActionPerformed

    private void TEKNOLOGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEKNOLOGIActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori2().setVisible(true);
            }
        });
    }//GEN-LAST:event_TEKNOLOGIActionPerformed

    private void GAMBARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMBARActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori1().setVisible(true);
            }
        });
    }//GEN-LAST:event_GAMBARActionPerformed

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
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mulai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GAMBAR;
    private javax.swing.JLabel KATEGORI;
    private javax.swing.JButton KEMBALI;
    private javax.swing.JButton TEKNOLOGI;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}