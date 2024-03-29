/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ryanokal
 */
public class NewStudent extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String lastDigits, item, schoolID;
    
    int incrementCode;
    String code = "000";
    
    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
        initComponents();
        connection = ConnectionDatabase.DbConnection();
        
        incrementCode++;
        
        DisplayStudentDetail();
        AddSchoolItems();
        AddCoursesItems();
        AddCounties();
        ListOfYears();
    }
    void ListOfYears()
    {
        for(int i=2012; i <= 2022; i++)
        {
            YearOfAdmission.addItem(Integer.toString(i));
        }
    }

    void AddCounties()
    {
        try {
            String counties = "SELECT * FROM county";
            ps = connection.prepareStatement(counties);
            
            rs = ps.executeQuery();
        
        while(rs.next())
        {
            String county = rs.getString("CountyName");
            countyComboBox.addItem(county);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void AddSchoolItems()
    {
        String schools = "SELECT * FROM school";
        try {
            
            ps = connection.prepareStatement(schools);
            
            rs = ps.executeQuery();
        
            while(rs.next())
            {
                schoolComboBox.addItem(rs.getString("SchoolName"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
    
   /* private void AddDepartmentItems()
    {
        String departments = "SELECT * FROM department";
        try {
            
            ps = connection.prepareStatement(departments);
            
            rs = ps.executeQuery();
        
            while(rs.next())
            {
                Department.addItem(rs.getString("DeptName"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } */
    
    private void AddCoursesItems()
    {
        String courses = "SELECT * FROM course";
        try {
            
            ps = connection.prepareStatement(courses);
            
            rs = ps.executeQuery();
        
            while(rs.next())
            {
                course.addItem(rs.getString("courseName"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    /*void AddDepartments()
    {
        String departments = "SELECT DeptName FROM department "
                    + "WHERE SchoolID = (SELECT SchoolID FROM school WHERE SchoolName = '" 
                    + schoolComboBox.getSelectedItem() + "')";
        try {
            ps = connection.prepareStatement(departments);
            
            rs = ps.executeQuery();
            //Department.removeAllItems();
            
            while(rs.next())
            {
                Department.addItem(rs.getString("DeptName"));
            }
        } catch (Exception e)
        {
            
        }
    }*/
    /*private void AddCourses()
    {
        String courses = "SELECT CourseName FROM course "
                    + "WHERE DeptID = (SELECT DeptID FROM department WHERE "
                    + "DeptName = '" + Department.getSelectedItem() + "')";
        
        try {
            ps = connection.prepareStatement(courses);
            
            rs = ps.executeQuery();
            course.removeAllItems();
            
            while(rs.next())
            {
                course.addItem(rs.getString("CourseName"));
            }
            
        } catch (Exception e)
        {
            
        }
    }*/
    
    private void GetCourseDuration()
    {
        try {
            String courses = "SELECT * FROM course "
                    + "WHERE CourseName = '"
                    + course.getSelectedItem() + "'";
            
            ps = connection.prepareStatement(courses);
            
            rs = ps.executeQuery(courses);
            course.removeAllItems();
            
            while(rs.next())
            {
                courseDurationLbl.setText(rs.getString("Duration"));
            }
            
        } catch (Exception e) 
        {
            
        }
    }
    //on click  field ID max 8 characters and must be int
    
    //on click field PHONE number - 10 characters max and must be int
    
    //Date picker
    
    //
    
    void DisplayStudentDetail() //reg and email
    {
        // i.e SIST/0001/20
        regNoLbl.setText(schoolID + "/" + code + incrementCode + "/" + lastDigits);
        
        // i.e SIST000120@KISIIUNIVERSITY.AC.KE
        schoolEmailLbl.setText(schoolID + code + incrementCode + lastDigits + "@kisiiuniversity.ac.ke");
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
        jLabel1 = new javax.swing.JLabel();
        studentNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IdNumberField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        schoolComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        regNoLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        schoolEmailLbl = new javax.swing.JLabel();
        createStudentBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        countyComboBox = new javax.swing.JComboBox<>();
        dateOfBirth = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        YearOfAdmission = new javax.swing.JComboBox<>();
        courseDurationLbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student Name");

        studentNameField.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Number");

        IdNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNumberFieldActionPerformed(evt);
            }
        });
        IdNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdNumberFieldKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("KCSE AGP Grade");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("School");

        schoolComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                schoolComboBoxComponentAdded(evt);
            }
        });
        schoolComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                schoolComboBoxItemStateChanged(evt);
            }
        });
        schoolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Course");

        course.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseItemStateChanged(evt);
            }
        });
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create New Student");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Year of Admission");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Course Duration");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("RegNo");

        regNoLbl.setBackground(new java.awt.Color(0, 51, 102));
        regNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regNoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        regNoLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("School Email");

        schoolEmailLbl.setForeground(new java.awt.Color(0, 0, 0));
        schoolEmailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schoolEmailLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        schoolEmailLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        createStudentBtn.setText("ENROL");
        createStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentBtnActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("STATUS");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "MARRIED" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Phone Number");

        phoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumberKeyTyped(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("GENDER");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("COUNTY");

        countyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countyComboBoxActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("DATE OF BIRTH");

        YearOfAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearOfAdmissionActionPerformed(evt);
            }
        });

        courseDurationLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseDurationLbl.setForeground(new java.awt.Color(0, 0, 0));
        courseDurationLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseDurationLbl.setText("0");
        courseDurationLbl.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regNoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schoolEmailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(304, 304, 304)
                        .addComponent(createStudentBtn)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(studentNameField)
                                .addComponent(IdNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schoolComboBox, 0, 284, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(YearOfAdmission, 0, 111, Short.MAX_VALUE)
                            .addComponent(courseDurationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(YearOfAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseDurationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(schoolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(regNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(schoolEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(createStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jMenu2.setText("<- Back");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(771, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IdNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdNumberFieldActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        // TODO add your handling code here:
        
        Registra reg = new Registra();
        reg.show(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void createStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentBtnActionPerformed
        // TODO add your handling code here
        try {
            String createStudent = "INSERT INTO student (RegNo, FullName, SchoolID, SemID, CourseID, PhoneNO, "
                    + "County, Status, Gender, DOB, KSCEGrade, IDNumber) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            //use school id as var to get the school ID and insert in the table
            //for new students auto - 1.1 for year 1 sem 1
            //var course ID to get the course ID
            //DOB FORMAT - 2001 - 01 -14
            
            //increment the code - reg
            
            //display success message else show an error message - fill all details
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "SUCcESSFULLY REGISTERED STUDENT");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_createStudentBtnActionPerformed

    private void schoolComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_schoolComboBoxComponentAdded

    }//GEN-LAST:event_schoolComboBoxComponentAdded

    private void schoolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolComboBoxActionPerformed
        //generate the SchoolID for REG NO
    }//GEN-LAST:event_schoolComboBoxActionPerformed

    private void schoolComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_schoolComboBoxItemStateChanged
        // TODO add your handling code here:
        String schools = "SELECT * FROM school where SchoolName = '" + schoolComboBox.getSelectedItem() + "'";
        try {
            
            ps = connection.prepareStatement(schools);
            
            rs = ps.executeQuery();
        
            while(rs.next())
            {
                schoolID = rs.getString("SchoolID");
                System.out.println(schoolID);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_schoolComboBoxItemStateChanged

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void countyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countyComboBoxActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // Display couser duraation to the label when a course is selected
        
    }//GEN-LAST:event_courseActionPerformed

    private void YearOfAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearOfAdmissionActionPerformed
        // TODO add your handling code here:
        lastDigits= YearOfAdmission.getSelectedItem().toString().substring(YearOfAdmission.getSelectedItem().toString().length() - 2);
        DisplayStudentDetail();
    }//GEN-LAST:event_YearOfAdmissionActionPerformed

    private void courseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseItemStateChanged
        // TODO add your handling code here:
        //GetCourseDuration();
    }//GEN-LAST:event_courseItemStateChanged

    private void IdNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdNumberFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_IdNumberFieldKeyTyped

    private void phoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_phoneNumberKeyTyped

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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdNumberField;
    private javax.swing.JComboBox<String> YearOfAdmission;
    private javax.swing.JComboBox<String> countyComboBox;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JLabel courseDurationLbl;
    private javax.swing.JButton createStudentBtn;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel regNoLbl;
    private javax.swing.JComboBox<String> schoolComboBox;
    private javax.swing.JLabel schoolEmailLbl;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField studentNameField;
    // End of variables declaration//GEN-END:variables
}
