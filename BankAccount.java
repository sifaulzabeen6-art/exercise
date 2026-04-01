import java.util.Scanner;
class BankAccount
{
	
	int deposit;
	int withdraw;
	int balance=0;
	Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		
		
		
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
			b=new BankAccount(a,b.balance);
			
		}
	   else if(option==2)
	   {
		 System.out.print("ENTER THE  WITH DRAW AMOUNT");
		 int a=sc.nextInt();
		 b=new BankAccount(a,b.balance,true);

		  
		   
	   }
      else if(option==3)
	   {
		   
		     
			 System.out.println("BALANCE AMOUNT"+b.balance);
			
	   }
      
      else 
	   {
		   result=false;
	   }
       }while(result);
	   
	}
	BankAccount(int am,int balance)
	{
		
		
         this.balance=balance+am;
			System.out.println("AMOUNT DEPOSITED:"+am);
	}
	BankAccount( int am,int balance,boolean iswithdraw)
	{
		
	
				if(am<=balance)
			
	
	{
		 this.balance=balance-am;
		System.out.println("AMOUNT WITHDRAW:"+am);
			
	}
	
	else{
		this.balance=balance;
		System.out.println("CHECK BALAQNCE");
	}
	}

	
	
	BankAccount()
	{
		
			System.out.println("BALANCE AMOUNT:"+balance);
	}
	
}
