import java.util.Scanner;
class Exam3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ARRAY SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		boolean result=true;
		
			for(int i=0;i<arr.length;i++)
			{
			System.out.println("ENTER THE "+i+"value:");
			
		    arr[i]=sc.nextInt();
			}
			do{
		
		System.out.println("*************WELCOME*****");
		System.out.println("1.Addition");
		System.out.println("2.DISPLAY");
		System.out.println("3.REVERSE");
		System.out.println("4.EXIT");
		System.out.println("*********************");
		System.out.print("ENTHE THE OPTION:");
		int option=sc.nextInt();
		
	if(option==1)
	{
		for( int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("ADDITION:" + sum);
	}
	else if (option==2)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("DISPALY:"+arr[i]);
		}
		
	}
	else if(option==3)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println("REVERSE:"+arr[i]);
		}
	}
	else
	{
		System.out.println("THE PROGRAM EXITED");
		result=false;
	}
			
	    }while(result);
			
		
	}
}