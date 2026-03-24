import java.util.Scanner;
class Swap1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE");
		int size=sc.nextInt();
		int arr[]=new int[size];
		Swap1 s1=new Swap1();
		s1.insert(arr);
		s1.swap(arr,2,1);
		
	}
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value of"+i+"array");
			arr[i]=sc.nextInt();
		}
	}
	void swap(int arr[],int one,int two)
	{
		
		
			int temp=arr[one];
			arr[one]=arr[two];
			arr[two]=temp;
			for (int i=0;i<arr.length;i++)
			{
			System.out.println("dispaly the all value swaped"+arr[i]);
			}
		
	}
}