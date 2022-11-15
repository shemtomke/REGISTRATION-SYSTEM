/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration.system;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHEM TOM
 */
public class StudentUnit extends javax.swing.JFrame {

    StudentHomeDashboard studentHomeDashBoard = new StudentHomeDashboard();
    UserDetails userDetails = new UserDetails(UserDetails.username);
    
    DefaultTableModel tableModel;
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    boolean selectUnit = false;
    String unitID;
    
    /**
     * Creates new form StudentUnit
     */
    public StudentUnit() {
        initComponents();
        ShowSemester();
        PopulateUnits();
        CheckUnitRegistration();
        
        
        System.out.println("REG NO IS : " + userDetails.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        yearTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportSessionTable = new javax.swing.JTable();
        registerButton = new javax.swing.JButton();
        year = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        reportButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUnits = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeBtn = new javax.swing.JMenu();
        HomeBtn = new javax.swing.JMenuItem();
        UnitsBtn = new javax.swing.JMenuItem();
        FeeBtn = new javax.swing.JMenuItem();
        ExamsBtn = new javax.swing.JMenuItem();
        progressBtn = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        yearTxt.setBackground(new java.awt.Color(255, 255, 255));
        yearTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yearTxt.setForeground(new java.awt.Color(0, 0, 0));
        yearTxt.setText("REPORT SESSION");

        reportSessionTable.setBackground(new java.awt.Color(255, 255, 255));
        reportSessionTable.setForeground(new java.awt.Color(0, 0, 0));
        reportSessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Semester", "Date Reported"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reportSessionTable);

        registerButton.setBackground(new java.awt.Color(0, 255, 0));
        registerButton.setForeground(new java.awt.Color(0, 0, 0));
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        year.setBackground(new java.awt.Color(255, 255, 255));
        year.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        year.setForeground(new java.awt.Color(0, 0, 0));
        year.setText("YEAR 1 SEM 1");

        reportButton.setBackground(new java.awt.Color(0, 255, 0));
        reportButton.setForeground(new java.awt.Color(0, 0, 0));
        reportButton.setText("REPORT");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        tableUnits.setBackground(new java.awt.Color(255, 255, 255));
        tableUnits.setForeground(new java.awt.Color(0, 0, 0));
        tableUnits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Unit Code", "Unit Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableUnits);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(yearTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(year)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(registerButton)
                .addGap(76, 76, 76))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        homeBtn.setForeground(new java.awt.Color(0, 0, 0));
        homeBtn.setText("=");
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                homeBtnMenuSelected(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        HomeBtn.setText("HOME");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        homeBtn.add(HomeBtn);

        UnitsBtn.setText("UNITS & SESSION");
        UnitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitsBtnActionPerformed(evt);
            }
        });
        homeBtn.add(UnitsBtn);

        FeeBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        FeeBtn.setText("FEE");
        FeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeBtnActionPerformed(evt);
            }
        });
        homeBtn.add(FeeBtn);

        ExamsBtn.setText("EXAMS");
        ExamsBtn.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                ExamsBtnMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        ExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamsBtnActionPerformed(evt);
            }
        });
        homeBtn.add(ExamsBtn);

        progressBtn.setText("PROGRESS");
        progressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progressBtnActionPerformed(evt);
            }
        });
        homeBtn.add(progressBtn);

        logOut.setText("LOG OUT");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        homeBtn.add(logOut);

        jMenuBar1.add(homeBtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(771, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowSemester()
    {
        year.setText(studentHomeDashBoard.semester);
    }
    
    void PopulateUnits()
    {
        try {
            String unitTable = "SELECT UnitID, UnitName FROM unit "
                    + "WHERE SemID = (SELECT SemID FROM student WHERE RegNO = '" + userDetails.getUsername() + "')"
                    + "AND CourseID = (SELECT CourseID FROM student WHERE RegNO = '" + userDetails.getUsername() + "')";
            
            ps = ConnectionDatabase.DbConnection().prepareStatement(unitTable);
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) tableUnits.getModel();
            
            while(rs.next())
            {
                String unitCode = rs.getString("UnitID");
                String unitName = rs.getString("UnitName");
                
                tableModel.addRow(new Object[]{selectUnit, unitCode, unitName});
                System.out.println(unitCode);
            }
        } catch (Exception e) {
        }
    }
    void CheckUnitRegistration()
    {
        //if the user has clicked and registered units then set all check boxes to true and the button to false
        //check if the table from home dashboard has populated anything if true then do as above
        //check if the data exists in the table if so then disable
        unitID = (String) tableUnits.getValueAt(0, 1);
        String queryCheck = "SELECT * FROM unitregistration WHERE UnitID = '" + unitID + "'";
        
        try {
            ps = ConnectionDatabase.DbConnection().prepareStatement(queryCheck);
            rs = ps.executeQuery();
            boolean exists = rs.next();
            
            if(exists)
            {
                registerButton.setEnabled(false);
            }
        } catch (Exception e) {
        }
        
    }
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        //if all booleans are selected then show successful message
        
        //else tell the user to register all units for that semeseter
        
        //if registered then populate all the data to the home portal.
        tableModel = (DefaultTableModel) tableUnits.getModel();

        int index = 3;
        
        try 
        {
            String registerUnits = "INSERT INTO unitregistration("
                            + "UnitRegID, RegNO, Status, UnitID, UnitName) values ("
                            + "?,?,?,?,?)";

            ps = ConnectionDatabase.DbConnection().prepareStatement(registerUnits);
            
            for (int row = 0; row < tableUnits.getRowCount(); row++) 
            {
                tableUnits.getValueAt(row, 0);

                String unitCode = (String) tableUnits.getValueAt(row, 1);
                String unitName = (String) tableUnits.getValueAt(row, 2);

                ps.setInt(1, index++);
                ps.setString(2, userDetails.getUsername());
                ps.setString(3, "Pending");
                ps.setString(4, unitCode);
                ps.setString(5, unitName);
               
                ps.addBatch();
                ps.execute();
                
                if((Boolean) tableUnits.getValueAt(row, 0))
                {
                    JOptionPane.showMessageDialog(null, "SUCCESSFULLY REGISTERED!");
                    registerButton.setEnabled(false);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "REGISTER ALL UNITS ALLOCATED!");
                }
            }
            
            ps.executeBatch();
            ConnectionDatabase.DbConnection().commit();
            
        } 
        catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        //if you are a new student then show that you were reported for session by the registrar
        
    }//GEN-LAST:event_reportButtonActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        StudentHomeDashboard studentHomeDashBoard = new StudentHomeDashboard();

        studentHomeDashBoard.show();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void UnitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitsBtnActionPerformed
        // TODO add your handling code here:
        StudentUnit studentUnit = new StudentUnit();

        studentUnit.show();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_UnitsBtnActionPerformed

    private void FeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeBtnActionPerformed
        // TODO add your handling code here:
        StudentFee studentFee = new StudentFee();
        studentFee.show();
        this.setVisible(false);
        this.dispose();

        
    }//GEN-LAST:event_FeeBtnActionPerformed

    private void ExamsBtnMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_ExamsBtnMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamsBtnMenuKeyPressed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamsBtnActionPerformed
        // TODO add your handling code here:
        Examination studentExam = new Examination();
        studentExam.show();
        this.setVisible(false);
        this.dispose();

        
    }//GEN-LAST:event_ExamsBtnActionPerformed

    private void progressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressBtnActionPerformed
        // TODO add your handling code here:
        StudentProgress studentProgress = new StudentProgress();
        studentProgress.show();
        this.setVisible(false);
        this.dispose();

        
    }//GEN-LAST:event_progressBtnActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        StudentLogin login = new StudentLogin();
        login.show();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void homeBtnMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeBtnMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnMenuSelected

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        StudentHomeDashboard studentHomeDashBoard = new StudentHomeDashboard();

        studentHomeDashBoard.show();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUnit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUnit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExamsBtn;
    private javax.swing.JMenuItem FeeBtn;
    private javax.swing.JMenuItem HomeBtn;
    private javax.swing.JMenuItem UnitsBtn;
    private javax.swing.JMenu homeBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JMenuItem progressBtn;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JTable reportSessionTable;
    private javax.swing.JTable tableUnits;
    private javax.swing.JLabel year;
    private javax.swing.JLabel yearTxt;
    // End of variables declaration//GEN-END:variables
}
