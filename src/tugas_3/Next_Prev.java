/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Paman Gobel
 */
public class Next_Prev extends javax.swing.JFrame {

    
    public Next_Prev() {
        initComponents();
        
    }
    
    String na,al,no,email;
    
    ArrayList<simpan> data=new ArrayList<>();
    
    int next=0;
    
    int i,array=0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        previous_mundur = new javax.swing.JButton();
        next_lanjut = new javax.swing.JButton();
        save_simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("ALAMAT");

        jLabel4.setText("No. Telp");

        previous_mundur.setText("Prev");
        previous_mundur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_mundurActionPerformed(evt);
            }
        });

        next_lanjut.setText("Next");
        next_lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_lanjutActionPerformed(evt);
            }
        });

        save_simpan.setText("save");
        save_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previous_mundur)
                        .addGap(18, 18, 18)
                        .addComponent(next_lanjut)
                        .addGap(35, 35, 35)
                        .addComponent(save_simpan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previous_mundur)
                    .addComponent(next_lanjut)
                    .addComponent(save_simpan))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void next_lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_lanjutActionPerformed
        na = jTextField1.getText();
        al = jTextField2.getText();
        no = jTextField3.getText();
        email = jTextField4.getText();
        
        if(array >= next-1){
            if(na.isEmpty()||al.isEmpty()||no.isEmpty()||email.isEmpty()){
                
                JOptionPane.showMessageDialog(null, "Tidak ada data selanjutnya");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");

            }
            else{
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");

                array++;
            }
        }    
        if(array < next){
            i=array+1;
        
            jTextField1.setText(data.get(i).Nama);
            jTextField2.setText(data.get(i).Alamat);
            jTextField3.setText(data.get(i).No_telp);
            jTextField4.setText(data.get(i).Email);
        
            
            array++;
        }
        
        System.out.println("array = "+array);
        System.out.println("next = "+next);
         
    }//GEN-LAST:event_next_lanjutActionPerformed

    private void previous_mundurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_mundurActionPerformed
        
       if(array <= 0){
           JOptionPane.showMessageDialog(null, "Tidak ada Data Sebelumnya");
           
       }
       else{
       i=array-1;
            jTextField1.setText(data.get(i).Nama);
            jTextField2.setText(data.get(i).Alamat);
            jTextField3.setText(data.get(i).No_telp);
            jTextField4.setText(data.get(i).Email);
        
        array--;
       }
        System.out.println("array = "+array);
    }//GEN-LAST:event_previous_mundurActionPerformed

    private void save_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_simpanActionPerformed
        na = jTextField1.getText();
        al = jTextField2.getText();
        no = jTextField3.getText();
        email = jTextField4.getText();
        
        if(na.isEmpty()||al.isEmpty()||no.isEmpty()||email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Sebagian Data belum diisi !!");
        }
        else{
            
            next++;
            
            for(i=array;i<next;i++){
                data.add(new simpan(na,al,no,email));
            }
            array++;
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            
            JOptionPane.showMessageDialog(null, "Data berhasil tersimpan");
        }
        System.out.println("array = "+array);
        System.out.println("next = "+next);
        
    }//GEN-LAST:event_save_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(Next_Prev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Next_Prev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Next_Prev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Next_Prev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Next_Prev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton next_lanjut;
    private javax.swing.JButton previous_mundur;
    private javax.swing.JButton save_simpan;
    // End of variables declaration//GEN-END:variables

    private Object check(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
