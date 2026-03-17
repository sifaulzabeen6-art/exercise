import java.util.Scanner;
class Exam5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A ARRAY SIZE:");
		int size =sc.nextInt();
		int arr[]=new int[size];
		boolean result=true;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+":");
			arr[i]=sc.nextInt();
		}
		do{
		System.out.println("***************");
		System.out.println("1.reverse value");
		System.out.println("2.REVERSE WITH SWAP");
		System.out.println("3.EVEN NUMBER");
		System.out.println("4.DIVISIBLE BY 7");
		System.out.println("5.LENGTH OF ARRAY");
		System.out.println("6.EXIT");
		
		System.out.print("ENTER YOUR OPTION:");
		int option=sc.nextInt();
		if(option==1)
		{
			for(int i=arr.length-1;i>=0;i--)
			{
			System.out.println(arr[i]);	
			}
				
			
		}
		else if(option==2)
		{
			for(int i =0;i<arr.length/2;i++)
			{
				int temp=arr[i];
				int back=arr.length-1-i;
				arr[i]=arr[back];
				arr[back]=temp;
				
				
			}
			for(int i=0;i<arr.length;i++)
			{
							System.out.println("REVERSE WITH SWAP:"+arr[i]);
			}

				
		}
		else if(option==3)
		{
			for(int i =0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					System.out.println("EVEN VALUE:" +arr[i]);
				}
			}
				
		}
		else if(option==4)
		{
			for(int i =0;i<arr.length;i++)
			{
				if(arr[i]%7==0)
				{
					System.out.println("DIVISIBLE 7 VALUE:" +arr[i]);
				}
			}
				
		}
		else if(option==5)
		{
			
			
			
			System.out.println("THE LENGTH:"+size);
			
			   
		}
		else
		{
			 System.out.println("THE PROGRAM EXITED");
			result=false;
		}
		}while(result);
		
	}
}