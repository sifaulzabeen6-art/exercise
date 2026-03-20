import java.util.Scanner;
class Banking
{
	int balance=0;

	Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Banking b=new Banking();
		b.menu();
	}
	void menu()
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
			deposit(a);
		}
	   else if(option==2)
	   {
		 System.out.print("ENTER THE  WITH DRAW AMOUNT");
		 int a=sc.nextInt();
		   withdraw(a);
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
	}
	
	void deposit(int am)
	{
		
           balance=balance+am;
			System.out.println("AMOUNT DEPOSITED:"+am);
	}
	void withdraw( int am)
	{
		if(am<=balance)
			
	
	{
		balance=balance-am;
		System.out.println("AMOUNT WITHDRAW:"+am);
			
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