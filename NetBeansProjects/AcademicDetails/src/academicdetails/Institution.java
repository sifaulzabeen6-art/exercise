/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academicdetails;

import java.util.Arrays;
import java.util.Scanner;
public class Institution {
   final String instituitionname="Abc INSTITTION";
   class Student{
       String studentname;
       int rollno;
       int[]marks;
       int average;
       char grade;
        Scanner sc=new Scanner(System.in);
       void addstudent()
       {
           sc.nextLine();
         
           System.out.println("ENTER THE STUDENT NAME:");
            studentname=sc.nextLine();
           
           System.out.println("ENTER ROLL NO:");
           rollno=sc.nextInt();
           System.out.println("ENTER NO OF SUBJECTS:");
           int sub=sc.nextInt();
           marks=new int[sub];
       }
       void addmarks()
       {
           if(marks==null)
           {
               System.out.println("PLEASE ENTER THE STUDENTS DETAILS!!!");
               return;
           }
           System.out.println("ENTER THE MARKS:");
           for (int i = 0; i < marks.length; i++) {
               marks[i]=sc.nextInt();
               
           }
       }
       void Grade()
       {
           if(marks==null)
           {
               System.out.println("NO MARKS AVAILABEL!!!");
               return;
           }
         double sum=0;
           for (int i = 0; i < marks.length; i++) {
               sum=sum+marks[i];
              }
           average=(int) (sum/marks.length);
           if(average>=90)
          grade='A';
  
           
           else if(average>=75)
           
              grade='B';
          
           else if(average>=50)
           
              grade='C';
           
           else{
               grade='F';
           }
           System.out.println("GRADE:"+grade);
                   
       }
       void display()
       {
           
       if(studentname==null)
       {
           System.out.println("NO STUDENT DETAILS"); 
           return;
       }
           System.out.println("INSTITUTION NAME:"+instituitionname);
           System.out.println("STUDENT NAME:"+studentname);
           System.out.println("ROLL NO:"+rollno);
           System.out.println("MARKS:"+Arrays.toString(marks));
           System.out.println("AVERAGE:"+average);
           System.out.println("GRADE"+grade);
       }
       
   }
    
}
