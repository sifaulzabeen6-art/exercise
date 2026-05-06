/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeepayroll;

import java.util.*;
public class EmployeePayRoll {


    public static void main(String[] args) {
      



   

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(0, "", "", 0);

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                emp.addEmployee();
            } 
            else if (choice == 2) {
                emp.viewEmployees();
            } 
            else if (choice == 3) {
                emp.searchEmployee();
            } 
            else if (choice == 4) {
                emp.updateSalary();
            } 
            else if (choice == 5) {
                emp.calculateNetSalary();
            } 
            else if (choice == 6) {
                emp.deleteEmployee();
            } 
            else if (choice == 7) {
                System.out.println("Exiting...");
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
    
    

