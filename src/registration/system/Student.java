/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.system;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SHEM TOM
 */
public class Student //extend to programme
{
    Connection connection = null;
    PreparedStatementWrapper ps = null;
    ResultSet rs = null;
    
    String fname, programmeName, schoolName, regNumber, year;
    
    public Student(String fullNames, String yearOfStudy, String school, String programme, String regNo)
    {
        
        
        this.fname = fullNames;
        this.year = yearOfStudy;
        this.schoolName =school;
        this.regNumber = regNo;
        this.programmeName = programme;
    }
    
    
    
    public String getFullNames()
    {
        return fname;
    }
    public String getProgrammeName()
    {
        return programmeName;
    }
    public String getRegNumber()
    {
        return regNumber;
    }
    public String getSchoolName()
    {
        return schoolName;
    }
    public String getYearOfStudy()
    {
        return year;
    }
}
