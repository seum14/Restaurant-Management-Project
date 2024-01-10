/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;



import Manager.Add_Food;
import User.Home;
import User.Home;
import com.mysql.jdbc.ResultSet;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.xml.stream.events.Comment;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Order_Form extends javax.swing.JFrame {

  
    /**
     * Creates new form Order_Form
     */
   
  java.sql.ResultSet rs ;
     String choice;
   // public static DefaultTableModel k;
   public Order_Form()
    {
        
        initComponents();
       showTable();
       showpic();
        
    }
  
      public void showpic()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\wallpaper2you_512446 (1).jpg");
        jLabel16.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel16.setIcon(scaledIcon);
        
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
          String query = "SELECT *FROM Offer";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement pst = con.prepareStatement(query);
                                              rs =   pst.executeQuery(query);
                                                jTable4.setModel(DbUtils.resultSetToTableModel( rs));
                                                
      } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex);
      } 
                			
}
           

      public void balance ()
      {
          int Total = Integer.parseInt(total_bill.getText());
        int py = Integer.parseInt(pay.getText());
        int bal = py-Total;
        balance.setText(String.valueOf(bal));
      }

      public void bill()
      {
          String code = id.getText();
          String Total = total_bill.getText();
          String Pay = pay.getText();
          String baln = balance.getText();
          String nam = name.getText();
          String pnam = pname.getText();
          String mail = email.getText();
          String acc = account.getText();
          String tim = time.getText();
          String dat = date.getText();
          
          DefaultTableModel model = new DefaultTableModel();
          
          model = (DefaultTableModel)jTable3.getModel();
          
          area.setText(area.getText()+"*********************************************************************************\n");
          area.setText(area.getText()+"                                          KHS Cafe & Restaurent            \n");
          area.setText(area.getText()+"                                                 Bill of Food                  \n");
           area.setText(area.getText()+"*********************************************************************************\n");
           area.setText(area.getText()+"                                           CONTACTS           \n");
           area.setText(area.getText()+"Mobile Number : 01773331040           \n");
          area.setText(area.getText()+"E-mail : khalid.hasan.seum1@gmail.com                 \n");
           area.setText(area.getText()+"*********************************************************************************\n");
            area.setText(area.getText()+"\n");
        
            area.setText(area.getText()+"Customer Name : "+pnam+"\n");
            area.setText(area.getText()+"E-Mail : "+mail+"\n");
            area.setText(area.getText()+"Account Number : "+acc+"\n");
            area.setText(area.getText()+"Time : "+tim+"\n");
            area.setText(area.getText()+"Date : "+dat+"\n");
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"\n");
           area.setText(area.getText()+"Food Name"+"\t"+"\t"+"Price"+"\t"+"Piece "+"\t"+"Amount($)"+"\n");
           area.setText(area.getText()+"\n");
       for (int i=0; i<model.getRowCount();i++)
       {
           String ID = (String)model.getValueAt(i, 0);
           String Name = (String)model.getValueAt(i, 1);
           String Piece = (String)model.getValueAt(i, 2);
           String Price = (String)model.getValueAt(i, 3);
           String Amount = (String)model.getValueAt(i, 4);
       
         area.setText(area.getText()+Name+"\t"+"\t"+Price+"\t"+Piece +"\t"+Amount+"\n");
       }
       area.setText(area.getText()+"-------------------------------------------------------------------------------------------------\n");
          area.setText(area.getText()+"-------------------------------------------------------------------------------------------------\n");
         
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"\n");
        
        area.setText(area.getText()+"\t"+"\t"+"Subtotal : "+Total+"$"+"\n");
        area.setText(area.getText()+"\t"+"\t"+"Pay : "+Pay+"$"+"\n");
       area.setText(area.getText()+"\t"+"\t"+"Balance : "+baln+"$"+"\n");
       area.setText(area.getText()+"\t"+"15% of VAT already included in food price.\n");
        area.setText(area.getText()+"\n");
        area.setText(area.getText()+"\n");
            area.setText(area.getText()+"*********************************************************************************\n");
           area.setText(area.getText()+"\t"+"Happy moment with KHS Restaurent & Cafe \n");
            area.setText(area.getText()+"\t"+"Thanks For Visiting\n");
            area.setText(area.getText()+"*********************************************************************************\n");
           area.setText(area.getText()+"*********************************************************************************\n");
      
      }
      
      
      
      
      public void check()
      {
      try {
          Class.forName("com.mysql.jdbc.Driver");
           String query = "UPDATE bank_account SET Debit_Money=? WHERE Account_no=? and password=?";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						PreparedStatement pst = con.prepareStatement(query);
                                            
                    pst.setString(1, pay.getText());
                    pst.setString(2, account.getText());
                 //   pst.setString(3, name.getText());
                    pst.setString(3, password.getText().toString());
                  //  pst.executeUpdate();
                    if(pst.executeUpdate()>0)
                    {
                         JOptionPane.showMessageDialog(null, "Sucessfully Paid");
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null, "Check Your Personal information again");
                         JOptionPane.showMessageDialog(null, "Pay by Liquid Money");
                    }
      } catch (ClassNotFoundException ex) {
         JOptionPane.showMessageDialog(null, "Check Your Personal information again");
         
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Check Your Personal information again");
           
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        total_bill = new javax.swing.JTextField();
        pay = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        account = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMenuCustomer = new javax.swing.JButton();
        btnBestSellersCustomer = new javax.swing.JButton();
        btnOrdersCustomer = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 1096, 624));
        setMaximumSize(new java.awt.Dimension(1096, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1028, 624));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Place Your Order ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 110, 310, 60);

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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 520, 110);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Food Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 200, 70, 30);

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(10, 230, 74, 22);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Food Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 200, 90, 30);
        jPanel1.add(name);
        name.setBounds(90, 230, 150, 22);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 200, 60, 30);

        quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityStateChanged(evt);
            }
        });
        jPanel1.add(quantity);
        quantity.setBounds(250, 230, 50, 22);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 200, 50, 30);
        jPanel1.add(price);
        price.setBounds(320, 230, 74, 22);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 200, 50, 30);

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total);
        total.setBounds(410, 230, 74, 22);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 230, 77, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pay Money :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 400, 100, 20);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(660, 190, 420, 270);

        jTable4.setBackground(new java.awt.Color(0, 0, 0));
        jTable4.setForeground(new java.awt.Color(255, 255, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(520, 0, 570, 110);

        jTable3.setBackground(new java.awt.Color(0, 0, 0));
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Food Name", "Order Amount", "Price (with TAX)", "Total (with TAX)"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 260, 580, 100);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Bill :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 370, 110, 19);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Balance Money :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 430, 120, 20);
        jPanel1.add(total_bill);
        total_bill.setBounds(140, 370, 160, 22);
        jPanel1.add(pay);
        pay.setBounds(140, 400, 160, 22);
        jPanel1.add(balance);
        balance.setBounds(140, 430, 160, 22);

        confirm.setText("Confirm Bill");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm);
        confirm.setBounds(460, 490, 120, 23);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 460, 120, 20);
        jPanel1.add(pname);
        pname.setBounds(140, 460, 160, 22);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(830, 480, 77, 23);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 490, 80, 20);
        jPanel1.add(email);
        email.setBounds(140, 490, 160, 22);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Account No :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(320, 370, 90, 30);
        jPanel1.add(account);
        account.setBounds(420, 370, 170, 22);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 400, 80, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date (dd-mm-yy):");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(320, 460, 130, 20);
        jPanel1.add(date);
        date.setBounds(460, 460, 130, 22);
        jPanel1.add(password);
        password.setBounds(420, 400, 170, 22);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Time :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(320, 430, 90, 20);
        jPanel1.add(time);
        time.setBounds(420, 430, 170, 22);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Black-Wooden-Background-Copy-1280x800.jpg"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 1100, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 96, 1096, 528);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        btnMenuCustomer.setBackground(new java.awt.Color(150, 105, 50));
        btnMenuCustomer.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMenuCustomer.setForeground(new java.awt.Color(150, 105, 50));
        btnMenuCustomer.setText("Menu");
        btnMenuCustomer.setBorderPainted(false);
        btnMenuCustomer.setContentAreaFilled(false);
        btnMenuCustomer.setFocusPainted(false);
        btnMenuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenuCustomer);
        btnMenuCustomer.setBounds(750, 20, 100, 58);

        btnBestSellersCustomer.setBackground(new java.awt.Color(150, 105, 50));
        btnBestSellersCustomer.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnBestSellersCustomer.setForeground(new java.awt.Color(150, 105, 50));
        btnBestSellersCustomer.setText("Your Bank Account");
        btnBestSellersCustomer.setBorderPainted(false);
        btnBestSellersCustomer.setContentAreaFilled(false);
        btnBestSellersCustomer.setFocusPainted(false);
        btnBestSellersCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestSellersCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(btnBestSellersCustomer);
        btnBestSellersCustomer.setBounds(580, 20, 180, 60);

        btnOrdersCustomer.setBackground(new java.awt.Color(150, 105, 50));
        btnOrdersCustomer.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnOrdersCustomer.setForeground(new java.awt.Color(150, 105, 50));
        btnOrdersCustomer.setText("Review");
        btnOrdersCustomer.setBorderPainted(false);
        btnOrdersCustomer.setContentAreaFilled(false);
        btnOrdersCustomer.setFocusPainted(false);
        btnOrdersCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrdersCustomer);
        btnOrdersCustomer.setBounds(840, 20, 86, 60);

        btnLogout.setBackground(new java.awt.Color(150, 105, 50));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(150, 105, 50));
        btnLogout.setText("Log Out");
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setFocusPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout);
        btnLogout.setBounds(920, 20, 100, 60);

        jButton2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(187, 118, 32));
        jButton2.setText("KHS Cafe & Restaurent  ");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(0, 0, 330, 90);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(150, 105, 50));
        jButton3.setText("Add Bank Account");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(390, 20, 200, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1096, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCustomerActionPerformed
        // TODO add your handling code here:
        Customer_Menu m = new Customer_Menu();
        m.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_btnMenuCustomerActionPerformed

    private void btnBestSellersCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestSellersCustomerActionPerformed
        // TODO add your handling code here:
        
          Your_bank_account b = new Your_bank_account();
        b.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnBestSellersCustomerActionPerformed

    private void btnOrdersCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersCustomerActionPerformed
        // TODO add your handling code here:
        Review r = new Review();
        r.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnOrdersCustomerActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
          Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String ID = id.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String query = "SELECT *FROM menu_item where id = ?";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, ID);
                rs = pst.executeQuery();
                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(null, "Product code not found");
                }
                else 
                {
                    String food_name = rs.getString("Name");
                    String food_price = rs.getString("Price");
                    name.setText(food_name.trim());
                      price.setText(food_price.trim());
                      
                    
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
           }
        else if (evt.getKeyCode()==KeyEvent.VK_SPACE)
        {
            String ID = id.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String query = "SELECT *FROM offer where ID = ?";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, ID);
                rs = pst.executeQuery();
                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(null, "Product code not found");
                }
                else 
                {
                    String food_name1 = rs.getString("Name");
                    String food_price1 = rs.getString("Price");
                    name.setText(food_name1.trim());
                      price.setText(food_price1.trim());
                      
                    
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
           }
        
        
    }//GEN-LAST:event_idKeyPressed

    private void quantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityStateChanged
        // TODO add your handling code here:
        int quan = Integer.parseInt(quantity.getValue().toString());
        int pr = Integer.parseInt(price.getText());
        int sum = quan*pr;
        total.setText(String.valueOf(sum));
    }//GEN-LAST:event_quantityStateChanged

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
       if(pname.getText().equals("")||date.getText().equals("")||time.getText().equals("")||email.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null, "Enter All information");
            
         }
       else
       {
        balance ();
         if(account.getText().equals("")||password.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null, "Pay by Liquid Money");
            
         }
         
         
      
         bill();
         
       check();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                String query = "INSERT INTO `payment`(`Name`, `Email`, `Account`, `Time`, `Date`, `Total_Bill`, `Pay_Money`, `Balance_Money`) VALUES (?,?,?,?,?,?,?,?)";
          	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
                PreparedStatement pst = con.prepareStatement(query);
               pst.setString(1, pname.getText());
               pst.setString(2, email.getText());
               pst.setString(3, account.getText());
               pst.setString(4, time.getText());
               pst.setString(5, date.getText());
              
               pst.setString(6, total_bill.getText());
               pst.setString(7, pay.getText());
               pst.setString(8, balance.getText());
               if(pst.executeUpdate()<0)
               {
                   System.out.println("Update in Database Successfully");
               }
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
                
       }
       
      total_bill.setText("");
      pay.setText("");
      balance.setText("");
      pname.setText("");
      email.setText("");
      account.setText("");
      password.setText("");
      time.setText("");
      date.setText("");
       
    }//GEN-LAST:event_confirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
      DefaultTableModel model = new DefaultTableModel();
      
      //for table one
        model = (DefaultTableModel)jTable3.getModel();
        model.addRow(new Object[]
        {
           id.getText(),
            name.getText(),
            quantity.getValue().toString(),
            price.getText(),
            total.getText(),
        });
       int sum =0;
        for (int i=0;i<jTable3.getRowCount();i++)
        {
            sum = sum + Integer.parseInt(jTable3.getValueAt(i,4).toString());
        }
        total_bill.setText(Integer.toString(sum));
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
      try {
          // TODO add your handling code here:
          area.print();
      } catch (PrinterException ex) {
          Logger.getLogger(Order_Form.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_printActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bank_account b = new bank_account();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Welcome m = new Welcome();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Order_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField balance;
    private javax.swing.JButton btnBestSellersCustomer;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenuCustomer;
    private javax.swing.JButton btnOrdersCustomer;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JSpinner quantity;
    private javax.swing.JTextField time;
    private javax.swing.JTextField total;
    private javax.swing.JTextField total_bill;
    // End of variables declaration//GEN-END:variables
}
