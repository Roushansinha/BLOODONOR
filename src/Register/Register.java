/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Roushan Sinha
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        FullName = new javax.swing.JLabel();
        Father_Name = new javax.swing.JLabel();
        E_mail = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        D_O_B = new javax.swing.JLabel();
        Whatsapp_No = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Adhaar_card_no = new javax.swing.JLabel();
        Blood_group = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        C_Password = new javax.swing.JLabel();
        jTextFieldfullname = new javax.swing.JTextField();
        jTextFieldFname = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldWno = new javax.swing.JTextField();
        jRadioButtonmale = new javax.swing.JRadioButton();
        jRadioButtonfmale = new javax.swing.JRadioButton();
        jTextFieldAdhaar = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        jComboBoxBgroup = new javax.swing.JComboBox<>();
        jTextFieldAddress = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JPasswordField();
        jTextFieldCPAssword = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        FullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FullName.setForeground(new java.awt.Color(255, 255, 255));
        FullName.setText("Full Name:");

        Father_Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Father_Name.setForeground(new java.awt.Color(255, 255, 255));
        Father_Name.setText("Father's Name :");

        E_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        E_mail.setForeground(new java.awt.Color(255, 255, 255));
        E_mail.setText("E-mail :");

        Address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address :");

        D_O_B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        D_O_B.setForeground(new java.awt.Color(255, 255, 255));
        D_O_B.setText("D.O.B :");

        Whatsapp_No.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Whatsapp_No.setForeground(new java.awt.Color(255, 255, 255));
        Whatsapp_No.setText("Whatsapp No :");

        Gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender :");

        Adhaar_card_no.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Adhaar_card_no.setForeground(new java.awt.Color(255, 255, 255));
        Adhaar_card_no.setText("Adhaar Card No:");

        Blood_group.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Blood_group.setForeground(new java.awt.Color(255, 255, 255));
        Blood_group.setText("BLOOD Group :");

        Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password :");

        C_Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        C_Password.setForeground(new java.awt.Color(255, 255, 255));
        C_Password.setText("Confirm Password:");

        jTextFieldfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfullnameActionPerformed(evt);
            }
        });

        jTextFieldFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnameActionPerformed(evt);
            }
        });

        jRadioButtonmale.setText("Male");

        jRadioButtonfmale.setText("Female");

        RegisterButton.setBackground(new java.awt.Color(204, 204, 204));
        RegisterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(0, 0, 255));
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION");

        jComboBoxBgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jComboBoxBgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBgroupActionPerformed(evt);
            }
        });

        Username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username :");

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 0, 0));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Adhaar_card_no)
                    .addComponent(Password)
                    .addComponent(Whatsapp_No)
                    .addComponent(Username)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E_mail)
                        .addGap(13, 13, 13))
                    .addComponent(Address))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldAdhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(Blood_group))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RegisterButton)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Father_Name)
                                    .addComponent(FullName)
                                    .addComponent(D_O_B)
                                    .addComponent(Gender)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(C_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldFname, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jTextFieldfullname, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonmale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonfmale))
                    .addComponent(jTextFieldCPAssword)
                    .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Username)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FullName)
                        .addComponent(jTextFieldfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E_mail))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Father_Name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D_O_B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButtonmale)
                        .addComponent(jRadioButtonfmale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldWno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Whatsapp_No))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adhaar_card_no)
                    .addComponent(jTextFieldAdhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blood_group)
                    .addComponent(jComboBoxBgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(C_Password)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCPAssword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(jButtonReset))
                .addGap(222, 222, 222))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfullnameActionPerformed

    private void jTextFieldFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnameActionPerformed

    private void jComboBoxBgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBgroupActionPerformed
        // TODO add your handling code here:
       
            
    }//GEN-LAST:event_jComboBoxBgroupActionPerformed
   
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String Uname = jTextFieldUsername.getText();
        String Fname = jTextFieldfullname.getText().toString();
        String Email =jTextFieldEmail.getText();
        String F_name =jTextFieldFname.getText();
        String Addres =jTextFieldAddress.getText();
        //String =jDateChooserDOB.getDateFormatString();
        String Whatsapp_no =jTextFieldWno.getText();
        String Adhaar =jTextFieldAdhaar.getText();
        //String Blood_Group =jComboBoxBgroup.getText();
        String Pass=jTextFieldPassword.getText();
        String Confirm_Pass =jTextFieldCPAssword.getText();
        
        if (Uname.equals("")) {
            JOptionPane.showMessageDialog(null,"Username is mandatory");
            
        }
        if (Fname.equals("")) {
            JOptionPane.showMessageDialog(null,"Your anme is Required");
        }
         if (Email.equals("")) {
            JOptionPane.showMessageDialog(null,"Email is mandatory");
        }
          if (Addres.equals("")) {
            JOptionPane.showMessageDialog(null,"Address is mandatory");
        }
          if(Whatsapp_no.equals("")) {
            JOptionPane.showMessageDialog(null,"Whatsapp number is mandatory");
        }
           if(Adhaar.equals("")) {
            JOptionPane.showMessageDialog(null,"Adhaar card is mandatory");
        }
          
             if(Confirm_Pass.equals("")) {
            JOptionPane.showMessageDialog(null,"Password is required");
        }
             try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","oracle");
            
            PreparedStatement ps = con.prepareStatement("insert into Donor values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,"FULLNAME");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jTextFieldUsername.setText(null);
        jTextFieldfullname.setText(null);
        jTextFieldEmail.setText(null);
        jTextFieldAddress.setText(null);
        jTextFieldAdhaar.setText(null);
        jTextFieldWno.setText(null);
        jTextFieldFname.setText(null);
        jTextFieldPassword.setText(null);
        jTextFieldCPAssword.setText(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Adhaar_card_no;
    private javax.swing.JLabel Blood_group;
    private javax.swing.JLabel C_Password;
    private javax.swing.JLabel D_O_B;
    private javax.swing.JLabel E_mail;
    private javax.swing.JLabel Father_Name;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Password;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Whatsapp_No;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBoxBgroup;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonfmale;
    private javax.swing.JRadioButton jRadioButtonmale;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAdhaar;
    private javax.swing.JPasswordField jTextFieldCPAssword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JPasswordField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldWno;
    private javax.swing.JTextField jTextFieldfullname;
    // End of variables declaration//GEN-END:variables
}
