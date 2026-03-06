import java.util.Scanner;
class BillsCity
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("****WELCOME TO SMART CITY UTILITY MENU****");
		System.out.println("1.ELECTRICITY BILL");
		System.out.println("2.WATER BILL");
		System.out.println("3.INTERNET BILL");
		System.out.println("4.EXIT");
		System.out.println("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
		System.out.println("ENTER A UNITS:");
		int units=sc.nextInt();
		
			if(units<=100)
			{
				System.out.println("$2 per unit");
			}
			else if(units<=300)
			{
				System.out.println("$3 per unit");
			}
			else 
			{
				System.out.println("$5 per unit");
			}
		}
		else if(choice==2)
		{
			System.out.println("1.Appartment");
			System.out.println("2.INDIVIDUAL HOUSE");
			System.out.print("CHOOSE HOUSE TYPE:");
			int types=sc.nextInt();
			if(types==1)
			{
				System.out.println("monthly charge:300");
			}

			else 
			{
				System.out.println("monthly charge:500");
			}
			
		}
		else if (choice==3)
		{
			System.out.println("1.BASIC PLAN");
			System.out.println("2.STANDARD PLAN");
			System.out.println("3.PREMIUM PLAN");
			System.out.println("CHOOSE YOUR PLAN:");
			int plan=sc.nextInt();
			
			if(plan==1)
			{
				System.out.println("paln rate is:$399");
			}
			else if(plan==2)
			{
				System.out.println("plan rate is :$699");
			}
			else 
			{
				System.out.println("plan rate is:$999");
			}
		}
		else 
		{
	      System.out.println("*****THANK YOU FOR USING SMART CITY UTILITY SYSTEM*******");
		}
		
		
	}
}
