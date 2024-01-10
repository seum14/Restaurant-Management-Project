/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

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
public class Manager_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
     ResultSet rs ;
    public Manager_Menu() {
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
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 1096, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Edwardian Script ITC", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("KHS Cafe & Restaurent ");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 20, 270, 70);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(187, 101, 36));
        jButton2.setText("Manage Account");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(440, 30, 170, 50);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(187, 101, 36));
        jButton3.setText("Add Food");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(800, 30, 110, 50);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(187, 101, 36));
        jButton4.setText("Refund");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(900, 30, 90, 50);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton5.setForeground(new java.awt.Color(187, 101, 36));
        jButton5.setText("Log Out");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(980, 30, 100, 50);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton6.setForeground(new java.awt.Color(187, 101, 36));
        jButton6.setText("Create Order");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(590, 30, 140, 50);

        jButton7.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton7.setForeground(new java.awt.Color(187, 101, 36));
        jButton7.setText("Add Offer");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(710, 30, 110, 50);

        jButton8.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton8.setForeground(new java.awt.Color(187, 101, 36));
        jButton8.setText("Add Bank Account");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);
        jButton8.setBounds(270, 30, 190, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(-2, 0, 1100, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        front_page p = new front_page();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        manage_account a = new manage_account();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Add_Food a = new Add_Food();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Refund r = new Refund();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       Manager_Order_Form m = new Manager_Order_Form();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Add_Offer o = new Add_Offer();
        o.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Manager_bank_account a = new Manager_bank_account();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
