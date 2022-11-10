/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.system;

/**
 *
 * @author SHEM TOM
 */
public class Programme
{
    String courseName, courseCode;
    
    public Programme(String course, String courseUnitCode)
    {
        this.courseCode = courseUnitCode;
        this.courseName = course;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    public String getCourseCode()
    {
        return courseCode;
    }
}
