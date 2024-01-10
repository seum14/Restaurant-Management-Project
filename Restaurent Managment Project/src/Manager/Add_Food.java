/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;



import User.Home;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.transform.Result;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Add_Food extends javax.swing.JFrame {

  
  ResultSet rs ;
     String choice;
    public static DefaultTableModel k;
    
    public Add_Food(){
        initComponents();
showTable();
  
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
                			
    
}
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 1096, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(54, 0, 0));
        jPanel2.setForeground(new java.awt.Color(54, 0, 0));
        jPanel2.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Edwardian Script ITC", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("KHS Cafe & Restaurent");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel7.add(jLabel13);
        jLabel13.setBounds(10, 10, 260, 70);

        jButton17.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(187, 101, 36));
        jButton17.setText("Manage Account");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton17);
        jButton17.setBounds(440, 20, 170, 40);

        jButton18.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton18.setForeground(new java.awt.Color(187, 101, 36));
        jButton18.setText("Update Offer");
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setFocusPainted(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton18);
        jButton18.setBounds(780, 20, 130, 40);

        jButton19.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton19.setForeground(new java.awt.Color(187, 101, 36));
        jButton19.setText("Refund");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setFocusPainted(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton19);
        jButton19.setBounds(900, 20, 90, 40);

        jButton20.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton20.setForeground(new java.awt.Color(187, 101, 36));
        jButton20.setText("Log Out");
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setFocusPainted(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton20);
        jButton20.setBounds(980, 20, 100, 40);

        jButton21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton21.setForeground(new java.awt.Color(187, 101, 36));
        jButton21.setText("Create Order");
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusPainted(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton21);
        jButton21.setBounds(590, 20, 130, 40);

        jButton22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton22.setForeground(new java.awt.Color(187, 101, 36));
        jButton22.setText("Menu");
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setFocusPainted(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton22);
        jButton22.setBounds(702, 20, 110, 40);

        jButton23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton23.setForeground(new java.awt.Color(187, 101, 36));
        jButton23.setText("Add Bank Account");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusPainted(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton23);
        jButton23.setBounds(270, 20, 190, 40);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 0, 1100, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 100);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(73, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(610, 310, 10, 200);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Item :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 280, 190, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 410, 170, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Food Price :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 440, 160, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Food ID :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 380, 150, 30);
        jPanel1.add(id);
        id.setBounds(270, 380, 220, 24);
        jPanel1.add(name);
        name.setBounds(270, 410, 220, 24);

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price);
        price.setBounds(270, 440, 220, 24);

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 480, 77, 32);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Delete Food :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(830, 280, 150, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Food ID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 340, 220, 30);
        jPanel1.add(item);
        item.setBounds(780, 380, 250, 24);

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(860, 420, 77, 32);

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 10, 990, 240);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Appetizers", "Pasta", "Burger", "Pizza", "Drinks", "Desserts" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(270, 340, 220, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose Your Category :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 340, 240, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/vintage_gold_wallpaper-wallpaper-1920x1200.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1100, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 1100, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if(id.getText().equals("")||name.getText().equals("")||price.getText().equals("")||jComboBox1.getSelectedItem().equals("Category"))
        {
            JOptionPane.showMessageDialog(null, "Enter all the field");
        }
        else
        {
          try
            {
                //Add new added item into database in menu_item table
                 Class.forName("com.mysql.jdbc.Driver");
                 String query = "INSERT INTO menu_item ( ID, Name, Rank, Price, Category )"+"VALUES(?,?,?,?,?)";
                
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement preparedStmt = con.prepareStatement(query);
            
           
              
                //Set random itemID
               
                preparedStmt.setInt(1, Integer.valueOf(id.getText()));
                preparedStmt.setString(2, name.getText());
                preparedStmt.setInt(3, 0);
                preparedStmt.setInt(4, Integer.valueOf(price.getText()));
                preparedStmt.setString(5, jComboBox1.getSelectedItem().toString());
                preparedStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Food added successfully");
            } catch (ClassNotFoundException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      }
        }
     showTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          
       try
            {
                //Add new added item into database in menu_item table
                 Class.forName("com.mysql.jdbc.Driver");
                 String query = "delete from menu_item where ID = ? ";
                
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement preparedStmt = con.prepareStatement(query);
            
           
              
                //Set random itemID
               
                preparedStmt.setInt(1, Integer.valueOf(item.getText()));
              
                preparedStmt.executeUpdate();
               // JOptionPane.showConfirmDialog(null, "Do You want to Delete this Food Item ?");
               JOptionPane.showMessageDialog(null, "Food deleted successfully");
            } catch (ClassNotFoundException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(Add_Food.class.getName()).log(Level.SEVERE, null, ex);
      }
          
           showTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
        front_page p = new front_page();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MousePressed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        manage_account a = new manage_account();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Add_Offer o = new Add_Offer();
        o.setVisible(true);
        dispose();
  
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Refund r = new Refund();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        Manager_Order_Form m = new Manager_Order_Form();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        Manager_Menu m = new Manager_Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        Manager_bank_account a = new Manager_bank_account();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton23ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
