/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;


public class Student{
    int rollNumber;
    String name;
    int age;
    String course;
    double marks;

    public Student(int rollNumber, String name, int age, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    void display()
    {
                System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }


}

   

