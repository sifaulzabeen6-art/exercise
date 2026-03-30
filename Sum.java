import java.util.Scanner;
class Sum
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
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("THE SUM VALUE:"+sum);
		
	}
}