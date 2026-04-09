/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagement;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cboolean result=true;
    Scanner sc=new Scanner(System.in);
    Employe e=new Employe();
        System.out.println("ENTER THE EMPLOYEE ID");
        e.setEmpid(sc.nextInt());
        sc.nextLine();
        
        
        System.out.println("ENTER THe EMPLOYEE NAME");
        e.setEmpName(sc.nextLine());
        
        System.out.println("ENTER DESIGNATION");
        e.setDesignation(sc.nextLine());
        System.out.println("EntER SALARY");
        e.setSalary(sc.nextInt());
        System.out.println("***************************");
        e.DispalyEmployeeDetails();
    }
}