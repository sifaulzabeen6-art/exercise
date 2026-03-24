import java.util.Scanner;
class Trav
{
	Scanner sc=new Scanner (System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("ENTER THE SIZE");
		int size= sc.nextInt();
		int arr[]=new int[size];
		Trav t1=new Trav();
		t1.insert(arr);
		t1.traverse(arr);
		 
		
	}
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value of"+i+"array");
			arr[i]=sc.nextInt();
		}
	}
	void traverse(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
						System.out.println("dispaly the all value"+arr[i]);
		}
	}
}