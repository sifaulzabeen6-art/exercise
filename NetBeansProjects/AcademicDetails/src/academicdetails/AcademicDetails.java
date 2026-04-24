
package academicdetails;

import java.util.Scanner;
public class AcademicDetails {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean result=true;
        Institution.Student obj=new Institution().new Student();
        do{
        System.out.println("******************************");
        System.out.println("1.ADD STUDENTS");
        System.out.println("2.ADD MARKS");
        System.out.println("3.CALCULATE GRADE");
        System.out.println("4.DISPALY ");
        System.out.println("5.EXIT");
        System.out.println("******************************");
        System.out.print("ENTER YOUR OPTION:");
        int option=sc.nextInt();
        sc.nextLine();
        if(option==1)
        {
            obj.addstudent();
        }
        else if(option==2)
        {
            obj.addmarks();
        }
        else if(option==3)
        {
            obj.Grade();
        }
        else if(option==4)
        {
            obj.display();
        }
        else
        {
            result=false;
            System.out.println("THANK UUUU");
        }
        }while(result);
      
    }
    
}
