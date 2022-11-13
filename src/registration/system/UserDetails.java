/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.system;

import java.util.Observable;

/**
 *
 * @author SHEM TOM
 */
public class UserDetails extends Observable
{
    public static String username, semID, courseID, schoolID;
    
    public UserDetails(String user)
    {
        this.username = user;
        setChanged();
        notifyObservers(user);
    }
    public String getUsername()
    {
        return username;
    }
    public String getSemester()
    {
        return semID;
    }
    public String getCourse()
    {
        return courseID;
    }
    public String getSchool()
    {
        return schoolID;
    }
}
