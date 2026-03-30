import java.util.Scanner;
class Count1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("ENTER THE TARGET VALUE:");
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
			   count++;
			   
			}
		}
	System.out.println(count);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		