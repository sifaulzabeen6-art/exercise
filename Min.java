import java.util.Scanner;
class Min
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A ARRAY SIZE:");
		int size =sc.nextInt();
		int arr[]=new int[size];
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+":");
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
	    {
			if(arr[i]<min)
			{
				secmin=min;
				min=arr[i];
			}
		
		}
		System.out.println("ENTER THE SECOND MINIMUM VALUE"+secmin);
	}
}