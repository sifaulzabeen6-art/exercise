/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AccHomework;

import java.util.Scanner;
public class AccHomework {

   
    public static void main(String[] args) {
        boolean result=true;
    Scanner sc=new Scanner(System.in);
    BankAccount ba=new BankAccount();
        System.out.println("ENTER THE ACCOUNT NUMBER");
        ba.setAccountNumber(sc.nextInt());
        sc.nextLine();
        
        System.out.println("ENTER THe ACCOUNTHOLDER NAME");
        ba.setAccountHolderNmae(sc.nextLine());
        System.out.println("ENTER THE BALNCE");
        ba.setBalance(sc.nextInt());
        do{
        System.out.println("***********");
        System.out.println("1.DEPOSIT");
        System.out.println("2.WITHDRAW");
        System.out.println("3.DISPLAY ACCOUNT DTAILS");
        System.out.println("4.EXIT");
        System.out.print("ENTER YOUR CHOICE:");
        int option=sc.nextInt();
        if(option==1)
        {
            System.out.println("ENTER AMOUNT TO DEPOSIT");
            int dep=sc.nextInt();
            ba.deposit(dep);
        }
        else if(option==2)
        {
            System.out.println("ENTER AMOUNT TO WITHDRAW"); 
            int wit=sc.nextInt();
            ba.withdraw(wit);
        }
        else if(option==3)
        {
            ba.AccountDetails();
        }
        else
        {
           result=false; 
        }
        }while(result);
    }
    
}
