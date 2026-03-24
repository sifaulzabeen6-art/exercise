import java.util.Scanner;
class Delete
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the value of"+i+"array");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(  "BEFORE"+ar[i]);
		}
		
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE VALUE TO DELETE POSITION");
		int num=se.nextInt();
		
		
	
		
		int arr[]=new int[ar.length-1];
		for(int i=0;i<num-1;i++)
		{
			arr[i]=ar[i];
			
		}
		
		for(int i=num-1;i<arr.length;i++)
		{
			arr[i]=ar[i+1];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(  "AFTER "+arr[i]);
		}
		
	}
}