/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean result=true;
        do{
        
        System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
             int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();

                int i;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).rollNumber == roll) {
                        System.out.println("Roll number already exists!");
                        break;
                    }
                }
                if (i == list.size()) {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(roll, name, age, course, marks));
                    System.out.println("Student Added!");
                }
            }
            
            else if (choice == 2) {

                if (list.size() == 0) {
                    System.out.println("No students found!");
                } else {
                    for (Student s : list) {
                        s.display();
                    }
                }

            } 
            
            
            else if (choice == 3) {

                System.out.print("Enter Roll Number to search: ");
                int searchRoll = sc.nextInt();

                int i;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).rollNumber == searchRoll) {
                        list.get(i).display();
                        break;
                    }
                }

                if (i == list.size()) {
                    System.out.println("Student not found!");
                }

            } 
            
            
            
            else if (choice == 4) {

                System.out.print("Enter Roll Number to update: ");
                int updateRoll = sc.nextInt();

                int i;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).rollNumber == updateRoll) {
                        System.out.print("Enter new marks: ");
                        list.get(i).marks = sc.nextDouble();
                        System.out.println("Marks updated!");
                        break;
                    }
                }

                if (i == list.size()) {
                    System.out.println("Student not found!");
                }

            } 
            
            
            else if (choice == 5) {

                System.out.print("Enter Roll Number to delete: ");
                int deleteRoll = sc.nextInt();

                int i;
                for (i = 0; i < list.size(); i++) {
                    if (list.get(i).rollNumber == deleteRoll) {
                        list.remove(i);
                        System.out.println("Student deleted!");
                        break;
                    }
                }

                if (i == list.size()) {
                    System.out.println("Student not found!");
                }

            } 
            
            
            else 
            {
                System.out.println("exit");
                result=false;
                
            
            }
        }while(result);
            
    }
}

    
    

