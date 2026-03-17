import java.util.Scanner;
class Exam4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE:");
        int size=sc.nextInt();
		int arr[]=new int[size];
		 boolean result = true;
		for(int i=0;i<arr.length;i++)
		{
				System.out.print("ENTER THE  "+i+"VALUE :");
				arr[i]=sc.nextInt();
		}
		do{
		System.out.println("***************");
		System.out.println("1.MAXIMUM VALUE");
		System.out.println("2.MINIMUM VALUE");
		System.out.println("3.SUM VALUE");
		System.out.println("4.EXIT");
		System.out.print("ENTER YOUR OPTION:");
		int option=sc.nextInt();
		if(option==1)
			
		{
			int max=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.println("DISPLAY THE MAXIMUM VALUE:"+max);
		}
		 else if(option==2)
			
		{
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println("DISPLAY THE MINIMUM VALUE:"+min);
		}
		else if(option==3)
			
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			System.out.println("DISPLAY THE SUM VALUE:"+sum);
		}
		else
		{
		    System.out.println("THE PROGRAM EXITED");
			result=false;
		}
		}while(result);
		
		
		
			
		
		
		
	}
}