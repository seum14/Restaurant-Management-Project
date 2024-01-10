package User;


import Customer.Welcome;
import Manager.front_page;
import Staff.Staff_front_page;
import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class login extends javax.swing.JFrame {
  Connection con = null;
	PreparedStatement pst = null;
        ResultSet rs ;
    /**
     * Creates new form Forgot_pass
     */
    public login() {
        initComponents();
    jPanel1.setBackground(new Color(0,0,0,70));
    
  
    	showpic1();
		
                        }
  public void showpic1()
    {
        ImageIcon icon = new ImageIcon("E:\\Enginnering Folder\\java\\Restaurent Managment Project\\src\\Picture\\preview_italian-pizza.jpeg");
        jLabel9.setIcon(icon);
        //scaling image for fit
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        jLabel9.setIcon(scaledIcon);
        
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 120, 1096, 624));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1096, 624));
        setMinimumSize(new java.awt.Dimension(1096, 624));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(50, 310, 251, 22);

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 340, 90, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 4, 62));
        jLabel7.setText("Password : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 280, 105, 18);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option", "Manager", "Staff", "Customer" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(190, 340, 106, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/image-260nw-387081622.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 20, 130, 130);

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("KHS Cafe & Restaurent   ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 360, 40);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(50, 250, 250, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 4, 62));
        jLabel4.setText("User Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 230, 75, 18);

        jButton3.setText("Forget Password ?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 460, 190, 30);

        jButton4.setText("Create New Account");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(80, 420, 190, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OR");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 380, 50, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 390, 530));

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
     
       if(name.getText().equals("")||jComboBox1.getSelectedItem().toString().equals("Select")||password.getText().equals(""))
                                                {
                                                    JOptionPane.showMessageDialog(null,"Some field are empty","Error",1);
                                                }
                                               else
                                                {
        try {
    Class.forName("com.mysql.jdbc.Driver");
       String query = "SELECT * FROM signup WHERE username=? AND password=?";
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiuserlogin", "root", "");
						pst = con.prepareStatement(query);
						pst.setString(1, name.getText());
						
						
						pst.setString(2, password.getText());
						
							String option = jComboBox1.getSelectedItem().toString();				
						rs = (ResultSet) pst.executeQuery();
                                                        
							if(rs.next())
							{
								String s1 = rs.getString("signupas");
							       
							
                                                   if(option.equalsIgnoreCase("Manager")&&s1.equalsIgnoreCase("Manager"))
                                                   {
                                                        
                                                            front_page m = new front_page();
                                                            m.setVisible(true);
                                                            dispose();
                                                            setVisible(false);
                                                   }
                                                     else  if(option.equalsIgnoreCase("Staff")&&s1.equalsIgnoreCase("Staff")) 
                                                       {
                                                            Staff_front_page s = new Staff_front_page();
                                                            s.setVisible(true);
                                                            dispose();
                                                            setVisible(false);
                                                       }
                                                     else if(option.equalsIgnoreCase("Customer")&&s1.equalsIgnoreCase("Customer"))
                                                         {
                                                           Welcome c = new Welcome();
                                                            c.setVisible(true);
                                                            dispose();
                                                            setVisible(false);
                                                         }
                                                        }
                                                        else
                                                        {
                                                            JOptionPane.showMessageDialog(null, "Please check User Name or Password");
                                                        }
      
      }  catch (Exception ex) {
          Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
      }
                                 
                                                }		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home d = new Home();
        d.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Sign_Up p = new Sign_Up();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Forgot_pass p = new Forgot_pass();
       p.setVisible(true);
       dispose();
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
