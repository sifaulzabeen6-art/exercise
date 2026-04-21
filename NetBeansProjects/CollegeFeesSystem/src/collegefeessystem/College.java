/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegefeessystem;

/**
 *
 * @author user
 */
public class College {
    static final String collegename="XYZ ENGINEERING COLLEGE";
    final int regfees;
    static int totalstudents=0;

    public College(int regfees) {
        this.regfees = regfees;
        totalstudents++;
    }
    static void displayclgdetails()
    {
        System.out.println("COLLEGE NAME"+collegename);
        System.out.println("Total students"+totalstudents);
        
    }
    void displayregfees()
    {
        System.out.println("STUDENT REG FEES"+regfees);
    }
    
    
    
}
