package User;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Sign_Up extends javax.swing.JFrame {
  Connection con = null;
	PreparedStatement pst = null;
    /**
     * Creates new form Forgot_pass
     */
    public Sign_Up() {
        initComponents();
    jPanel1.setBackground(new Color(0,0,0,70));
    
  
    	
	
                        }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        birth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 1096, 624));
        setIconImage(getIconImage());
        setMaximizedBounds(new java.awt.Rectangle(100, 100, 1096, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/image-260nw-387081622.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 130));

        jLabel2.setBackground(new java.awt.Color(204, 102, 0));
        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 53)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 91, 26));
        jLabel2.setText("The KHS Cafe & Restaurant    ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 710, 80));

        jLabel3.setFont(new java.awt.Font("Kunstler Script", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Create New Account   ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 300, 30));

        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 602, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(70, 300, 251, 22);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(165, 384, 75, 32);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 4, 62));
        jLabel7.setText("New Password : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 280, 105, 18);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 4, 62));
        jLabel8.setText("User Type :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 330, 71, 18);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option", "Manager", "Staff", "Customer" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(70, 350, 106, 26);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 4, 62));
        jLabel5.setText("E-Mail : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 130, 51, 18);
        jPanel1.add(email);
        email.setBounds(70, 150, 250, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 4, 62));
        jLabel6.setText("Birth-Date (DD-MM-YY) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 180, 147, 18);
        jPanel1.add(birth);
        birth.setBounds(70, 200, 250, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 4, 62));
        jLabel4.setText("User Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 80, 75, 18);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(70, 100, 250, 24);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 4, 62));
        jLabel10.setText("Gender :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 230, 90, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option", "Male", "Female", "Others" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(70, 250, 110, 26);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 390, 430));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/441010.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(1923, 624));
        jLabel9.setMinimumSize(new java.awt.Dimension(1923, 624));
        jLabel9.setPreferredSize(new java.awt.Dimension(1923, 624));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       if(name.getText().equals("")||email.getText().equals("")||birth.getText().equals("")||jComboBox1.getSelectedItem().toString().equals("Option")||jComboBox2.getSelectedItem().toString().equals("Option")||pass.getText().equals(""))
                                                {
                                                    JOptionPane.showMessageDialog(null,"Some field are empty","Error",1);
                                                }
                                               else
                                                {
        try {
    Class.forName("com.mysql.jdbc.Driver");
       String query = "INSERT INTO `signup`(`username`, `email`, `dateofbirth`, `gender`, `password`, `signupas`) VALUES (?,?,?,?,?,?)";
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						pst = con.prepareStatement(query);
						pst.setString(1, name.getText());
						pst.setString(2, email.getText());
						pst.setString(3, birth.getText());
						pst.setString(4, jComboBox2.getSelectedItem().toString());
                                                pst.setString(6, jComboBox1.getSelectedItem().toString());
						pst.setString(5, pass.getText());
						
						pst.executeUpdate();					
						
          
      
      }  catch (Exception ex) {
           // JOptionPane.showMessageDialog(null,"Sign up failed ! \nPlease change User Name or E-mail");
            System.out.println("Sign up failed ! \nPlease change User Name or E-mail");                                    
      }
        
          try {
    Class.forName("com.mysql.jdbc.Driver");
       String query = "INSERT INTO `login`(`Name`, `Email`, `Gender`, `SignUpAs`) VALUES (?,?,?,?)";
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						pst = con.prepareStatement(query);
						pst.setString(1, name.getText());
						pst.setString(2, email.getText());
						
						pst.setString(3, jComboBox2.getSelectedItem().toString());
                                                pst.setString(4, jComboBox1.getSelectedItem().toString());
						
						
						if(pst.executeUpdate()>0)
						{
							JOptionPane.showMessageDialog(null,"Sign up successfully as "+jComboBox1.getSelectedItem().toString());
						}
                                               					
						
      
      }  catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Sign up failed ! \nPlease change User Name or E-mail");
                                                  
      }
                                                }		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        login h = new login();
        h.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birth;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
