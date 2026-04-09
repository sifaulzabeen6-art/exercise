/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccHomework;

public class BankAccount {
    private  int AccountNumber;
    private String AccountHolderNmae;
     private int Balance;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountHolderNmae() {
        return AccountHolderNmae;
    }

    public void setAccountHolderNmae(String AccountHolderNmae) {
        this.AccountHolderNmae = AccountHolderNmae;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }
    public void deposit(int amount)
    {
        Balance=Balance+amount;
        System.out.println("DEPOSITED AMOUNT"+amount);
    }
    public void withdraw(int amount)
    {
        if(Balance>=amount)
        {
            Balance-=amount;
            System.out.println("WITHDRAW"+amount);
        
        }
        else{
            System.out.println("INSUFFICIENT AMOUNT");
        
        }
    }
    public  void AccountDetails()
            {
                System.out.println("ACCOUNT NUMBER"+AccountNumber);
                System.out.println("ACCOUNT HOLDER NAME"+AccountHolderNmae);
                System.out.println("BALANCE"+Balance);
            }
   
    
}
