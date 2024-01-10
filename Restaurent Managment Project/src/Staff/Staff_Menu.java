/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import Menu.*;
import Manager.*;
import Menu.*;
import Manager.Add_Food;
import User.Home;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Staff_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
     ResultSet rs ;
    public Staff_Menu() {
        initComponents();
        showTable();
        showpic1();
        showpic2();
        showpic3();
        showpic4();
        showpic5();
        showpic6();
        showpic7();
        showpic();
    }
     public void showpic()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\wallpaper2you_512460.jpg");
        jLabel8.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel8.setIcon(scaledIcon);
        
    }
      public void showpic7()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\wallpaper2you_512460.jpg");
        jLabel7.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel7.setIcon(scaledIcon);
        
    }
    
    
    
    public void showpic1()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\whiskey-glass.jpg");
        jLabel1.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel1.setIcon(scaledIcon);
        
    }
     public void showpic2()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\beef-burger-with-deep-fried-bacon-and-thousand-island-dressing-50486939.jpg");
        jLabel2.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel2.setIcon(scaledIcon);
        
    }
      public void showpic3()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\photo-1513104890138-7c749659a591.jpg");
        jLabel3.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel3.setIcon(scaledIcon);
        
    }
       public void showpic4()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\red-velvet-cake.jpg");
        jLabel4.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel4.setIcon(scaledIcon);
        
    }
        public void showpic5()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\maxresdefault.jpg");
        jLabel5.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel5.setIcon(scaledIcon);
        
    }
         public void showpic6()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\images (10).jpg");
        jLabel6.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel6.setIcon(scaledIcon);
        
    }
    
public void showTable()
{
      try {
          Class.forName("com.mysql.jdbc.Driver");
          String query = "SELECT *FROM menu_item";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement pst = con.prepareStatement(query);
                                              rs =   pst.executeQuery(query);
                                                jTable2.setModel(DbUtils.resultSetToTableModel( rs));
                                                
      } catch (Exception ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      } 
                			
       try {
          Class.forName("com.mysql.jdbc.Driver");
          String query = "SELECT *FROM Offer ";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement pst = con.prepareStatement(query);
                                                pst.executeQuery();
                                                 rs = pst.executeQuery(query);
                                                jTable3.setModel(DbUtils.resultSetToTableModel( rs));
                                                 
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 109, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(null);

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Food ID", "Food Name", "Food Rank", "Sold of Units ", "Available Quantity", "Category"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 0, 1070, 310);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(780, 320, 300, 160);

        jLabel2.setText("jLabel1");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 320, 300, 160);

        jLabel3.setText("jLabel1");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(410, 320, 300, 160);

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 1100, 500);

        jTabbedPane1.addTab("Main Menu", jPanel2);

        jPanel3.setLayout(null);

        jTable3.setBackground(new java.awt.Color(0, 0, 0));
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Food ID", "Food Name", "Food Rank", "Sold of Units ", "Available Quantity", "Category"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 0, 1070, 310);

        jLabel4.setText("jLabel1");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 320, 300, 160);

        jLabel5.setText("jLabel1");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(410, 320, 300, 160);

        jLabel6.setText("jLabel1");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(780, 320, 300, 160);

        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 1100, 500);

        jTabbedPane1.addTab("Offers", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 100, 1100, 530);

        jPanel4.setBackground(new java.awt.Color(22, 14, 8));
        jPanel4.setLayout(null);

        jButton1.setBackground(new java.awt.Color(75, 14, 19));
        jButton1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 103, 24));
        jButton1.setText("Menu");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(770, 40, 80, 38);

        jButton2.setBackground(new java.awt.Color(75, 14, 19));
        jButton2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 103, 24));
        jButton2.setText("Create Order");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(850, 40, 130, 38);

        jButton3.setBackground(new java.awt.Color(75, 14, 19));
        jButton3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 103, 24));
        jButton3.setText("Add Bank Account");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(390, 40, 190, 38);

        jButton5.setBackground(new java.awt.Color(75, 38, 6));
        jButton5.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 103, 24));
        jButton5.setText("Your Bank Account");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(580, 40, 190, 38);

        jButton4.setBackground(new java.awt.Color(75, 14, 19));
        jButton4.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 103, 24));
        jButton4.setText("Log Out");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(980, 40, 100, 40);

        jToggleButton1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(204, 103, 24));
        jToggleButton1.setText("KHS Cafe & Restaurent  ");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1);
        jToggleButton1.setBounds(10, 22, 380, 70);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1100, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Staff_Menu s = new Staff_Menu();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Staff_Order_Form s = new Staff_Order_Form();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Create_bank_account c = new Create_bank_account();
        c.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Staff_bank_account c = new Staff_bank_account();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home h = new Home();
        h.setVisible(true);

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Staff_front_page p =new Staff_front_page();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
