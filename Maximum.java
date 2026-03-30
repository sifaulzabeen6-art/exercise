import java.util.Scanner;
class Maximum
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
		int max=0;
	
		for(int i=0;i<arr.length;i++)
			
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
			System.out.println("THE MAXIMUM VALUE IS:"+max);
		
	}
	
}