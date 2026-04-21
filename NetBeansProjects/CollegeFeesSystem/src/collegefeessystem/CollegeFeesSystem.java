/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegefeessystem;

/**
 *
 * @author user
 */
public class CollegeFeesSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        College c=new College(200000);
         College c1=new College(300000);
         College.displayclgdetails();
         c.displayregfees();
         c1.displayregfees();
        
    }
    
}
