/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration.system;

import com.mysql.cj.callback.UsernameCallback;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 *
 * @author SHEM TOM
 */
public class StudentLogin extends javax.swing.JFrame
{
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    static String regDetails;
    
    /**
     * Creates new form LoginScreen
     */
    public StudentLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        logoKsu = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        loginInfoLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoKsu.setBackground(new java.awt.Color(255, 255, 255));
        logoKsu.setForeground(new java.awt.Color(255, 255, 255));
        logoKsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/system/Kisii2.jpg"))); // NOI18N

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        welcomeLabel.setText("WELCOME");

        loginInfoLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginInfoLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 14)); // NOI18N
        loginInfoLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginInfoLabel.setText("To Login enter your Student Admision No.and Password");

        UsernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 20)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setText("USERNAME");

        PasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 20)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLabel.setText("PASSWORD");

        loginButton.setBackground(new java.awt.Color(51, 51, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(0, 0, 0));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Back)
                .addGap(187, 187, 187)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoKsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLabel))
                .addGap(280, 280, 280))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(337, 337, 337)
                            .addComponent(UsernameLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoKsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        // When the user has not insert any data to the form
        StudentHomeDashboard studentHomeDashBoard = new StudentHomeDashboard();
        
        //Login
        String studentTable = "SELECT * FROM student WHERE regno = ?";
        
        try 
            {
                ps = ConnectionDatabase.DbConnection().prepareStatement(studentTable);
                 
                ps.setString(1, usernameField.getText());
                ps.setString(1, passwordField.getText());
                
                /*try{
                FileWriter UserId = new FileWriter("Logs.txt");
                
                UserId.write(loginDetails);
                
                    System.out.println("Reg Number is : " + loginDetails);
                UserId.close();
                }catch(IOException e) {
                    System.out.println("An Error Occured");
                }*/
                
                rs = ps.executeQuery();            
                
                if(rs.next())
                {
                    StudentHomeDashboard studentHomeDashboard = new StudentHomeDashboard();
                    
                    regDetails = rs.getString("RegNO");
                    
                    UserDetails userDetails = new UserDetails(regDetails);
                    
                    //Correct details
                    JOptionPane.showMessageDialog(null, "Successfully Logged In!");

                    //close login form
                    
                    new StudentHomeDashboard().setVisible(true);
                    
                    this.setVisible(false);
                    this.dispose();
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "INVALID DETAILS!"); 
                   
                   //clear the form automatically
                    usernameField.setText("");
                    passwordField.setText("");
                }
            }
            catch (Exception e)
            {
                //Incorrect Details
                JOptionPane.showMessageDialog(null, "INVALID DETAILS!");

                //clear the form automatically
                usernameField.setText("");
                passwordField.setText("");
            }
    }//GEN-LAST:event_loginButtonActionPerformed

    
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        ChooseUser chooseUser = new ChooseUser();

        this.setVisible(false);
        this.dispose();

        chooseUser.show();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginInfoLabel;
    private javax.swing.JLabel logoKsu;
    private javax.swing.JPasswordField passwordField;
    public javax.swing.JTextField usernameField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables


}
