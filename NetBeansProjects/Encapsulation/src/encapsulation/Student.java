/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;


public class Student {
    private String name;
    private int rollno;
    private int mark;
    private String fedback;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getFedback() {
        return fedback;
    }

    public void setFedback(String fedback) {
        this.fedback = fedback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    private double height;
    private float weight;

    public Student(String name, int rollno, int mark, String fedback, double height, float weight) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
        this.fedback = fedback;
        this.height = height;
        this.weight = weight;
    }
    public void display(Student s)
    {
         System.out.println(s.name);
        System.out.println(s.weight); 
        System.out.println(s.height);
        System.out.println(s.rollno);
        System.out.println(s.fedback);
    }
    
}
