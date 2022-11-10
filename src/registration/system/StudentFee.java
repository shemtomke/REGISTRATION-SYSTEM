
package registration.system;

import registration.system.StudentLogin;
import registration.system.StudentHomeDashBoard;
import registration.system.StudentUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Brianpraise
 */
public class StudentFee extends javax.swing.JFrame {

    /**
     * Creates new form Examination
     */
    public StudentFee() {
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

        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        yearTxt = new javax.swing.JLabel();
        yearOfStudtDropDown = new javax.swing.JComboBox<>();
        generateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableExams = new javax.swing.JTable();
        yearTxt1 = new javax.swing.JLabel();
        generateButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableExams1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        yearOfStudtDropDown1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeBtn = new javax.swing.JMenu();
        HomeBtn = new javax.swing.JMenuItem();
        UnitsBtn = new javax.swing.JMenuItem();
        FeeBtn = new javax.swing.JMenuItem();
        ExamsBtn = new javax.swing.JMenuItem();
        progressBtn = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("LOG OUT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        yearTxt.setBackground(new java.awt.Color(255, 255, 255));
        yearTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        yearTxt.setForeground(new java.awt.Color(0, 0, 0));
        yearTxt.setText("Fee Statement");

        yearOfStudtDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1 Sem 1", "Year 1 Sem 2", "Year 2 Sem 1", "Year 2 Sem 2", "Year 3 Sem 1", "Year 3 Sem 2", "Year 4 Sem 1", "Year 4 Sem 2" }));

        generateButton.setBackground(new java.awt.Color(102, 255, 102));
        generateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateButton.setForeground(new java.awt.Color(0, 0, 0));
        generateButton.setText("GENERATE");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        TableExams.setBackground(new java.awt.Color(204, 255, 204));
        TableExams.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Ref", "Description", "Debit (KES)", "Credit (KES)", "Balance (KES)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableExams);

        yearTxt1.setBackground(new java.awt.Color(255, 255, 255));
        yearTxt1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        yearTxt1.setForeground(new java.awt.Color(0, 0, 0));
        yearTxt1.setText("Fee Structure");

        generateButton1.setBackground(new java.awt.Color(102, 255, 102));
        generateButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateButton1.setForeground(new java.awt.Color(0, 0, 0));
        generateButton1.setText("GENERATE");
        generateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButton1ActionPerformed(evt);
            }
        });

        TableExams1.setBackground(new java.awt.Color(204, 255, 204));
        TableExams1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Account", "Amount (KES)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableExams1);

        yearOfStudtDropDown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1 Sem 1", "Year 1 Sem 2", "Year 2 Sem 1", "Year 2 Sem 2", "Year 3 Sem 1", "Year 3 Sem 2", "Year 4 Sem 1", "Year 4 Sem 2" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTxt)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yearOfStudtDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(generateButton))
                    .addComponent(yearTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yearOfStudtDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(generateButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(yearTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearOfStudtDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearOfStudtDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

        UnitsBtn.setText("UNITS");
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(771, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateButtonActionPerformed

    private void generateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateButton1ActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        StudentHomeDashBoard studentHomeDashBoard = new StudentHomeDashBoard();

        this.setVisible(false);
        this.dispose();

        studentHomeDashBoard.show();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void UnitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitsBtnActionPerformed
        // TODO add your handling code here:
        StudentUnit studentUnit = new StudentUnit();

        this.setVisible(false);
        this.dispose();

        studentUnit.show();
    }//GEN-LAST:event_UnitsBtnActionPerformed

    private void FeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeBtnActionPerformed
        // TODO add your handling code here:
        StudentFee studentFee = new StudentFee();

        this.setVisible(false);
        this.dispose();

        studentFee.show();
    }//GEN-LAST:event_FeeBtnActionPerformed

    private void ExamsBtnMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_ExamsBtnMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamsBtnMenuKeyPressed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamsBtnActionPerformed
        // TODO add your handling code here:
        Examination studentExam = new Examination();

        this.setVisible(false);
        this.dispose();

        studentExam.show();
    }//GEN-LAST:event_ExamsBtnActionPerformed

    private void progressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressBtnActionPerformed
        // TODO add your handling code here:
        StudentProgress studentProgress = new StudentProgress();

        this.setVisible(false);
        this.dispose();

        studentProgress.show();
    }//GEN-LAST:event_progressBtnActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        StudentLogin login = new StudentLogin();

        this.setVisible(false);
        this.dispose();

        login.show();

    }//GEN-LAST:event_logOutActionPerformed

    private void homeBtnMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeBtnMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnMenuSelected

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        StudentHomeDashBoard studentHomeDashBoard = new StudentHomeDashBoard();

        this.setVisible(false);
        this.dispose();

        studentHomeDashBoard.show();
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
            java.util.logging.Logger.getLogger(StudentFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExamsBtn;
    private javax.swing.JMenuItem FeeBtn;
    private javax.swing.JMenuItem HomeBtn;
    private javax.swing.JTable TableExams;
    private javax.swing.JTable TableExams1;
    private javax.swing.JMenuItem UnitsBtn;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton generateButton1;
    private javax.swing.JMenu homeBtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JMenuItem progressBtn;
    private javax.swing.JComboBox<String> yearOfStudtDropDown;
    private javax.swing.JComboBox<String> yearOfStudtDropDown1;
    private javax.swing.JLabel yearTxt;
    private javax.swing.JLabel yearTxt1;
    // End of variables declaration//GEN-END:variables
}