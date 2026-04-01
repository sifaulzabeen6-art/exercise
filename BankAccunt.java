import java.util.Scanner;
class BankAccount
{
	
	int deposit;
	int withdraw;
	int balance=0;
	public static void main(String[]args)
	{
		boolean result=true;
	do{
		System.out.println("1.DEPOSIT:");
		System.out.println("2.WITHDRAW");
		System.out.println("3.CHECK BALANCE");
		System.out.println("4.EXIT");
		
		System.out.println("ENTER THE OPTION:");
		int option=sc.nextInt();
		if(option==1)
		{
			 System.out.print("ENTER THE DEPOSIT AMOUNT");
		    int a=sc.nextInt();
			
		}
	   else if(option==2)
	   {
		 System.out.print("ENTER THE  WITH DRAW AMOUNT");
		 int a=sc.nextInt();
		   
	   }
      else if(option==3)
	   {
		   
		     checkbalance();
			
	   }
      
      else 
	   {
		   result=false;
	   }
       }while(result);
	   BankAccount b=new BankAccount(int a);
	}
	BankAccount(int am)
	{
		this.am=a;
           balance=balance+am;
			System.out.println("AMOUNT DEPOSITED:"+am);
	}
	BankAccount( int am)
	{
		this.am=a;
		if(am<=balance)
			
	
	{
		balance=balance-am;
		System.out.println("AMOUNT WITHDRAW:"+am);
			
	}
	}
	else{
		System.out.println("CHECK BALAQNCE");
	}
	}

	
	
	void checkbalance()
	{
		
			System.out.println("BALANCE AMOUNT:"+balance);
	}
	
}
}