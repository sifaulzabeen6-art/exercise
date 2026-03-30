import java.util.Scanner;
class Bubblesort
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={23,56,89,78,34};
		Bubblesort b=new Bubblesort();
		b.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("ENTER THE TARGET VALUE:");
		int target=sc.nextInt();
		b.search(arr,target,0);
	}
	void sort(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	void search(int ar[],int target,int index)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
		{
				System.out.println(i);
			}
		}
	}
	
}