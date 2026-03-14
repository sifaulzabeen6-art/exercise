import java.util.Scanner;
class Menu
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ARRAY SIZE:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		 boolean  exit=true;
		
		
		do{
		System.out.println("----MENU---");
		System.out.println("1.INSERT ELEMENTS:");
		System.out.println("2.DISPALY ELEMENTS:");
		System.out.println("3.COUNT EVEN NUM:");
		System.out.println("4.COUNT ODD NUM:");
		System.out.println("5.EXIT");
		
		System.out.println("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		
		
		if(choice==1)
		{
			
			for(int i=0;i<arr.length;i++)
			{
			System.out.println("ENTER THE "+i+"value:");
			
		    arr[i]=sc.nextInt();
			}
		
			
		}
		else if(choice==2)
		{
				System.out.println("DISPLAY THE ELEMENT:");
				for(int i=0;i<arr.length;i++)
				{
						System.out.println(arr[i]);
				}
				
		}
		else if(choice==3)
		{
			   int evencount=0;
				for(int i=0;i<arr.length;i++)
				{
				if(arr[i]%2==0)
				{
					evencount++;
				}
				}
				
				System.out.println("DISPLAY THE EVEN COUNT:"+evencount);
				
		}
		else if(choice==4)
		{
			     int oddcount=0;
					for(int i=0;i<arr.length;i++)
					{
					if(arr[i]%2!=0)
					{
					oddcount++;
				
					}
					}
					System.out.println("DISPLAY THE ODD COUNT:"+oddcount);
		}
		
		else 
		{    
	                      
	                        
							System.out.println("THE PROGRAM EXITED");
							exit=false;
			
		}
		
		}while(exit);
		
			
		
	}
}