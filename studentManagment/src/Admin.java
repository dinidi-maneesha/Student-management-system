
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    
    Connection conn =null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Admin() throws ClassNotFoundException {
        super ("Admin");
        initComponents();
        conn = databaseConnection.connection();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminName = new javax.swing.JTextField();
        adminUser = new javax.swing.JTextField();
        adminID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adminPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(288, 13, 130, 55);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 124, 19, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(12, 201, 101, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(12, 298, 134, 22);

        adminName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminName);
        adminName.setBounds(220, 200, 277, 47);

        adminUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminUser);
        adminUser.setBounds(220, 290, 277, 47);

        adminID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDActionPerformed(evt);
            }
        });
        jPanel1.add(adminID);
        adminID.setBounds(220, 120, 277, 47);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(12, 389, 130, 22);

        adminPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminPassword);
        adminPassword.setBounds(220, 380, 277, 47);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 480, 119, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 480, 101, 37);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 480, 101, 37);

        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(520, 120, 101, 37);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(340, 480, 102, 36);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\aaaaaaaaa\\new new new.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 100, 660, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
            stmt = conn.createStatement();
             int Id = Integer.parseInt(adminID.getText());
             String sql= "DELETE FROM admin WHERE Id='"+Id+"' ";
             stmt.executeUpdate(sql);
             
              setVisible(false);
              ShowAdmin object = new ShowAdmin();
             object.setVisible(true);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          try{
                    stmt = conn.createStatement();
                    int Id =  Integer.parseInt(adminID.getText());
                    
                    String sql = "SELECT * FROM admin WHERE Id= '"+Id+"' ";
                    rs = stmt.executeQuery(sql);
                    
                    if (rs.next()){
                        adminName.setText(rs.getString("name"));
                        adminUser.setText(rs.getString("username"));
                        adminPassword.setText(rs.getString("password"));
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Record Not Found");
                    }
                }  
                  catch (Exception e){JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_searchActionPerformed

    private void adminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminIDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            adminID.setText("");
            adminName.setText("");
            adminUser.setText("");
            adminPassword.setText("");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Home object = new Home();
        object.setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             try{
              stmt =conn.createStatement();
              
              String username = adminUser.getText();
              String password = adminPassword.getText();
              String name = adminName.getText();
              
              String sql = "UPDATE ADMIN SET username = '"+username+"',password='"+password+"', name='"+name+"' ";
              
              stmt.executeUpdate(sql);
              JOptionPane.showMessageDialog(null,"Data inserted success");
              
          }catch (Exception e){JOptionPane.showMessageDialog(null, e);}        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminID;
    private javax.swing.JTextField adminName;
    private javax.swing.JTextField adminPassword;
    private javax.swing.JTextField adminUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}