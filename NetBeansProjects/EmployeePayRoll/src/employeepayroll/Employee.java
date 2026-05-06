/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeepayroll;

/**
 *
 * @author user
 */
 import java.util.*;
public class Employee {
   



    int id;
    String name;
    String dept;
    double basic;

    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

  
    Employee(int id, String name, String dept, double basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
    }

 
    void addEmployee() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        
        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        // 2-step object creation
        Employee e = new Employee(id, name, dept, basic);
        list.add(e);

        System.out.println("Employee Added Successfully!");
    }

   
    void viewEmployees() {

        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : list) {
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Department: " + e.dept);
            System.out.println("Basic Salary: " + e.basic);
            System.out.println("----------------");
        }
    }

    // 3. Search Employee
    void searchEmployee() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("ID: " + e.id);
                System.out.println("Name: " + e.name);
                System.out.println("Department: " + e.dept);
                System.out.println("Basic Salary: " + e.basic);
                return;
            }
        }

        System.out.println("Employee not found!");
    }

  
    void updateSalary() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("Enter new salary: ");
                e.basic = sc.nextDouble();
                System.out.println("Salary updated!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

  
    void calculateNetSalary() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {

                double hra = 0.2 * e.basic;
                double da = 0.1 * e.basic;
                double pf = 0.05 * e.basic;

                double net = e.basic + hra + da - pf;

                System.out.println("Net Salary: " + net);
                return;
            }
        }

        System.out.println("Employee not found!");
    }

  
  void deleteEmployee() {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    for (int i = 0; i < list.size(); i++) {

        if (list.get(i).id == id) {
            list.remove(i);
            System.out.println("Employee deleted!");
            return;
        }
    }

    System.out.println("Employee not found!");
}
}

