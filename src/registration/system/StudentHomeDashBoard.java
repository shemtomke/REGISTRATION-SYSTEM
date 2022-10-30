/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration.system;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Brianpraise
 */
public class StudentHomeDashBoard extends javax.swing.JFrame {
    
    
    /**
     * Creates new form StudentDashBoard
     */
    public StudentHomeDashBoard() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        unitButton = new javax.swing.JButton();
        examButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        studentNameTxt = new javax.swing.JLabel();
        regNoTxt = new javax.swing.JLabel();
        schoolTxt = new javax.swing.JLabel();
        YearTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        programmeTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT DASHBOARD");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        homeButton.setBackground(new java.awt.Color(153, 153, 255));
        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(0, 0, 0));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        unitButton.setBackground(new java.awt.Color(204, 255, 204));
        unitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitButton.setForeground(new java.awt.Color(0, 0, 0));
        unitButton.setText("UNITS");
        unitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitButtonActionPerformed(evt);
            }
        });

        examButton.setBackground(new java.awt.Color(204, 255, 204));
        examButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        examButton.setForeground(new java.awt.Color(0, 0, 0));
        examButton.setText("EXAMINATION");
        examButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 51, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("LOG OUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration/system/kISII_SMALL-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(examButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(unitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(20, 20, 20)))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(72, 72, 72)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(unitButton)
                .addGap(50, 50, 50)
                .addComponent(examButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(logoutButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        studentNameTxt.setBackground(new java.awt.Color(0, 0, 0));
        studentNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        studentNameTxt.setText("Name");

        regNoTxt.setBackground(new java.awt.Color(255, 255, 255));
        regNoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regNoTxt.setForeground(new java.awt.Color(0, 0, 0));
        regNoTxt.setLabelFor(regNoTxt);
        regNoTxt.setText("REG NO");

        schoolTxt.setBackground(new java.awt.Color(204, 255, 204));
        schoolTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        schoolTxt.setForeground(new java.awt.Color(0, 0, 0));
        schoolTxt.setText("SCHOOL");

        YearTxt.setBackground(new java.awt.Color(255, 255, 255));
        YearTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        YearTxt.setForeground(new java.awt.Color(0, 0, 0));
        YearTxt.setText("YEAR");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BIT 101", "MOBILE", "PENDING"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "COURSE CODE", "COUTSE NAME", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        programmeTxt.setBackground(new java.awt.Color(255, 255, 255));
        programmeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        programmeTxt.setForeground(new java.awt.Color(0, 0, 0));
        programmeTxt.setText("Programme");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(studentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(schoolTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(programmeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(programmeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schoolTxt)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(771, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitButtonActionPerformed
        // TODO add your handling code here:
        StudentUnit studentUnit = new StudentUnit();
        
        try {
            studentUnit.setVisible(true);
            this.setVisible(false);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_unitButtonActionPerformed

    private void examButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examButtonActionPerformed
        // TODO add your handling code here:
        Examination studentExam = new Examination();
        
        try {
            studentExam.setVisible(true);
            this.setVisible(false);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_examButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(new LoginScreen().loginDetails);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        LoginScreen loginScreen = new LoginScreen();
        
        try {
            loginScreen.setVisible(true);
            this.setVisible(false);
            this.dispose();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
           
        StudentHomeDashBoard studentHome = new StudentHomeDashBoard();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                studentHome.setVisible(true);
                
            }
        });
        
        studentHome.DisplayStudent();
        
    }
    public void DisplayStudent()
    {
        Connection connection = null;
        PreparedStatementWrapper ps = null;
        ResultSet rs = null;
        
        connection = ConnectionDatabase.DbConnection();
    
        //GET NAME, YEAR, SCHOOL, PROGRAMME, REGNO - will add more later
        try 
            {
                //Fetch Values for the specific user
                String studentDetails = 
                "SELECT * FROM student WHERE regno = " + new LoginScreen().loginDetails;
                
                ps = (PreparedStatementWrapper) connection.prepareStatement(studentDetails);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    Student student = new Student(rs.getString("fname"), rs.getString("semID"), rs.getString("facultyID"),
                    rs.getString("Course_Code"), rs.getString("regno"));
                    
                    studentNameTxt.setText(rs.getString("fname"));
                    YearTxt.setText(rs.getString("semID"));
                    schoolTxt.setText(rs.getString("facultyID"));
                    programmeTxt.setText(rs.getString("Course_Code"));
                    regNoTxt.setText(rs.getString("regno"));
                    
                    JOptionPane.showMessageDialog(null, rs.getString("fname") + rs.getString("regno"));
                }
            }
            catch (Exception e)
            {
                
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel YearTxt;
    private javax.swing.JButton examButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel programmeTxt;
    private javax.swing.JLabel regNoTxt;
    private javax.swing.JLabel schoolTxt;
    private javax.swing.JLabel studentNameTxt;
    private javax.swing.JButton unitButton;
    // End of variables declaration//GEN-END:variables

    private PreparedStatementWrapper prepareStatement(String studentDetails) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
